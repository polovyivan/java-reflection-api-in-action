package com.polovyi.ivan.tutorials.demo.slides.modifiers;

import com.polovyi.ivan.tutorials.PersonalAccount;
import java.lang.reflect.Modifier;

public class ObtainModifiersSlide1 {

    public static void main(String[] args) throws NoSuchMethodException {
        System.out.println("Obtain class modifier");
        Class<PersonalAccount> personalAccountClass = PersonalAccount.class;
        int modifier = personalAccountClass.getModifiers();
        boolean isPublic = Modifier.isPublic(modifier);
        System.out.println("isPublic = " + isPublic);
    }

}
