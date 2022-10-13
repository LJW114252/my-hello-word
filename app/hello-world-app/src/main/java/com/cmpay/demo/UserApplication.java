package com.cmpay.demo;

import com.cmpay.lemon.common.LemonFramework;
import com.cmpay.lemon.framework.LemonBootApplication;

@LemonBootApplication
public class UserApplication {
    public static void main(String[] args) {
        LemonFramework.run(UserApplication.class, args);
    }
}
