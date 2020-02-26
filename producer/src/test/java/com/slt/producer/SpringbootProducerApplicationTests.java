package com.slt.producer;

import com.slt.common.entity.Order;
import com.slt.producer.producer.OrderSender;
import com.slt.producer.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootProducerApplicationTests {
    @Autowired
    private OrderSender orderSender;

    @Test
    public void testSend() throws Exception {
        Order order = new Order();
        order.setId(2018092101);
        order.setName("测试订单1");
        order.setMessageId(System.currentTimeMillis()+"$"+UUID.randomUUID());
        orderSender.send(order);
    }


    @Autowired
    private OrderService orderService;

    @Test
    public void testSend2() throws Exception {
        Order order = new Order();
        order.setId(2000092101);
        order.setName("测试订单1");
        order.setMessageId(System.currentTimeMillis()+"$"+UUID.randomUUID().toString());
        orderService.createOrder(order);
    }

}
