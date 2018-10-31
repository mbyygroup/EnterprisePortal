package com.mbyy.portal;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mbyy.portal.mapper")
public class PortalApplication {

    private final static Logger LOGGER= LoggerFactory.getLogger(PortalApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(PortalApplication.class, args);
        LOGGER.info("项目启动");
    }
}
