package com.ali.behavioral.memento;

public class ArticleMemento {

    private String autor;
    private String texto;

    public ArticleMemento(String autor, String texto) {
        this.autor = autor;
        this.texto = texto;
    }

    public String getAutor() {
        return autor;
    }

    public String getTexto() {
        return texto;
    }

}
