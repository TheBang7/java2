package week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice3Answer {
    public static void main(String[] args) {
        int f = 1;
        while (true) {
            System.out.print("Please input the function No:\n" +
                    "1 - Get even numbers\n" +
                    "2 - Get odd numbers\n" +
                    "3 - Get prime numbers\n" +
                    "4 - Get prime numbers that are bigger than 5\n" +
                    "0 - Quit\n");
            Scanner in = new Scanner(System.in);
            f = in.nextInt();
            if (f == 0) return;
            System.out.println("Input size of the list:");
            int l = in.nextInt();
            System.out.print("Input elements of the list:\n");
            List<Integer> ans = new ArrayList<Integer>();
            int a;
            //ans.clear();
            for (int i = 0; i < l; i++) {
                a = in.nextInt();
                if (f == 1 && a % 2 == 0) ans.add(a);
                else if (f == 2 && a % 2 == 1) ans.add(a);
                else if (f == 3 && isPrime(a)) ans.add(a);
                else if (f == 4 && a > 5 && isPrime(a)) ans.add(a);
            }
            System.out.println(ans);
        }
    }

    public static boolean isPrime(int a) {
        if (a == 1) return false;
        int b = (int) Math.sqrt(a);
        for (int i = 2; i <= b; i++) {
            if (a % i == 0) return false;
        }
        return true;
    }

}
