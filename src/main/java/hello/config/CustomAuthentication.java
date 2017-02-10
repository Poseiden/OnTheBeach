package hello.config;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import javax.security.auth.Subject;
import java.util.Collection;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class CustomAuthentication implements Authentication {
    private UserPrivilege userPrivilege;
    public CustomAuthentication(UserPrivilege userPrivilege) {
        this.userPrivilege = userPrivilege;
    }

    @Override
    public boolean implies(Subject subject) {
        return false;
    }

    @Override
    public String getName() {
        return this.userPrivilege.getUserName();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> list = this.userPrivilege.getPrivilegeCodes().stream().map(SimpleGrantedAuthority::new).collect(toList());
        return list;
    }

    @Override
    public Object getCredentials() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object getDetails() {
        return this.userPrivilege;
    }

    @Override
    public Object getPrincipal() {
        return this.userPrivilege;
    }

    @Override
    public boolean isAuthenticated() {
        return true;
    }

    @Override
    public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {
        throw new IllegalArgumentException();
    }
}
