package com.encom.producer.service.impl;

import com.encom.producer.model.DataDto;
import com.encom.producer.model.ResponseData;
import com.encom.producer.service.DataProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DataProducerServiceImpl implements DataProducerService {
    @Value("${spring.kafka.template.send-data-topic}")
    private String dataTopic;
    private final KafkaTemplate<String, Object> kafkaTemplate;

    @Override
    public ResponseData<DataDto> sendData(DataDto data) {
        kafkaTemplate.send(dataTopic, data);
        return ResponseData.<DataDto>builder()
            .code(200)
            .message("Dto sended, check consumer 8)")
            .body(data)
            .build();
    }
}
