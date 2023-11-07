package com.polovyi.ivan.tutorials.demo.slides.field;

import com.polovyi.ivan.tutorials.Account;
import com.polovyi.ivan.tutorials.PersonalAccount;
import java.lang.reflect.Field;
import java.time.LocalDate;

public class ObtainClassFieldsSlide7 {

    public static void main(String[] args) throws Exception {
        System.out.println("\nGet a value of a public field: ");
        PersonalAccount personalAccount = new PersonalAccount("id",
                "name",
                "address",
                LocalDate.now(),
                "firstName",
                "lastName");
        Class<? extends Account> personalAccountClass = PersonalAccount.class;
        Field lastName = personalAccountClass.getField("lastName");
        String lastNameValue = (String) lastName.get(personalAccount);
        System.out.println("lastNameValue = " + lastNameValue);
    }
}
