package org.lms.dao;

import java.util.List;

import org.lms.model.Category;
import org.springframework.stereotype.Repository;


public interface CategoryDAO{

	void addCategory(Category category); 
	List<Category> allCategories();
}
