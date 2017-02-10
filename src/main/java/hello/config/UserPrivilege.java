package hello.config;

import java.util.List;

public class UserPrivilege {
    private List<String> privilegeCodes;
    private String userName;

    public List<String> getPrivilegeCodes() {
        return privilegeCodes;
    }

    public void setPrivilegeCodes(List<String> privilegeCodes) {
        this.privilegeCodes = privilegeCodes;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
