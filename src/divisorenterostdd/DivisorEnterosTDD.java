/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divisorenterostdd;

/**
 *
 * @author Sercop-Admin
 */
public class DivisorEnterosTDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dividir division1 = new Dividir();
        try{
            System.out.println(Dividir.division(4, 3));
        } catch(ArithmeticException e){
            System.out.println("No Existe División para 0");
        }
    }
    
}
