package com.w.service;

import java.util.List;

import com.w.domain.Category;

public interface CategoryService {
	
	int addCategory(Category category);

    int deleteCategory(int categoryID);

    int updateCategory(Category category);

    List<Category> findAllCategory();

    Category findOneByID(int categoryId);

}
