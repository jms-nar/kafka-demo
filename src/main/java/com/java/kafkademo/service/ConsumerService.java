package com.java.kafkademo.service;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "narendra-topic", groupId = "group_id")
    public void consume(String message){
        System.out.println(String.format("$$ -> Consumed Message -> %s",message));
    }
}
