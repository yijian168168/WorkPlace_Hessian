package com.hessian.demo.server.service;

import com.hessian.demo.server.interf.HessianServerIntf;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2015/7/2 0002.
 */
@Service
public class HessianServerImpl implements HessianServerIntf {

    @Value("testValue")
    private String testValue;

    @Value("testValue")
    private String testStaticValue;

    public String method1(String msg) {

        System.out.println("HessianServerImpl,接收到消息：" + msg);

        return "i receive your msg ";
    }

    public String getTestValue() {
        return testValue;
    }

    public void setTestValue(String testValue) {
        this.testValue = testValue;
    }

    public String getTestStaticValue() {
        return testStaticValue;
    }

    public void setTestStaticValue(String testStaticValue) {
        this.testStaticValue = testStaticValue;
    }
}
