package com.example.tdplay.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zhiwen.zuo
 * @date 2019-08-02
 **/
@Data
public class DeviceEvent implements Serializable {
    private Long ts;

    private String carrierId;

    private String deviceId;

    private String driverId;

    private String value;

    private Integer eventCmdId;
}

