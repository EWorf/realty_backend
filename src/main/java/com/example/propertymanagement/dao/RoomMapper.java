package com.example.propertymanagement.dao;

import com.example.propertymanagement.entity.Room;
import java.util.List;

public interface RoomMapper {
    int deleteByPrimaryKey(Integer roomId);

    int insert(Room record);

    Room selectByPrimaryKey(Integer roomId);

    List<Room> selectAll();

    int updateByPrimaryKey(Room record);
}