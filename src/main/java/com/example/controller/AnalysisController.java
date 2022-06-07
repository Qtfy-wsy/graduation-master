package com.example.controller;


import com.example.entity.Analysis1;
import com.example.entity.Analysis2;
import com.example.mapper.AnalysisMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/analysis")
public class AnalysisController {

    @Autowired
    AnalysisMapper analysisMapper;


    @GetMapping("/1")
    public List<Analysis1> getAnalysis1(){
        System.out.println("==================================================");
        System.out.println(analysisMapper.getAnalysis1());
        return analysisMapper.getAnalysis1();
    }

    @GetMapping("/2")
    public List<Analysis2> getAnalysis2(){
        System.out.println(analysisMapper.getAnalysis2());
        return analysisMapper.getAnalysis2();
    }

}
