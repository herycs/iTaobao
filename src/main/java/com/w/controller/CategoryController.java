package com.w.controller;

import com.w.common.entity.StateCode;
import com.w.domain.Category;
import com.w.service.CategoryService;
import com.w.common.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    
//    @RequestMapping("/update.do")
    @RequestMapping(value = "/{cateID}", method = RequestMethod.PUT)
    @ResponseBody
    public Result updateCate(@PathVariable("cateID")int cateID, @RequestBody Category category) throws Exception {
        category.setCate_ID(cateID);
        int result = categoryService.updateCategory(category);
        if(result == 1){
            return Result.getUpdateSuccessData();
        }
        return Result.getUpdateFailedData();
    }

//    @RequestMapping("/add.do")
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Result addCate(@RequestBody Category category) throws Exception {
        int result = categoryService.addCategory(category);
        if (result == 1){
            return Result.getAddSuccessData();
        }
        return Result.getAddFailedData();
    }

//    @RequestMapping("/del.do")
    @RequestMapping(value = "/{cateID}", method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteCate(@PathVariable("cateID") int cateID) throws Exception {
        int result = categoryService.deleteCategory(cateID);
        if (result == 1){
            return Result.getDeleteSuccessData();
        }
        return Result.getDeleteFailedData();
    }

//    @RequestMapping("/findAll.do")
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Result findAll() throws Exception {
        List categoryList = categoryService.findAllCategory();
        return new Result(StateCode.SUCCESS, "数据获取成功", categoryList);
    }
}
