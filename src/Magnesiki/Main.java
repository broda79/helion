package Magnesiki;

public class Main {

    public static void main(String[] args) {



        Perkusja p = new Perkusja();

        if (p.beben == true){
            p.zagrajNaBebnie();
        }
        p.beben = false;

        p.zagrajNaTalerzach();

    }
}
