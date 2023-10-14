package com.example.productservice_proxy.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
public abstract class BaseModel {

    private Long id;
    private Date CreatedAt;
    private Date lastUpdatedAt;
    private boolean isDeleted;


}
