package java_mini_projects;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;
public class Ticket_Counter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<String> customer= new ArrayDeque<>();
        ArrayList<String> allcustomer= new ArrayList<>();
        
        
        mainMenu(input,customer,allcustomer);
  
    }

    public static void mainMenu(Scanner input,Queue<String> customer,ArrayList<String> allcustomer){

        while(true){
            System.out.println("CLICK 1 TO ADD CUSTOMER\nCLICK 2 TO SERVE\nCLICK 3 TO SHOW NEXT CUSTOMER \nCLICK 4 to view all customers who bought ticket today.\nCLICK 5 to exit");
            int choice = input.nextInt();
            
            if(choice==1){
                addCustomer(input, customer,allcustomer);
            }
        
            else if(choice==2){
                serveCustomer(input,customer,allcustomer);
            }
        
            else if(choice==3){
                nextCustomer(input,customer,allcustomer);
            }
        
            else if(choice==4){
                allCustomers(input,customer,allcustomer);
            }
            else if(choice==5){
                System.out.println("Exiting...");
                break;
            }
        }
    
    }

    public static void addCustomer(Scanner input,Queue<String> customer,ArrayList<String> allcustomer){
        
        System.out.print("ENTER CUSTOMER's NAME:  ");
        input.nextLine();
        String name= input.nextLine();
        customer.offer(name);
        allcustomer.add(name);
    
        

    }

    public static void serveCustomer(Scanner input,Queue<String> customer,ArrayList<String> allcustomer){

        String served = customer.poll();
        if(served != null){
            System.out.println(served + " served");
        }
        else{
            System.out.println("No customers");
        }

        
    }

    public static void nextCustomer(Scanner input,Queue<String> customer,ArrayList<String> allcustomer){

        if(customer.isEmpty()){
            System.out.println("No customers");
        }
        else{
            System.out.println(customer.peek());
        }
        
    }

    public static void allCustomers(Scanner input,Queue<String> customer,ArrayList<String> allcustomer){

        System.out.println(allcustomer);
        
    }
      
}
