package ru.SpringBoot.CRUD.service;

import ru.SpringBoot.CRUD.model.User;

import java.util.List;

public interface UserService {
    void add(User user);

    void update(User user);

    void delete(long id);

    List<User> getUsersList();
}