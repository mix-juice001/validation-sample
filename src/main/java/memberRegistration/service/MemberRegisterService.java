package memberRegistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import memberRegistration.model.Member;
import memberRegistration.model.MemberRepository;
import org.springframework.stereotype.Component;

@Component
public class MemberRegisterService {

    @Autowired
    private MemberRepository repository;

    public void addMember(Member member) {
        //repository.save(member);
    }

}
