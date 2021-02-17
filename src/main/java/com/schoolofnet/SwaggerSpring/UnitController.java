package com.schoolofnet.SwaggerSpring;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/units")
@Api(value = "Units")
public class UnitController {

    @GetMapping
    @ApiOperation(value = "Get Units measures")
    public String getAll() {
        return "cm, m, g, kg";
    }
}
