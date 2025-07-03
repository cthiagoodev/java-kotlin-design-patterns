package br.com.thiagoodev.designpatterns.factory.java;

public class Main {
    public static void main(String[] args) {
        try {
            final Application app = new Application();
            app.render();
        } catch (Exception error) {
            System.out.println(error.getMessage());
        }
    }
}
