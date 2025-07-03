package br.com.thiagoodev.designpatterns.factory.java;

public class WindowsDialog extends Dialog {
    @Override
    Button createButton() {
        return new WindowButton();
    }
}
