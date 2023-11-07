package com.polovyi.ivan.tutorials.demo.slides.field;

import com.polovyi.ivan.tutorials.Account;
import com.polovyi.ivan.tutorials.PersonalAccount;
import java.lang.reflect.Field;
import java.time.LocalDate;

public class ObtainClassFieldsSlide6 {

    public static void main(String[] args) throws Exception {
        System.out.println("\nGet a value of a private field: ");
        PersonalAccount personalAccount = new PersonalAccount("id",
                "name",
                "address",
                LocalDate.now(),
                "firstName",
                "lastName");
        Class<? extends Account> personalAccountClass = PersonalAccount.class;
        Field firstName = personalAccountClass.getDeclaredField("firstName");
        System.out.println("firstName = " + firstName);
        firstName.setAccessible(true);
        String firstNameValue = (String) firstName.get(personalAccount);
        System.out.println("firstNameValue = " + firstNameValue);
    }
}
