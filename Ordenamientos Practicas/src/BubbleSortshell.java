public class BubbleSortshell{
    int [] array;

    public BubbleSortshell(int[] arreglo){
        this.array = arreglo;
    }

    public void sortShellAscendente(){
        int a = array.length;
        int interacion = 0;
        int cambios =0;
        int contComparaciones = 0;
        System.out.println("Arreglo Original: ");
        printArreglo();
        System.out.println();
        for(int gap =a/2 ; gap >0;gap/=2){
            for(int i = gap; i< a; i++){
                int aux = array[i];
                int j = i;
                System.out.println("I " + interacion + "\t");
                printArregloForm();
                int A = j-gap;
                int B = j;
                if(!(j>=gap && array[j-gap] > aux)){
                    System.out.println("\tgap=" + gap + "a- " + A + "b-" + B+ 
                                       "[a]= " + array[A] + "[b]= " +  aux + "cambio-no");
                }
                contComparaciones++;
                while (j>=gap && array[j-gap] > aux){
                    System.out.println("\tgap=" + gap + "a- " + A + "b-" + B+ 
                                       "[a]= " + array[A] + "[b]= " +  aux + "cambio-si");
                    cambios++;
                    array[j] = array[j-gap];
                    j-=gap;
                    contComparaciones++;
                    if (j>=gap && array[j-gap]>aux){
                        A = j-gap;
                        B = j;
                        System.out.println("\t\t\t\t\t\t");
                    }
                }
                array[j] = aux;
                interacion++;
            }

        }
        System.out.println("\nend\t");
        printArreglo();
        System.out.println("Hubo un total de Comparaciones : " +contComparaciones);
        System.out.println("Iteraciones : " +interacion);
        System.out.println("Cambios : " +cambios);
    }

    public void sortShellDescendente(){
        int a = array.length;
        int interacionDes =0;
        int contComparacionesDes = 0;
        int cambiosDes =0;
        System.out.println("Arreglo original: ");
        printArreglo();
        System.out.println();
        for(int gap =a/2 ; gap >0;gap/=2){
            for(int i = gap; i< a; i++){
                int aux = array[i];
                int j = i;
                System.out.println("I " + interacionDes + "\t");
                printArregloForm();
                int A = j-gap;
                int B = j;
                if(!(j>=gap && array[j-gap] < aux)){
                    System.out.println("\tgap= "+ gap + "a- " + A + "b-" + B+ 
                                       "[a]= " + array[A] + "[b]= " +  aux + "cambio-no");
                }
                contComparacionesDes++;
                while (j>=gap && array[j-gap] < aux){
                    System.out.println("\tgap= "+ gap + "a- " + A + "b-" + B+ 
                                       "[a]= " + array[A] + "[b]= " +  aux + "cambio-si");
                    cambiosDes++;
                    array[j] = array[j-gap];
                    j-=gap;
                    contComparacionesDes++;
                    if (j>=gap && array[j-gap]<aux){
                        A = j-gap;
                        B = j;
                        System.out.println("\t\t\t\t\t\t");
                    }
    
                }
                array[j] = aux;
                interacionDes++;
            }

        }
        System.out.println("\nend\t");
        printArreglo();
        System.out.println("Hubo un total de Comparaciones : " +contComparacionesDes);
        System.out.println("Iteraciones : " +interacionDes);
        System.out.println("Cambios : " +cambiosDes);
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