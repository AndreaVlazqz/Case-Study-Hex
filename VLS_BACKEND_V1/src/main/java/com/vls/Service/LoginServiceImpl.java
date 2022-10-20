//package com.vls.Service;
//
//import com.vls.Entity.Login;
//import com.vls.Repository.LoginRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class LoginServiceImpl implements LoginService {
//
//   @Autowired
//   private LoginRepository loginRepository;
//
//    @Override
//    public Login moderatorLogin(Login login) {
//        Login loginEntityFromDb = loginRepository.getById(login.getLoginId());
//        if(login.getLoginId().equals(loginEntityFromDb.getLoginId()) && login.getPassword().equals(loginEntityFromDb.getPassword())){
//            return loginEntityFromDb;
//        }
//        return login;
//    }
//
//    @Override
//    public Login findByIdAndPassword(String loginId, String password) {
//        return loginRepository.findByIdAndPassword(loginId,password);
//    }
//}
