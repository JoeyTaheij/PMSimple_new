package com.company;

import java.time.LocalDate;

public class WaterOpdracht extends Opdracht {
    public WaterOpdracht(String title, String beschrijving, LocalDate deadline) {
        this.titel = title;
        this.beschrijving = beschrijving;
        this.deadline = deadline;
        this.type = "Water";
    }
}
