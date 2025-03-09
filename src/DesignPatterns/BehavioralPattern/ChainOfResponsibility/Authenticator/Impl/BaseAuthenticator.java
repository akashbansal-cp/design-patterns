package DesignPatterns.BehavioralPattern.ChainOfResponsibility.Authenticator.Impl;

import DesignPatterns.BehavioralPattern.ChainOfResponsibility.Authenticator.Authenticator;
import DesignPatterns.BehavioralPattern.ChainOfResponsibility.User.User;

import java.util.Objects;

public class BaseAuthenticator implements Authenticator{

    public Authenticator nextAuthenticator;

    @Override
    public String authenticate(User user) {
        if(Objects.isNull(nextAuthenticator)){
            return null;
        }
        return nextAuthenticator.authenticate(user);
    }
}
