package Lr1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int a = in.nextInt();

        System.out.print("Введите второе число: ");
        int b = in.nextInt();

        int sum = a + b;
        int difference = a - b;

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);

        in.close();
    }
}