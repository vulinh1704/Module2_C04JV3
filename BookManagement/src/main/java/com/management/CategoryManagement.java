package com.management;

import com.model.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CategoryManagement implements IManagement<Category> {
    private List<Category> list;

    public CategoryManagement() {
        this.list = new ArrayList<>();
    }

    @Override
    public void add(Category category) {
        this.list.add(category);
    }

    @Override
    public void delete(Long id) throws Exception {
        int index = this.findIndexById(id);
        this.list.remove(index);
    }

    @Override
    public void update(Long id, Category newCategory) throws Exception {
        int index = this.findIndexById(id);
        Category oldData = this.findById(id);
        newCategory.setId(oldData.getId());
        this.list.set(index, newCategory);
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
