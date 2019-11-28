package com.w.controller.base;

import com.w.domain.Category;
import com.w.service.CategoryService;
import com.w.domain.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin
@Controller
@RequestMapping("/cate")
public class CategoryController {
    
    @Autowired
    private CategoryService categoryService;
    
    @RequestMapping("/update.do")
    @ResponseBody
    public JsonData updateCate(Category category){
        int result = categoryService.updateCategory(category);
        if(result == 1){
            return JsonData.getUpdateSuccessData();
        }
        return JsonData.getUpdateFailedData();
    }

    @RequestMapping("/add.do")
    @ResponseBody
    public JsonData addCate(Category category){
        int result = categoryService.addCategory(category);
        if (result == 1){
            return JsonData.getAddSuccessData();
        }
        return JsonData.getAddFailedData();
    }

    @RequestMapping("/del.do")
    @ResponseBody
    public JsonData deleteCate(int cateID){
        int result = categoryService.deleteCategory(cateID);
        if (result == 1){
            return JsonData.getDeleteSuccessData();
        }
        return JsonData.getDeleteFailedData();
    }

    @RequestMapping("/findAll.do")
    @ResponseBody
    public JsonData findAll(){
        List categoryList = categoryService.findAllCategory();
        return JsonData.getJsonData(new JsonData(0, "数据获取成功", categoryList));
    }
}
