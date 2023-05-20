package com.example.bootcampdemo2.mapper;

import com.example.bootcampdemo2.dto.UserDTO;
import com.example.bootcampdemo2.dto.UserSaveRequest;
import com.example.bootcampdemo2.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    User saveRequestToUser(UserSaveRequest userSaveRequest);
    UserDTO userToUserDto(User user);
    List<UserDTO> userListToUserDtoList(List<User> users);

}
