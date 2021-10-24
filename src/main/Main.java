package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Данные вводятся в одну строку в формате \"Число Операция Число\" с пробелами.");
        System.out.println("При вводе используется римская (I, II ...) или арабская (1, 2 ...) система исчисления.");
        System.out.println("Числа в диапазоне от 1 до 10");

        System.out.println("Введите уравнение:");

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] all;
        try {
            all = str.split(" ");
            if (all.length > 3) {
                System.out.println("Математическая операция не удовлетворяет условию задачи.");
            } else {
                Operations.logicOperations(all[0], all[1], all[2]);
            }
        } catch (Exception e) {
            System.out.println("Данная строка - не подходит под условие задачи!");
        }
    }
}
