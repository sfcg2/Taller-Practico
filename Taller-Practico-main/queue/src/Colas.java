import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Colas {
    
    private int numero = 1;

    Queue<String> q = new LinkedList<String>();


    public void enqueue(int n){

        String cadenaBinaria = "";
        
        int i = 1;
        while(i<=n){

            System.out.println("i = " + i );
            int actualizarnum = (numero / 2); // 0
            cadenaBinaria += String.valueOf(numero % 2);//1
            //cadenaBinaria.indexOf(String.valueOf(numero % 2),0);
            System.out.println("division " + actualizarnum); //0
            System.out.println("modulo " + (numero % 2));
            System.out.println("cadena " + cadenaBinaria); //1

            //numero = actualizarnum;
            setNumero(actualizarnum); ////0
            System.out.println("nuevo numero " + getNumero()+ "\n"); 

            if(actualizarnum == 0 ){
                q.add(cadenaBinaria);
                cadenaBinaria = "";
                setNumero(i);

            }
        }System.out.println(q);
        //System.out.println(q.peek());
        //System.out.println(q.poll());
        //System.out.println(q.peek());
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

            System.out.println("holi");
            System.out.print("Ingrese un numero: ");
            int n = scanner.nextInt();
            System.out.println("funcion");
            colas.enqueue(n);
        }
    }
}
