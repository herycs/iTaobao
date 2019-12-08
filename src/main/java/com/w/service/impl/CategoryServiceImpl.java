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
	public int addCategory(Category category) throws Exception{
		int result = categoryDao.addCategory(category);
		return result;
	}

	@Override
	public int deleteCategory(int categoryID) throws Exception{
		int result = categoryDao.deleteCategory(categoryID);
		return result;
	}

	@Override
	public int updateCategory(Category category) throws Exception{
		int result = categoryDao.updateCategory(category);
		return result;
	}

	@Override
	public List<Category> findAllCategory() throws Exception{
		
		return categoryDao.findAllCategory();
	}

	@Override
	public Category findOneByID(int categoryId) throws Exception{
		// TODO Auto-generated method stub
		return (Category) categoryDao.findCategoryByID(categoryId);
	}

}
