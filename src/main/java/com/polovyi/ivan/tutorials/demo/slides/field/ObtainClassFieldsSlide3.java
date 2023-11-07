package com.polovyi.ivan.tutorials.demo.slides.field;

import com.polovyi.ivan.tutorials.Account;
import com.polovyi.ivan.tutorials.PaymentMethod;
import com.polovyi.ivan.tutorials.PersonalAccount;
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.Arrays;

public class ObtainClassFieldsSlide3 {

    public static void main(String[] args) throws Exception {

        System.out.println("\nObtain a private field by name:");
        Class<? extends Account> personalAccountClass = PersonalAccount.class;
        Field firstName = personalAccountClass.getDeclaredField("firstName");
        System.out.println("firstName = " + firstName);

    }
}
