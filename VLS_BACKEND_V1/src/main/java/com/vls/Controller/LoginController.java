//package com.vls.Controller;
//
//import com.vls.Entity.Login;
//import com.vls.Service.LoginService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@CrossOrigin(origins = "")
//public class LoginController {
//
//    @Autowired
//    private LoginService loginService;
//
//    @PostMapping("/login")
//    public Login moderatorLogin(@RequestBody Login login){
//        Login loginEntityFromService = loginService.moderatorLogin(login);
//        return loginEntityFromService;
//    }
//}
