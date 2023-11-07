package com.polovyi.ivan.tutorials.demo.slides.classobject;

import com.polovyi.ivan.tutorials.Account;
import com.polovyi.ivan.tutorials.PersonalAccount;
import java.time.LocalDate;

public class ObtainClassObjectSlide2 {

    public static void main(String[] args) {
        System.out.println("\nClass object can be obtained from the object itself");
        PersonalAccount personalAccount = new PersonalAccount("id",
                "name",
                "address",
                LocalDate.now(),
                "firstName",
                "lastName");
        Class<? extends Account> personalAccountFromObject = personalAccount.getClass();
        System.out.println("personalAccountFromObject = " + personalAccountFromObject.getSimpleName());
    }
}
