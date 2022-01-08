import java.util.Scanner;
public class ui

{
        public static String s2;
        public static String s1;
        public static void main(String[] args) {
                Scanner myObj2 = new Scanner(System.in);
                System.out.print("\033[H\033[2J");
                System.out.println("\n================================================================================");
                System.out.println("================================================================================");
                System.out.println("\n\n\t\t\t\tWelcome To TIC TAC TOE\n ");
                System.out.println("\n\t\tEnter Username 1");
                s1 = myObj2.nextLine();
                System.out.println("\n\t\tEnter Username 2");
                s2 = myObj2.nextLine();
                System.out.print("\033[H\033[2J");
                System.out.println("\n\n\t\t"+s1 + "  VS  " + s2);
                System.out.println("\n\t\t"+s1 + " You are assigned X\n" +"\t\t"+ s2 + " You are Assigned O\n");
                board b = new board();
                b.disp();
                
        }

}
