package ChatBot;
import java.util.Scanner;


public class ChatBot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! My name is Botя.");
        System.out.println("I was created in 2021.");
        System.out.println("Please, remind me your name.");
        String my_name = input.nextLine();
        System.out.println("What a great name you have, " + my_name + "!");
    }
}