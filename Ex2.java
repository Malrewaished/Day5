import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int rock = 0;
        int paper = 1;
        int scissors = 2;

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Hi there, plz write rock, paper, or scissors, to draw just write draw");

        String myMove = (sc.nextLine());
            if(myMove.equals("draw")) {
                break;
            }
            if(!myMove.equals("rock") && !myMove.equals("paper") && !myMove.equals("scissors")) {
                System.out.println("You lose!");
            } else {

                int randN = (int) (Math.random() * 3);

                String opponentMove = "";
                if (randN == 0) {
                    opponentMove = "rock";
                } else if (randN == 1) {
                    opponentMove = "paper";
                } else {
                    opponentMove = "scissors";
                }
                System.out.println("ٌYour friend was playing with " + opponentMove);


                if(myMove.equals(opponentMove)) {
                    System.out.println("It is a tie! :(");
                } else if((myMove.equals("rock") && opponentMove.equals("scissors")) || (myMove.equals("scissors") && opponentMove.equals("paper")) || (myMove.equals("paper") && opponentMove.equals("rock"))) {
                    System.out.println("Waw, you won! :)");
                } else {
                    System.out.println("Ohh sorry, You lost! :(");
                }

            }

        }
        System.out.println("Thanks for playing this kind of game");
        System.out.println("See you again! :)");

    }
}