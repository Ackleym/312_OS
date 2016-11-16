/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg312project;

/**
 *
 * @author Najia13
 */
public class CPU {
    
    
    //♥♥♥♥ Simulates a CPU clock ♥♥♥♥♥ 

    public class Clock{
        public void execute(){}
        public void getClock(){}
    
    }
    
    //♥♥♥♥ Simulates an interrupt processor ♥♥♥♥♥
    public class InterruptProcessor{
        public void signalInterrupt(){}
        public void addEvent(){}
        public void getEvent(){}
    
    }
    
    //♥♥♥♥ Encapsulates the event queue used by interrupt system ♥♥♥♥♥
    public class EventQueue{
        public void enQueue(){}
        public void deQueue(){}
        
    
    }
}
