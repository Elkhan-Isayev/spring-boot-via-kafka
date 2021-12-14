package com.encom.consumer.kafka;

import com.encom.consumer.model.DataDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class DataConsumerService {
    @KafkaListener(topics = "${spring.kafka.template.send-data-topic}", groupId = "encom-team-group")
    public void consumeNotification(DataDto dataDto) {
        log.info("incoming data DTO: {}", dataDto.toString());
//        System.out.println(dataDto);
    }
}
