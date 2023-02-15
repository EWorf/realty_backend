package com.example.propertymanagement.dao;

import com.example.propertymanagement.entity.Login;
import java.util.List;

public interface LoginMapper {
    int deleteByPrimaryKey(Integer loginId);

    int insert(Login record);

    Login selectByPrimaryKey(Integer loginId);

    List<Login> selectAll();

    int updateByPrimaryKey(Login record);
}