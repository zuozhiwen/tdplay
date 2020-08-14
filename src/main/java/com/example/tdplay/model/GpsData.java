package com.example.tdplay.model;

import lombok.Data;

import java.io.Serializable;

/**
 * gps_data
 * @author zhiwen.zuo
 * @date 2019-08-07
 */
@Data
public class GpsData implements Serializable {
    private long ts;

    private String carrierId;

    private String deviceId;

    private String driverId;

    private double longitude;

    private double latitude;

    private double hdop;

    private double speed;
}