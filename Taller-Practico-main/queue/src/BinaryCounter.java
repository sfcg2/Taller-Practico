import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryCounter {

    private Queue<String> queuee;
    
    public void cadenaBinaria(int n) {

        queuee = new LinkedList<String>();
        queuee.offer("1");
        
        for (int i = 0; i < n; i++) {
            String front = queuee.poll();
            System.out.println(front);
            queuee.offer(front+"0");
            queuee.offer(front+"1");
        }
    }
    
    public static void main(String[] args) {

        System.out.print("Count in binary to what decimal value?: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        BinaryCounter binaryCounter = new BinaryCounter();
        binaryCounter.cadenaBinaria(n);
    }
}
