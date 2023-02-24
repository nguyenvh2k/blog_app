package com.blogapp.dao;

import com.blogapp.model.CategoryModel;

import java.util.List;

public interface ICategoryDAO {
    List<CategoryModel> FindAll();
}
