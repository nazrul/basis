package gov.brta.dao;

import gov.brta.domain.User;

/**
 * @author misbah
 */
public interface UserDao {
    void save(User user);

    User get(int userId);

    User getUserByUserName(String userName);
}
