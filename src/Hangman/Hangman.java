package Hangman;
import java.util.Objects;
import java.util.Scanner;


public class Hangman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("HANGMAN");
        String user = input.nextLine();
        if (Objects.equals(user, "java")){
            System.out.println("You survived!");
        } else{
            System.out.println("You lost!");
        }
    }
}