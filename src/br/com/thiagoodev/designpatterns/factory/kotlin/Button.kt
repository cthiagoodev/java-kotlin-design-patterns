package br.com.thiagoodev.designpatterns.factory.kotlin

interface Button {
    fun render()
    fun onClick(action: () -> Unit)
}