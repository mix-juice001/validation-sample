package memberRegistration.model.member;

import memberRegistration.model.member.Member;

public interface MemberRepository {
    public void save(Member member);
}
