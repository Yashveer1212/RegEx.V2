import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //variables and scanner
        Scanner scan = new Scanner(System.in);
        String p1Name;// Name of Fighter1
        String p2Name;// Name of Fighter2
        String p1Weapon;// Weapon of fighting for fighter1
        String p2Weapon;// Weapon of fighting for fighter2
        int p1Power;// Power level of fighter1
        int p2Power;// Power level of fighter2
        Fighter p1 = new Fighter();
        Fighter p2 = new Fighter();

        System.out.println("\nYour fighter's weapon should be formatted like this: Weapon_Num");
        System.out.println("For the fighter's name, please only capitalize the first letter only. Also no special characters");
        System.out.println("Power should be formatted in any number 1-10");
        System.out.println();

        //Fill out the classes
        System.out.println("P1: Enter the name of your Fighter");
        p1Name = scan.next();
        p1.setName(p1Name);
        System.out.println("P1: Enter the Weapon of your Fighter");
        p1Weapon = scan.next();
        p1.setfighterWeapon(p1Weapon);
        System.out.println("P1: Enter the power level of your Fighter (1-10)");
        p1Power = scan.nextInt();
        p1.setfighterPower(p1Power);
        System.out.println("P2: Enter the name of your Fighter");
        p2Name = scan.next();
        p2.setName(p2Name);
        System.out.println("P2: Enter the Weapon of your Fighter");
        p2Weapon = scan.next();
        p2.setfighterWeapon(p2Weapon);
        System.out.println("P2: Enter the power level of your Fighter(1-10)");
        p2Power = scan.nextInt();
        p2.setfighterPower(p2Power);

        System.out.println("\n");
        System.out.println("Player One Stats");
        System.out.println(p1);
        System.out.println("\n");
        System.out.println("Player Two Stats");
        System.out.println(p2);

        //logic
        System.out.println("\n");
        if(p1.getfighterPower() == p2.getfighterPower())
        {
            System.out.println("Your Fighters are evenly matched, they decided not to fight each other " + p1.getName() + " and " +
                    p2.getName() + " end up teaming together to try and rule the world.");
        }
        else if(p1.getfighterPower() > p2.getfighterPower())
        {
            System.out.println("The Fighter " + p1.getName() + " has easily defeated " + p2.getName() + " and has own the fight.");
        }
        else
        {
            System.out.println("The Fighter " + p2.getName() + " has easily defeated " + p1.getName() + " and has own the fight.");
        }
    }//end of main method
}//end of Main class