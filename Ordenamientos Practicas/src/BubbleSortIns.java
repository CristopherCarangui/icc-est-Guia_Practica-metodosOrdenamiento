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
            contComparaciones++;
            if(!(j>0 && array[j-1] > valorActual)){
                System.out.println("\ta= " + A + "\tb= " + B + 
                    "\t[a]= " + array[A] + "\t[b]= " +  valorActual + "\tcambio=no");
            }
            boolean saltar = true;
            while (j>0 && array[j-1] > valorActual){
                huboComparaciones = true;
                A = j-1;
                B = j;
                int valorUno = array[A];
                if (saltar){
                    System.out.print(interacion + "\t");
                    printArregloForm();
                    System.out.println("\ta= " + A + "\tb= " + B + 
                        "\t[a]= " + valorUno + "\t[b]= " + valorActual + "\tcambio=si");
                    saltar = false;
                } else {
                    System.out.print("\t");
                    for (int k = A; k < i; k++){
                        System.out.print(array[k] + "\t");
                    }
                    System.out.println("\t\ta= " + A + "\tb= " + B +
                        "\t[a]= " + valorUno + "\t[b]= " + valorActual + "\tcambio=si");
                }

                array[j] = array[j-1];
                cambios++;
                j--;
                contComparaciones++;
            }
            if (!saltar){
                System.out.print("\t");
                if (j - 1 >= 0){
                    for (int k = j - 1; k < i; k++){
                        System.out.print(array[k] + "\t");
                    }
                    System.out.println("\t\ta=" + (j-1) + "\tb=" + j +
                        "\t[a]=" + array[j-1] + "\t[b]=" + valorActual + "\tcambio=no");
                } else {
                    System.out.println("\t\ta=0\tb=0" +
                        "\t[a]=" + array[0] + "\t[b]=" + valorActual + "\tcambio=no");
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
    int interacionDes = 0, cambiosDes = 0, contComparacionesDes = 0;
    System.out.println("Arreglo original: ");
    printArreglo();
    System.out.println();

    for (int i = 1; i < array.length; i++){
        int valorActual = array[i];
        int j = i;
        int A = j - 1;
        int B = j;
        System.out.print("I" + interacionDes + "\t");
        printArregloForm();
        System.out.println();
        contComparacionesDes++;

        if(!(j > 0 && array[j-1] < valorActual)){
            System.out.println("\ta= " + A + "\tb= " + B +
                "\t[a]= " + array[A] + "\t[b]= " + valorActual + "\tcambio=no");
        }

        boolean saltarDes = true;
        while (j > 0 && array[j-1] < valorActual){
            A = j - 1;
            B = j;
            int valorA = array[A];
            if(saltarDes){
                System.out.println("\ta= " + A + "\tb= " + B +
                    "\t[a]= " + valorA + "\t[b]= " + valorActual + "\tcambio=si");
                saltarDes = false;
            } else {
                System.out.println("\t\t\ta= " + A + "\tb= " + B +
                    "\t[a]= " + valorA + "\t[b]= " + valorActual + "\tcambio=si");
            }
            array[j] = array[j-1];
            cambiosDes++;
            j--;
            contComparacionesDes++;
        }

        if(!saltarDes){
            if(j - 1 >= 0){
                System.out.println("\t\t\ta=" + (j-1) + "\tb=" + j +
                    "\t[a]=" + array[j-1] + "\t[b]=" + valorActual + "\tcambio=no");
            }
        }
        array[j] = valorActual;
        array[j] = valorActual;
        interacionDes++;
    }

    System.out.println("\nend\t");
    printArreglo();
    System.out.println("Comparaciones: " + contComparacionesDes);
    System.out.println("Iteraciones: " + interacionDes);
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
