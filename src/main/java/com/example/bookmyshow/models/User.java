package com.example.bookmyshow.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity(name = "book_my_show_users")
public class User extends BaseModel{
    private String name;
    @Column(unique = true)
    private String email;
    private String password;
}
