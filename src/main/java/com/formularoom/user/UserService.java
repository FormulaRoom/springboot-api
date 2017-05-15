package com.formularoom.user;

import java.util.List;

public interface UserService {

    long count();

    String createUser(User user);

    String editUser(User user);

    String deleteUser(long userId);

    String resetPassword(long userId, String password);

    List<Long> getUserIdLst();

    List<User> getUserLst();

    User getUserById(long id);
}

