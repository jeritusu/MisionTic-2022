
import java.util.Scanner;

public class HolaMundoNetBeans {

    public static void main(String[] args) {
        /*
        System.out.println("Hello World!");
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su nombre: ");
        String.out.println("hola "+ nombre+ "bienvenido a Java");*/
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor digite un numero de 1 a 7: ");
        int dia=sc.nextInt();
        
        switch (dia){
            case 1:
                System.out.println("el  dia es lunes");
                break;
            case 2:
                System.out.println("el  dia es martes");
                break;
            case 3:
                System.out.println("el  dia es miercoles");
                break;
            case 4:
                System.out.println("el  dia es jueves");
                break;
            case 5:
                System.out.println("el  dia es viernes");
                break;
            case 6:
                System.out.println("el  dia es sabado");
                break;
            case 7:
                System.out.println("el  dia es domingo");
                break;
                
        }
    }
}


