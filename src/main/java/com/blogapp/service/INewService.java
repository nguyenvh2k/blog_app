package com.blogapp.service;

import com.blogapp.model.NewModel;

import java.util.List;

public interface INewService {
    List<NewModel> findByCategoryId(Long categoryId);
}
