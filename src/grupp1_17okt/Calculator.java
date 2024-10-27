package grupp1_17okt;

/*6.Skapa en class Calculator som läser in två tal i konstruktorn och sparar dem som attribut
7.Skapa en metod som skriver ut addition för dessa två tal. Skapa ett objekt och anropa	denna metod ifrån en annan klass som har en main-metod
8.Uppdatera din main-metod så att den läser in 	de två talen med Scanner
9.Uppdatera Calculator så att den har liknande 	metoder för minus/delat med/gånger
*/


public class Calculator {

    private int tal1;
    private int tal2;

    public Calculator(int talet1, int talet2){
        tal1 = talet1;
        tal2 = talet2;

    }

    public int addition(){
        int sum = tal1 + tal2;
        System.out.println("summan av de adderade talen blir: " +sum);
        return sum;
    }

}


