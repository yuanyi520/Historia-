package com.yuanyi.historia.bean;

/**
 * @name: 密码实体类
 * @author: yuanyi
 * @time：2021/02/19 19:19
 * @version：ver 1.0
 */
public class Password {

    private WebSite username;

    private String loginPassword;

    private String otherPassword1;

    private String otherPassword2;

    private String otherPassword3;

    private String otherPassword4;

    private String otherPassword5;

    public Password() {
    }

    public WebSite getUsername() {
        return username;
    }

    public void setUsername(WebSite username) {
        this.username = username;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public String getOtherPassword1() {
        return otherPassword1;
    }

    public void setOtherPassword1(String otherPassword1) {
        this.otherPassword1 = otherPassword1;
    }

    public String getOtherPassword2() {
        return otherPassword2;
    }

    public void setOtherPassword2(String otherPassword2) {
        this.otherPassword2 = otherPassword2;
    }

    public String getOtherPassword3() {
        return otherPassword3;
    }

    public void setOtherPassword3(String otherPassword3) {
        this.otherPassword3 = otherPassword3;
    }

    public String getOtherPassword4() {
        return otherPassword4;
    }

    public void setOtherPassword4(String otherPassword4) {
        this.otherPassword4 = otherPassword4;
    }

    public String getOtherPassword5() {
        return otherPassword5;
    }

    public void setOtherPassword5(String otherPassword5) {
        this.otherPassword5 = otherPassword5;
    }
}
