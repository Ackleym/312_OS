/*
 * ♥♥♥♥♥♥♥♥♥
Encapsulates the queue structure used by Scheduler
♥♥♥♥♥♥♥♥♥
 */
package pkg312project;


public class ExecutionQueue {

    public class Node
    {
        Node next;
        Node prev;
        PCB pcb;

        public Node(PCB pcb)
        {
            this.pcb = pcb;
            this.next = null;
            this.prev = null;
        }
    }

    static Node current;
    Node first;
    Node last;
    int numProc;

    public void executionQueue()
    {
        ExecutingQueue.current = null;
        this.first = null;
        this.last = null;
        int numProc = 0;
    }

    public static class PCB
    {
        int memory;
        int arrival;
        int timeElapsed;
        int counter;
        String state;
        String priority;

        public PCB()
        {
            this.priority = null;
            this.state = "New";
            this.arrival = 0;
            this.timeElapsed = 0;
            this.counter = 0;
        }


    }
    public Node enQueue(PCB pcb)
    {
        Node newNode = new Node(pcb);
        newNode.pcb = pcb;

        if (current == null)
        {
            first = newNode;
            last = newNode;
            current = newNode;
            current.next = null;
        }

        else
        {
            current.next = newNode;
            newNode = current;
            current.prev = first;
            last = newNode;
        }

        return newNode;
    }

    public void deQueue()
    {
        if (first.next != null)
            first.next.prev = null;
        first = first.next;

    }

//    public void printPCB(Node node)
//    {
//        int memory = node.pcb.memory;
//        int arrival = node.pcb.arrival;
//        int timeElapsed = node.pcb.timeElapsed;
//        int counter = node.pcb.counter;
//        String state = node.pcb.state;
//        String priority = node.pcb.priority;
//
//        System.out.println(memory + "\n" + arrival + "\n" + timeElapsed + "\n" + counter
//                + "\n" + state + "\n" + priority);
//
//        if (node.next != null)
//        {
//            node = node.next;
//            printPCB(node);
//        }
//    }
//
//
//    public static void main(String[] args)
//    {
//        ExecutingQueue exec = new ExecutingQueue();
//        PCB pcb = new ExecutingQueue.PCB();
//        exec.enQueue(pcb);
//        exec.enQueue(pcb);
//        exec.enQueue(pcb);
//        exec.deQueue();
//        exec.printPCB(current);
//
//    }


}
