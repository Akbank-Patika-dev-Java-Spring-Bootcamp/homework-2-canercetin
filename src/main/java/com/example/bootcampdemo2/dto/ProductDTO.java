package com.example.bootcampdemo2.dto;

import com.example.bootcampdemo2.entity.User;
import com.example.bootcampdemo2.enums.EnumStatus;

public record ProductDTO(Long id,
                        User user,
                        String title,
                        String description,
                        byte[] image,
                        Double price,
                        EnumStatus status) {
}
