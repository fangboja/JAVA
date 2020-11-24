/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class RectangleTest {

    
    public static void main(String[] args) {
       Rectangle r1 = new Rectangle();
        System.out.println("面積="+r1.getArea());
       r1.draw();
       
        Rectangle r2 = new Rectangle(12);
        System.out.println("面積="+r2.getArea());
        r2.draw();
        
         Rectangle r3 = new Rectangle(15,5);
        System.out.println("面積="+r3.getArea());
        r3.draw();
    }
    
}
