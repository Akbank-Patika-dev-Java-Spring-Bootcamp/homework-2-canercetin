package com.example.bootcampdemo2.entity;

import com.example.bootcampdemo2.enums.EnumStatus;
import com.example.bootcampdemo2.enums.EnumUserType;
import com.example.bootcampdemo2.general.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "USERS")
@Getter
@Setter
public class User extends BaseEntity {

    @Id
    @GeneratedValue(generator = "User", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "User", sequenceName = "USER_ID_SEQ")
    @Column(name = "ID")
    private Long id;

    @Column(name = "USER_NAME", length = 50, nullable = false, unique = true)
    private String userName;

    @Column(name = "EMAIL", length = 50, nullable = false, unique = true)
    private String email;

    @Column(name = "PHONE_NUMBER", length = 30, nullable = false, unique = true)
    private String phoneNumber;

    @Column(name = "PASSWORD", length = 400)
    private String password;

    @Column(name = "USER_TYPE", length = 30, nullable = false)
    @Enumerated(EnumType.STRING)
    private EnumUserType userType;

    @Column(name = "STATUS", length = 30, nullable = false)
    @Enumerated(EnumType.STRING)
    private EnumStatus status;
}
