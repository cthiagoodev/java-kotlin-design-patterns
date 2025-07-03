package br.com.thiagoodev.designpatterns.singleton.kotlin

/// This module is an example of Singleton Design Pattern
fun main() {
    val singleton1 = Singleton
    singleton1.name = "Foo"

    val singleton2 = Singleton
    singleton2.name = "Baa"

    println(singleton1.name)
    println(singleton2.name)

    val isEquals: Boolean = singleton1 == singleton2

    println("Instance is equals: $isEquals")
}