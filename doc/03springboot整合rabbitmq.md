#1、添加RabbitMQ依赖
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-amqp</artifactId>
    </dependency>

#2、在application.yml中配置RabbitMQ
    spring:
      rabbitmq:
        addresses: 127.0.0.1:5672
        username: guest
        password: guest
        virtual-host: /
        publisher-confirms: true # 启动确认回调
        publisher-returns: true  # 确认返回回调