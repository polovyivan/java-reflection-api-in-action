package com.polovyi.ivan.tutorials.demo.slides.classobject;


import com.polovyi.ivan.tutorials.Account;
import com.polovyi.ivan.tutorials.PersonalAccount;
import java.time.LocalDate;

public class ObtainClassObjectSlide5 {

    public static void main(String[] args) throws Exception {
        Class<?> personalAccountFromForName = Class.forName("com.polovyi.ivan.tutorials.PersonalAccount");
        PersonalAccount personalAccount2 = new PersonalAccount("id",
                "name",
                "address",
                LocalDate.now(),
                "firstName",
                "lastName");
        Class<? extends Account> personalAccountFromGetClass = personalAccount2.getClass();
        Class<PersonalAccount> personalAccountClassUsingClassSyntax = PersonalAccount.class;
        System.out.println("References obtained using fromName and getClass point to the dame object: " + (personalAccountFromForName == personalAccountFromGetClass));
        System.out.println("References obtained using fromName and .class point to the dame object: " + (personalAccountFromForName == personalAccountClassUsingClassSyntax));
        System.out.println("References obtained using getClass and .class point to the dame object: " + (personalAccountFromGetClass == personalAccountClassUsingClassSyntax));
    }
}
