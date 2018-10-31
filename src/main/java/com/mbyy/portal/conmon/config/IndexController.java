package com.mbyy.portal.conmon.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/*
*
* 通用访问拦截匹配
*
* */
@Controller
public class IndexController {
    /*
    * 页面跳转
    *
    * */

    public String page(@PathVariable("url")String url){
        return url;
    }

    /*
    *
    * 页面跳转（二级目录）
    *
    * */
    @RequestMapping("{module}/{url}.html")
    public String page(@PathVariable("module")String module,@PathVariable("url")String url){
        return module+"/"+url;
    }
}
