package com.company;

public class KlaarVoorControle implements State {
    @Override
    public void setState(Opdracht opdracht) {
        opdracht.setState(this);
    }

    @Override
    public String getState() {
        return "Deze opdracht is klaar voor controle!";
    }
}