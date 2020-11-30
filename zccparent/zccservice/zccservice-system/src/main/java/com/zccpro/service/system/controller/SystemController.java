package com.zccpro.service.system.controller;

import com.zccpro.boot.common.base.Result;
import com.zccpro.service.system.dto.SystemDTO;
import com.zccpro.service.system.service.ISystemService;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "system")
@AllArgsConstructor
@Api(tags = "zccpro-system")
public class SystemController {


    @Autowired
    private final ISystemService systemService;

    @GetMapping(value = "list")
    @ApiOperation(value = "system list接口")
    public Object list() {
        return systemService.list();
    }


    @GetMapping(value = "page")
    @ApiOperation(value = "system page接口")
    public Object page() {
        return systemService.page();
    }

    @GetMapping(value = "exception")
    @ApiOperation(value = "自定义异常及返回测试接口")
    public Result<String> exception() {
        return Result.data(systemService.exception());
    }

    @PostMapping(value = "valid")
    @ApiOperation(value = "参数校验测试接口")
    public Result<SystemDTO> valid(@Valid @RequestBody SystemDTO systemDTO) {
        return Result.data(systemDTO);
    }
}
