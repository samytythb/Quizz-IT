package com.Iter.service;

import com.Iter.model.Tech.exam.Category;

import java.util.Optional;
import java.util.Set;

public interface CategoryService {
    public Category addCategory(Category category);

    public Category updateCategory(Category category);

    public void deleteCategory(Long cid);
    public Set<Category> getCategories();
    public Category getCategory(Long cid);
}
