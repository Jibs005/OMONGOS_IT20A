import java.util.*;

class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

public class HospitalQueue {
    public static void main(String[] args) {
        Queue<Patient> normalQueue = new LinkedList<>();
        PriorityQueue<Patient> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(p -> p.severity));

        normalQueue.add(new Patient("Paul Kane", 3));
        normalQueue.add(new Patient("Alex", 1));
        normalQueue.add(new Patient("Jasiel", 2));
        normalQueue.add(new Patient("Jayboy", 1));

        priorityQueue.addAll(normalQueue);

        System.out.println("Normal Queue (FIFO Order):");
        while (!normalQueue.isEmpty()) {
            System.out.println("Treating: " + normalQueue.poll());
        }

        System.out.println();

        System.out.println("Priority Queue (By Severity):");
        while (!priorityQueue.isEmpty()) {
            System.out.println("Treating: " + priorityQueue.poll());
        }
    }
}
