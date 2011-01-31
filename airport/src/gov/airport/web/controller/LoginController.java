package gov.airport.web.controller;

import gov.airport.domain.LoginCommand;
import gov.airport.domain.User;
import gov.airport.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ValidationUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@Controller
public class LoginController {
    private static final Logger log = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public void showForm(
            ModelMap model
    ) {

        log.debug("entered showLoginForm");
        model.put("command", new LoginCommand());
    }

    @RequestMapping(value = "/login",  method = RequestMethod.POST)
    public void processForm (
            @ModelAttribute("command") LoginCommand command,
            BindingResult result,
            HttpSession session
    ) {
        validate(command, result);
        if (result.hasErrors()) {
            return;
        }
        User user = userService.getUserByUserNameAndPassword(command.getUserName(), command.getPassword());
        if (user != null) {
            log.debug("user login successfully, id={}, userName={}", user.getId(), user.getUserName());
            session.setAttribute("USER", user);
        }
        log.debug("entered processFormSubmission, userName={}, password={}", command.getUserName(), command.getPassword());
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public void logout(HttpSession session,
                         HttpServletResponse response
                         ) throws IOException {
        session.invalidate();
        response.sendRedirect("login");
    }

    private void validate(LoginCommand command, BindingResult result) {

        ValidationUtils.rejectIfEmptyOrWhitespace(result, "userName", "common.required");
        ValidationUtils.rejectIfEmptyOrWhitespace(result, "password", "common.required");
    }
}
