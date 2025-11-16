package lr1;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите имя : ");
        String name = in.nextLine();

        System.out.print("Введите возраст : ");
        String Age = in.nextLine();

        System.out.println( "Имя пользователя: " + name + "\nВозрост пользователя: " + Age );

        in.close();
    }
}
