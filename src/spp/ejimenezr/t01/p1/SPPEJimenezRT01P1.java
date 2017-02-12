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
        
            System.out.println("Introduce una de las 8 categorías");
        cate=kb.nextInt();
        if (cate>=1 && cate<=8){
        switch (cate){
            case 1:
                he= mensajePedirHorasExtra();
                sue= mensajePedirSueldo();
                sF=sue+(he*30);
                System.out.println("El sueldo final es "+sF);
                break;
            case 2:
                he= mensajePedirHorasExtra();
                sue= mensajePedirSueldo();
                sF=sue+(he*38);
                System.out.println("El sueldo final es "+sF);
                break;
            case 3:
                he= mensajePedirHorasExtra();
                sue= mensajePedirSueldo();
                sF=sue+(he*50);
                System.out.println("El sueldo final es "+sF);
                break;
            case 4:
                he= mensajePedirHorasExtra();
                sue= mensajePedirSueldo();
                sF=sue+(he*70);
                System.out.println("El sueldo final es "+sF);
                break;
            case 5:
                he= mensajePedirHorasExtra();
                sue= mensajePedirSueldo();
                sF=sue+(he*90);
                System.out.println("El sueldo final es "+sF);
                break;
            case 6:
                he= mensajePedirHorasExtra();
                sue= mensajePedirSueldo();
                sF=sue+(he*110);
                System.out.println("El sueldo final es "+sF);
                break;
            case 7:
                he= mensajePedirHorasExtra();
                sue= mensajePedirSueldo();
                sF=sue+(he*130);
                System.out.println("El sueldo final es "+sF);
                break;
            case 8:
                he= mensajePedirHorasExtra();
                sue= mensajePedirSueldo();
                sF=sue+(he*150);
                System.out.println("El sueldo final es "+sF);
                break;
            }
            }
        else {
            System.out.println("Valor no admitido");
                }
        }
    static double mensajePedirHorasExtra() {
        Scanner kb= new Scanner(System.in);
        double he;
            System.out.println("Introduzca las horas extra");
            he=kb.nextDouble();
            return he;
    }
    static double mensajePedirSueldo() {
        double sue;
        Scanner kb= new Scanner(System.in);
        System.out.println("Introduzca el sueldo inicial");
        sue=kb.nextDouble();
        return sue;
        
    }
}