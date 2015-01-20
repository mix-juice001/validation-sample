package memberRegistration.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import memberRegistration.model.member.Member;
import memberRegistration.service.MemberRegisterService;

@Controller
@RequestMapping("member")
public class MemberRegistrationController {

    @Autowired
    private MemberRegisterService service;

    @RequestMapping("register")
    public String register(@Validated Member member, BindingResult result) {
        if (result.hasErrors()) {
            return "member/registration";
        }
        service.addMember(member);
        return "member/result";
    }

    @RequestMapping
    public String welcome(@ModelAttribute Member member) {
        return "member/registration";
    }
}
