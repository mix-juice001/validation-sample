package memberRegistration.model.security;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties(prefix = "auth")
public class UserCredentialList {

    private List<UserCredential> users = new ArrayList<>();

    public List<UserCredential> getUsers() {
        return users;
    }

    public void setUsers(List<UserCredential> users) {
        this.users = users;
    }
}
