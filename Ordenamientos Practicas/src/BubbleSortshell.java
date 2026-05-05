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
                contComparaciones++;
                if(!(j>=gap && array[j-gap] > aux)){
                    System.out.println("\tgap=" + gap + "\ta= " + A + "\tb=" + B+ 
                        "\t[a]= " + array[A] + "\t[b]= " +  aux + "\tcambio=no");
                }
                boolean saltos = true;
                while (j>=gap && array[j-gap] > aux){
                    if (saltos){
                        System.out.println("\tgap=" + gap + "\ta= " + A + "\tb=" + B+ 
                            "\t[a]= " + array[A] + "\t[b]= " +  aux + "\tcambio=si");
                        saltos = false;
                    }else{
                        System.out.println("\tgap=" + gap + "\ta= " + A + "\tb=" + B+ 
                            "\t[a]= " + array[A] + "\t[b]= " +  aux + "\tcambio=si");
                    }
                    array[j] = array[j-gap];
                    cambios++;
                    j-=gap;
                    contComparaciones++;
                }
                if (!saltos){
                        A = j-gap>=0 ? j-gap:0;
                        B = j;
                        printArregloDez(A, B);
                        System.out.println("\tgap=" + gap + "\ta=" + A + "\tb=" + B +
                            "\t[a]=" + (j-gap>=0?array[j-gap]:array[0]) + "\t[b]=" + aux + "\tcambio=no");
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
                contComparacionesDes++;
                if(!(j>=gap && array[j-gap] < aux)){
                    System.out.println("\tgap=" + gap + "\ta= " + A + "\tb=" + B+ 
                        "\t[a]= " + array[A] + "\t[b]= " +  aux + "\tcambio=no");
                }
                boolean saltosDes =true;
                while (j>=gap && array[j-gap] < aux){
                    A = j-gap;
                    B = j;
                    if (saltosDes){
                        System.out.println("\tgap=" + gap + "\ta= " + A + "\tb=" + B+ 
                            "\t[a]= " + array[A] + "\t[b]= " +  aux + "\tcambio=si");
                        saltosDes = false;
                    }else{
                        printArregloDez(A,B);
                        System.out.println("\tgap=" + gap + "\ta= " + A + "\tb=" + B+ 
                            "\t[a]= " + array[A] + "\t[b]= " +  aux + "\tcambio=si");
                    }
                    array[j] = array[j-gap];
                    cambiosDes++;
                    j-=gap;
                    contComparacionesDes++;
                   
    
                }
                if (!saltosDes){
                        A = j-gap>=0 ? j-gap:0;
                        B = j;
                        printArregloDez(A, B);
                        System.out.println("\tgap=" + gap + "\ta=" + A + "\tb=" + B +
                            "\t[a]=" + (j-gap>=0?array[j-gap]:array[0])+ "\t[b]=" + aux + "\tcambio=no");
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

    public void printArregloDez(int posUno , int posDos){
        for(int k=0;k<posUno;k++){
            System.out.print("\t");
        }
        System.out.print(array[posUno] + "\t");

        for(int k=posUno+1;k<=posDos;k++){
            System.out.print("\t");
        }
        System.out.println(array[posDos] + "\t");
    }

}