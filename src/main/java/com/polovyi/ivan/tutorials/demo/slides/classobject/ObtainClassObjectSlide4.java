package com.polovyi.ivan.tutorials.demo.slides.classobject;

public class ObtainClassObjectSlide4 {

    public static void main(String[] args) {
        System.out.println("\nVoid and primitives types have representations as well");
        Class<Void> voidClass = void.class;
        Class<Integer> integerClass = int.class;
        Class<Double> doubleClass = double.class;
        Class<int[]> intArrayClass = int[].class;
        Class<int[][]> intMultiDimensionalArrayClass = int[][].class;

        System.out.println("voidClass.getName() = " + voidClass.getName());
        System.out.println("integerClass.getName() = " + integerClass.getName());
        System.out.println("doubleClass.getName() = " + doubleClass.getName());
        System.out.println("intArrayClass.getName() = " + intArrayClass.getName());
        System.out.println("intMultiDimensionalArrayClass.getName() = " + intMultiDimensionalArrayClass.getName());
    }
}
