package gov.sonali_bank.service;

import gov.sonali_bank.domain.User;

/**
 * @author misbah
 */
public interface UserService {
    void save(User user);

    User get(int userId);

    User getUserByUserNameAndPassword(String userName, String password);
}
