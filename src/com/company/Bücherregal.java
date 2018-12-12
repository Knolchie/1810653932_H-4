package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bücherregal {


    public static void main(String[] args) {
        Date eins = new Date(118, 9, 02, 14, 9, 54);//bei month 9 weil von 0 gezählt wird, und 118 weil Java nit bei null Anfang rechnen
        Book meinBuch = new Book(200, eins, "My Book", "00000");
        Book Harry1 = new Book(300, eins, "Harry Potter 1", "888");
        Book Harry2 = new Book(400, eins, "Harry potter 2", "8136");
        Book Harry3 = new Book(376, eins, "Harry Potter 3", "Joho");
        Book Harry4 = new Book(745, eins, "Harry Potter 4", "haha");
        Book Harry5 = new Book(600, eins, "Harry Potter 5", "762387126");

        Paperbook einz = new Paperbook(200, eins, "JO", "1", "April");
        Paperbook ein = new Paperbook(210, eins, "JOO", "1", "März");
        Paperbook ei = new Paperbook(240, eins, "JOO", "1", "Mai");
        Paperbook e = new Paperbook(100, eins, "JOO", "1", "Dezember");
        Paperbook eh = new Paperbook(140, eins, "JOOO", "1", "April");


        //Aufgabe 1 System.out.println("Das Buch hat "+meinBuch.getPages()+" Seiten, wurde am"+meinBuch.getReleased()+" veröffentlicht und hat den titel "+meinBuch.getTitle());

        List<Book> b = new ArrayList<>();
        b.add(Harry1);
        b.add(Harry2);
        b.add(Harry3);
        b.add(Harry4);
        b.add(Harry5);

        for (Book jo : b) {
            System.out.println("Das Buch  " + jo.getTitle() + " hat Seiten " + jo.getPages() + " und wurde am " + jo.getReleased() + " veröffentlicht und hat den titel " + jo.getTitle());
        }
        List<Paperbook> papier = new ArrayList<>();
        papier.add(einz);
        papier.add(ein);
        papier.add(ei);
        papier.add(e);
        papier.add(eh);
        for (Paperbook i : papier) {
            System.out.println("Das Buch " +i.getTitle()+" hat "+i.getPages()+" Seiten und folgende isbn "+i.getIsbn()+ " und ist zusätzlich im Monat "+i.getMonth()+" erschienen");


        }


    }
}

