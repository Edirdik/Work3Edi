import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер элемента ряда Фибоначчи (10 ≤ i ≤ 100000): ");
        int n = sc.nextInt();
        long a = 0, b = 1, c = 1;
        for (int i = 3; i <= n; i++) {
            a = b;
            b = c;
            c = a + b;
        }
        System.out.println("f(" + n + ") = " + c);
        int[] count = new int[10];
        while (c > 0) {
            count[(int)(c % 10)]++;
            c /= 10;
        }
        int maxCount = 0, maxDigit = 0;
        for (int i = 0; i < 10; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                maxDigit = i;
            }
        }
        System.out.println("[" + maxDigit + ", " + maxCount + "]");
    }
}