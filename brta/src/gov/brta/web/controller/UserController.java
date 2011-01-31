package gov.brta.web.controller;

import gov.brta.domain.User;
import gov.brta.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
public class UserController {
    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    private static final String userNameField = "userName";
    private static final String passwordField = "password";
    private static final String confirmPasswordField = "confirmPassword";

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/create", method = RequestMethod.GET)
    public String create(
            HttpSession session,
            ModelMap modelMap
    ) {

        log.debug("entered create");
        modelMap.put("command", new User());
        return "user/create";
    }

    @RequestMapping(value = "/user/save", method = RequestMethod.POST)
    public String save(
            @ModelAttribute("command") User user,
            BindingResult result,
            HttpSession session,
            ModelMap modelMap
    ) {
        User loggedInUser = (User)session.getAttribute("USER");
        log.debug("logged in user fount={}", loggedInUser != null);
        if (loggedInUser != null) {
            log.debug("loggedInUser.id={}", loggedInUser.getId());
        }
        validate(user, result);
        if (result.hasErrors()) {
            modelMap.put("command", user);
            return "user/create";
        }
        user.setCreateDate(new Date());
        user.setLastUpdateDate(new Date());
        userService.save(user);
        modelMap.put("command", user);
        return "user/show";
    }

    @RequestMapping(value = "/user/show", method = RequestMethod.GET)
    public String show(@RequestParam(value = "userId") int userId,
                       ModelMap modelMap) {
        User user = userService.get(userId);
        log.debug("user id={}, userName={}, password={}", new Object[]{});
        modelMap.put("x", "xyz");
        modelMap.put("user", user);
        return "user/show";
    }

    private void validate(Object obj, Errors errors) {

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, userNameField, "common.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, passwordField, "common.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, confirmPasswordField, "common.required");

        User user = (User)obj;

        if(!errors.hasFieldErrors(passwordField) && !errors.hasFieldErrors(confirmPasswordField)
                && ! user.getPassword().equals(user.getConfirmPassword())) {
            errors.reject("user.password.confirmPassword.mismatch", "Password and Confirm Password are not same");
        }
    }

}
