import java.util.Random;
import java.util.Scanner;

public class gamesptv21 {


    public static void main(String[] args) {

        System.out.println("Privet, gruppa SPTV21!");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int cash = 3;
        do {
            System.out.println("---- New run ----");
            System.out.println("cash = " + cash);
            int myNumber = random.nextInt(11);
            int n = 0;
            do {
                System.out.print("Zagadano chislo ot 0 do 10, ugadai: ");
                int yourNumber = scanner.nextInt();
                if (myNumber == yourNumber) {
                    System.out.println("Ura! ti ugadal! tebe 1 evro v kosheljok");
                    cash++;
                    break;
                } else {
                    if(yourNumber < myNumber)
                    {
                        System.out.println("Загаданое число больше твоего!");
                } else {
                    System.out.println("Загаданое число меньше твоего!");
                    }

                }
                n++;
                if (n > 2) {
                    System.out.println("Ti proigral, c tebja 1 evro :)");
                    cash--;
                    break;
                }
            } while (true);
            System.out.println("To exit press 0, continue - press ather enykey");
            int repeat = scanner.nextInt();
            if (repeat == 0 || cash == 0) {
                System.out.printf("V tvojom koshelke %d EUR, By-by%n", cash);
                break;
            }
        } while (true);
    }
}