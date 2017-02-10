package hello.config;

import java.util.List;

public class UserPrivilege {
    private List<String> privilegeCodes;

    public List<String> getPrivilegeCodes() {
        return privilegeCodes;
    }

    public void setPrivilegeCodes(List<String> privilegeCodes) {
        this.privilegeCodes = privilegeCodes;
    }
}
