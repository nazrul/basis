package gov.brta.service;

import gov.brta.dao.UserDao;
import gov.brta.domain.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author misbah
 */

@Service
public class UserServiceImpl implements UserService {
    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    public void save(User user) {

        log.debug("Entered save");
        userDao.save(user);
    }

    public User get(int userId) {
        return userDao.get(userId);
    }

    public User getUserByUserNameAndPassword(String userName, String password) {
        User user = userDao.getUserByUserName(userName);
        return (user != null && user.getPassword().equals(password))
                ? user
                : null;
    }
}
