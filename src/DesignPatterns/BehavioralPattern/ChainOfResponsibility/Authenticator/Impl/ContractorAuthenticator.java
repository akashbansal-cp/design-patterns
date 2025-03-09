package DesignPatterns.BehavioralPattern.ChainOfResponsibility.Authenticator.Impl;

import DesignPatterns.BehavioralPattern.ChainOfResponsibility.User.User;

import java.util.Objects;

public class ContractorAuthenticator extends BaseAuthenticator {

    @Override
    public String authenticate(User user) {
        if ("CONTRACTOR".equals(user.getUserType())) {
            // do user authentication and return access key
            return "contractorFound";
        }
        System.out.println("Not a contractor");
        if(Objects.isNull(nextAuthenticator)){
            return null;
        }
        return nextAuthenticator.authenticate(user);
    }
}
