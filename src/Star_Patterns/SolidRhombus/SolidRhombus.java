package Star_Patterns.SolidRhombus;

import java.util.*;
public class SolidRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n - i; j++)
                System.out.print(" ");

            for(int k = 0; k < n; k++)
                System.out.print("*");

            System.out.println();
        }
    }

}
