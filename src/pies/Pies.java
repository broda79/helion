package pies;

public class Pies {
    String imie;

//tworzymy obiekt pies1 i korzystamy z niego


    public static void main(String[] args) {

        Pies pies1 = new Pies();
        pies1.szczekaj();
        pies1.imie = "Azorek";

        //teraz tworzymy tablicę obiektów pies

        Pies[] mojePsy = new Pies[3];
        //zapisujemy w niej obiekty

        mojePsy[0] = new Pies();
        mojePsy[1] = new Pies();
        mojePsy[2] = pies1;

        //teraz uzyskujemy  dostęp do obiektów w tablicy

        mojePsy[0].imie = "Szarik";
        mojePsy[1].imie = "Cywil";

        // a jak ma na imię pies z ostatniej komórki

        System.out.print("Ostatni pies ma na imie:");
        System.out.print(mojePsy[2].imie);

        // teraz pętla każąca wszytki psom szczekać

        int x = 0;
        while (x<mojePsy.length){
            mojePsy[x].szczekaj();
            x++;
        }
    }





    public void szczekaj(){
        System.out.println(imie + "Szczeka: hau, hau!!");
    }
}
