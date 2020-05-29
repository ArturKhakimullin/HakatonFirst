package Game;

public class Main {
    public static void main(String[] args) {
        System.out.println("Пожалуйста, зарегистрируйтесь");
        String userName = "";
        do {
            if (userName.equals("выход"))
                EntryAndOutput.exit();
            else
                userName = Registration.regName();
        } while (!Registration.checkName(userName));


        EntryAndOutput.Game();
    }

}
