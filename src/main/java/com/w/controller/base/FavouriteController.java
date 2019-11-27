package com.w.controller.base;

import com.w.domain.Favourable;
import com.w.service.FavourableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
@Controller
@RequestMapping("/fav")
public class FavouriteController {

    @Autowired
    private FavourableService favourableService;

    @RequestMapping("/update.do")
    public String updateFavourable(Favourable favourable){
        int result = favourableService.updateFavourable(favourable);
        if (result == 1) {
            return "success";
        }
        return "filed";
    }

    @RequestMapping("/add.do")
    public String addFavourable(Favourable favourable){
        int result = favourableService.addFavourable(favourable);
        if (result == 1) {
            return "success";
        }
        return "filed";
    }

    @RequestMapping("/del.do")
    public String deleteFavourable(int favID){
        int result = favourableService.deleteFavourable(favID);
        if (result == 1) {
            return "success";
        }
        return "filed";
    }

    @RequestMapping("/findAll.do")
    @ResponseBody
    public List<Favourable> findAll(){
        List favList = favourableService.findAllFavourable();
        return favList;
    }
}
