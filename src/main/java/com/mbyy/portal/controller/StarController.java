package com.mbyy.portal.controller;

import com.mbyy.portal.pojo.Star;
import com.mbyy.portal.service.StarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/api/")
public class StarController {
    private static final String URI_THIS="product/con-service-list";

    @Autowired
    private StarService starService;

    @GetMapping(value = "selectByName")
    public Star selectByName(String name){
        return starService.selectByName(name);
    }

    @GetMapping(value = "con-service-list.html")
    public String selectAll(ModelMap map){
        map.addAttribute("list",starService.selectAll());
        return URI_THIS;
    }

    @GetMapping(value = "selectByType")
    public List<Star> selectByType(String type){
        return starService.selectByType(type);}
}
