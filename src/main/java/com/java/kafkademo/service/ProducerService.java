package com.java.kafkademo.service;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class ProducerService {

    private static final String TOPIC = "narendra-topic";

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessage(String message){
        System.out.println(String.format("$$ -> Producing message --> %s",message));
        this.kafkaTemplate.send(TOPIC,message);
    }
}
