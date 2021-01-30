package com.slt.producer.producer;

import com.slt.common.entity.Order;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;
    /**
     * 还要在 rabbitmq 控制台配置exchange和queue，并绑定
     * 加绑定在控制台的exchange和queues哪一块都可以
     */
    public void send(Order order) throws  Exception{
        CorrelationData correlationData = new CorrelationData();
        correlationData.setId(order.getMessageId());

        rabbitTemplate.convertAndSend("order-exchange",//exchange 交换机
                "order.abcd",//routingKey 路由键
                order,//消息内容
                correlationData);//消息唯一id

    }
}
