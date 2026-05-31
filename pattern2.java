import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER n");
        int n = input.nextInt();
        int a=(n+1)/2;
        int b=(n-1)/2;
            for (int i=1; i<=a;i++){
                for (int j=1; j<=a-i; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                if (!(i==1)){
                    for (int j=1; j<=2*(i-1)-1; j++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                
                
                System.out.println();

                

            }
            for (int i=1; i<=b;i++){
                for (int j=1; j<=i; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                if (!(i==b)){
                    for (int j=1;j <= n-2*i-1; j++){
                        System.out.print(" ");
                    }
                    System.out.print("*");

                }
                

                System.out.println();

                
            }
            input.close();
            

            
        }

        
    }
