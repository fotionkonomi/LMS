package org.lms.service;

import java.util.List;

import org.lms.dao.CategoryDAO;
import org.lms.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDAO categoryDAO;
	
	public void setCategoryDAO(CategoryDAO categoryDAO) {
		this.categoryDAO = categoryDAO;
	}
	
	public CategoryDAO getCategoryDAO() {
		return categoryDAO;
	}
	
	@Override
	public void addCategory(Category c) {
		this.categoryDAO.addCategory(c);
	}
	
	@Override
	public List<Category> allCategories() {
		return this.categoryDAO.allCategories();
	}
}
