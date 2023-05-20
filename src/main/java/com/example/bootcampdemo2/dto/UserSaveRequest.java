package com.example.bootcampdemo2.dto;

import com.example.bootcampdemo2.enums.EnumStatus;
import com.example.bootcampdemo2.enums.EnumUserType;

public record UserSaveRequest(String userName,
                              String email,
                              String phoneNumber,
                              String password,
                              EnumUserType userType,
                              EnumStatus status) {
}
