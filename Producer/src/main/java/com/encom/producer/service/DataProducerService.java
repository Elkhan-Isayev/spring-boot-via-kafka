package com.encom.producer.service;

import com.encom.producer.model.DataDto;
import com.encom.producer.model.ResponseData;

public interface DataProducerService {
    DataDto sendData(DataDto data);
}
