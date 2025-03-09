package DesignPatterns.BehavioralPattern.ChainOfResponsibility;

import DesignPatterns.BehavioralPattern.ChainOfResponsibility.Authenticator.Authenticator;
import DesignPatterns.BehavioralPattern.ChainOfResponsibility.Authenticator.Impl.BaseAuthenticator;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class AuthenticationChain {

    public BaseAuthenticator getAuthenticatorBasedOnAuthenticationChain(List<AuthenticationMapping> authenticationMappingList) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        BaseAuthenticator baseAuthenticator = new BaseAuthenticator();
        BaseAuthenticator currentAuthenticator = baseAuthenticator;

        for(AuthenticationMapping authenticationMapping : authenticationMappingList){
            currentAuthenticator.nextAuthenticator = (Authenticator) authenticationMapping.getAuthenticatorClass().getDeclaredConstructor().newInstance();
            currentAuthenticator = (BaseAuthenticator) currentAuthenticator.nextAuthenticator;

        }

        return baseAuthenticator;

    }

}
