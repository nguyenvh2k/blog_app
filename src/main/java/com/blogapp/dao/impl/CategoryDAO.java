package com.blogapp.dao.impl;

import com.blogapp.dao.GenericDAO;
import com.blogapp.dao.ICategoryDAO;
import com.blogapp.mapper.CategoryMapper;
import com.blogapp.model.CategoryModel;
import com.mysql.cj.protocol.Resultset;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO {
    @Override
    public List<CategoryModel> FindAll() {
        String sql = "select * from category";
        return query(sql,new CategoryMapper());
    }
}
