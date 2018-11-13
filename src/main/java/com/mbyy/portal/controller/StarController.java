package com.mbyy.portal.controller;

import com.mbyy.portal.pojo.Star;
import com.mbyy.portal.service.StarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class StarController {
    @Autowired
    private StarService starService;

    @GetMapping(value = "selectByName")
    public Star selectByName(String name){
        return starService.selectByName(name);
    }

    @GetMapping(value = "selectAll")
    public List<Star> selectAll(){
        return starService.selectAll();
    }
}
