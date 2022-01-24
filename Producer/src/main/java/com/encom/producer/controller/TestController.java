package com.encom.producer.controller;

import com.encom.producer.model.DataDto;
import com.encom.producer.model.ResponseData;
import com.encom.producer.service.DataProducerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/test")
public class TestController {
    private final DataProducerService dataProducerService;

    @PostMapping("/send")
    public ResponseData<DataDto> sendDataToConsumer(@RequestBody DataDto dataDto) {
        DataDto data = dataProducerService.sendData(dataDto);
        return ResponseData.<DataDto>builder()
            .code(200)
            .message("Dto sended, check consumer 8)")
            .body(data)
            .build();
    }
}
