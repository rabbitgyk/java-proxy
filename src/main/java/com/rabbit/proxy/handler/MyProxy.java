package com.rabbit.proxy.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Author: guoyankui
 * @DATE: 23/11/2017 12:03 AM
 */
public class MyProxy implements InvocationHandler {

    Object target;

    public MyProxy(Object target){
        this.target = target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("start my hi");
        Object result = method.invoke(target,args);
        System.out.println("end my hi");
        return result;
    }
}
