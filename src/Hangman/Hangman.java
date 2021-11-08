package Hangman;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;


public class Hangman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("HANGMAN");
        ArrayList<String> lst = new ArrayList<>();
        lst.add("python");
        lst.add("java");
        lst.add("javascript");
        lst.add("kotlin");

        String word = lst.get(new Random().nextInt(lst.size()));
        int repeat = 0;
        while (repeat != 8) {
            String user = input.nextLine();
            if (word.equals(user)) {
                System.out.println("You survived!");
                break;
            } else {
                System.out.println("You lost!");
                repeat++;
            }
        }
    }
}