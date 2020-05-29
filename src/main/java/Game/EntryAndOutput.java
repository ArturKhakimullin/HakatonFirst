package Game;

import java.util.Scanner;

public class EntryAndOutput {
    public static void Game() {
        Scanner game = new Scanner(System.in);
        System.out.println("В какую игру желаете сыграть?: \n" +
                "\"Загадать число\"\n" +
                "\"Угадать число\"\n" +
                "Введи название игры:");
        String choose = game.nextLine();

        if (choose.equalsIgnoreCase("Загадать число")) {
            System.out.println("Хороший выбор, начинаем!");
            GameOne.goGameOne();
        } else if (choose.equalsIgnoreCase("Угадать число")) {
            System.out.println("Отличный выбор, начинаем!");
            GameTwo.goGameTwo();
        } else if (choose.equalsIgnoreCase("Выйти из игры")) {
            System.out.println("Спасибо за игру");
            System.exit(0);
        }
    }


    public static void exit() {
        System.exit(0);
    }
}

