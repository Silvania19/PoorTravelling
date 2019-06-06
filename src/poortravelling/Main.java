/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poortravelling;

/**
 *
 * @author silva
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Persona p1=new Persona("silvania", "ortega","2235341614", 19);
       p1.agragarComentario("esta es la mejor");
       p1.agragarComentario("ru culo");
        System.out.println("Persona 1:"+ p1.toString());
    }
    
}
