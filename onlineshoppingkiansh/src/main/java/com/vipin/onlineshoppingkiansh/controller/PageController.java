package com.vipin.onlineshoppingkiansh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vipin.backendshoppingkiansh.dao.CategoriesDAO;
import com.vipin.backendshoppingkiansh.dto.Categories;

@Controller
public class PageController {
	
	@Autowired
	CategoriesDAO categoriesDAO;
	
	
	@RequestMapping({"/","/home","/index"})
	public ModelAndView home(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "home");
		mv.addObject("homeviewclicked", true);
		mv.addObject("categories",categoriesDAO.getCategories());
		return mv;
	}
	
	@RequestMapping("/about")
	public ModelAndView about(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("aboutviewclicked", true);
		mv.addObject("categories",categoriesDAO.getCategories());
		return mv;
	}
	
	@RequestMapping("/contact")
	public ModelAndView contact(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("contactviewclicked", true);
		mv.addObject("categories",categoriesDAO.getCategories());
		return mv;
	}
	
	
	@RequestMapping("/view/all/products")
	public ModelAndView viewallproducts(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "View Products");
		mv.addObject("allproductsclicked", true);
		mv.addObject("categories",categoriesDAO.getCategories());
		return mv;
	}
	
	
	@RequestMapping("/view/category/{id}/products")
	public ModelAndView viewcategoryproducts(@PathVariable("id")int id){
		ModelAndView mv = new ModelAndView("page");
		
		//fetch category id
		Categories cat = null;
		cat = categoriesDAO.getId(id);
		
		mv.addObject("category",cat);
		mv.addObject("title", cat.getName());
		mv.addObject("categoryproductsclicked", true);
		
		mv.addObject("categories",categoriesDAO.getCategories());
		return mv;
	}
}
