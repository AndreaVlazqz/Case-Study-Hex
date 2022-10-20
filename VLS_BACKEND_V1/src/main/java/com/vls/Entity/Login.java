//package com.vls.Entity;
//
//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import java.io.Serializable;
//
//@JsonIgnoreProperties({"hibernateLazyInitializer"})
//@Entity
//@Table(name="LOGIN")
//public class Login implements Serializable {
//
//    @Id
//    @Column(name="LOGIN_ID")
//    private String loginId;
//
//    @Column(name="PASSWORD")
//    private String password;
//
//    public Login (){
//
//    }
//
//    public String getLoginId() {
//        return loginId;
//    }
//
//    public void setLoginId(String loginId) {
//        this.loginId = loginId;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    @Override
//    public String toString() {
//        return "Login{" +
//                "loginId='" + loginId + '\'' +
//                ", password='" + password + '\'' +
//                '}';
//    }
//}
