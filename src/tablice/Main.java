package tablice;

public class Main {


    public static void main(String[] args) {

        int [] liczby;

        liczby = new int[7];

        liczby[0] = 6;
        liczby[1] = 19;
        liczby[2] = 44;
        liczby[3] = 42;
        liczby[4] = 10;
        liczby[5] = 20;
        liczby[6] = 1;

        Pies [] zwierzaki;

        zwierzaki = new Pies[7];

        zwierzaki[0] = new Pies();
        zwierzaki[1] = new Pies();

        Pies burek = new Pies();
        burek.imie = "Burek";

        Pies[] mojePieski = new Pies[3];
        mojePieski[0] = new Pies();
        mojePieski[0].imie ="Burek";
        mojePieski[0].szczekaj();


    }
}
