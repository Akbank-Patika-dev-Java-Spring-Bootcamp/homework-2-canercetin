package com.example.bootcampdemo2.entity;

import com.example.bootcampdemo2.enums.EnumStatus;
import com.example.bootcampdemo2.general.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "PRODUCTS")
@Getter
@Setter
public class Product extends BaseEntity {

    @Id
    @GeneratedValue(generator = "Product", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "Product", sequenceName = "PRODUCT_ID_SEQ")
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_USER")
    private User user;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "IMAGE")
    private byte[] image;

    @Column(name = "PRICE")
    private Double price;

    @Column(name = "STATUS")
    @Enumerated(EnumType.STRING)
    private EnumStatus status;

}
