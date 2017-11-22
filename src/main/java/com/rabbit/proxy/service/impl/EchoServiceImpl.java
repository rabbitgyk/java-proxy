package com.rabbit.proxy.service.impl;

import com.rabbit.proxy.service.EchoService;

/**
 * @Author: guoyankui
 * @DATE: 23/11/2017 12:11 AM
 */
public class EchoServiceImpl implements EchoService {

    public String sayHello(String name) {
        System.out.println("my hello is say ok");
        return "hello" + name;
    }
}
