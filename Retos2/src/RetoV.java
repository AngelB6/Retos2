import java.util.Scanner;

public class RetoV {
    public static void main(String[] args) {
        // Declaramos las variables necesarias
        int posi1, posi2, cont=1, respuesta=1;
        // Instanciamos la clase Scanner para capturar los datos ingresados por el usuario 
        Scanner capturar = new Scanner(System.in);
        // Creamos una matriz llamada tamañoMa de tipo int que servira para mostrarle al usuario el tamaño del concentrate  
        int [] [] tamañoMa = new int [3] [3];
        // Creamos un ciclo for con el que vamos a rellenar la matriz con nuemros para que el usuario sepa el tamaño
        for (int filas1=0; filas1<3; filas1++) {
            for (int columnas1=0; columnas1<3; columnas1++) {
                tamañoMa [filas1] [columnas1] = cont;
                cont++;
            }
        }
        System.out.println("El concentrate tiene el siguinete tamaño:");
        // Creamos un ciclo for que servira para mostrarle al usuario el tamaño de la matriz 
        for (int filas1=0; filas1<3; filas1++){
            System.out.println();
            for (int columnas1=0; columnas1<3; columnas1++){
                System.out.print(tamañoMa[filas1][columnas1] + "\t");
            }
        }
        // Creamos una matriz llamada matriz de tipo int y con tamaño de 3 fila y 3 columnas
        int [] [] matriz = new int [3] [3];
        // Rellenamos la matriz con numeros que se repitan al menos dos veces en la matriz
        matriz [0] [0] = 1;
        matriz [0] [1] = 5;
        matriz [0] [2] = 7;

        matriz [1] [0] = 6;
        matriz [1] [1] = 3;
        matriz [1] [2] = 5;

        matriz [2] [0] = 6;
        matriz [2] [1] = 7;
        matriz [2] [2] = 1;
        // Creamos un ciclo Do-While para que el ususario juegue minimo una vez
        do {
            // Solicitmaos el valor 1
            System.out.println("\nIngrese la posision de la primera fila y la columna (00-01-02-10-11-12-20-21-22)");
            // Asignamos el valor capturado a la variable posi1
            posi1=capturar.nextInt();
            // Solicitmaos el valor 1
            System.out.println("Ingrese la posision de la segunda fila y la columna (00-01-02-10-11-12-20-21-22)");
            // Asignamos el valor capturado a la variable posi2
            posi2=capturar.nextInt();
            System.out.println("Se estan comparando las posiciones...");
            // Creamos una condicional que compare el pavlor ingresado por el ususario con las pociciones correctas y muestre un mensaje dependeindo de la evaluacion
            if (posi1==00 && posi2==22){
                System.out.println("Usted ha encontrado el par del numero 1");
            }else if (posi1==01 && posi2==12){
                System.out.println("Usted ha encontrado el par del numero 5");
            }else if (posi1==02 && posi2==21){
                System.out.println("Usted ha encontrado el par del numero 7");
            }else if (posi1==10 && posi2==20){
                System.out.println("Usted ha encontrado el par del numero 6");
            }else{
                System.out.println("No ha encontrado ninguna posicion");
            }
            // Preguntamos al usuario si desea seguir jugando
            System.out.println("¿Desea seguir jugando?\n1. Si\n2. No");
            // Capturamos la respuesta
            respuesta=capturar.nextInt();
        // Evaluamos la condicion
        }while (respuesta==1);{
            System.out.println("Gracias por jugar!\nLa solucion del concentrate era:");
            // Creamos un ciclo for para mostrar los valores de la matriz
            for (int filas2=0; filas2<3; filas2++){
                System.out.println();
                for (int columnas2=0; columnas2<3; columnas2++){
                    System.out.print(matriz[filas2][columnas2] + "\t");
                }
            }
        }
        // Limpiamos el buffer
        capturar.close();
    }
}