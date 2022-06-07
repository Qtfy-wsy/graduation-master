package com.example.mapper;


import com.example.entity.Analysis1;
import com.example.entity.Analysis2;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AnalysisMapper {


    @Select("select * from tbl_analysis1 limit 15")
    List<Analysis1> getAnalysis1();

    @Select("select * from tbl_analysis2")
    List<Analysis2> getAnalysis2();


}
