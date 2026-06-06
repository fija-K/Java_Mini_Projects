package java_mini_projects;

import java.util.Scanner;
import java.util.Stack;

public class Browser_History {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Stack<String> history= new Stack<>();
        
        
        mainMenu(input,history);
  
    }

    public static void mainMenu(Scanner input, Stack<String> historyStack){

        while(true){
            System.out.println("1 Visit");
            System.out.println("2 Back");
            System.out.println("3 Current Page");
            System.out.println("4 History");
            System.out.println("5 Exit");
            int choice = input.nextInt();
            
            if(choice==1){
                visitPage(input, historyStack);
            }
        
            else if(choice==2){
                back(input, historyStack);
            }
        
            else if(choice==3){
                currentPage(input, historyStack);
            }
        
            else if(choice==4){
                history(input, historyStack);
            }
            else if(choice==5){
                System.out.println("Exiting...");
                break;
            }
        }
    
    }

    public static void visitPage(Scanner input, Stack<String> historyStack){

        System.out.print("ENTER THE WEBSITE U WANNA VISIT:  ");
        input.nextLine();
        String page= input.nextLine();
        historyStack.push(page);
        System.out.println("You are on "+page+" website");
        

    }

    public static void back(Scanner input, Stack<String> historyStack){

        if(!historyStack.empty()){
            historyStack.pop();
        }
        else{
            System.out.println("empty");
        }
        
    }

    public static void history(Scanner input, Stack<String> historyStack){

        System.out.println(historyStack);
    }

    public static void currentPage(Scanner input, Stack<String> historyStack){

        if(!historyStack.empty()){
            System.out.println(historyStack.peek());

        }
        else{
            System.out.println("empty");
        }
        
    }
      
}
