package br.com.thiagoodev.designpatterns.factory.java;

public class WebDialog extends Dialog {
    @Override
    Button createButton() {
        return new HTMLButton();
    }
}
