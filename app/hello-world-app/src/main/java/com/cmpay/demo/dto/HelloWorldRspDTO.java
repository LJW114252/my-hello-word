package com.cmpay.demo.dto;

import com.cmpay.framework.data.response.GenericRspDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


@ApiModel(value = "HelloWorldRspDTO", description = "hello响应对象")
public class HelloWorldRspDTO extends GenericRspDTO {
    @ApiModelProperty(name = "消息")
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
