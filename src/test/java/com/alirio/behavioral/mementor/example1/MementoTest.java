package com.alirio.behavioral.mementor.example1;

import com.ali.behavioral.memento.example1.Article;
import com.ali.behavioral.memento.example1.Carataker;
import org.junit.Test;

public class MementoTest {

    @Test
    private static void probarMemento() {
        Carataker carataker = new Carataker();
        Article article = new Article("alberto", "memento text 1");
        article.setTexto(article.getTexto() + " texto 2");
        System.out.println(article.getTexto());

        carataker.addMemento(article.createMemento());
        article.setTexto(article.getTexto() + " texto 3");
        System.out.println(article.getTexto());

        carataker.addMemento(article.createMemento());
        article.restoreMemento(carataker.getMemento(0));
        System.out.println(article.getTexto());
    }
}
