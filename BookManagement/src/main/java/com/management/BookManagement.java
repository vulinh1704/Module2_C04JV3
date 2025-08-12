package com.management;
import com.model.Book;
import java.util.ArrayList;
import java.util.List;

public class BookManagement implements IManagement<Book>{

    private List<Book> list;

    public BookManagement() {
        this.list = new ArrayList<>();
    }

    @Override
    public void add(Book book) {
        this.list.add(book);
    }

    @Override
    public void delete(Long id) throws Exception {
        int index = this.findIndexById(id);
        this.list.remove(index);
    }

    @Override
    public void update(Long id, Book newBook) throws Exception {
        int index = this.findIndexById(id);
        Book oldData = this.findById(id);
        newBook.setId(oldData.getId());
        this.list.set(index, newBook);
    }

    @Override
    public Book findById(Long id) throws Exception {
        int index = this.findIndexById(id);
        return this.list.get(index);
    }

    @Override
    public List<Book> findAll() {
        return this.list;
    }

    @Override
    public int findIndexById(Long id) throws Exception {
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).getId() == id) {
                return i;
            }
        }
        throw new Exception("Data not found");
    }
}
