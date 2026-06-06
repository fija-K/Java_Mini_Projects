package java_mini_projects;
import java.util.Scanner;

public class electric_bill {
    public static void main(){
        System.out.println("ENTER UR ELECTRICITY UNITS USED THIS MONTH.");
        Scanner unit = new Scanner(System.in);
        int eu = unit.nextInt();
        int bill = 0;
        if (eu<=100){
            bill = (bill + (5*eu));

        }
        else if (eu>100 && eu<=200 ){
            bill = (bill + (5*100)+(7*(eu-100)));


        }
        else{
            bill = (bill + (5*100)+(7*100)+(10*(eu-200)));

        }
        System.out.println("Your this month bill of "+eu+" units is: "+bill+" rupees.");
        unit.close();
        


    }
}
