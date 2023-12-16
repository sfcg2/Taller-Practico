import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Colas {
    
    private int numero = 1;

    Queue<StringBuilder> q = new LinkedList<StringBuilder>();


    public void enqueue(int n){

        StringBuilder cadenaBinaria = new StringBuilder();
        
        int i = 1;

        while(i<=n){

            System.out.println("i = " + i );
            int actualizarnum = (numero / 2);
            cadenaBinaria.insert(0, String.valueOf(numero % 2));
            setNumero(actualizarnum);
            System.out.println("nuevo numero " + getNumero()+ "\n"); 

            if(actualizarnum == 0 ){

                q.add(cadenaBinaria);
                cadenaBinaria = new StringBuilder();
                i++;
                setNumero(i);

            }
        }for(StringBuilder s: q){
            System.out.println(s);
        }
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            Colas colas = new Colas();

            System.out.print("Cola de numeros binarios desde el 1 hasta el numero:");
            int n = scanner.nextInt();
            colas.enqueue(n);
        }
    }
}
