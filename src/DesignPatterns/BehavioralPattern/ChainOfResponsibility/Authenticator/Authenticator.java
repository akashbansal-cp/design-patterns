package DesignPatterns.BehavioralPattern.ChainOfResponsibility.Authenticator;

import DesignPatterns.BehavioralPattern.ChainOfResponsibility.User.User;

public interface Authenticator {

    String authenticate(User user);

}
