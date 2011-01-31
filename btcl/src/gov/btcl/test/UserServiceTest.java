package gov.btcl.test;

import junit.framework.Assert;
import gov.btcl.domain.User;
import gov.btcl.service.UserService;
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