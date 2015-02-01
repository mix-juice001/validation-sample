package memberRegistration.model.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.authority.mapping.GrantedAuthoritiesMapper;

import java.util.ArrayList;
import java.util.Collection;

public class AblGrantedAuthoritiesMapper implements GrantedAuthoritiesMapper {
    @Override
    public Collection<? extends GrantedAuthority> mapAuthorities(Collection<? extends GrantedAuthority> authorities) {
        ArrayList<GrantedAuthority> roles = new ArrayList<GrantedAuthority>(authorities.size());
        authorities.forEach(auth -> roles.add(new SimpleGrantedAuthority("ROLE_" + auth.getAuthority())));
        return roles;
    }
}
