package com.cmpay.demo.controller;


import com.cmpay.demo.dto.HelloWorldReqDTO;
import com.cmpay.demo.dto.HelloWorldRspDTO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
@RequestMapping("/demo")
public class HelloWorldController {


    @ApiOperation(value="hello world", notes="hello world", produces="application/json")
    @ApiResponse(code = 200, message = "hello world")
    @GetMapping("/hello")
    public HelloWorldRspDTO hello(HelloWorldReqDTO reqDTO) {
        HelloWorldRspDTO rspDTO = new HelloWorldRspDTO();
        rspDTO.setMessage("Hello World Wolrd!");
        System.out.println("hello");
        return rspDTO;
    }
}
