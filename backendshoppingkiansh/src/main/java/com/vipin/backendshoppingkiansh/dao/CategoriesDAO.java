package com.vipin.backendshoppingkiansh.dao;

import java.util.List;

import com.vipin.backendshoppingkiansh.dto.Categories;

public interface CategoriesDAO {
	List<Categories> getCategories();

	Categories getId(int id);
}
