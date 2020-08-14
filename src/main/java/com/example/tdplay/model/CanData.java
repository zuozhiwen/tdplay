package com.example.tdplay.model;


import lombok.Data;

import java.io.Serializable;

/**
 * @author zhiwen.zuo
 * @date 2019-08-02
 **/
@Data
public class CanData implements Serializable {
    private long ts;

    private String carrierId;

    private String deviceId;

    private String driverId;

    private String rfid;

    private int hourOfCreatedAt;

    private double avgVelocity;

    private double distance;

    private double absDistance;

    private double movingTime;

    private int batteryVolt;

    private int batteryCurrent;

    private int batteryState;

    private double brakeTime;

    private double seatTime;

    private double forkTime;

    private double overlapTime;

    private int forkCounter;

    private int moveCounter;

    private int forwardCounter;

    private int reverseCounter;

    private int directionChangeCounter;

    private double forwardTime;

    private double reverseTime;

    private double forwardDistance;

    private double reverseDistance;

    private double carryTime;

    private int carryCount;

    private double turnOnTime;
}
