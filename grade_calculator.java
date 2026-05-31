import java.util.Scanner;
public class grade_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you marks: ");
        float marks = input.nextFloat();
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 80) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }
        input.close();
    }
}
