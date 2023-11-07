package com.polovyi.ivan.tutorials.demo.slides.field;

import com.polovyi.ivan.tutorials.Account;
import com.polovyi.ivan.tutorials.PersonalAccount;
import java.lang.reflect.Field;

public class ObtainClassFieldsSlide5 {

    public static void main(String[] args) throws Exception {
        System.out.println("\nObtain field type: ");
        Class<? extends Account> personalAccountClass = PersonalAccount.class;
        Field lastName = personalAccountClass.getField("lastName");
        Class<?> type = lastName.getType();
        System.out.println("type = " + type);
    }
}
