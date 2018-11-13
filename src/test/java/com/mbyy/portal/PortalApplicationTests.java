package com.mbyy.portal;

import com.mbyy.portal.pojo.Star;
import com.mbyy.portal.service.StarService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PortalApplicationTests {

    @Autowired
    private StarService starService;

    public Star selectByName(String name){
        return null;
    }

    public List<Star> selectAll(){
        return starService.selectAll();
    }
    @Test
    public void contextLoads() {
        selectByName("阿旺");
    }

}
