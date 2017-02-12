/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.ejimenezr.t01.p1;
import java.util.Scanner;
/**
 *
 * @author elver
 */
public class SPPEJimenezRT01P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cate;
        double sue, he, sF;
        Scanner kb =new Scanner(System.in);
        
            System.out.println("Introduce una de las 5 categorías");
        cate=kb.nextInt();
        if (cate>=1 && cate<=5){
        switch (cate){
            case 1:
                System.out.println("Introduzca las horas extra");
                he=kb.nextDouble();
                System.out.println("Introduzca el sueldo base");
                sue=kb.nextDouble();  
                sF=sue+(he*30);
                System.out.println("El sueldo final es "+sF);
                break;
            case 2:
                System.out.println("Introduzca las horas extra");
                he=kb.nextDouble();
                System.out.println("Introduzca el sueldo base");
                sue=kb.nextDouble(); 
                sF=sue+(he*38);
                System.out.println("El sueldo final es "+sF);
                break;
            case 3:
                System.out.println("Introduzca las horas extra");
                he=kb.nextDouble();
                System.out.println("Introduzca el sueldo base");
                sue=kb.nextDouble(); 
                sF=sue+(he*50);
                System.out.println("El sueldo final es "+sF);
                break;
            case 4:
                System.out.println("Introduzca las horas extra");
                he=kb.nextDouble();
                System.out.println("Introduzca el sueldo base");
                sue=kb.nextDouble(); 
                sF=sue+(he*70);
                System.out.println("El sueldo final es "+sF);
                break;
            case 5:
                System.out.println("Introduzca las horas extra");
                he=kb.nextDouble();
                System.out.println("Introduzca el sueldo base");
                sue=kb.nextDouble(); 
                sF=sue+(he*90);
                System.out.println("El sueldo final es "+sF);
                break;
            }
            }
        else {
            System.out.println("Valor no admitido");
                }
        }
}
