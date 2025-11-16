package Lr1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите ваш возраст: ");
        int age = in.nextInt();

        int currentYear = 2025;
        int birthYear = currentYear - age;

        System.out.println("Вы родились в " + birthYear + " году");

        in.close();
    }
}
