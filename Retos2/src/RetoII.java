import java.util.Scanner;

public class RetoII {
    public static void main(String[] args) {
        // Declaramos una variable para la cantidad de competidores
        int canCompe;
        // Instanciamos la clase Scanner para capturar los datos ingresados por el usuario
        Scanner capturar = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de competidores que desea registrar");
        // Asignamos el valor capturado a la variable canCompe (Cantidad Copetidores)
        canCompe = capturar.nextInt();
        /*Creamos dos vectores el primero llamdo nom de tipo String que almacenera el nombre de cada competidor y el segundo llamado t de tipo int que alamcenara el tiempo de cada 
        competidor en segundos*/
        String [] nom = new String [canCompe];
        int [] t = new int [canCompe];
        // Creamos un ciclo for que con cada iteracion rellene cada una de las pociones de los dos vectores. Primero soloicitara el nombre del competidor y luego el tiempo de este
        for (int i=0; i<canCompe; i++) {
            // Cambiamos el tipo de dato que va a recibir el Scanner
            capturar.nextLine();
            System.out.println("Ingrese el nombre del competidor N" + i);
            nom[i]=capturar.nextLine();
            System.out.println("Ingrese el tiempo del competidor en segundos");
            t[i]=capturar.nextInt();
        }
        // Creamos un ciclo for que recorra cada una de las pocisones del vector y muetsre a los competidores y su tiempo
        for (int x=0; x<canCompe; x++){
            System.out.print("El nombre del competidor " + x + " es: " + nom[x] + " y su tiempo es de: ");
            System.out.println(t[x]);
        }
        // Creamos un ciclo for anidado que reorganice los datos del tiempo de cada competidor de menor a mayor
        for (int z=0; z<canCompe-1; z++) {
            for (int y=0; y<canCompe-z-1; y++) {
                // Si en la posicion 0 del vector t hay un valor menor que en la posicion 1 del mismo vector ejecute 
                if (t[y]>t[y+1]) {
                    // Creamos una variable que se utilizara de forma temporal para almacenar el valor mayor
                    int tTemp=t[y];
                    // Asignamos el valor de t en la posicion 0 a la posicion 1 del mismo vector
                    t[y]=t[y+1];
                    // Asignamos el valor de t de la posicion 1 a la varble temporal
                    t[y+1]=tTemp;
                }
            }
        }
        // Mostramos el menor timepo hecho por los competidores
        System.out.println("El ganador tuvo como tiempo: " + t[0]);
        // Limpiamos el buffer  
        capturar.close();
    }
}