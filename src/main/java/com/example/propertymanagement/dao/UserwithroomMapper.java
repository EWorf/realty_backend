package com.example.propertymanagement.dao;

import com.example.propertymanagement.entity.Userwithroom;
import java.util.List;

public interface UserwithroomMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Userwithroom record);

    Userwithroom selectByPrimaryKey(Integer id);

    List<Userwithroom> selectAll();

    int updateByPrimaryKey(Userwithroom record);
}