package TomasGenomgang2;

public class Fakultet {

    //48. Skapa ett program som skriver ut n! (fakulteten)
    //Fakulteten är = 1*2*3 =3!

    public static void main(String[] args) {

        int n; //samma sak som n=3;
        n=3;

        int produkt = 1;
        //Sattes utanför för att komma åt att initieras innan och efteråt
        //i lika med ett index, går inte börja med start på 0, för 0*0=0
        for (int i = 1; i <= 3; i++) {
            produkt = produkt * i;
            if (i != n) System.out.print(i+ " * ");
            else System.out.print(i);
        }
        System.out.print(", Fakulteten är = " +produkt);


    }
}
