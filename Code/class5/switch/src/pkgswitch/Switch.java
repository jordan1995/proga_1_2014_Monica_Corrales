/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author dell 3110
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
         boolean validar = true;
         double valor1 =0;
         double valor2 =0;
         double resultado;
         char continuar;
         int opcion =0;
         Scanner teclado = new Scanner (System.in);
         operaciones oOperaciones = new operaciones ();
         
         do{
             System.out.println("Digite la operación que desea realizar");
             System.out.println("1- Suma");
             System.out.println("2- Resta");
             System.out.println("3- División");
             System.out.println("4- Multiplicación");
             System.out.println("5- Raíz");
             System.out.println("6- Potencia");
             
             opcion=Integer.parseInt(teclado.nextLine());
             
             switch(opcion)
             {
              case 1:
                  System.out.println("Digite el valor del primer digito");
                  valor1=Double.parseDouble(teclado.nextLine());
                  System.out.println("Digite el valor del segundo digito");
                  valor2=Double.parseDouble(teclado.nextLine());
                  resultado=oOperaciones.Sumar(valor1, valor2);
                  System.out.println(resultado);
              break;
              
              case 2:
                  System.out.println("Digite el valor del primer digito");
                  valor1=Double.parseDouble(teclado.nextLine());
                  System.out.println("Digite el valor del segundo digito");
                  valor2=Double.parseDouble(teclado.nextLine());
                  resultado=oOperaciones.Resta(valor1, valor2);
                  System.out.println(resultado);
               break;
                  
               case 3:
                  System.out.println("Digite el valor del primer digito");
                  valor1=Double.parseDouble(teclado.nextLine());
                  System.out.println("Digite el valor del segundo digito");
                  valor2=Double.parseDouble(teclado.nextLine());
                  resultado=oOperaciones.Division(valor1, valor2);
                  System.out.println(resultado);
               break;
               
               case 4:
                  System.out.println("Digite el valor del primer digito");
                  valor1=Double.parseDouble(teclado.nextLine());
                  System.out.println("Digite el valor del segundo digito");
                  valor2=Double.parseDouble(teclado.nextLine());
                  resultado=oOperaciones.Multiplicacar(valor1, valor2);
                  System.out.println(resultado);
               break;
               
               case 5:
                  System.out.println("Digite el valor del primer digito");
                  valor1=Double.parseDouble(teclado.nextLine());
                  resultado=oOperaciones.Raíz(valor1);
                  System.out.println(resultado);
               break;
               case 6:
                  System.out.println("Digite el valor del primer digito");
                  valor1=Double.parseDouble(teclado.nextLine());
                  System.out.println("Digite el valor del segundo digito");
                  valor2=Double.parseDouble(teclado.nextLine());
                  resultado=oOperaciones.potencia(valor1, valor2);
                  System.out.println(resultado);
               break;
               
               default:
                   break;
                  
             
             }
             
             
             
             System.out.println("Desea continuar con otra operación? S/N");
             continuar=teclado.nextLine().charAt(0);
             if ((continuar=='S')||(continuar=='s')) {
                 validar =true;
             }else{
                 validar=false;
             }

         
         }while (validar);
         
    }
    
}
