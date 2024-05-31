package com.exam.examserver.Services;

import com.exam.examserver.Entity.Exam.Category;

import java.util.Set;

public interface CategoryService {
    public Category addCategory (Category category);
    public Category updateCategory (Category category);
    public Set<Category> getCategory();
    public Category getCategory (Long id);
    public void deleteCategory (Long id);
}
