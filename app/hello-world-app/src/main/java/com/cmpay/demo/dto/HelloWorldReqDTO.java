package com.cmpay.demo.dto;

import com.cmpay.framework.data.request.GenericDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.stereotype.Component;


@ApiModel(value="HelloWorldReqDTO", description="hello请求对象")
public class HelloWorldReqDTO extends GenericDTO {
    @ApiModelProperty(name="消息")
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
