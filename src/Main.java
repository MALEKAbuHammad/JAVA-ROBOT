import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SideKick sideKickObject = new SideKick();
        WatADriver driverBot = new WatADriver();
        Scanner keyboardInput = new Scanner(System.in);

        int menuChoice;
        boolean keepMenuRunning;

        do {

            System.out.println("******* MENU FOR ROBOT CHOICE  *****");
            System.out.println("1. SideKick robot ");
            System.out.println("2. WatADriver robot ");
            System.out.println("**************************************");

            System.out.println("Enter your choice of robot(1 or 2): ");
            menuChoice = keyboardInput.nextInt();

            switch (menuChoice) {
                case 1:
                    sideKickObject.setChoice();;
                    sideKickObject.takeAction();
                    if(sideKickObject instanceof KungFuSkills) {
                        sideKickObject.kungFuProtection();
                    } else {
                        System.out.println("Sorry no KungFu skills available.");
                    }
                    break;

                case 2:
                    driverBot.setChoice();
                    driverBot.takeAction();
                    break;

                default:
                    System.out.println("Invalid choice for a robot.");
            }

            keyboardInput.nextLine();
            System.out.println("Another run? (enter y for yes/ any value for no):  ");
            String userInput = keyboardInput.nextLine();

            if(userInput.equalsIgnoreCase("y")) {
                keepMenuRunning = true;
            } else {
                keepMenuRunning = false;
            }

        } while (keepMenuRunning);
    }
}
