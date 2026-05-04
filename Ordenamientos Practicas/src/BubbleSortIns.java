public class BubbleSortIns {
    int [] array;
    public  BubbleSortIns(int [] arreglo){
        this.array = arreglo;
    }

    public void sortInsAscedente(){
        int interacion =0;
        int cambios =0;
        boolean huboComparaciones;
        int contComparaciones = 0 ;
        System.out.println("Arreglo original: ");
        printArreglo();
        System.out.println();
        for (int i =1; i< array.length;i++){
            huboComparaciones = false;
            int valorActual = array[i];
            int j = i;
            System.out.print("I" + interacion + "\t" );
            printArregloForm();
            int A = j-1;
            int B = j;
            if(!(j>0 && array[j-1] > valorActual)){
                System.out.println("\ta= " + A + "b= " + B + 
                                    "[a]= " + array[A] + "[b]= " +  valorActual + "cambio-no");
            }
            contComparaciones++;
            while (j>0 && array[j-1] > valorActual){
                huboComparaciones = true;
                System.out.println("\ta= " + A + "b= " + B + 
                                    "[a]= " + array[A] + "[b]= " +  valorActual + "cambio-si");
                array[j] = array[j-1];
                cambios++;
                j--;
                contComparaciones++;
                if(j>0 && array[j-1]>valorActual){
                    A = j-1;
                    B = j;
                    System.out.print("\t\t\t\t\t\t");
                }
            }
            array[j] = valorActual;
            interacion++;
        }
        System.out.println("\nend\t");
        printArreglo();
        System.out.println("\n Hubo un total de Comparaciones : " +contComparaciones);
        System.out.println("Iteraciones: " + (interacion));
        System.out.println("Cambios: " + cambios);
       
    }

    public void sortInsDescedente(){
        int interacionDes =0;
        int cambiosDes = 0;
        boolean huboComparacionesDes;
        System.out.println("Arreglo original: ");
        printArreglo();
        System.out.println();
        int contComparacionesDes = 0 ;
        for (int i =1; i< array.length;i++){
            huboComparacionesDes = false;
            int valorActual = array[i];
            int j = i;
            System.out.print("I" + interacionDes + "\t" );
            printArregloForm();
            int A = j-1;
            int B = j;
            if(!(j>0 && array[j-1] > valorActual)){
                System.out.println("\ta= " + A + "b= " + B + 
                                    "[a]= " + array[A] + "[b]= " +  valorActual + "cambio-no");
            }
            contComparacionesDes++;
            while (j>0 && array[j-1] < valorActual){
                huboComparacionesDes = true;
                System.out.println("\ta= " + A + "b= " + B + 
                                    "[a]= " + array[A] + "[b]= " +  valorActual + "cambio-si");
                array[j] = array[j-1];
                cambiosDes++;
                j--;
                contComparacionesDes++;
            }
            array[j] = valorActual;
            interacionDes++;
        }
        System.out.println("\nend\t");
        printArreglo();
        System.out.println("\n Hubo un total de Comparaciones : " +contComparacionesDes);
        System.out.println("Iteraciones: " + (interacionDes));
        System.out.println("Cambios: " + cambiosDes);
    }

    public void printArreglo() {
          for(int i: array){
            System.out.print(i + ",");
           
        }
        System.out.println();
    }
    public void printArregloForm(){
        for(int num :array){
            System.out.print(num + "\t");
        }
    }

}
