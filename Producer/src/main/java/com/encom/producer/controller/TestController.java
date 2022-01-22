package com.encom.producer.controller;

import com.encom.producer.model.DataDto;
import com.encom.producer.model.ResponseData;
import com.encom.producer.service.DataProducerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Controller
@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/test")
public class TestController {
    private final DataProducerService dataProducerService;

    @PostMapping("/send")
    public ResponseData<DataDto> sendDataToConsumer(@RequestBody DataDto dataDto) {
        return dataProducerService.sendData(dataDto);
    }
}
