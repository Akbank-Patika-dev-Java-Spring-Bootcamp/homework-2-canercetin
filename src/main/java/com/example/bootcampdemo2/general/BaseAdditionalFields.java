package com.example.bootcampdemo2.general;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Embeddable
@Getter
@Setter
public class BaseAdditionalFields {

    @Column(name = "ID_USER_CREATED_BY")
    private Long createdBy;
    @Column(name = "ID_USER_UPDATED_BY")
    private Long updatedBy;
    @Column(name = "CREATION_DATE")
    private LocalDateTime creationDate;
    @Column(name = "UPDATE_DATE")
    private LocalDateTime updateDate;

}
