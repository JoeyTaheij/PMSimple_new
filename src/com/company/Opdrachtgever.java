package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

class Opdrachtgever extends Gebruiker {
    private final ArrayList<Gebruiker> subscribers = new ArrayList<Gebruiker>();

    public Opdrachtgever(int id, String naam, String email, String telefoon, String wachtwoord) {
        this.id = id;
        this.naam = naam;
        this.email = email;
        this.telefoon = telefoon;
        this.wachtwoord = wachtwoord;
        this.rol = "Opdrachtgever";
    }

    public String toString() {
        return "Opdrachtgever{" +
                "id=" + id +
                ", naam='" + naam + '\'' +
                ", email='" + email + '\'' +
                ", telefoon='" + telefoon + '\'' +
                ", wachtwoord='" + wachtwoord + '\'' +
                '}';
    }

//    ---------------------------------------------------------------------------------------------------------------------------
//                                               Opdrachtgever methodes
//    ---------------------------------------------------------------------------------------------------------------------------
    public void subscribe(Gebruiker gebruiker){
        subscribers.add(gebruiker);
    }
    public void unSubscribe(Gebruiker gebruiker){
        subscribers.remove(gebruiker);
    }

    public void notifyNieuweOpdracht(Opdracht opdracht) {
        for (Gebruiker gebruiker : subscribers) {
            gebruiker.update(opdracht);
        }
    }

    public void newOpdracht(String type, String titel, String beschrijving, LocalDate deadline) {
        Opdracht newOpdracht = OpdrachtFactory.getOpdracht(type,titel,beschrijving,deadline);
        OpdrachtLijst.add(newOpdracht);
        notifyNieuweOpdracht(newOpdracht);
    }

    @Override
    public void update(Opdracht opdracht) {
        System.out.println("Not Allowed!");
    }

    public void setAfgerond(int opdracht) {
        if (OpdrachtLijst.get(opdracht) == null) {
            System.out.println("|Opdracht " + opdracht + " bestaat niet!");
        } else {
            OpdrachtLijst.get(opdracht).setState(new Afgerond());
        }
    }

    public void removeOpdracht(int opdracht) {
        if (OpdrachtLijst.get(opdracht) == null) {
            System.out.println("|Opdracht " + opdracht + " bestaat niet!");
        } else {
            OpdrachtLijst.getOpdrachtlijst().remove(opdracht);
        }
    }
}
