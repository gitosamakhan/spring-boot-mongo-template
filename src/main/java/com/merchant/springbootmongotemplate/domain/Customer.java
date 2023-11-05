package com.merchant.springbootmongotemplate.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Customer {
    @Id
    private int id;
    private String name;
    private String email;
}
