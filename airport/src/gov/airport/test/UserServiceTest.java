package gov.airport.test;

import gov.airport.domain.User;
import junit.framework.Assert;
import gov.airport.service.UserService;
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
        user.setAdmin(true);           
        user.setCreateDate(new Date());

        userService.save(user);

        Assert.assertNotSame(0, user.getId());
    }

}
