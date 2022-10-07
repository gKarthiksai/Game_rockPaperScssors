import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello Player");
        System.out.println("You are playing with computer");
        System.out.println("Choose numbers : \nChoose 1 for rock\nChoose 2 for paper\nChoose 3 for scissors.");
        System.out.println("Player input : ");
        int playerInput = scanner.nextByte();
        int computerOutput = random.nextInt(3)+1;
        if(playerInput==computerOutput){
            System.out.println("It was a \"DRAW\" ");
            System.out.print("Computer choose : ");
            System.out.print(computerOutput);
            System.out.println("");
            System.out.print("You choose : ");
            System.out.print(playerInput);
        }
        if (playerInput == 1 && computerOutput == 2) {
            System.out.println("Computer Wins");
            System.out.print("Computer choose : ");
            System.out.print(computerOutput);
            System.out.println("");
            System.out.print("You choose : ");
            System.out.print(playerInput);
        }
        if(playerInput==2&&computerOutput==3){
            System.out.println("Computer Wins");
            System.out.print("Computer choose : ");
            System.out.print(computerOutput);
            System.out.println("");
            System.out.print("You choose : ");
            System.out.print(playerInput);
        }
        if(playerInput==3&&computerOutput==1){
            System.out.println("Computer Wins");
            System.out.print("Computer choose : ");
            System.out.print(computerOutput);
            System.out.println("");
            System.out.print("You choose : ");
            System.out.print(playerInput);
        }
        if (playerInput == 2 && computerOutput == 1) {
            System.out.println("You Win");
            System.out.print("You choose : ");
            System.out.print(playerInput);
            System.out.println("");
            System.out.print("Computer choose : ");
            System.out.print(computerOutput);
        }
        if(playerInput==3 && computerOutput==2){
            System.out.println("You Win");
            System.out.print("You choose : ");
            System.out.print(playerInput);
            System.out.println("");
            System.out.print("Computer choose : ");
            System.out.print(computerOutput);
        }
        if(playerInput==1 && computerOutput==3) {
            System.out.println("You Win");
            System.out.print("You choose : ");
            System.out.print(playerInput);
            System.out.println("");
            System.out.print("Computer choose : ");
            System.out.print(computerOutput);
        }
    }
}
