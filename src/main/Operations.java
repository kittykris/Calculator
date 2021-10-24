package main;

public class Operations {

    public static void logicOperations(String first, String operation, String second) {
        int numb1 = 0;
        int numb2 = 0;
        int answer;
        char operand;

        boolean isRoman = false;
        try {
            numb1 = Integer.parseInt(first);
            numb2 = Integer.parseInt(second);
        } catch (Exception e) {
            numb1 = Convert.toArabic(first);
            numb2 = Convert.toArabic(second);
            if (numb1 == 0 || numb2 == 0) {
                System.out.println("Используются одновременно разные системы исчисления");
            }
            isRoman = true;
        }

        if (numb1 < 1 || numb1 > 10 || numb2 < 1 || numb2 > 10) {
            System.out.println("Числа вне диапазона данных");
        } else {
            operand = operation.charAt(0);
            switch (operand) {
                case '+':
                    answer = numb1 + numb2;
                    break;
                case '-':
                    answer = numb1 - numb2;
                    break;
                case '*':
                    answer = numb1 * numb2;
                    break;
                case '/':
                    answer = numb1 / numb2;
                    break;
                default:
                    answer = 0;
                    break;
            }
            if (isRoman) {
                String roman;
                if (answer == 0) {
                    System.out.println(answer);
                } else if (answer < 0) {
                    System.out.println("В римской системе нет отрицательных чисел");
                } else {
                    roman = Convert.toRoman(answer);
                    System.out.println(roman);
                }
            } else System.out.println(answer);
        }
    }
}
