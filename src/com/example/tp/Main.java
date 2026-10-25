
package com.example.tp;

public class Main {
    public static void main(String[] args) {

        Forme[] formes = {
            new Cercle("Rouge", 5.0),
            new Rectangle("Bleu", 4.0, 6.0),
            new Triangle("Vert", 3.0, 7.0),
            new Cercle("Jaune", 2.5)
        };

        for (Forme forme : formes) {
            forme.dessiner();
        }
    }
}

