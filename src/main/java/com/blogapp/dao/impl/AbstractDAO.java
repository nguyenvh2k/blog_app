package com.blogapp.dao.impl;

import com.blogapp.dao.GenericDAO;
import com.blogapp.mapper.RowMapper;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AbstractDAO<T> implements GenericDAO<T> {
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/servletv23";
            String user = "root";
            String password = "123456";
            return DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters) {
        List<T> results = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            connection = getConnection();
            statement = connection.prepareStatement(sql);
            setParameter(statement,parameters);
            //set parameter
            resultSet = statement.executeQuery();
            while (resultSet.next()){
                results.add(rowMapper.mapRow(resultSet));
            }
            return results;
        }catch (SQLException e){
            return null;
        }finally {
            try {
                if (connection!=null){
                    connection.close();
                }
                if (statement!=null){
                    statement.close();
                }
                if (resultSet!=null){
                    resultSet.close();
                }
            }catch (SQLException e){
                return null;
            }
        }
    }
    private void setParameter(PreparedStatement statement,Object... parameters){
        try {
            for (int i = 0;i<parameters.length;i++){
                Object parameter = parameters[i];
                int index = i+1;
                if (parameter instanceof Long){
                    statement.setLong(index,(Long)parameter);
                }else if (parameter instanceof String){
                    statement.setString(index,(String) parameter);
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}
