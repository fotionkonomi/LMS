package org.lms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.lms.dao.CategoryDAO;
import org.lms.model.Category;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryDAOImpl implements CategoryDAO {
	@PersistenceContext
	private EntityManager entityManager;

	public void addCategory(Category category) {
		entityManager.persist(category);
	}

	public List<Category> allCategories() {
		TypedQuery<Category> query = entityManager.createQuery("Select c from Category c", Category.class);
		return query.getResultList();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}



}
