package com.blogapp.web;


import com.blogapp.service.ICategoryService;
import com.blogapp.service.INewService;

import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(urlPatterns = {"/trang-chu"})
public class HomeController extends HttpServlet {
    @Inject
    protected ICategoryService categoryService;

    @Inject
    private INewService newService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long categoryId = 1L;
        request.setAttribute("news",newService.findByCategoryId(categoryId));
        request.setAttribute("categories",categoryService.findAll());
        RequestDispatcher rd = request.getRequestDispatcher("/views/web/home.jsp");
        rd.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
