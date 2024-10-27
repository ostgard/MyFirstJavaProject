package TomasGenomgang;

public class Lon {
    public static void main(String[] args) {
       /* 2. En försäljare har delvis prestationslön. Han får 8000 kr per månad i grundlön och 9% av
        försäljningssumman. Skapa ett program som beräknar lönesumman under en period.
       */

        int monthlySalary = 8000;
        int provisionPercentage = 9;
        int salesAmount = 55436;
        int newSalary = monthlySalary + provisionPercentage*salesAmount/100;
        System.out.println("nya lönen blir "+newSalary);

    }
}
