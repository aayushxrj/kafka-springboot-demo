package com.aayushxrj.kafka_springboot_demo;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "aayushxrj",
            groupId = "groupId"
    )
    void Listener(String data){
        System.out.println("Listener Received : "+data + " 🎉");
    }
}
