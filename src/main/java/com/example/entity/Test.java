package com.example.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;


@TableName("test")
public class Test extends Model<Test> {
    /**
      * 主键
      */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
      * 城市 
      */
    private String name;

    /**
      * 天气 
      */
    private String weather;

    /**
      * 最高气温 
      */
    private Double max;

    /**
      * 最低气温 
      */
    private Double min;

    /**
      * 风 
      */
    private String wind;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
         this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
         this.name = name;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
         this.weather = weather;
    }

    public Double getMax() {
        return max;
    }

    public void setMax(Double max) {
         this.max = max;
    }

    public Double getMin() {
        return min;
    }

    public void setMin(Double min) {
         this.min = min;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
         this.wind = wind;
    }

}