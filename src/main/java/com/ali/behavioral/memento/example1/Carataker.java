package com.ali.behavioral.memento.example1;

import java.util.ArrayList;
import java.util.List;

public class Carataker {
    private List<ArticleMemento> estados= new ArrayList<>();

public void addMemento(ArticleMemento memento){
    estados.add(memento);
}
public ArticleMemento getMemento(int index){
    return estados.get(index);
}
}
