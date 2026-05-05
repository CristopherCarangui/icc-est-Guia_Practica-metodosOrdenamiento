import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        runBubbleSortIns();
        runBubbleSortshell();
        int [] array = {12,-7,25,0,-15,33,19,-22,5,48,-3};
        do{
            System.out.println("==== Programa de Ordenamiento =====");
            System.out.println("1.Ejecutar Ordenamientos");
            System.out.println("2.Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1: {
                    System.out.println(" Ordenamientos"); 
                    System.out.println("1.Insercion (true/false)");
                    System.out.println("2.Shell (true/false");
                    int opcionOr = teclado.nextInt();
                    teclado.nextLine();
                    switch(opcionOr){
                        case 1: {
                            System.out.println(" true"); 
                            System.out.println("false");
                            String insert = teclado.nextLine();
                            if(insert.equals("true")){
                                BubbleSortIns bAsc = new BubbleSortIns(array.clone());
                                bAsc.sortInsAscedente();
                            } else if (insert.equals("false")){
                                BubbleSortIns bDes = new BubbleSortIns(array.clone());
                                bDes.sortInsDescedente();
                            }
                            break;
                        }

                        case 2:{
                            System.out.println(" true"); 
                            System.out.println("false");
                            String insert = teclado.nextLine();
                            if(insert.equals("true")){
                                BubbleSortshell bAsc = new BubbleSortshell(array.clone());
                                bAsc.sortShellAscendente();
                            } else if (insert.equals("false")){
                                BubbleSortshell bDes = new BubbleSortshell(array.clone());
                                bDes.sortShellDescendente();
                            }
                            break;
                        }
                    }
                
                }
            }
        }while(opcion !=2);
        teclado.close();

    }

    public static void runBubbleSortIns(){
 
    }

    public static void runBubbleSortshell(){

    }


    
    
}
