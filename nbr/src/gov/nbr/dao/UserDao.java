package gov.nbr.dao;

import gov.nbr.domain.User;

/**
 * @author misbah
 */
public interface UserDao {
    void save(User user);

    User get(int userId);

    User getUserByUserName(String userName);
}
