import java.util.Scanner;

public class RetoI {
    public static void main(String[] args) {
        // Declaramos las variables 
        int n, suma = 0, califi=0;
        // Instanciamos la clase Scanner para capturar el valor de las notas
        Scanner capturar = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de notas que desea registrar");
        // Capturamos cuantas notas se van a resgitrar para determinar el tamaño del vector
        n = capturar.nextInt();
        // Creamos un vector llamdo vector1 de tipo entero y con un tamaño de n (Cantidad de notas)
        int [] vector1 = new int [n];
        // Creamos un ciclo for para rellenar el vector en cada una de sus poosicones
        for (int i=0; i<=n-1; i++) {
            System.out.println("Digite la nota N" + i);
            // Capturamos el valor para cada una de las posiciones
            vector1[i]=capturar.nextInt();
        }
        // Creamos un ciclo for que permita sumar cada una de las posiciones del vector entre si
        for(int i=0; i<n; i++) {
            suma=suma+vector1[i];
        }
        // Realizamos el promedio de las notas (La suma total de las notas/La cantidad de notas)
        califi = suma/n;
        System.out.println("El promedio de las notas es de: " + califi);
        // Creamos una condiconal anidado que evalue el promedio y muestre un mensaje dependediento del promedio
        if (califi<30){
            System.out.println("Reprobaste, usted debe recuperar");
        }else if (califi>=30 && califi<=40){
            System.out.println("Pasaste raspando");
        }else{
            System.out.println("Aprobaste con muy buenos resultados, felicidades!");
        }
        // Limpiamos el buffer
        capturar.close();
    }   
}