/*
 * Составьте программу для нахождения длины катета прямоугольного треугольника (b), если известны длины гипотенузы (c) и катета (a). Результат вывести на консоль..
 */
package LAB3;

/**
 *
 * @author sedunov
 */
import java.util.Scanner;
public class Zadanie5 {
    public static void main (String args[]) {
        System.out.println("Введите длину гипотенузы и катета:");
        Scanner sc = new Scanner(System.in);
        double c = sc.nextDouble();
        double a = sc.nextDouble();
        System.out.println("Второй катет = " + Math.sqrt((c*c-a*a)));
    }  
}
