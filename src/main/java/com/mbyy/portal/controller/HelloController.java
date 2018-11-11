package com.mbyy.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class HelloController {
    @GetMapping(value = "product.html")
    public String product(){
        return "product";
    }
    @RequestMapping(value = "index.html",method = RequestMethod.GET)
    public String index(){
        return "index";
    }
    @RequestMapping(value = "service.html",method = RequestMethod.GET)
    public String service(){
        return "service";
    }
    @RequestMapping(value = "job.html",method = RequestMethod.GET)
    public String job(){
        return "job";
    }
    @RequestMapping(value = "information-detail.html",method = RequestMethod.GET)
    public String information_detail(){
        return "information-detail";
    }
    @RequestMapping(value = "information.html",method = RequestMethod.GET)
    public String information(){
        return "information";
    }
    @RequestMapping(value = "error.html",method = RequestMethod.GET)
    public String error(){
        return "error";
    }
    @RequestMapping(value = "employ.html",method = RequestMethod.GET)
    public String employ(){
        return "employ";
    }
    @RequestMapping(value = "about.html",method = RequestMethod.GET)
    public String about(){
        return "about";
    }
    @RequestMapping(value = "resume.html",method = RequestMethod.GET)
    public String resume(){
        return "resume";
    }
    @RequestMapping(value = "con-",method = RequestMethod.GET)
    public String con_service(){
        return "product/con-service";
    }
    @RequestMapping(value = "con-service-list.html",method = RequestMethod.GET)
    public String con_service_list(){
        return "product/con-service-list";
    }
    @RequestMapping(value = "product-",method = RequestMethod.GET)
    public String product_service(){
        return "product/product-service";
    }
    @RequestMapping(value = "skill-form.html",method = RequestMethod.GET)
    public String skill_form(){
        return "product/skill-form";
    }

    @RequestMapping(value = "test.html",method = RequestMethod.GET)
    public String test(){
        return "test";
    }

}
