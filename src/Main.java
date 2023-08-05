
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of The size of the team");
        int num = sc.nextInt();
        boolean i1 = true;
        System.out.println("Enter the number of Player records to create");
        int n = sc.nextInt();

        for(int i = 0; i < n; ++i) {
            System.out.println("Enter the Details Of the Player");
            System.out.println("Enter the Player ID: ");
            String PlayerID = String.valueOf(sc.next());
            System.out.println("Enter the Name Of the Player: ");
            String Name = String.valueOf(sc.next());
            System.out.println("Enter the name of the the team the player:" + Name + "is in: ");
            String teamname = String.valueOf(sc.next());
            System.out.println("Enter the division the player:" + Name + "is in: ");
            String Division = String.valueOf(sc.next());
            System.out.println(" does" + Name + " have any professional Experience in this sport ?");
            String Experience = String.valueOf(sc.next());
            System.out.println("Does " + Name + "have any track record?");
            String var12 = String.valueOf(sc.next());
        }

    }
}


