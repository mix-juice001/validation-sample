package memberRegistration.model;

import memberRegistration.model.Member;

public interface MemberRepository {
    public void save(Member member);
}
