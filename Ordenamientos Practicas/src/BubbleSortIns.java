public class BubbleSortIns {
    int [] array;
    public  BubbleSortIns(int [] arreglo){
        this.array = arreglo;
    }

    public void sortInsAscedente(){
        printArreglo();
        boolean huboComaparaciones;
        int contComaparaciones = 0 ;
        for (int i =1; i< array.length;i++){
            huboComaparaciones = false;
            int valorActual = array[i];
            int j = i;
            System.out.println("Numero " + i + "actual: " + array[j] );
            while (j>0 && array[j-1] > valorActual){
                huboComaparaciones = true;
                System.out.println("Cambio: " + array[j] + "por" + array[j-1]);
                array[j] = array[j-1];
                j--;
                contComaparaciones++;
            }
            array[j] = valorActual;
            printArreglo();
        }
        System.out.println("Hubo un total de : " +contComaparaciones);
       
    }

    public void sortInsDescedente(){
        printArreglo();
        boolean huboComparacionesDes;
        int contComparacionesDes = 0 ;
        for (int i =1; i< array.length;i++){
            huboComparacionesDes = false;
            int valorActual = array[i];
            int j = i;
            System.out.println("Numero" + i + "actual:" + array[j]);
            while (j>0 && array[j-1] < valorActual){
                huboComparacionesDes = true;
                System.out.println("Cambio: " + array[j] + "por" + array[j-1]);
                array[j] = array[j-1];
                j--;
                contComparacionesDes++;
            }
            array[j] = valorActual;
            printArreglo();
        }
        System.out.println("Hubo un total de : " +contComparacionesDes);
    }

    public void printArreglo() {
          for(int i: array){
            System.out.print(i + ",");
           
        }
        System.out.println();
    }

}
