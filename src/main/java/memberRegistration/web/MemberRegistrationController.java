package memberRegistration.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import memberRegistration.model.Member;
import memberRegistration.service.MemberRegisterService;

@Controller
public class MemberRegistrationController {

    @Autowired
    private MemberRegisterService service;

    @RequestMapping("/member/register")
    public String registerMember(@Validated Member member, BindingResult result) {
        if (result.hasErrors()) {
            return "memberRegistration";
        }
        service.addMember(member);
        return "memberRegistrationResult";
    }

    @RequestMapping("/")
    public String welcome(@ModelAttribute Member member) {
        return "memberRegistration";
    }
}
