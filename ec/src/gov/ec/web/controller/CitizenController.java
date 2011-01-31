package gov.ec.web.controller;

import gov.ec.domain.Citizen;
import gov.ec.service.CitizenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class CitizenController {
    private static final Logger log = LoggerFactory.getLogger(CitizenController.class);

    @Autowired
    private CitizenService citizenService;


    @RequestMapping(value = "/citizen/createNew", method = RequestMethod.GET)
    public String create(
            HttpSession session,
            ModelMap modelMap
    ) {

        log.debug("entered create");
        modelMap.put("command", new Citizen());
        return "citizen/createNew";
    }

    @RequestMapping(value = "/citizen/save", method = RequestMethod.POST)
    public String save(
            @ModelAttribute("command") Citizen citizen,
            BindingResult result,
            HttpSession session,
            ModelMap modelMap
    ) {

        citizenService.save(citizen);
        modelMap.put("citizen", citizen);
        return "citizen/show";
    }

    @RequestMapping(value = "/citizen/show", method = RequestMethod.GET)
    public String show(@RequestParam(value = "userId") int userId,
                       ModelMap modelMap) {
        Citizen citizen = citizenService.getCitizenById(userId);
        return "citizen/show";
    }

    @InitBinder
    public void initBinder(WebDataBinder binder, HttpServletRequest request) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }


}