package gov.sonali_bank.dao;

import gov.sonali_bank.domain.User;

/**
 * @author misbah
 */
public interface UserDao {
    void save(User user);

    User get(int userId);

    User getUserByUserName(String userName);
}
