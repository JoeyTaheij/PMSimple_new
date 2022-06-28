package com.company;

public class Nieuw implements State{
    @Override
    public void setState(Opdracht opdracht) {
        opdracht.setState(this);
    }

    public String getState() {
        return "Deze opdracht is nieuw!";
    }
}
