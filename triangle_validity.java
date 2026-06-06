package java_mini_projects;

import java.util.Scanner;

public class triangle_validity {
    public static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER ANGLE 1");
        float a1 = input.nextFloat();
        System.out.println("ENTER ANGLE 2");
        float a2 = input.nextFloat();
        System.out.println("ENTER ANGLE 3");
        float a3 = input.nextFloat();
        if ((a1+a2+a3)==180){
            System.out.println("UR FIGURE IS TRIANGLE and" );
            if (a1==90 || a2==90 || a3==90){
                System.out.println("ITS A RIGHT TRIANGLE");

            }
            else if (a1<90 && a2<90 && a3<90){
                System.out.println("ITS AN ACUTE TRIANGLE");
            }
            else{
                System.out.println("ITS AN OBTUSE TRIANGLE");
            }

        }
        else{
            System.out.println("NOT A TRIANGLE");
        
        }
        input.close();


    }
    
}
