package com.tehtävä11;

import java.util.ArrayList;

class Caretaker {

    ArrayList<Memento> savedArticles = new ArrayList<Memento>();

    public void addMemento(Memento m) { savedArticles.add(m); }

    public Memento getMemento(int index) { return savedArticles.get(index);}
}
