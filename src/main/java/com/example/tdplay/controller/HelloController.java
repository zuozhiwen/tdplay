package com.example.tdplay.controller;

import com.example.tdplay.model.DeviceEvent;
import com.example.tdplay.repository.DeviceEventDAO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("hello")
@AllArgsConstructor
public class HelloController {
    private final DeviceEventDAO deviceEventDAO;

    @GetMapping
    public Object index() {
        DeviceEvent item = new DeviceEvent();
        item.setCarrierId("carrier_001");
        item.setDeviceId("device_001");
        item.setDriverId("driver_001");
        item.setTs(System.currentTimeMillis());
        item.setEventCmdId(52);
        item.setValue("1");
        deviceEventDAO.importOne("device_event_test001", item);
        return System.currentTimeMillis();
    }
}
