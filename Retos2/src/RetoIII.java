import java.util.Scanner;

public class RetoIII {
    public static void main(String[] args) {
        // Declaramos una variable llamada n
        int n;
        // Instanciamos la clase Scanner para capturar los datos ingresados por el usuario
        Scanner capturar = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de letras que tiene la palabra");
        // Asignamos el valor capturado a la varable n 
        n = capturar.nextInt();
        // Creamos un vector llamado palabra de tipo String que alamcenara en cada una de las posiciones una letra de la palabra, tiene como tamaño el valor asignado en la varable n
        String [] palabra = new String [n];
        System.out.println("Ingrese la palabra letra por letra");
        // Cambiamos el tipo de dato que recibira el Scanner
        capturar.nextLine();
        // Creamos un ciclo for que se encargara de almacenar en cada uno de los espacios una letra de la palabra
        for (int letra=0; letra<n; letra++){
            System.out.println("Ingrese la letra N" + letra);
            palabra[letra] = capturar.nextLine();
        }
        
        System.out.println("Bienvenido al juego del ahorcado!\nLa palabra a adivinar contiene " + n + " letras");
        // Creamos una variable que se usara como contador de letras encontradas
        int n1=n;
        // Creamos una varible String que se usara para almacenar la letra ingresada por el usuario
        String letraUsu;
        // Creamos un ciclo for anidado que le solicitara al usuario ingrese una letra para despues comparar la letra ingresda por el usuario y verificar si esta en alguna posicion del vector
        for (int letraUsua=0; letraUsua<n; letraUsua++){
            System.out.println("Ingrese una letra");
            letraUsu = capturar.nextLine();
            for (int i=0; i<n; i++){
                if (palabra[i].equals(letraUsu)){
                    System.out.println("La letra " + letraUsu + " esta en la palabra\nTe quedan " + (n1=n1-1) + " letras por adivinar");
                }else{
                }
            }
        }
        // Creamos un vector donde el usuario ingrese la palabra que crea es correcta letra por letra
        String [] palabraUsu = new String [n];
        // Creamos un ciclo for que almacene en el vector palabraUsu una letra en cada uno de los espacios
        for (int palabraDes=0; palabraDes<n; palabraDes++){
            System.out.println("Ingrese la palabra que crea es correcta letra por letra");
            palabraUsu [palabraDes] = capturar.nextLine();
        }
        // Creamos un contador 
        int acerto=0;
        // Creamos un ciclo for para que compare cada una de las letras de lso dos vectores y que sume o reste dependiendo si acerto o no
        for (int valor=0; valor<n; valor++) {
            if (palabra[valor].equals(palabraUsu[valor])){
                acerto++;
            }else{
                acerto--;
            }
        }
        // Creamos una condicional que evalue si el nuemro de aciertos es igual al nuemro de letras que tiene la palabra y que muestre un mensaje dependiendo
        if (acerto==n){
            System.out.println("Felicidades! Usted ha acertado la palabra");
        }else{
            System.out.println("No acerto, la palabra era: ");
            for (String valor : palabra) {
                System.out.print(valor);
            }
        }
        // Limpiamos el buffer
        capturar.close();
    }
}