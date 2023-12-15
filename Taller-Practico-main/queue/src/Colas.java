import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Colas {

    private int numero = 1;
    Queue<String> fila = new LinkedList<String>();


    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in)) {
            Colas colas = new Colas();
      
            
            System.out.println("holi");

            System.out.print("Ingrese un numero: ");
            int n = scanner.nextInt();
            
            System.out.println("funcion");

            colas.enqueue(n);
        }
    }
    
    String cadena = "";

    public void enqueue(int n){

        int i = 1;

        while(i <= n ){
            System.out.println("i = " + i );
            int actualizarnum = (numero / 2); // 0
            cadena += String.valueOf(numero % 2); //1 
            System.out.println("division " + actualizarnum); //0
            System.out.println("modulo " + (1%2));
            System.out.println("cadena " + cadena); //1

            //numero = actualizarnum;
            setNumero(actualizarnum); ////0
            System.out.println("nuevo numero " + getNumero()+ "\n"); 

            if(actualizarnum == 0 ){
                fila.add(cadena);
                cadena = "";
                i++;
                setNumero(i);
                
            }
        }System.out.println(fila);
        System.out.println(fila.peek());
        System.out.println(fila.poll());
        System.out.println(fila.peek());
    }

    






    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
