package com.encom.producer.kafka;

import com.encom.producer.model.DataDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Slf4j
@RequiredArgsConstructor
@Service
public class DataProducerService {
    private final KafkaTemplate<String, Object> kafkaTemplate;

    @Value("${spring.kafka.template.send-data-topic}")
    private String dataTopic;

    @PostConstruct
    public void start() {
        DataDto data = new DataDto();
        data.setTitle("testTitle");
        data.setDescription("Hello World!");
        sendData(data);
    }

    public void sendData(DataDto value) {
        log.info("Outgoing data: {}", value);
        kafkaTemplate.send(dataTopic, value);
    }
}
