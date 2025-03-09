package DesignPatterns.BehavioralPattern.ChainOfResponsibility.Authenticator.Impl;

import DesignPatterns.BehavioralPattern.ChainOfResponsibility.User.User;

import java.util.Objects;

public class VisitorAuthenticator extends BaseAuthenticator {

    @Override
    public String authenticate(User user) {
        if ("VISITOR".equals(user.getUserType())) {
            // do user authentication and return access key
            return "visitorFound";
        }
        System.out.println("Not a visitor");
        if (Objects.isNull(nextAuthenticator)) {
            return null;
        }
        return nextAuthenticator.authenticate(user);
    }
}
