package com.company;

import java.util.ArrayList;

public class GebruikerLijst {
    private static final ArrayList<Gebruiker> gebruikerLijst = new ArrayList<Gebruiker>();

    public static ArrayList<Gebruiker> getGebruikerLijst() {
        return gebruikerLijst;
    }

    public static void add(Gebruiker gebruiker) {
        gebruikerLijst.add(gebruiker);
    }

    public static Gebruiker get(int id) {
        return gebruikerLijst.get(id);
    }
}
