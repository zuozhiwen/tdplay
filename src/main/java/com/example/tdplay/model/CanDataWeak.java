package com.example.tdplay.model;


import lombok.Data;

import java.io.Serializable;

/**
 * @author zhiwen.zuo
 * @date 2019-09-02
 **/
@Data
public class CanDataWeak implements Serializable {
    private Long ts;

    private String carrierId;

    private String deviceId;

    private String driverId;

    private String rfid;

    private Integer hourOfCreatedAt;

    private Double avgVelocity;

    private Double distance;

    private Double absDistance;

    private Double movingTime;

    private Integer batteryVolt;

    private Integer batteryCurrent;

    private Integer batteryState;

    private Double brakeTime;

    private Double seatTime;

    private Double forkTime;

    private Double overlapTime;

    private Integer forkCounter;

    private Integer moveCounter;

    private Integer forwardCounter;

    private Integer reverseCounter;

    private Integer directionChangeCounter;

    private Double forwardTime;

    private Double reverseTime;

    private Double forwardDistance;

    private Double reverseDistance;

    private Double carryTime;

    private Integer carryCount;

    private Double turnOnTime;
}
