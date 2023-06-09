package ru.SpringBoot.CRUD.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.SpringBoot.CRUD.dao.UserDao;
import ru.SpringBoot.CRUD.model.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private final UserDao userDao;

    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Transactional
    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Transactional
    @Override
    public void delete(long id) {
        try {
            userDao.delete(id);
        } catch (Exception e) {
            throw new IllegalArgumentException("Введены неверные данные");
        }
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getUsersList() {
        return userDao.getUsersList();
    }
}