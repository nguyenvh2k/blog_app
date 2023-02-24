package com.blogapp.dao.impl;

import com.blogapp.dao.INewDAO;
import com.blogapp.mapper.NewMapper;
import com.blogapp.model.CategoryModel;
import com.blogapp.model.NewModel;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NewDAO extends AbstractDAO<NewModel> implements INewDAO {
    @Override
    public List<NewModel> findByCategoryId(Long categoryId) {
        String sql = "select * from news where categoryid=?";
        return query(sql,new NewMapper(),categoryId);
    }
}
