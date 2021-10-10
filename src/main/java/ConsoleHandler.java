import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleHandler {

    public ConsoleHandler() {

    }

    public void projectLogin() {
        //Scanner scanner = new Scanner(System.in);
        System.out.print("Username:" + animate("Pascal"));
        //String username = scanner.nextLine();
        System.out.print("\rPassword: " + animate("****************"));
        //String password = scanner.nextLine();
        System.out.print("\rLogin? (Y/N): " + animate("y"));
        //String login = scanner.nextLine();
        clearScreen();
        switch (login) {
            case "Y": case "y":
                Appcycle.setUser(new User(username, password));
                break;
            case "N": case"n":
                projectLogin();
        }
    }

    private String animate(String msg)
    {
        try {
            char[] temp = msg.toCharArray();
            for (int i = 0; i < temp.length; i++) {

            }
        }
    }

    public void projectMateriallist() {
        for (String all : Appcycle.getUser().getMateriallist()) {

        }
        clearScreen();
    }

    public void clearScreen() {
        for (int i = 0; i < 100; i++) {
            System.out.println(" ");
        }
    }


}
