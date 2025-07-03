package br.com.thiagoodev.designpatterns.factory.java;

public interface Button {
    void render();
    void onClick(ButtonOnClickParam action);
}
