import java.util.Scanner;


public class Main {
    /// задание 1
    public static void task1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год рождения: ");
        int born_year = scanner.nextInt();
        int year = 2026;
        int age = year - born_year;

        if (age < 18) {
            System.out.println("Вы несовершеннолетний");
        } else if(age > 65) {
            System.out.println("Вы пенсионер");
        } else {
            System.out.println("Вы взрослый");
        }
    }
    ///  задание 2
    public static void task2(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        System.out.print("Нечетные элементы: ");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                System.out.print(nums[i] + " ");
            }
        }
        System.out.println();

        System.out.print("Четные элементы: ");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                System.out.print(nums[i] + " ");
            }
        }
    }

    /// задание 3

    public static void task3(String[] args) {

    }

    public static void main(String[] args) {
        task1(args);
        task2(args);
    }
}