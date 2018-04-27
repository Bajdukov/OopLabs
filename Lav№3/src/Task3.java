/*
 Создайте массив из 15 случайных целых чисел из отрезка [0;9]. 
Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов и 
выведете это количество на экран на отдельной строкеnd open the template in the editor.
 */

/**
 *
 * @author gloom
 */
public class Task3 {
  public static void main(String[] args) {
        double[] array=new double[15];
        int k=0;
        for(int i=0;i<15;i++){
            array[i]=Math.round(Math.random()*9);
            System.out.print((int) array[i]+" ");
            if ((array[i]/2)==(Math.round(array[i]/2))) {
                k++;                
            }            
        }
        System.out.print("\nЧетных чисел: "+k+"\n");
    }   
}
