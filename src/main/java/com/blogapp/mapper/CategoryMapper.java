package com.blogapp.mapper;

import com.blogapp.model.CategoryModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryMapper implements RowMapper<CategoryModel>{
    @Override
    public CategoryModel mapRow(ResultSet resultSet) {
        try {
            CategoryModel category = new CategoryModel();
            category.setId(resultSet.getLong("id"));
            category.setName(resultSet.getString("name"));
            category.setCode(resultSet.getString("code"));
            return category;
        }catch (SQLException e){
            return null;
        }
    }
}
