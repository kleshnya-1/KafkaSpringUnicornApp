package ru.laptseu.unicornApp.kafka.producers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerFullUnicornStateMessage {

    @Value("${unicorn.kafka.topics.names.fullInfo}")
   // @Value("${logFile.address}")
    private static  String TOPIC;

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void writeMessage(String msg){

        this.kafkaTemplate.send(TOPIC, msg);
    }

}
