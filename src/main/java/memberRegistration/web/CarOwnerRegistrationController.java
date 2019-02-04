package memberRegistration.web;

import memberRegistration.model.owner.CarOwner;
import memberRegistration.model.owner.GenderType;
import memberRegistration.model.owner.validation.Sufficient;
import memberRegistration.model.owner.validation.Necessary;
import memberRegistration.service.CarOwnerRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("carOwner")
public class CarOwnerRegistrationController {

    @Autowired
    private CarOwnerRegisterService service;

    @ModelAttribute("genderTypes")
    public GenderType[] genderTypeList() {
        return GenderType.values();
    }

    @RequestMapping("register")
    public String register(@Validated({Sufficient.class}) CarOwner carOwner, BindingResult result) {
        if (result.hasErrors()) {
            return "owner/registration";
        }
        service.addCarOwner(carOwner);
        return "owner/result";
    }

    @RequestMapping(value = "register", params = "action=suspend")
    public String suspend(@Validated({Necessary.class}) CarOwner carOwner, BindingResult result) {
        if (result.hasErrors()) {
            return "owner/registration";
        }
        service.addCarOwner(carOwner);
        return "owner/result";
    }

    @RequestMapping
    public String welcome(@ModelAttribute CarOwner carOwner) {
        return "owner/registration";
    }


    private static String[] allowFields = {
            "name",
            "age",
            "genderType"
    };

    @InitBinder
    public void criteriaBinder(WebDataBinder binder) {
        binder.setAllowedFields(allowFields);
    }

}
