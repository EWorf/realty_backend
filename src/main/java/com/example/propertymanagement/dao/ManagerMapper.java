package com.example.propertymanagement.dao;

import com.example.propertymanagement.entity.Manager;
import java.util.List;

public interface ManagerMapper {
    int deleteByPrimaryKey(Integer managerId);

    int insert(Manager record);

    Manager selectByPrimaryKey(Integer managerId);

    List<Manager> selectAll();

    int updateByPrimaryKey(Manager record);
}