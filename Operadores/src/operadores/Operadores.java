/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadores;

/**
 *
 * @author AbnerRodrigues
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) / 2;
        System.out.println("A média é igual a " + m);
        
        
        // usei o type cast para resolver o problema
        // calculo da raiz quadrada
        
        float res = (float) Math.sqrt(n1);
        
        System.out.println(res);
        
        // numero aleatorio entre 0.0 - 1.0
        double ale = Math.random();
        System.out.println(ale);
        
        // aleatorio inteiro 5 - 10
        int n = (int)(5 + ale * (10-5));
        System.out.println(n);
         
    }
    
}
