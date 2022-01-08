 import java.util.Scanner;
 public class board {
   public static int loop2 = 1,  sc1 = 0, sc2 = 0 , t = 0;
   int k, loop1 = 1;

   public void disp() {
     ui u = new ui();
     Scanner myObj = new Scanner(System.in);
     while (loop1 == 1) {
       char[] arr = {'1','2','3','4','5','6','7','8','9'};
       int flag = 0;
       while (loop2 == 1) {
        System.out.println("\n");
         for (int i = 0; i < 9; i += 3)
           System.out.println("\t\t"+arr[i] + "|" + arr[i + 1] + "|" + arr[i + 2]);
         System.out.println("\t\t-------------");

         if (flag == 0) {
           System.out.println("\t\t"+u.s1 + " Enter the position\n");
           k = myObj.nextInt();
           if (k > 9 || k < 1)
                {
                  System.out.println("\t\tWrong Pos");
                 } 
             else if (arr[k - 1] == 'X' || arr[k - 1] == 'O' ) {
             System.out.println("\t\tWrong Pos");
           } else {
             arr[k - 1] = 'X';
             flag = 1;
             System.out.print("\033[H\033[2J");
           }
           check(arr, u.s1);
           continue;
           
         }

         if (flag == 1) {
           System.out.println("\t\t"+u.s2 + " Enter the position\n");
           k = myObj.nextInt();
           if (k > 9 || k < 1)
                {
                  System.out.println("\t\tWrong Pos");
                 } 
           else if (arr[k - 1] == 'X' || arr[k - 1] == 'O' ) {
             System.out.println("\t\tWrong Pos");
           } else {
             arr[k - 1] = 'O';
             flag = 0;
             System.out.print("\033[H\033[2J");
           }
           check(arr, u.s2);
           continue;
         }
                                                                                                            
       }
       t++;
       System.out.println("\n\t\tTotal Number of Games Played is " + t);
       System.out.println("\n\t\tThe Score is  " + u.s1 + "--" + sc1 + "    " + u.s2 + "--" + sc2);
       System.out.println("\n\t\tDo you Want to Continue 1-Yes 0-No");
       loop1 = myObj.nextInt();
       if (loop1 == 1) loop2 = 1;
     }

   }
   static void check(char[] arr, String s) {
     ui u2 = new ui();
     if ((arr[0] == arr[1] && arr[1] == arr[2]) || (arr[3] == arr[4] && arr[4] == arr[5]) || (arr[6] == arr[7] && arr[7] == arr[8]) || (arr[0] == arr[3] && arr[3] == arr[6]) || (arr[1] == arr[4] && arr[4] == arr[7]) || (arr[2] == arr[5] && arr[5] == arr[8]) || (arr[0] == arr[4] && arr[4] == arr[8]) || (arr[2] == arr[4] && arr[4] == arr[6])) {
         System.out.println("\n\n\t\t"+s + " Won the Game");
         loop2 = 0;
         if (s == u2.s1) sc1++;
         else sc2++;
        } 
    else if (arr[0] != '1' && arr[1] != '2' && arr[2] != '3' && arr[3] != '4' && arr[4] != '5' && arr[5] != '6' && arr[6] != '7' && arr[7] != '8' && arr[8] != '9') {
       System.out.println("\t\tGAME DRAW");
       loop2 = 0;
     }

   }

 }
