package com.blogapp.service.impl;

import com.blogapp.dao.INewDAO;
import com.blogapp.model.NewModel;
import com.blogapp.service.INewService;

import javax.inject.Inject;
import java.util.List;

public class NewService implements INewService {

    @Inject
    private INewDAO newDAO;

    @Override
    public List<NewModel> findByCategoryId(Long categoryId) {
        return newDAO.findByCategoryId(categoryId);
    }
}
