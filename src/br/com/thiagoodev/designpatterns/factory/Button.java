package br.com.thiagoodev.designpatterns.factory;

public interface Button {
    void render();
    void onClick(ButtonOnClickParam action);
}
