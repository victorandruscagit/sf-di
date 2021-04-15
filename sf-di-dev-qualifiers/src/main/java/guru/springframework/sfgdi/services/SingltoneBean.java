package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingltoneBean {
    public SingltoneBean() {
        System.out.println("Creating a singleton bean");
    }


    public String getMyScope(){
        return "I am a singleton";
    }
}

