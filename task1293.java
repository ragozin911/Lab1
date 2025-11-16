package Lr1;

import java.util.Scanner;

public class task1293 {

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите переменную A : ");
    double A = in.nextDouble();

    System.out.print("Введите переменную B : ");
    double B = in.nextDouble();

    System.out.print("Введите переменную N : ");
    double N = in.nextDouble();

if (1 <= N && N <= 100 && 1 <= A  && A <= 100 && 1 <= B && B <= 100) {
    System.out.println("Понадобится " + A * B * N * 2 + " Нг");
} else {
    System.out.println("Введены некорректные данные");
}
}
    }




