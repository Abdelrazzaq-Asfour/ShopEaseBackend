package com.ecomproject.api.service;

import com.ecomproject.api.model.Category;

import java.util.List;

public interface CategoryService {
    List <Category> getAllCategories();
    void createCategory(Category category);
    String deleteCategory(Long Id);

    Category updateCategory(Category category, Long categoryId);
}
