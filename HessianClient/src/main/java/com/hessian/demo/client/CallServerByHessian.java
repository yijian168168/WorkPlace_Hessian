package com.hessian.demo.client;

import com.caucho.hessian.client.HessianProxyFactory;
import com.dubbo.bean.dubbo.DubboRespInfo;
import com.dubbo.bean.dubbo.DubboSendInfo;
import com.dubbo.intf.dubbo.DubboService;
import com.hessian.demo.client.interf.HessianServerIntf;
import org.junit.Test;

import java.net.MalformedURLException;

/**
 * 通过hessian 客户端的方式访问Server
 *
 * Created by Lenovo-PC-QR on 2016/9/22.
 */
public class CallServerByHessian {

    @Test
    public void testClient(){
        HessianProxyFactory factoryBean = new HessianProxyFactory();
        factoryBean.setConnectTimeout(50000);
        factoryBean.setReadTimeout(50000);
        String url = "http://127.0.0.1:8086/test1Service";
        HessianServerIntf testService = null;
        String returnMsg = null;
        try {
            testService = (HessianServerIntf)factoryBean.create(HessianServerIntf.class,url);
            returnMsg = testService.method1("你好！ ");
            System.out.println("接收到响应消息：" + returnMsg);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void testClientHessian(){
        HessianProxyFactory factoryBean = new HessianProxyFactory();
        factoryBean.setConnectTimeout(50000);
        factoryBean.setReadTimeout(50000);
        String url = "http://127.0.0.1:8080";
        DubboService testService = null;
        DubboRespInfo returnMsg = null;
        try {
            testService = (DubboService)factoryBean.create(DubboService.class,url);
            DubboSendInfo dubboSendInfo = new DubboSendInfo();
            dubboSendInfo.setInfo("hello");
            returnMsg = testService.service(dubboSendInfo);
            System.out.println("接收到响应消息：" + returnMsg);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testClientHessianString(){
        HessianProxyFactory factoryBean = new HessianProxyFactory();
        factoryBean.setConnectTimeout(50000);
        factoryBean.setReadTimeout(50000);
        String url = "http://127.0.0.1:8080";
        DubboService testService = null;
        String returnMsg = null;
        try {
            testService = (DubboService)factoryBean.create(DubboService.class,url);
            returnMsg = testService.service("hello");
            System.out.println("接收到响应消息：" + returnMsg);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
