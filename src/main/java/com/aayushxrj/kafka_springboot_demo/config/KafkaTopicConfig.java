package com.aayushxrj.kafka_springboot_demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic aayushxrjTopic(){
        return TopicBuilder.name("aayushxrj")
                .build();
    }
}
