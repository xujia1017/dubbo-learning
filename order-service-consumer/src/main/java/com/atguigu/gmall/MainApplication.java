package com.atguigu.gmall;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.atguigu.gmall.service.OrderService;

/**
 * 消费者入口
 *
 * @author Athletic
 * Created on 2022-01-06 11:33:43
 */
public class MainApplication {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");

        OrderService orderService = applicationContext.getBean(OrderService.class);

        orderService.initOrder("1");
        System.out.println("调用完成....");

        //只是为了阻塞
        System.in.read();
    }

}
