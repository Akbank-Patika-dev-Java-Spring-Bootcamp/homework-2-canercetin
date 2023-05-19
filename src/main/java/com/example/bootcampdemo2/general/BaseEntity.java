package com.example.bootcampdemo2.general;

import jakarta.persistence.Embedded;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity implements Serializable, Cloneable {

    @Embedded
    private BaseAdditionalFields baseAdditionalFields;

}
