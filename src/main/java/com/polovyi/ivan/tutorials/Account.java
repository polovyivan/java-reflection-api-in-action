package com.polovyi.ivan.tutorials;

import java.time.LocalDate;

public abstract class Account {
    public String id;
    private String name;
    private String address;
    private LocalDate createdAt;

    public Account(String id, String name, String address, LocalDate createdAt) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.createdAt = createdAt;
    }

    public Account() {
    }
}
