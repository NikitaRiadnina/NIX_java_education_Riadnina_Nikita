package ChatBot;
import java.util.Scanner;


public class ChatBot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! My name is Botя.\nI was created in 2021.\nPlease, remind me your name.");
        String my_name = input.nextLine();
        System.out.println("What a great name you have, " + my_name + "!");
        System.out.println("Let me guess your age.\nЯ ленивый что бы считать, поэтому введу свой возраст, а бот найдёт остатки от деления на 3,5 и 7");
        int remainder3 = input.nextInt() % 3;
        int remainder5 = input.nextInt() % 5;
        int remainder7 = input.nextInt() % 7;
        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }
}