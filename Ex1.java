import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){

                Scanner sc=new Scanner(System.in);
                System.out.println("Enter your number: ");
                int n1=(sc.nextInt());
                System.out.println("Enter your next number: ");
                int n2=(sc.nextInt());
                System.out.println("Enter your formula: ");
                String operation=(sc.next());
                if (operation.equals("+")) {
                    System.out.println(n1 + n2);
                } else if (operation.equals("*")) {
                    System.out.println(n1*n2);
                } else if (operation.equals("/")) {
                    System.out.println(n1 / n2);
                } else if (operation.equals("-")) {
                    System.out.println(n1 - n2);
                } else if (operation.equals("%")) {
                    System.out.println(n1 % n2);
                }
                else {
                    System.out.println("Wrong equation!!");
                }

            }

}
