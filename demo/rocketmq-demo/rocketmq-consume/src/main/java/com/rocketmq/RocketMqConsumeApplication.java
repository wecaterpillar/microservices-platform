package com.rocketmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Rocketmq消费者 demo
 *
 */
@SpringBootApplication
public class RocketMqConsumeApplication {
    public static void main(String[] args) {
        SpringApplication.run(RocketMqConsumeApplication.class, args);
    }
}
