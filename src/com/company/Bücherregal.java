package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Bücherregal {


    public static void main(String[] args)
    {
       Date eins = new Date(118,9,02,14,9,54);//bei month 9 weil von 0 gezählt wird, und 118 weil Java nit bei null Anfang rechnen
        Book meinBuch = new Book(200,eins,"My Book","00000");
       Book Harry1 =  new Book (300,eins,"Harry Potter 1","888");
       Book Harry2 = new Book (400,eins,"Harry potter 2","8136");
       Book Harry3 = new Book (376,eins,"Harry Potter 3","Joho");
       Book Harry4 = new Book (745,eins,"Harry Potter 4","haha");
       Book Harry5 = new Book (600,eins,"Harry Potter 5","762387126");

       Paperbook a = new Paperbook(200,eins,"My Paperbook 1","00000- 000000-0000","1","April");
        Paperbook c = new Paperbook(210,eins,"My Paperbook 2","00000- 000000-0000","1","April");
        Paperbook d = new Paperbook(240,eins,"My Paperbook 3","00000- 000000-0000","1","April");
        Paperbook e = new Paperbook(100,eins,"My Paperbook 4","00000- 000000-0000","1","April");
        Paperbook f = new Paperbook(140,eins,"My Paperbook 5","00000- 000000-0000","1","April");


       //Aufgabe 1 System.out.println("Das Buch hat "+meinBuch.getPages()+" Seiten, wurde am"+meinBuch.getReleased()+" veröffentlicht und hat den titel "+meinBuch.getTitle());

        List<Book>b = new ArrayList<>();
        b.add(Harry1);
        b.add(Harry2);
        b.add(Harry3);
        b.add(Harry4);
        b.add(Harry5);

for(Book jo: b){
    System.out.println("Das Buch  "+jo.getTitle()+" hat Seiten "+jo.getPages()+ " und wurde am "+jo.getReleased()+" veröffentlicht und hat den titel "+jo.getTitle());

}


    }
}
