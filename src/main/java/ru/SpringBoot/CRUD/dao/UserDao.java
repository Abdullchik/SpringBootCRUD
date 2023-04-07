package ru.SpringBoot.CRUD.dao;
import ru.SpringBoot.CRUD.model.User;

import java.util.List;

public interface UserDao {
    void add(User car);

    void update(User user);

    void delete(long id);

    List<User> getUsersList();
}
