package com.hessian.demo.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by ZhangQingrong on 2017/1/18.
 */
@Component
public class AppProperties {

    @Value("${testValue}")
    private String value1;

    public static String value2;

    private String value3;

    public static String value4;

    public String getValue1() {
        return value1;
    }

    public void setValue1(String value1) {
        this.value1 = value1;
    }

    public static String getValue2() {
        return value2;
    }

    @Value("#{settings['${testValue}']}")
    public static void setValue2(String value2) {
        AppProperties.value2 = value2;
    }

    public String getValue3() {
        return value3;
    }

    @Value("${testValue}")
    public void setValue3(String value3) {
        this.value3 = value3;
    }

    public String getValue4() {
        return value4;
    }

    @Value("${testValue}")
    public void setValue4(String value4) {
        AppProperties.value4 = value4;
    }
}
