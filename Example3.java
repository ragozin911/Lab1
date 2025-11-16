package lr1;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите название текущего дня недели: ");
        String dayOfWeek = in.nextLine();

        System.out.print("Введите название месяца: ");
        String month = in.nextLine();

        System.out.print("Введите дату (номер дня в месяце): ");
        String date = in.nextLine();

        System.out.println("Сегодня: \n" + "День недели: " + dayOfWeek + "\nЧисло: " + date + "\nМесяц: " + month );

        in.close();
    }
}
