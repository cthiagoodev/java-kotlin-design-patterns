package br.com.thiagoodev.designpatterns.factory;

public class WindowsDialog extends Dialog {
    @Override
    Button createButton() {
        return new WindowButton();
    }
}
