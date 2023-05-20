package com.example.bootcampdemo2.dto;

import com.example.bootcampdemo2.entity.User;
import com.example.bootcampdemo2.enums.EnumStatus;

public record ProductSaveRequest(String title,
                                 String description,
                                 byte[] image,
                                 Double price,
                                 EnumStatus status) {
}
