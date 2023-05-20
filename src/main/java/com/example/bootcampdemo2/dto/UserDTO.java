package com.example.bootcampdemo2.dto;

import com.example.bootcampdemo2.enums.EnumStatus;
import com.example.bootcampdemo2.enums.EnumUserType;

public final record UserDTO(Long id,
                           String userName,
                           String email,
                           String phoneNumber,
                           EnumUserType userType,
                           EnumStatus status) {
}
