import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("el valor de la multiplicacion es: "+calMul(num1,num2));

        
    }
    public static double calMul(int numero1,int numero2){
        double res = numero1*numero2;
        return res;
    }
}
