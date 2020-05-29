package Game;

import java.util.Random;
import java.util.Scanner;

public class GameOne {
    private static final int MIN = 0;
    private static final int MAX = 100;

    public static boolean goGameOne() {

        int min = MIN;
        int max = MAX;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int resNum = random.nextInt(max - min) + min;
        while (true) {
            try {
                System.out.println("Для выхода введите \"выйти\"");
                System.out.println("если ваше число больше введите \"больше\", если меньше введите \"меньше");
                System.out.println("если число верно введите \"верно\".");
                System.out.println(resNum);
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("выйти")) {
                    System.out.println("Спасибо за игру!");
                    return true;
                }
                if (input.equalsIgnoreCase("меньше")) {
                    max = resNum;
                    resNum = random.nextInt(max - min) + min;
                } else if (input.equalsIgnoreCase("больше")) {
                    min = resNum + 1;
                    resNum = random.nextInt(max - min) + min;
                } else if (input.equalsIgnoreCase("верно")) {
                    System.out.println("----------------------\n" +
                            " Спасибо за игру!\n" +
                            "----------------------\n" +
                            "Давайте сыграем в Угадать число\n" +
                            "----------------------\n");


                    return true;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Обманывать плохо, твоё число " + resNum);
                return true;
            }
        }
    }
}
