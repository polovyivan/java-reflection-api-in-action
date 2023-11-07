package com.polovyi.ivan.tutorials.demo.slides.field;

import com.polovyi.ivan.tutorials.Account;
import com.polovyi.ivan.tutorials.PersonalAccount;
import java.lang.reflect.Field;
import java.time.LocalDate;

public class ObtainClassFieldsSlide8 {

    public static void main(String[] args) throws Exception {
        System.out.println("\nSet value to a private field firstName: ");
        PersonalAccount personalAccount = new PersonalAccount("id",
                "name",
                "address",
                LocalDate.now(),
                "firstName",
                "lastName");
        Class<? extends Account> personalAccountClass = PersonalAccount.class;
        Field firstName = personalAccountClass.getDeclaredField("firstName");
        firstName.setAccessible(true);
        firstName.set(personalAccount, "changedFirstName");
        System.out.println("Changed field firstName: " + personalAccount.getFirstName());
    }
}
