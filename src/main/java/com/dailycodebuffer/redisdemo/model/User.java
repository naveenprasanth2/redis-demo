package com.dailycodebuffer.redisdemo.model;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String firstName;
    private String lastName;
    private String emailId;
    private int age;
}
