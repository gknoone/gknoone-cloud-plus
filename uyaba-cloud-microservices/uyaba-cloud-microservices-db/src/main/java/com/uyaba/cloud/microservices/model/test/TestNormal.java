package com.uyaba.cloud.microservices.model.test;

import lombok.Data;

import java.io.Serializable;
@Data
public class TestNormal implements Serializable {
    private Long id;

    private String name;

    private static final long serialVersionUID = 1L;
}