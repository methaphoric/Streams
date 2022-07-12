public class Main {

    public static void main(String[] args) {
        GymActivity gymActivity = new GymFactoryCraiova();

        //Introducerea concurentilor in baza de date
        gymActivity.addMember(new GymMember("Ionut", 20, 0, 0, false));
        gymActivity.addMember(new GymMember("Andrei", 22, 0, 0, false));
        gymActivity.addMember(new GymMember("Alina", 19, 0, 0, false));
        gymActivity.addMember(new GymMember("Florentin", 30, 0, 0, false));
        gymActivity.addMember(new GymMember("Louie", 30, 0, 0, false));

        //Situația inițială
        System.out.println(ConsoleColors.GREEN + "Everybody starts from 0:" + ConsoleColors.RESET);
        System.out.println(gymActivity);

        //Primirea rezultatelor de la arbitru
        gymActivity.receiveResult(0, 30, 70);
        gymActivity.receiveResult(1, 55, 55);
        gymActivity.receiveResult(2, 27, 40);
        gymActivity.receiveResult(3, 60, 40);
        gymActivity.receiveResult(4, 5, 40);


        //stabilirea castigatorilor
        gymActivity.givePrizes();

        //afisarea rezultatelor
        System.out.println(ConsoleColors.BLUE + "Received results:" + ConsoleColors.RESET);
        System.out.println(gymActivity);


        //afisarea castigatorului/ castigatorilor in caz de egalitate
        System.out.print("The winner/s is/are: ");
        gymActivity.displayWinners();

    }


}
