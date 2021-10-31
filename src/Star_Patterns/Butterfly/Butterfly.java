package Star_Patterns.Butterfly;

import java.util.*;
public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j <= i; j++)
                System.out.print("*");

            int spaces = 2 * (n - i - 1);
            for(int k = 0; k < spaces; k++)
                System.out.print(" ");

            for(int l = 0; l <= i;l++)
                System.out.print("*");

            System.out.println();
        }

        for(int i = n-1; i >=0; i--)
        {
            for(int j = 0; j <= i; j++)
                System.out.print("*");

            int spaces = 2 * (n - i - 1);
            for(int k = 0; k < spaces; k++)
                System.out.print(" ");

            for(int l = 0; l <= i;l++)
                System.out.print("*");

            System.out.println();
        }
    }
}
