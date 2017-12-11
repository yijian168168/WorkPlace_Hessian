package com.hessian.demo.client;

import com.hessian.demo.client.interf.HessianServerIntf;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 通过SpringHessian 的方式访问Server
 * <p>
 * Created by Lenovo-PC-QR on 2016/9/22.
 */
public class CallServerBySpringHessian {

    private HessianServerIntf hessianServer;

    @Before
    public void init() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/springHessian-client.xml");
        hessianServer = applicationContext.getBean(HessianServerIntf.class);
    }

    @Test
    public void testClient() {
        String result = hessianServer.method1("hello");
        System.out.println("receive response msg : " + result);
    }
}
