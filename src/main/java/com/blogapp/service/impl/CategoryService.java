package com.blogapp.service.impl;

import com.blogapp.dao.ICategoryDAO;
import com.blogapp.dao.impl.CategoryDAO;
import com.blogapp.model.CategoryModel;
import com.blogapp.service.ICategoryService;

import javax.inject.Inject;
import java.util.List;

public class CategoryService implements ICategoryService {

    @Inject
    private ICategoryDAO categoryDAO;

//    public CategoryService(){
//        categoryDAO = new CategoryDAO();
//    }

    @Override
    public List<CategoryModel> findAll() {
        return categoryDAO.FindAll();
    }
}
