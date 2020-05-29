package Game;

import java.util.Scanner;

public class Registration {
    public static boolean checkName(String name) {
        if (name.equals("")) {
            System.out.println("Пустое имя, попробуйте ещё раз");
            return false;
        } else if (name.contains(" ")) {
            System.out.println("Имя не должно быть из двух слов ");
            return false;
        } else {
            System.out.println("Имя корректно, продолжайте...");
            return true;
        }
    }

    public static String regName() {
        System.out.println("Введите имя: \n" +
                "или можете написать\"выход\" для выхода из игры");
        return new Scanner(System.in).nextLine();
    }
    public static String firstUpperCase(String word){
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }

}
