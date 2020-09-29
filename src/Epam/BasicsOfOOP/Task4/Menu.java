package BasicsOfOOP.Task4;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    private static final String MENUINFO=
            "\n1. Print all treasures.\n"+
                    "2.Choose treasures by number.\n"+
                    "3.Print list of selected treasures.\n"+
                    "4.Clear list of your treasures.\n"+
                    "5.Print most expensive treasure.\n"+
                    "6.Select treasures by amount.\n"+
                    "7.Exit.\n\n"+
                    "Make your decision:";
    public static void makeDecision()throws IOException{
        while(true){
            System.out.println(MENUINFO);
            Scanner scanner=new Scanner(System.in);
            int choice=scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("All treasures in a cave:");
                    Cave.getInstance().printAllTreasures();
                    break;
                case 2:
                    System.out.print("Input number of the selected treasures:");
                    User.getInstance().addTreasure(scanner.next());
                    break;
                case 3:
                    System.out.println("Print list of selected treasures:");
                    User.getInstance().printMyTreasure();
                    break;
                case 4:
                    User.getInstance().clearListOfYourTreasures();
                    break;
                case 5:
                    System.out.println("Most expensive treasure is:");
                    Cave.getInstance().mostExpensiveTreasurePrint();
                    break;
                case 6:
                    System.out.print("Input amount of money:");
                    User.getInstance().selectTreasureByAmount(scanner.next());
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }
}
