/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pets;

/**
 *
 * @author gloom
 */
public class cat extends pet {
         private String name;
     public cat(String name) 
    {
    this.name=name;
        weight=7; 
        sex="girl"; 
        age=5; 
    }
     
     public void get(){
        
        System.out.println("Кот: "+name +" Вес: "+weight +", пол: "+sex +", возраст: "+age);
     }
     
     public static void main(String[] args){ 
    cat name = new cat("Morris");
    
    name.get();
    }
    
}
