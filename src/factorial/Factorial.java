/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

/**
 *
 * @author jmllamasg
 * Comentario Ejercicio 13
 * Comentario Ejercicio 15
 */
public class Factorial {
    public static int calculo(int n){
        if(n<0){
            throw new IllegalArgumentException("Número " +n+ " no puede ser < que 0");
        }
        int fact=1;
        for(int i=2 ;i<=n ; i++)
            fact*=i;
        if (fact==0){
            throw new ArithmeticException("Overflow, número "+n+" demasiado grande");
        }
        return fact;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Factorial f = new Factorial();
                
        System.out.println(f.calculo(0));
        System.out.println(f.calculo(5));
        System.out.println(f.calculo(-3));
        System.out.println(f.calculo(4000));
    }
    
}
