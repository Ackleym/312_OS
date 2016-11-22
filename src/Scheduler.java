/*
 *♥♥♥♥♥♥♥♥♥
Schedules processes according to round robin Algorithm with a time quantum of 10 cycles
♥♥♥♥♥♥♥♥♥
 */
package pkg312project;

public class Scheduler
{

    public class PCB
    {
//        int id;
//        int memory;
//        int arrival;
//        int timeElapsed
//        int counter;
//        String state;
//        String priority;
//
//        public PCB()
//            this.id = id;
//            this.priority = priority;
//            this.processState = new;
//            this,arrival = null;
//            this.timeElapsed = null;
//            this.counter = null;

    }

    //Ready queue for scheduler

    //Wait queue for scheduler
    public class WaitQueue
    {
        Node current;
        Node first;
        Node last;
        int numProc;

        public waitQueue()
        {
            this.current = null;
            this.first = null;
            this.last = null;
            int numProc = 0;
        }
    }

    //Node class for the queues
    public class Node
    {
        Node next;
        Node prev;
        Object data;

        public Node(Object[][] pcb)
        {
            thid.data = data;
            this.left = null;
            this.right = null;
        }
    }

    //Insert PCB into the proper queue
    public void insertPCB(Node pcb)
    {
        if pcb[0][1] is New
        {
            if pcb[1][1] > memory remaining
            {
                enqueue.waitQueue();
                setState(wait);
            }

            else
            {
                setState(ready);
                readyQueue.enqueue(pcb);
                memoryAllocated = memoryAllocated + pcb[1][1];
            }
        }
        if pcb[0][1] is Wait
        {
            if pcb[1][1] < memory remaining
            {
                setState(ready);
                waitQueue.dequeue(pcb);
                readyQueue.enqueue(pcb);
                memoryAllocated = memoryAllocated + pcb[1][1];
            }
        }
    }

    //Remove the PCB from queue
    public void removePCB()
    {
//        if (process state exit)
//            PCB == null;
    }

    //Get current state of a given process
    public void getState(Process process)
    {
//        PCB = process.PCB;
//        return PCB.processState;
    }

    //Set state of a given process
    public void setState(Process process)
    {
//        PCB = process.PCB;
//        if (PCB.processState = new)
//            if (memory > memoryAvailable)
//                PCB.processState = ready;
//                wait.enqueue(process);
//            else
//                PCB.processState = run;
//                execution.enqueue(process);
    }

    //Get the wait(?) for a given process
    public void getWait(Process process)
    {
//        PCB = process.PCB;
//        return PCB.timeElapsed;
    }

    //Set wait(?) for a given process
    public void setWait(Process process, int wait)
    {
//        PCB = process.PCB;
//        process.timeElapsed = wait;
    }

    public void getArrival(Process process)
    {
//        PCB = process.PCB;
//        return PCB.timeElapsed;

    }

    public void setArrival(Process process, int arrival)
    {
//        PCB = process.PCB;
//        process.arrival = arrival;
    }

    public void getCPUTime()
    {
//      time = clock;
//        return time;
    }

    public void setCPUTime(int time)
    {
//        clock = time;
    }
    
    
}
