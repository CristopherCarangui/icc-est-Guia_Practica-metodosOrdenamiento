import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        runBubbleSortIns();
        runBubbleSortshell();
        int [] array = {12,-7,25,0,-15,33,19,-55,5,48,-3};
        BubbleSortIns bSortIns = new BubbleSortIns(array);
        BubbleSortshell bSortshell = new BubbleSortshell(array);
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
                                bSortIns.printArreglo();
                                bSortIns.sortInsAscedente();
                            } else if (insert.equals("false")){
                                bSortIns.printArreglo();
                                bSortIns.sortInsDescedente();
                            }
                            break;
                        }

                        case 2:{
                            System.out.println(" true"); 
                            System.out.println("false");
                            String insert = teclado.nextLine();
                            if(insert.equals("true")){
                                bSortshell.printArreglo();
                                bSortshell.sortShellAscendente();
                            } else if (insert.equals("false")){
                                bSortshell.printArreglo();
                                bSortshell.sortShellDescendente();
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
