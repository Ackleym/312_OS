/*
 * ♥♥♥♥♥♥♥♥♥
Encapsulates the queue structure used by Scheduler
♥♥♥♥♥♥♥♥♥
 */
package pkg312project;


public class ExecutionQueue {

    Node current;
    Node first;
    Node last;
    int numProc;

    public executionQueue()
    {
        this.current = null;
        this.first = null;
        this.last = null;
        int numProc = 0;
    }

    public class Node
    {
        Node next;
        Node prev;
        Object data;

        public Node(Object[][] pcb)
        {
            thid.pcb = pcb;
            this.left = null;
            this.right = null;
        }
    }

}
    public void enQueue(Node pcb)
    {
        Node newNode = new Node();
        newNode.data = pcb;

        if current = null;
        {
            first = newNode;
            last = newNode;
            newNode.next = null;
        }

        else
        {
            current.
            last = pcb;
        }

    }

    public void deQueue()
    {
//        if (processState = exit)
//            remove process from queue and memory
    }
    
    
    
    
}
