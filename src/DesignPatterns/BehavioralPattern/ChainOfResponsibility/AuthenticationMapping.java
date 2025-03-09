package DesignPatterns.BehavioralPattern.ChainOfResponsibility;

import DesignPatterns.BehavioralPattern.ChainOfResponsibility.Authenticator.Impl.*;

public enum AuthenticationMapping {

    ADMIN(AdminAuthenticator.class),
    USER(UserAuthenticator.class),
    PARTNER(PartnerAuthenticator.class),
    CONTRACTOR(ContractorAuthenticator.class),
    EMPLOYEE(EmployeeAuthenticator.class),
    VISITOR(VisitorAuthenticator.class);

    private final Class<? extends BaseAuthenticator> clazz;

    Class<?> getAuthenticatorClass(){
        return clazz;
    }

    AuthenticationMapping(Class<? extends BaseAuthenticator> aClass) {
        this.clazz = aClass;
    }
}
