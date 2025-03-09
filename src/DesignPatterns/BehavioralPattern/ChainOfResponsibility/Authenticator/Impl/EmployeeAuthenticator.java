package DesignPatterns.BehavioralPattern.ChainOfResponsibility.Authenticator.Impl;

import DesignPatterns.BehavioralPattern.ChainOfResponsibility.User.User;

import java.util.Objects;

public class EmployeeAuthenticator extends BaseAuthenticator {

    @Override
    public String authenticate(User user) {
        if ("EMPLOYEE".equals(user.getUserType())) {
            // do user authentication and return access key
            return "employeeFound";
        }
        System.out.println("Not an employee");
        if(Objects.isNull(nextAuthenticator)){
            return null;
        }
        return nextAuthenticator.authenticate(user);
    }
}
