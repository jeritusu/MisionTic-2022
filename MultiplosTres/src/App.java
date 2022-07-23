public class App {
    
    public static void main(String[] args) throws Exception {
        //--------------------Ciclo For----------------------
        for (int i=3;i<100;i++){
            if (i%3==0){
                System.out.print(i+",");
            }
        }
        System.out.println("\r");//devolucion del carry

        //------------------Ciclo Do-While-------------------
        int j=3;
        do{            
            if (j%3==0){
                System.out.print(j+"-"); 
            }
            j++;
        }while(j<100);
        System.out.println("\r");//devolucion del carry

        //--------------------Ciclo While--------------------
        int k=3;
        while(k<100){
            if (k%3==0){
                System.out.print(k+" "); 
                
            }
            k++;
        }
    }}
