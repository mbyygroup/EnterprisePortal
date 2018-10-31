package com.mbyy.portal.conmon.interceptor;


import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/*
*
* 配置首页
* */
@Configuration
public class MyAdapter extends WebMvcConfigurerAdapter {
    public void addViewController(ViewControllerRegistry registry){
        registry.addViewController("/").setViewName("forward:/index.html");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
        super.addViewControllers(registry);
    }
}
