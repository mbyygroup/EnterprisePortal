package com.mbyy.portal.mapper;

import com.mbyy.portal.pojo.Star;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface StarMapper {
    Star selectByName(String name);
    List<Star> selectAll();
    List<Star> selectByType(String type);

}