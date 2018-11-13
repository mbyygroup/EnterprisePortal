package com.mbyy.portal.service.impl;

import com.mbyy.portal.mapper.StarMapper;
import com.mbyy.portal.pojo.Star;
import com.mbyy.portal.service.StarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StarServiceImpl implements StarService {
    @Autowired
    private StarMapper starMapper;

    @Override
    public Star selectByName(String name) {
        return starMapper.selectByName(name);
    }

    @Override
    public List<Star> selectAll() {
        return starMapper.selectAll();
    }
}
