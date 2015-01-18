package memberRegistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import memberRegistration.model.member.Member;
import memberRegistration.model.member.MemberRepository;
import org.springframework.stereotype.Component;

@Component
public class MemberRegisterService {

    @Autowired
    private MemberRepository repository;

    public void addMember(Member member) {
        //repository.save(member);
    }

}
