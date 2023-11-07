package com.polovyi.ivan.tutorials.demo.slides.classobject;

import com.polovyi.ivan.tutorials.Account;
import com.polovyi.ivan.tutorials.PersonalAccount;

public class ObtainClassObjectSlide3 {

    public static void main(String[] args) {
        System.out.println("\nThe .class Syntax");
        Class<Account> accountClassSyntax = Account.class;
        Class<PersonalAccount> personalAccountClassSyntax = PersonalAccount.class;
        System.out.println("accountClassSyntax = " + accountClassSyntax.getSimpleName());
        System.out.println("personalAccountClassSyntax = " + personalAccountClassSyntax.getSimpleName());
    }
}
