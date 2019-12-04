package com.w.controller;

import com.w.common.entity.StateCode;
import com.w.domain.Favourable;
import com.w.service.FavourableService;
import com.w.common.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassNameFavouriteController
 * @Description
 * @Author ANGLE0
 * @Date2019/11/14 9:06
 * @Version V1.0
 **/
@CrossOrigin
@Controller
@RequestMapping("/fav")
public class FavouriteController {

    @Autowired
    private FavourableService favourableService;

//    @RequestMapping("/update.do")
    @RequestMapping(value = "/{favID}", method = RequestMethod.POST)
    @ResponseBody
    public Result updateFavourable(@PathVariable("favID") int favID, @RequestBody Favourable favourable){
        favourable.setFav_ID(favID);
        int result = favourableService.updateFavourable(favourable);
        if(result == 1){
            return Result.getUpdateSuccessData();
        }
        return Result.getUpdateFailedData();
    }

//    @RequestMapping("/add.do")
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Result addFavourable(@RequestBody Favourable favourable){
        int result = favourableService.addFavourable(favourable);
        if (result == 1){
            return Result.getAddSuccessData();
        }
        return Result.getAddFailedData();
    }

//    @RequestMapping("/del.do")
    @RequestMapping(value = "/{favID}",  method = RequestMethod.DELETE)
    @ResponseBody
    public Result deleteFavourable(@PathVariable("favID") int favID){
        int result = favourableService.deleteFavourable(favID);
        if (result == 1){
            return Result.getDeleteSuccessData();
        }
        return Result.getDeleteFailedData();
    }

//    @RequestMapping("/findAll.do")
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Result findAll(){
        List favList = favourableService.findAllFavourable();
        return new Result(StateCode.SUCCESS, "获取数据成功", favList);
    }
}
