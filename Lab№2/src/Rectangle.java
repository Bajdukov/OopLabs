
import java.util.Scanner;

/*
 Ввести с клавиатуры два числа m и n. 
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
 */

/**
 *
 * @author gloom
 */
public class Rectangle {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 
       int m=0;
       int n=0;
       System.out.print("Введите целое число cтрок: ");
        if(sc.hasNextInt()) { //Проверяем правильность типа введенных данных
          m = sc.nextInt(); 
        System.out.print("Введите целое число cтолбцов: ");
        if(sc.hasNextInt()) { 
          n = sc.nextInt();
        }
            for (int i=0; i<m; i++)
            {
                for (int j=0; j<n; j++)
                { 
                    System.out.print(8);
                }
                        System.out.println();
            }
        }
   }
}

