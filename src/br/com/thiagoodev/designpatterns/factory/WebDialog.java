package br.com.thiagoodev.designpatterns.factory;

public class WebDialog extends Dialog {
    @Override
    Button createButton() {
        return new HTMLButton();
    }
}
