package com.polovyi.ivan.tutorials.demo.slides.modifiers;

import com.polovyi.ivan.tutorials.PersonalAccount;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ObtainModifiersSlide3 {

    public static void main(String[] args) throws NoSuchMethodException {
        System.out.println("\nCheck if a method is private");
        Class<PersonalAccount> personalAccountClass = PersonalAccount.class;
        Method method = personalAccountClass.getDeclaredMethod("normalize", String.class);
        int modifier = method.getModifiers();
        boolean isPrivate = Modifier.isPrivate(modifier);
        System.out.println("isPrivate = " + isPrivate);
    }
}
