package memberRegistration.datasource;

import memberRegistration.model.member.Member;
import memberRegistration.model.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDatasource implements MemberRepository {

    @Autowired
    private MemberMapper mapper;

    @Override
    public void save(Member member) {
        mapper.save(member);
    }
}
