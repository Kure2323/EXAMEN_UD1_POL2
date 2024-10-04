package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio2 {
    public void ejecutar(){
        Scanner entrada = new Scanner(System.in);
        boolean tc = true;
        int ap = 0;
        int lp =0;
        int aa =0;
        int la =0;

        while(tc == true) {
            try {
                System.out.println("Introduce el ancho de la pared:");
                ap = entrada.nextInt();
                System.out.println("Introduce el largo de la pared:");
                lp = entrada.nextInt();
                System.out.println("Introduce el ancho del azulejo:");
                aa = entrada.nextInt();
                System.out.println("Introduce el largo del azulejo:");
                la = entrada.nextInt();
                tc = false;
            }catch(InputMismatchException e){
                System.out.println("Introduzca un valor numérico correcto");
                entrada.nextLine();
            }
        }

        if(ap < 0 || lp < 0 || aa < 0 || la < 0){
            System.out.println("No pueden ser valores negativos.");
        }else{
            if(aa == la){
                System.out.println("El azulejo no puede ser cuadrado.");
            }else{
                if(ap < aa || lp < la){
                    System.out.println("El azulejo no puede ser más grande que la pared.");
                }else{
                    int areap = ap * lp;
                    int areaa = aa * la;
                    int resultado = areap / areaa;
                    System.out.println("Se necesitan " + resultado + " azulejos.");
                }
            }
        }

    }
}
