package net.isaccanedo.springboot.loginregistrationspringbootauthjsp.service;

import net.isaccanedo.springboot.loginregistrationspringbootauthjsp.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
