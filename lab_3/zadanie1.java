/*
 * С помощью цикла вычислите значение выражения 2^n
 */

package LAB1;

/**
 *
 * @author Uroboros
 */
import java.util.Scanner;
public class Zadanie2 {
    public static void main (String args[]) {
    System.out.println("Введите произвольное число для нахождения 2^n:");
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int fac = 1;
        for (int i = 1; i < n+1; i++){
            fac = fac * 2;
        }
        System.out.println("Факториал числа "+ n +" = "+fac);
    }
}
