import java.util.Scanner;

public class RetoIV {public static void main(String[] args) {
    // Instanciamos la clase Scanner para capturar el valor ingresado por el usuario
    Scanner capturar = new Scanner(System.in);
    // Creamos una matriz de nombre productos la cual tiene un tamaño de 9 filas y 5 columnas
    String[][] productos = new String[9][5];
    // Rellenamos la primera columna de cada una de las filas
    productos[0][0] = "0";
    productos[1][0] = "1";
    productos[2][0] = "2";
    productos[3][0] = "3";
    productos[4][0] = "4";
    productos[5][0] = "5";
    productos[6][0] = "6";
    productos[7][0] = "7";
    productos[8][0] = "8";
    // Rellenamos la primera fila
    productos[0][0] = "0";
    productos[0][1] = "1";
    productos[0][2] = "2";
    productos[0][3] = "3";
    productos[0][4] = "4";
    // Creamos un ciclo for anidado que se encaragra de rellenar la matriz solicitando primero los nombres y luego lso precios
    for (int filas = 1; filas < 9; filas++) {
        for (int columnas = 1; columnas < 5; columnas++) {
            if (filas == 1 || filas == 3 || filas == 5 || filas == 7 || filas == 9 || filas == 11) {
                System.out.println("Nombre Del Producto:");
                productos[filas][columnas] = capturar.nextLine();
            }else{
                System.out.println("Precio Del Producto");
                productos[filas][columnas] = capturar.nextLine();
            }
        }
        System.out.println(" ");
    }
    // Creamos un ciclo for para mostrar la matriz y el contenido de cada una de las pocisiones
    for (int filas = 0; filas < 9; filas++) {
        for (int columnas = 0; columnas < 5; columnas++) {
            System.out.print(productos[filas][columnas] + "\t");
        }
        System.out.println(" ");
    }
    // Limpiamos el buffer
    capturar.close();
}
}