package com.polovyi.ivan.tutorials.demo.slides.field;

import com.polovyi.ivan.tutorials.Account;
import com.polovyi.ivan.tutorials.PersonalAccount;
import java.lang.reflect.Field;

public class ObtainClassFieldsSlide4 {

    public static void main(String[] args) throws Exception {
        System.out.println("\nObtain a public field by name:");
        Class<? extends Account> personalAccountClass = PersonalAccount.class;
        Field lastName = personalAccountClass.getField("lastName");
        System.out.println("lastName = " + lastName);

    }
}
