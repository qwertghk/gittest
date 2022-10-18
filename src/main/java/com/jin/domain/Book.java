package com.jin.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Data
public class Book {

    private String name;
    private Integer id;
    private String type;
    private String description;


}
