/*
Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива
на экран сначала в строку, отделяя один элемент от другого пробелом,
а затем в столбик (отделяя один элемент от другого началом новой строки)
 */

/**
 *
 * @author gloom
 */
public class Task1 {
    public static void main(String[] args) {
       
       int[] array=new int[10];
       int i = 0;
       int n = 2;
        while (i < 10) {
            array[i] = n;
            n +=2;
            i++;
        }
        // Вывод значений в одну строку:
        for (i = 0; i < 10; i++)
         System.out.print(array[i]+" ");
        // Вывод значений в один столбец:
        System.out.println("\n");
        for (i = 0; i < 10; i++)   
            System.out.println(array[i]);
       
               }
    
}

       