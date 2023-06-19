//import java.util.Random;

//public class Main {
//    public static void main(String[] args) {
//        Random random = new Random();

//        int variable1 = random.nextInt();
//        int variable2 = random.nextInt();

//        System.out.println("a: " + variable1);
//        System.out.println("2: " + variable2);

//        if (variable1 > variable2) {
//            System.out.println("a>b");
//        } else if (variable1 < variable2) {
//            System.out.println("b>a");
//        } else {
//            System.out.println("a=b");
//        }
//    }
//}

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите значение для start: ");
        int start = scanner.nextInt();

        System.out.print("Введите значение для end: ");
        int end = scanner.nextInt();

        Random random = new Random();
        int result = random.nextInt(end - start + 1) + start;

        System.out.println("Сгенерированное случайное число: " + result);
    }
}