package com.boot.consume;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Queue;

@SpringBootApplication
public class RoomCleanerConsumerApplication {

    @Value("${amqp.queue.name}")
    private String queueName;

    @Value("${amqp.exchange.name}")
    private String exchangeName;

    @Bean
    public Queue queue() {
        return new Queue(queueName, false);
    }

    public static void main(String[] args) {
        SpringApplication.run(RoomCleanerConsumerApplication.class, args);
    }

}
