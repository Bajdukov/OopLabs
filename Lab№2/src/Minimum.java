

import java.util.Scanner;

/*
Ввести с клавиатуры два числа, и вывести на экран 
минимальное из них (Поиск минимума выполняется в функции).
 */

/**
 *
 * @author gloom
 */

public class Minimum {
    public static void Comparison (int a, int b) {
      if (a>b){
          System.out.print("Минимальное число="+b);
      }
      if (a<b) {
          System.out.print("Минимальное число="+a);
       }
      if (a==b) { System.out.print("Введенные числа равны");
    }
    }


        public static void main(String[] args) {
          System.out.print("Введите первое число:");
          Scanner sc1 = new Scanner(System.in);
          int a = sc1.nextInt();
          System.out.print("Введите второе число:");
          Scanner sc2 = new Scanner(System.in);
          int b = sc2.nextInt();
          Comparison(a,b);
          }
       
        
 
            
}   

     