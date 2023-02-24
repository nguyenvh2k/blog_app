package com.blogapp.mapper;

import com.blogapp.model.NewModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class NewMapper implements RowMapper<NewModel>{
    @Override
    public NewModel mapRow(ResultSet resultSet) {
        NewModel news = new NewModel();
        try {
            news.setId(resultSet.getLong("id"));
            news.setTitle(resultSet.getString("title"));
            return news;
        } catch (SQLException e) {
           return null;
        }
    }
}
