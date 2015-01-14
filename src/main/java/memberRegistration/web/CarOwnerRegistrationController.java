package memberRegistration.web;

import memberRegistration.model.owner.CarOwner;
import memberRegistration.model.owner.SexType;
import memberRegistration.service.CarOwnerRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarOwnerRegistrationController {

    @Autowired
    private CarOwnerRegisterService service;

    @ModelAttribute("radioEnum")
    public SexType[] sexTypeList() {
        return SexType.values();
    }

    @RequestMapping("/carOwner/register")
    public String validateGroup(@Validated CarOwner carOwner, BindingResult result) {
        if (result.hasErrors()) {
            return "owner/carOwnerRegistration";
        }
        service.addCarOwner(carOwner);
        return "owner/carOwnerRegistrationResult";
    }

    @RequestMapping(value = "/carOwner/register", params = "sex=MALE")
    public String validateGroupMale(@Validated({CarOwner.GroupMale.class}) CarOwner carOwner, BindingResult result) {
        if (result.hasErrors()) {
            return "owner/carOwnerRegistration";
        }
        service.addCarOwner(carOwner);
        return "owner/carOwnerRegistrationResult";
    }

    @RequestMapping("/carOwner")
    public String welcome(@ModelAttribute CarOwner carOwner) {
        return "owner/carOwnerRegistration";
    }

}
