
package menu_principal;

import java.util.Scanner;


public class hanoi {
    public static void main(String []args){
       


        Scanner entrada = new Scanner(System.in);
        int discos;
        System.out.println("Numero de discos: ");
        
        discos = entrada.nextInt();
        System.out.println("Numero de movimiento= "+(Math.pow(2, discos)-1));
        Hanoi(discos, 1, 2, 3);  //1:origen  2:auxiliar 3:destino
    }

//Método Torres de Hanoi Recursivo
    public static void Hanoi(int n, int origen, int auxiliar, int destino) {
        if (n == 1) {
            System.out.println("mover disco de " + origen + " a " + destino);
        } else {
            Hanoi(n - 1, origen, destino, auxiliar);
            System.out.println("mover disco de " + origen + " a " + destino);
            Hanoi(n - 1, auxiliar, origen, destino);
        }
    }
}
