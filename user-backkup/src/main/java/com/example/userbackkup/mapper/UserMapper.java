package com.example.userbackkup.mapper;


import com.example.userbackkup.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAll();




}
