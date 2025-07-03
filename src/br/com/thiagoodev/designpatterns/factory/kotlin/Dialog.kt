package br.com.thiagoodev.designpatterns.factory.kotlin

abstract class Dialog {
    abstract fun createButton(): Button

    fun render() {
        val button: Button = createButton()
        button.onClick(::closeDialog)
        button.render()
    }

    fun closeDialog() {

    }
}