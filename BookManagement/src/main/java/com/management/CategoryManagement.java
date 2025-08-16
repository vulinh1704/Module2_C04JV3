package com.management;
import com.dto.CategoryDatabase;
import com.model.Category;
import java.util.List;
import java.util.Objects;

public class CategoryManagement implements IManagement<Category> {
    private List<Category> list;
    private CategoryDatabase categoryDatabase = new CategoryDatabase();

    // Get ra thì gọi read, thay đổi data thì gọi write

    public CategoryManagement() {
        this.list = categoryDatabase.readData();
    }

    @Override
    public void add(Category category) {
        this.list.add(category);
        categoryDatabase.writeData(this.list);
    }

    @Override
    public void delete(Long id) throws Exception {
        int index = this.findIndexById(id);
        this.list.remove(index);
        categoryDatabase.writeData(this.list);
    }

    @Override
    public void update(Long id, Category newCategory) throws Exception {
        int index = this.findIndexById(id);
        Category oldData = this.findById(id);
        newCategory.setId(oldData.getId());
        this.list.set(index, newCategory);
        categoryDatabase.writeData(this.list);
    }

    @Override
    public Category findById(Long id) throws Exception {
        int index = this.findIndexById(id);
        return this.list.get(index);
    }

    @Override
    public List<Category> findAll() {
        return this.list;
    }

    @Override
    public int findIndexById(Long id) throws Exception {
        for (int i = 0; i < this.list.size(); i++) {
            Category category = this.list.get(i);
            if (Objects.equals(category.getId(), id)) {
                return i;
            }
        }
        throw new Exception("Data not found");
    }
}

// database (thong dung 99%) ban chat la file => he quan trị csdl (dùng câu lệnh để tung tác với database_
// or file text (qua trinh hoc)
