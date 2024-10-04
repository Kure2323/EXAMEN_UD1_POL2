package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejercicio1 {
    public void ejecutar() {
        boolean tc = true;
        int num = 0;
        Scanner entrada = new Scanner(System.in);

        while(tc == true){
            try{
                System.out.println("Introduce un número:");
                num = entrada.nextInt();
                tc = false;
            }catch(InputMismatchException e){
                System.out.println("ERROR. Introduce un valor válido");
                entrada.nextLine();
            }
        }
        if(num < 0){
            int abs = num * -1;
            System.out.println("El valor absoluto es " + abs);
        }else{
            System.out.println("El valor absoulto es " + num);
        }
    }
}

