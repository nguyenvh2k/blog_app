package com.blogapp.dao;

import com.blogapp.model.NewModel;

import java.util.List;

public interface INewDAO {
    List<NewModel> findByCategoryId(Long categoryId);
}
