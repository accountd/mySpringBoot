package com.example.sd.mapper;

import com.example.sd.domain.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper {
    User findById(Long id);
}
