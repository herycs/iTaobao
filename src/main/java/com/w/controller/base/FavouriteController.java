package com.w.controller.base;

import com.w.domain.Favourable;
import com.w.service.FavourableService;
import com.w.domain.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping("/update.do")
    @ResponseBody
    public JsonData updateFavourable(Favourable favourable){
        int result = favourableService.updateFavourable(favourable);
        if(result == 1){
            return JsonData.getUpdateSuccessData();
        }
        return JsonData.getUpdateFailedData();
    }

    @RequestMapping("/add.do")
    @ResponseBody
    public JsonData addFavourable(Favourable favourable){
        int result = favourableService.addFavourable(favourable);
        if (result == 1){
            return JsonData.getAddSuccessData();
        }
        return JsonData.getAddFailedData();
    }

    @RequestMapping("/del.do")
    @ResponseBody
    public JsonData deleteFavourable(int favID){
        int result = favourableService.deleteFavourable(favID);
        if (result == 1){
            return JsonData.getDeleteSuccessData();
        }
        return JsonData.getDeleteFailedData();
    }

    @RequestMapping("/findAll.do")
    @ResponseBody
    public JsonData findAll(){
        List favList = favourableService.findAllFavourable();
        return JsonData.getJsonData(new JsonData(0, "获取数据成功", favList));
    }
}
