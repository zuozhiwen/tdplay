package com.example.tdplay.model;

import lombok.Data;

/**
 * @author zhiwen.zuo
 * @date 2019-09-06
 **/
@Data
public class GpsDataWeak {
    private Long ts;

    private String carrierId;

    private String deviceId;

    private String driverId;

    private Double longitude;

    private Double latitude;

    private Double hdop;

    private Double speed;
}
