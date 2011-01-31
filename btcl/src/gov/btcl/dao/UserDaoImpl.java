package gov.btcl.dao;

import gov.btcl.domain.User;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

/**
 * @author misbah
 */

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

    public void save(User user) {
        getHibernateTemplate().save(user);
    }

    public User get(int userId) {
        return (User) getHibernateTemplate().get(User.class, userId);
    }

    public User getUserByUserName(String userName) {
        List users = getHibernateTemplate().find("FROM User AS user WHERE user.userName = ?", userName);
        return users.size() == 0
                ? null
                : (User)users.get(0);
    }
}
