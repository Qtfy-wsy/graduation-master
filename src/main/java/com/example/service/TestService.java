package com.example.service;

import com.example.entity.Test;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestService extends ServiceImpl<TestMapper, Test> {

    @Resource
    private TestMapper testMapper;

}