package br.com.thiagoodev.designpatterns.factory;

public abstract class Dialog {
    abstract Button createButton();

    void render() {
        final Button button = createButton();
        button.onClick(this::closeDialog);
        button.render();
    }

    void closeDialog() {

    }
}
