package org.lms.converter;

import org.lms.dto.CategoryDTO;
import org.lms.model.Category;
import org.springframework.core.convert.converter.Converter;

public class CategoryConverter  {

	public Category toModel(CategoryDTO categoryDTO) {
		Category category = new Category();
		category.setCategoryId(categoryDTO.getCategoryId());
		category.setCategoryName(categoryDTO.getCategoryName());
		category.setCategoryDescription(categoryDTO.getCategoryDescription());
		return category;
	}
	
	public CategoryDTO toDTO(Category categoryModel) {
		CategoryDTO categoryDTO = new CategoryDTO();
		categoryDTO.setCategoryId(categoryModel.getCategoryId());
		categoryDTO.setCategoryName(categoryModel.getCategoryName());
		categoryDTO.setCategoryDescription(categoryModel.getCategoryDescription());
		return categoryDTO;
	}

}
