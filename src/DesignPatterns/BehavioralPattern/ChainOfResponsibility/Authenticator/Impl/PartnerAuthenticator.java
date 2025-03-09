package DesignPatterns.BehavioralPattern.ChainOfResponsibility.Authenticator.Impl;

import DesignPatterns.BehavioralPattern.ChainOfResponsibility.User.User;

import java.util.Objects;

public class PartnerAuthenticator extends BaseAuthenticator {

    @Override
    public String authenticate(User user) {
        if ("PARTNER".equals(user.getUserType())) {
            // do user authentication and return access key
            return "partnerFound";
        }
        System.out.println("Not a partner");
        if(Objects.isNull(nextAuthenticator)){
            return null;
        }
        return nextAuthenticator.authenticate(user);
    }
}
