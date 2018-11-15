package com.mbyy.portal.service;

import com.mbyy.portal.pojo.Star;

import java.util.List;

public interface StarService {
    Star selectByName(String name);
    List<Star> selectAll();
    List<Star> selectByType(String type);
}
