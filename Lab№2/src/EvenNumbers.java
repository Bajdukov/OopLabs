/**Используя цикл for вывести на экран чётные числа от 1 до 100 включительно. 
 * Через пробел либо с новой строки.
 */




/**
 *
 * @author gloom
 */
public class EvenNumbers {
   
    public static void main(String[] args) {
       int i;
        for ( i=1; i<=100; i++){
        	if (i%2==0) {
		        System.out.println(i);
	        }
        }
    }
        
    
}
