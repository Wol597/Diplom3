package ru.yandex.practicum.user;

import lombok.Getter;
import lombok.Setter;

@Setter
public class User {
    @Getter
    private String name;
    private String email;
    @Getter
    private String password;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email.toLowerCase();
    }

}
