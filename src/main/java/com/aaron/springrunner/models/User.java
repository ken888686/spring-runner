package com.aaron.springrunner.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private long id;

    private String username;

    private String name;

    private String email;

    private String password;
}
