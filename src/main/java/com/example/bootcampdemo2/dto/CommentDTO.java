package com.example.bootcampdemo2.dto;

import com.example.bootcampdemo2.entity.Product;
import com.example.bootcampdemo2.entity.User;
import com.example.bootcampdemo2.enums.EnumStatus;

public record CommentDTO (Long id,
                          User user,
                          Product product,
                          String title,
                          String message,
                          EnumStatus status) {

}
