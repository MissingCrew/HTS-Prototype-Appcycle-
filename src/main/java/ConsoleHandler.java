import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleHandler {

    public ConsoleHandler() {

    }

    public void projectLogin() {
        //Scanner scanner = new Scanner(System.in);
        System.out.print("Username:");
        animate("Pascal", 300);
        //String username = scanner.nextLine();
        System.out.print("\rPassword: ");
        animate("****************", 250);
        //String password = scanner.nextLine();
        System.out.print("\rLogin? (Y/N): ");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        animate("y", 1000);
        //String login = scanner.nextLine();
        //clearScreen();
        /*switch (login) {
            case "Y": case "y":
                Appcycle.setUser(new User(username, password));
                break;
            case "N": case"n":
                projectLogin();
        }*/
        //Appcycle.setUser(new User("Pascal", "187Fanboy"));
        /*Appcycle.getUser().addMaterialWithCount("Stein", 20);
        Appcycle.getUser().addMaterialWithCount("LED", 4);
        Appcycle.getUser().addMaterialWithoutCount("Stock");*/
    }

    private void animate(String msg, int millis)
    {
        try {
            char[] temp = msg.toCharArray();
            for (int i = 0; i < temp.length; i++) {
                System.out.print(temp[i]);
                Thread.sleep(millis);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void inputMaterials() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nWillst du ein Material hinzufügen? (Y/N):");
        String mats = scanner.nextLine();
        switch (mats) {
            case "Y": case "y":
                System.out.print("Material: ");
                String material = scanner.nextLine();
                Appcycle.getUser().addMaterialWithoutCount(material);
                inputMaterials();
                break;
            case "N": case"n":
                break;
        }
    }

    public void projectMaterials() {
        System.out.println("\n----------------------Materials-------------------------");
        for (String all : Appcycle.getUser().getMaterials().keySet()) {
            System.out.println(all + " x" + Appcycle.getUser().getMaterials().get(all));
        }
        //clearScreen();
    }

    public void clearScreen() {
        for (int i = 0; i < 100; i++) {
            System.out.println(" ");
        }
    }


}
