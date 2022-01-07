package com.atguigu.gmall;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 生产者服务入口
 *
 * @author Athletic
 * Created on 2022-01-05 18:42:23
 */
public class MainApplication {

    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("provider.xml");
        ioc.start();

        System.in.read();
    }

}
