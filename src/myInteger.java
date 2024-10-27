public class myInteger {
    public static void main(String[] args) {
        int number = 5;
        int nextnumber = 6;

        System.out.println(number);
        System.out.println(nextnumber);


        number = 5 + 3;
        nextnumber = number + 1;

        System.out.println();
        System.out.println("updated");
        System.out.println(number);
        System.out.println(nextnumber);

        number += 3;
        System.out.println(number);
        number ++;
        System.out.println(number);
        nextnumber -=2;
        System.out.println(nextnumber);
        nextnumber--;
        System.out.println(nextnumber);
    }
}
