package br.com.thiagoodev.designpatterns.singleton.java;

/// This module is an example of Singleton Design Pattern
public class Main {
    public static void main(String[] args) {
        final Singleton singleton = Singleton.getInstance();
        singleton.setName("Foo");

        final Singleton singleton1 = Singleton.getInstance();
        singleton1.setName("Baa");

        System.out.println(singleton.getName());
        System.out.println(singleton1.getName());

        final boolean isEquals = singleton.equals(singleton1);

        System.out.println("Instance is equals: " + isEquals);
    }
}
