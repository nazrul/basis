package gov.rajuk.test;

import junit.framework.Assert;
import gov.rajuk.domain.User;
import gov.rajuk.service.UserService;
import org.junit.Test;
import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

import java.util.Date;

/**
 * @author misbah
 */
public class UserServiceTest extends AbstractDependencyInjectionSpringContextTests {
    private UserService userService;

    @Test
    public void testUserSave() {
        User user = new User();
        user.setUserName("lutfun");
        user.setPassword("therap");
        user.setAdmin(true);
        user.setFullName("Lutfun Nahar");
        user.setCreateDate(new Date());

        userService.save(user);

        Assert.assertNotSame(0, user.getId());
    }

}
