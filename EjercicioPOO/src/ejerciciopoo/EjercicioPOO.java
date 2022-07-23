
package ejerciciopoo;

import java.util.Date;
import java.util.Scanner;


public class EjercicioPOO {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite la cantidad de clientes para ingresar al sistema:");
        int numCli = sc.nextInt();
        sc.nextLine();//instruccion para limpiar el buffer  

        
        //crear una instancia de clase tipo array
        
        Cliente[] cliente = new Cliente[numCli];
        
        for (int i = 0; i < numCli; i++) {
            System.out.println("Digite el nombre del cliente "+(i+1)+": ");
            String nombre = sc.nextLine();
            System.out.println("El nombre "+nombre+" es cliente VIP (true o false)");
            boolean vip = sc.nextBoolean();
            cliente[i] = new Cliente(new Date(),vip);
            cliente[i].setNombre(nombre);
            sc.nextLine();
            
        }
        for (int i = 0; i < numCli; i++) {
            System.out.println(cliente[i].toString());
            
        }
    }
    
}
