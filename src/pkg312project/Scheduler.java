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
        int id;
        int priority
        String processState
        int arrival;
        int timeElapsed
        int counter;

        public PCB()
            this.id = id;
            this.priority = priority;
            this.processState = new;
            this,arrival = null;
            this.timeElapsed = null;
            this.counter = null;

    }

    public void insertPCB(int priority, int id)
    {
//        when new process
//            PCB.priority = priority;
//            PCB.id = id;
//            PCB.processState = New;
//            PCB.arrival = clock;
//            PCB.timeElapsed = 0;
//            PCB.counter = 0;

    }

    public void removePCB()
    {
//        if (process state exit)
//            PCB == null;
    }

    public void getState(Process process)
    {
//        PCB = process.PCB;
//        return PCB.processState;
    }

    public void setState(Process process, String state)
    {
//        PCB = process.PCB;
//        process.processState = state;
    }

    public void getWait(Process process)
    {
//        PCB = process.PCB;
//        return PCB.timeElapsed;
    }

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
