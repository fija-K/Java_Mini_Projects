package java_mini_projects;

import java.util.Scanner;
public class character_type_checker {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        System.out.println("Enter ur character");
        char a = c.next().charAt(0); // it will only check input's first character.
        if (Character.isUpperCase(a)){
            System.out.println("UPPERCASE");
        }
        else if(Character.isLowerCase(a)){
            System.out.println("LOWERCASE");
        }
        else if(Character.isDigit(a)){
            System.out.println("DIGIT");
        }
        else{
            System.out.println("SPECIAL CHARACTER");
        }
        c.close();


    }
}

