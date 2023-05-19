package com.example.bootcampdemo2.entity;

import com.example.bootcampdemo2.enums.EnumStatus;
import com.example.bootcampdemo2.general.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "COMMENTS")
@Getter
@Setter
public class Comment extends BaseEntity {

    @Id
    @GeneratedValue(generator = "Comment", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "Comment", sequenceName = "COMMENT_ID_SEQ")
    @Column(name = "ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_USER")
    private User user;

    @ManyToOne
    @JoinColumn(name = "ID_PRODUCT")
    private Product product;

    @Column(name = "TITLE", length = 100, nullable = false)
    private String title;

    @Column(name = "MESSAGE", length = 400)
    private String message;

    @Column(name = "STATUS", length = 30)
    @Enumerated(EnumType.STRING)
    private EnumStatus status;
}
