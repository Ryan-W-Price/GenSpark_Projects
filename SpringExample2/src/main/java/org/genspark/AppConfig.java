package org.genspark;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.ArrayList;

@Configuration
public class AppConfig {

    @Bean
    public Student getStudent(){
        ArrayList<Phone> phoneArrayList = new ArrayList<>();
        Phone phone1 = getPhone();
        Phone phone2 = getPhone();
        Phone phone3 = getPhone();
        phone1.setMob("555555555");
        phone2.setMob("66666666");
        phone3.setMob("99999999");
        phoneArrayList.add(phone1);
        phoneArrayList.add(phone2);
        phoneArrayList.add(phone3);
        Student s = new Student();
        s.setId(10);
        s.setName("Student");
        s.setPhone(phoneArrayList);
        return s;
    }

    @Bean
    public Address getAddress(){
        return new Address("USA", "FL", "Gainesville", "32601");
    }

    @Bean
    public Phone getPhone(){
        return new Phone();
    }



}
