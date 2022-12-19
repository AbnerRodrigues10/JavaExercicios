/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testetipos;

/**
 *
 * @author AbnerRodrigues
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
/*        int idade = 30;
//        String valor = idade; não funciona!
//a linha a baixo é chamada de classe invólucro 
        String valor = Integer.toString(idade);
        System.out.println(valor);
         */

// para ser feito em int
        String valor = "30";
        int idade = Integer.parseInt(valor);
        System.out.println(idade);
        
// para ser feito em float
        String valorComPonto = "30.5";
        float idadePonto = Float.parseFloat(valorComPonto);
        System.out.println(idadePonto);
    }

}
