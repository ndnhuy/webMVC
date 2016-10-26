package vn.kms.launch.basicwebapp.model;

import java.io.Serializable;
import java.math.BigDecimal;

import vn.kms.launch.basicwebapp.annotation.Table;

@Table(name = "USERS")
public class User implements Serializable {

    private static final long serialVersionUID = 122310839301386251L;

    private String userName;

    private String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

}