/*
 1.	Сделать класс Pet (лабораторная работа №6) абстрактным.
 */
package lab7_2;

/**
 *
 * @author gloom
 */
public abstract class pet {
    public boolean hungry;//хочет есть
    public String name;//пол
    public int age;//возраст
    
    abstract void voice();
}
