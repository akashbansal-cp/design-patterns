package DesignPatterns.BehavioralPattern.ChainOfResponsibility.Authenticator.Impl;

import DesignPatterns.BehavioralPattern.ChainOfResponsibility.User.User;

import java.util.Objects;

public class UserAuthenticator extends BaseAuthenticator{

    @Override
    public String authenticate(User user){
        if("USER".equals(user.getUserType())){
            // do user authentication and return access key
            return "userFound";
        }
        System.out.println("Not an User");
        if(Objects.isNull(nextAuthenticator)){
            return null;
        }
        return nextAuthenticator.authenticate(user);
    }
}
