package com.w.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.w.dao.CategoryDao;
import com.w.domain.Category;
import com.w.service.CategoryService;

/**
 * @ClassName CategoryServiceImpl
 * @Description
 * @Author ANGLE0
 * @Date2019/11/17 21:04
 * @Version V1.0
 **/
@Service("cateService")
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDao categoryDao;
	
	@Override
	public int addCategory(Category category) {
		int result = categoryDao.addCategory(category);
		return result;
	}

	@Override
	public int deleteCategory(int categoryID) {
		int result = categoryDao.deleteCategory(categoryID);
		return result;
	}

	@Override
	public int updateCategory(Category category) {
		int result = categoryDao.updateCategory(category);
		return result;
	}

	@Override
	public List<Category> findAllCategory() {
		
		return categoryDao.findAllCategory();
	}

	@Override
	public Category findOneByID(int categoryId) {
		// TODO Auto-generated method stub
		return (Category) categoryDao.findCategoryByID(categoryId);
	}

}
