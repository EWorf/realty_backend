package com.example.propertymanagement.entity;

import java.util.Date;

public class Room {
    private Integer roomId;

    private String roomNumber;

    private Integer roomStatus;

    private Date roomBeginTime;

    private Date roomEndTime;

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber == null ? null : roomNumber.trim();
    }

    public Integer getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(Integer roomStatus) {
        this.roomStatus = roomStatus;
    }

    public Date getRoomBeginTime() {
        return roomBeginTime;
    }

    public void setRoomBeginTime(Date roomBeginTime) {
        this.roomBeginTime = roomBeginTime;
    }

    public Date getRoomEndTime() {
        return roomEndTime;
    }

    public void setRoomEndTime(Date roomEndTime) {
        this.roomEndTime = roomEndTime;
    }
}