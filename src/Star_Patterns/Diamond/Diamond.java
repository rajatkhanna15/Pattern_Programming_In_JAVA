package Star_Patterns.Diamond;

import java.util.*;
public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n - 1;
        for(int i = 0; i < n;i++)
        {

            for(int j = 0 ; j <= space; j++)
                System.out.print(" ");
            space--;

            int x = i + 1;
            for(int k = 0; k < 2 * x - 1; k++)
                System.out.print("*");

            System.out.println();
        }
        space = 1;
        for(int i = n - 1; i >= 0; i --)
        {

            for(int j = 1 ; j <= space; j++)
                System.out.print(" ");
            space++;

            int x = i + 1;
            for(int k = 0; k < 2 * x - 1; k++)
                System.out.print("*");

            System.out.println();
        }


    }
}
