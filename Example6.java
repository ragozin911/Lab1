import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = in.nextLine();

        System.out.print("Введите год рождения: ");
        int birthYear = in.nextInt();

        int currentYear = 2025;
        int age = currentYear - birthYear;

        System.out.println("Имя: " + name + "\nВозраст: " + age );

        in.close();
    }
}
