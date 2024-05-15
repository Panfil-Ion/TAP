import java.util.LinkedList;
import java.util.Scanner;

public class Queue {
    private LinkedList<String> queue;

    public Queue() {
        this.queue = new LinkedList<>();
    }

    public void enqueue(String item) {
        queue.addLast(item);
    }

    public boolean contains(String pattern) {
        return queue.contains(pattern);
    }

    public static void main(String[] args) {
        Queue myQueue = new Queue();
        Scanner scanner = new Scanner(System.in);

        // Introduce unele siruri de caractere in coada
        System.out.println("Introduceti sirurile de caractere (separate prin spatiu):");
        String[] inputStrings = scanner.nextLine().split(" ");
        for (String str : inputStrings) {
            myQueue.enqueue(str);
        }

        // Verifica daca coada contine un sir-model
        System.out.println("Introduceti sirul-model pe care doriti sa il cautati:");
        String pattern = scanner.nextLine();
        if (myQueue.contains(pattern)) {
            System.out.println("Coada contine sirul-model: " + pattern);
        } else {
            System.out.println("Coada nu contine sirul-model: " + pattern);
        }

        scanner.close();
    }
}
