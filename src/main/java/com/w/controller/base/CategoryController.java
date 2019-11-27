package com.w.controller.base;

import com.w.domain.Category;
import com.w.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassNameCategoryController
 * @Description
 * @Author ANGLE0
 * @Date2019/11/14 9:06
 * @Version V1.0
 **/
@Controller
@RequestMapping("/cate")
public class CategoryController {
    
    @Autowired
    private CategoryService categoryService;
    
    @RequestMapping("/update.do")
    public String updateCate(Category category){
        int result = categoryService.updateCategory(category);
        if (result == 1) {
            return "sucess";
        }
        return "filed";
    }

    @RequestMapping("/add.do")
    public String addCate(Category category){
        int result = categoryService.addCategory(category);
        if (result == 1) {
            return "sucess";
        }
        return "filed";
    }

    @RequestMapping("/del.do")
    public String deleteCate(int cateID){
        int result = categoryService.deleteCategory(cateID);
        if (result == 1) {
            return "success";
        }
        return "filed";
    }

    @RequestMapping("/findAll.do")
    @ResponseBody
    public List<Category> findAll(){
        List categoryList = categoryService.findAllCategory();
        return categoryList;
    }
}
