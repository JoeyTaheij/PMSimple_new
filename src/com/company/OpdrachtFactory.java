package com.company;

import java.time.LocalDate;

public class OpdrachtFactory {
    public static Opdracht getOpdracht(String type, String title, String beschrijving, LocalDate deadline) {
        return switch (type) {
            case "Water" -> new WaterOpdracht(title, beschrijving, deadline);
            case "Groen" -> new GroenOpdracht(title, beschrijving, deadline);
            case "Afval" -> new AfvalOpdracht(title, beschrijving, deadline);
            default -> null;
        };
    }
}
