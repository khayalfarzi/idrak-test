package az.company.idraktest.service;

import az.company.idraktest.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
