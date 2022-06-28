package com.company;

import java.time.LocalDate;

public class GroenOpdracht extends Opdracht {
    public GroenOpdracht(String title, String beschrijving, LocalDate deadline) {
        this.titel = title;
        this.beschrijving = beschrijving;
        this.deadline = deadline;
        this.type = "Groen";
    }
}
