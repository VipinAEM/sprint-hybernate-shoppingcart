package com.vipin.backendshoppingkiansh.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.vipin.backendshoppingkiansh.dao.CategoriesDAO;
import com.vipin.backendshoppingkiansh.dto.Categories;

@Repository(value="CategoriesDAO")
public class CategoriesDAOImpl implements CategoriesDAO {

	private static List<Categories> categories = new ArrayList<>();
	
	static{
		Categories category = new Categories();
		
		category.setId(0);
		category.setName("Computeres");
		category.setDescription("List of computers can be found here");
		category.setImageUrl("cat_1.png");
		
		categories.add(category);
		
		category = new Categories();
		category.setId(1);
		category.setName("Phones");
		category.setDescription("List of phones can be found here");
		category.setImageUrl("cat_1.png");
		
		categories.add(category);
		
		category = new Categories();
		category.setId(2);
		category.setName("Sims");
		category.setDescription("List of sims can be found here");
		category.setImageUrl("cat_1.png");
		
		categories.add(category);
		
	}
	
	@Override
	public List<Categories> getCategories() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Categories getId(int id) {
		for(Categories category:categories){
			if(category.getId() == id) return category;
		}
		return null;
	}

}
