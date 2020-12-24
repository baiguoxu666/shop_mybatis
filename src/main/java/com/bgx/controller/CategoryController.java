package com.bgx.controller;

import com.bgx.entity.Category;
import com.bgx.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CategoryService cs;

    @RequestMapping("query")
    public String query(Integer id){
        System.out.println(cs.queryById(id));
        return null;
    }


    @RequestMapping("save")
    public String save(Category category, Integer parentId){

        try {
            cs.save(category,parentId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}