package com.w.service;

import java.util.List;

import com.w.domain.Category;

public interface CategoryService {
	
	int addCategory(Category category) throws Exception;

    int deleteCategory(int categoryID) throws Exception;

    int updateCategory(Category category) throws Exception;

    List<Category> findAllCategory() throws Exception;

    Category findOneByID(int categoryId) throws Exception;

}
