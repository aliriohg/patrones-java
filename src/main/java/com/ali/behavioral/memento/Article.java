package com.ali.behavioral.memento;

public class Article {
    private String autor;
    private String texto;

    public Article(String autor, String texto) {
        this.autor = autor;
        this.texto = texto;
    }

    public ArticleMemento createMemento() {
        return new ArticleMemento(this.autor, this.texto);
    }

    public void restoreMemento(ArticleMemento memento) {
        this.autor = memento.getAutor();
        this.texto = memento.getTexto();
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
