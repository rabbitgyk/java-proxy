package com.rabbit.proxy;

import com.rabbit.proxy.handler.MyProxy;
import com.rabbit.proxy.service.EchoService;
import com.rabbit.proxy.service.impl.EchoServiceImpl;

import java.lang.reflect.Proxy;

/**
 * @Author: guoyankui
 * @DATE: 23/11/2017 12:12 AM
 */
public class Main {
    public static void main(String[] args) {
        EchoService service = new EchoServiceImpl();

        MyProxy myProxy = new MyProxy(service);

        EchoService serviceProxy = (EchoService) Proxy.newProxyInstance(service.getClass().getClassLoader(),service.getClass().getInterfaces(), myProxy);

        serviceProxy.sayHello("guoyankui");
    }
}
