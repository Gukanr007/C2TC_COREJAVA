package practice;
import java.util.*;
public class TestCase1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size :");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1) {
                    System.out.print(j + " ");
                } 
                else if (i == n) {
                    System.out.print((n - j + 1) + " ");
                }
                else if (j == 1) {
                    System.out.print(i + " ");
                } 
                else if (j == n) {
                    System.out.print((n - i + 1) + " ");
                } 
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


	}

}
