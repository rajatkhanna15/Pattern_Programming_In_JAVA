package Star_Patterns.Inverted_Half_Pyramid;
import java.util.*;
import java.util.Scanner;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        for(int i = n-1; i >= 0; i--)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
