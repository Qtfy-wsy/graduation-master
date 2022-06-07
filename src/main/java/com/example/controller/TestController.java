package com.example.controller;

import com.example.common.Result;
import com.example.entity.Test;
import com.example.service.TestService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    @Resource
     private TestService testService;

    @PostMapping
    public Result<?> save(@RequestBody Test test) {
        return Result.success(testService.save(test));
    }

    @PutMapping
    public Result<?> update(@RequestBody Test test) {
        return Result.success(testService.updateById(test));
    }

    @DeleteMapping("/{id}")
    public Result<?> delete(@PathVariable Long id) {
        testService.removeById(id);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result<Test> findById(@PathVariable Long id) {
        return Result.success(testService.getById(id));
    }

    @GetMapping
    public Result<List<Test>> findAll() {
        return Result.success(testService.list());
    }

    @GetMapping("/page")
    public Result<IPage<Test>> findPage(@RequestParam(required = false, defaultValue = "") String name,
                                           @RequestParam(required = false, defaultValue = "1") Integer pageNum,
                                           @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        return Result.success(testService.page(new Page<>(pageNum, pageSize), Wrappers.<Test>lambdaQuery().like(Test::getName, name)));
    }

}