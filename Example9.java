package Lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");

        int n = in.nextInt();

        int prev = n - 1;
        int curr = n;
        int next = n + 1;

        long sum = prev + curr + next;
        long square = sum * sum;

        System.out.println(prev + " " + curr + " " + next + " " + square);

        in.close();
    }
}
