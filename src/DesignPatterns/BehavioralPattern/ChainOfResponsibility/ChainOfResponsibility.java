package DesignPatterns.BehavioralPattern.ChainOfResponsibility;

import DesignPatterns.BehavioralPattern.ChainOfResponsibility.Authenticator.Impl.BaseAuthenticator;
import DesignPatterns.BehavioralPattern.ChainOfResponsibility.User.User;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static DesignPatterns.BehavioralPattern.ChainOfResponsibility.AuthenticationMapping.*;

public class ChainOfResponsibility {

    public static void main(String[] args) {
        List<AuthenticationMapping> authenticationMappingList = Arrays.asList(ADMIN, USER, PARTNER, CONTRACTOR, EMPLOYEE, VISITOR);

        AuthenticationChain authenticationChain = new AuthenticationChain();

        try{
            BaseAuthenticator authenticator = authenticationChain.getAuthenticatorBasedOnAuthenticationChain(authenticationMappingList);

            User user = new User();
            user.setUserType("CONTRACTORs");

            String accessKey = authenticator.authenticate(user);

            if(Objects.isNull(accessKey)){
                System.out.println("Unauthorized User");
                throw new IllegalAccessException("Unauthorized User");
            }

            System.out.println(accessKey);


        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }


    }

}
