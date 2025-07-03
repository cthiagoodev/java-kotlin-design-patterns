package br.com.thiagoodev.designpatterns.factory;

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
