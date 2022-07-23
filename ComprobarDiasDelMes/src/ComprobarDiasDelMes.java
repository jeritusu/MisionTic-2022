import java.util.Scanner;

public class ComprobarDiasDelMes {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero de 1 a 12: ");
        int numMes = sc.nextInt();
        validar(numMes);
        

    }
    public static String mes(int mes){
        String res=" ";
        switch (mes){
            
            case 1:
                res = "Enero";
                break;
            case 2:
                res = "Febrero";
                break;
            case 3:
                res = "Marzo";
                break;
            case 4:
                res = "Abril";
                break;
            case 5:
                res = "Mayo";
                break;
            case 6:
                res = "Junio";
                break;
            case 7:
                res = "Julio";
                break;
            case 8:
                res = "Agosto";
                break;
            case 9:
                res = "Septiembre";
                break;
            case 10:
                res = "Octubre";
                break;
            case 11:
                res = "Noviembre";
                break;
            case 12:
                res = "Diciembre";
                break;                       
        }

        return res;
    }
    public static void validar(int val){
        if (val>=1 && val<=12){
            System.out.println("El mes de "+mes(val)+" tiene "+numDias(val)+" dias.");
        }else{
            System.out.println("numero no valido...");
        }
        
    }
    public static int numDias(int mes){
        int dias;
        if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
            dias = 31;
        }else if(mes==2){
            dias = 28;
        }else{
            dias = 30;
        }
        return dias;

    }
}
