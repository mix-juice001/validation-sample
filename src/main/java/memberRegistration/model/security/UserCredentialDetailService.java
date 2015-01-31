package memberRegistration.model.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class UserCredentialDetailService implements UserDetailsService {

    private List<? extends UserDetails> userDetailsList = new ArrayList<>();

    public UserCredentialDetailService(List<UserCredential> userCredentials) {
        this.userDetailsList = userCredentials;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userDetailsList.stream()
                .filter(ud -> ud.getUsername().equals(username))
                .findFirst()
                .orElseThrow(() -> new UsernameNotFoundException("not found"));
    }
}
