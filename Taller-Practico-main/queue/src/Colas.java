import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Colas {

    private int numero;


    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        Queue<Integer> fila = new LinkedList<Integer>();
        Colas colas = new Colas();
       
        
        System.out.println("holi");

        System.out.print("Ingrese un numero: ");

        colas.setNumero(scanner.nextInt()); 
        
        System.out.println("funcion");
        colas.enqueue(colas);
    }
    
    String cadena = "";

    public void enqueue(Colas cola){

        

        int actualizarnum = (cola.getNumero() / 2);
        cadena += String.valueOf(cola.getNumero() % 2);
        System.out.println("residuo" + actualizarnum);

        System.out.println("ggg " + cadena);
        numero = actualizarnum;
        System.out.println(numero);


    }
    public int getNumero() {
        return numero;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }
}
