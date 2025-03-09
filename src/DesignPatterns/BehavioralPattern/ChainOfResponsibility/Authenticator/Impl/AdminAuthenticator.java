package DesignPatterns.BehavioralPattern.ChainOfResponsibility.Authenticator.Impl;

import DesignPatterns.BehavioralPattern.ChainOfResponsibility.Authenticator.Authenticator;
import DesignPatterns.BehavioralPattern.ChainOfResponsibility.User.User;

import java.util.Objects;

public class AdminAuthenticator extends BaseAuthenticator {

    @Override
    public String authenticate(User user) {
        if ("ADMIN".equals(user.getUserType())) {
            // authenticate and return validation key or null
            return "adminFound";
        }
        System.out.println("Not an admin");
        if(Objects.isNull(nextAuthenticator)){
            return null;
        }
        return nextAuthenticator.authenticate(user);

    }
}
