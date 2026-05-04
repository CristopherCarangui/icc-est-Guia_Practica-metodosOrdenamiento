public class BubbleSortshell{
    int [] array;

    public BubbleSortshell(int[] arreglo){
        this.array = arreglo;
    }

    public void sortShellAscendente(){
        int a = array.length;
        int contComparaciones = 0;
        for(int gap =a/2 ; gap >0;gap/=2){
            for(int i = gap; i< a; i++){
                int aux = array[i];
                int j = i;
                System.out.println("Numero " + i + "actual: " + array[j] );
                while (j>=gap && array[j-gap] > aux){
                    System.out.println("Cambio: " + array[j-gap] + "por" + aux);
                    array[j] = array[j-gap];
                    j-=gap;
                    contComparaciones++;
                }
                array[j] = aux;
                printArreglo();
            }

        }
        System.out.println("Hubo un total de : " +contComparaciones);
    }

    public void sortShellDescendente(){
        int a = array.length;
        int contComparacionesDes = 0;
        for(int gap =a/2 ; gap >0;gap/=2){
            for(int i = gap; i< a; i++){
                int aux = array[i];
                int j = i;
                System.out.println("Numero " + i + "actual: " + array[j] );
                while (j>=gap && array[j-gap] < aux){
                    System.out.println("Cambio: " + array[j] + "por" + array[j-gap]);
                    array[j] = array[j-gap];
                    j-=gap;
                    contComparacionesDes++;
    
                }
                array[j] = aux;
                printArreglo();
            }

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