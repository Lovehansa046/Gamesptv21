import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вас приветствует программа 'Калькулятор'");
        do {
            System.out.println("Выберите задачу которая вам требуется!");

            System.out.println("Сложение - 1 " +
                    " Вычитание - 2 " +
                    " Умножение - 3 " +
                    " Деление - 4 " +
                    " Выйти из программы - 5 ");

            int valuesystemtask = scanner.nextInt();

            if (valuesystemtask == 1) {
                System.out.println("Вы выбрали сложение!");
                System.out.println("Введите первое число: ");
                int your_number_one_plus = scanner.nextInt();
                System.out.println("Введите второе число: ");
                int your_number_two_plus = scanner.nextInt();
                int summa = your_number_one_plus + your_number_two_plus;
                System.out.println(your_number_one_plus + " + " + your_number_two_plus + " = " + summa);
            } else {
                if (valuesystemtask == 2) {
                    System.out.println("Вы выбрали вычитание!");
                    System.out.println("Введите первое число: ");
                    int your_number_one_minus = scanner.nextInt();
                    System.out.println("Введите второе число: ");
                    int your_number_two_minus = scanner.nextInt();
                    int summa = your_number_one_minus - your_number_two_minus;
                    System.out.println(your_number_one_minus + " - " + your_number_two_minus + " = " + summa);
                } else {
                    if (valuesystemtask == 3) {
                        System.out.println("Вы выбрали Умножение!");
                        System.out.println("Введите первое число: ");
                        int your_number_one_double = scanner.nextInt();
                        System.out.println("Введите второе число: ");
                        int your_number_two_double = scanner.nextInt();
                        int summa = your_number_one_double * your_number_two_double;
                        System.out.println(your_number_one_double + " * " + your_number_two_double + " = " + summa);
                    } else {
                        if (valuesystemtask == 4) {
                            System.out.println("Вы выбрали Деление!");
                            System.out.println("Введите первое число: ");
                            double your_number_one_minusdouble = scanner.nextInt();
                            System.out.println("Введите второе число: ");
                            double your_number_two_minusdouble = scanner.nextInt();
                            double summa = your_number_one_minusdouble / your_number_two_minusdouble;
                            String result = String.format("%.2f",summa);
                            System.out.print(your_number_one_minusdouble + " / " + your_number_two_minusdouble + " = " + result);
                        } else {
                            if (valuesystemtask == 5) {
                                System.out.println("Вы вышли из программы!!");
                                System.out.println("Досвидание!!!");
                                break;
                            }
                        }
                    }
                }
            }
        }while (true);
    }
}
