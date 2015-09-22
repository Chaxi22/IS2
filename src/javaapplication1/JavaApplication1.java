/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola");
        
        Person p1;
        Date f;
       f = new Date(93, 11, 25);
       
        
        p1 = new Person("Chaxi", "Cabrera", f);
        System.out.println(p1.getFullName());
        System.out.println(p1.getBirthday());
        System.out.println(p1.getAge());
        System.out.println("Fin");        
    }
}
