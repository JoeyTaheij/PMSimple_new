package com.company;

import java.time.LocalDate;

public class AfvalOpdracht extends Opdracht{

    public AfvalOpdracht(String title, String beschrijving, LocalDate deadline) {
        this.titel = title;
        this.beschrijving = beschrijving;
        this.deadline = deadline;
        this.type = "Afval";
    }
}
