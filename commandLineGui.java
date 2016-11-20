import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;


//url of tutorial 
//https://www.youtube.com/watch?v=YYSjCGKCWQQ
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Najia13
 */
public class CommandLineGui {
    
    public static void main(String[] args){
        new CommandLineGui();
        
    
    }
    
    public JFrame theWindow;
    public JTextPane commandPrompt;
    public JTextField userInput;
    public JScrollPane scrollerWindow;
    
    public StyledDocument doc; 
    
    
    boolean trace = false;
    
    public CommandLineGui(){
         try {
         
             UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
             
         }
         catch (Exception ex)  {}
         theWindow = new JFrame();
         theWindow.setTitle("Console");
         theWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         commandPrompt = new JTextPane();
         commandPrompt.setEditable(false);
         commandPrompt.setFont(new Font("Courier New" , Font.PLAIN, 14));
         commandPrompt.setOpaque(false);
         
         doc = commandPrompt.getStyledDocument();
         
         
         
         userInput = new JTextField();
         userInput.setEditable(true);
         userInput.setForeground(Color.WHITE);
         userInput.setCaretColor(Color.WHITE);
         userInput.setOpaque(false);
         
         
         userInput.addActionListener(new ActionListener()
         {
             @Override
             public void actionPerformed(ActionEvent e){
             
                 String text = userInput.getText();
                 if (text.length()> 1){
                    //print(text + "\n", trace, new Color (255, 255,255));
                    //println(text, false); 
                    doCommand(text);
                    scrollBottom();
                    userInput.selectAll();
                    
                 
                 }
                 
                 
             }
             
         
         });
         
         
         
         
         
         scrollerWindow = new JScrollPane(commandPrompt);
         scrollerWindow.setOpaque(false);
         scrollerWindow.getViewport().setOpaque(false);
         
         
         theWindow.add(userInput, BorderLayout.SOUTH);
         
         theWindow.add(scrollerWindow, BorderLayout.CENTER);
         theWindow.getContentPane().setBackground(new Color(50, 50, 50));
         
         
         
         theWindow.setSize(660, 350);
         
         theWindow.setLocationRelativeTo(null);
         
         theWindow.setResizable(false);
         theWindow.setVisible(true);
         
         
        }

 //////♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥   
         public void scrollTop(){
                commandPrompt.setCaretPosition(0);
                

                        }
        public void scrollBottom(){
                commandPrompt.setCaretPosition(commandPrompt.getDocument().getLength());
                
                
        
        }
        
        public void print(String s, boolean trace){
            print(s, trace, new Color(255,255,255));
        
        }
        public void print(String s, boolean trace, Color col){
            Style style = commandPrompt.addStyle("Style", null);
            StyleConstants.setForeground(style, col);
            
            if (trace ){
                Throwable t = new Throwable();
                StackTraceElement[] elements = t.getStackTrace();
                String caller = elements[0].getClassName();
                
                s = caller + "-> " + s;
                
                 
            
            }
            
            
            try{
            doc.insertString(doc.getLength(), s, style);
            
            }
            catch(Exception ex){}
            
            
            
        
        }
        
        
        public void println(String s, boolean trace){
            println(s, trace, new Color(255, 255,255));
        
        }
        public void println(String s, boolean trace, Color c){
            print(s + "\n", trace, c);
            
        
        }
        
        
        //♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥ 
        //Functions for 
        //proc()
        //exe()
        //load()
        //mem()
        //exit()
        //reset()
        
        
        
        
        
        public void clear(){
        
            try{ 
            doc.remove(0,doc.getLength());
              
            
            
            }
            catch(Exception ex){}
        
        
        
        }







       public void doCommand(String s){
           final String[] commands = s.split(" ");
           
           try {
               if(commands[0].equalsIgnoreCase("reset"))
               {
                   clear();
               }
               
               
               else if (commands[0].equalsIgnoreCase("proc()")){
                   String help = "return unfinished processes and information, current process state, CPU time needed to finish,"
                           + "Priority, CPU time used ";
                   println(help, trace, new Color(255,255,255));
               
               }
                else if(commands[0].equalsIgnoreCase("mem()")){
                    String mem = "Show current usage of memory space";
                    println(mem, trace, new Color(255,255,255));
                
                }
                
                else if (commands[0].equalsIgnoreCase("load()") ){
                    String load = "loads prog/job files into simulator, includes allocation of programs PCB and memory space";
                    println(load, trace, new Color(255,255,255));
                }
                
                else if (commands[0].equalsIgnoreCase("exe()") ){
                    String exe = "Let's simulation run on it's own, specifiy number of cycles to run before pausing. If none in ready queue, go to command interface";
            
                    println(exe, trace, new Color(255,255,255));
                }
                
                else if (commands[0].equalsIgnoreCase("exit()") ){
                    String exe = "End and Exit simulation";
            
                    println(exe, trace, new Color(255,255,255));
                }
                
                
               else {
                   println(s, trace, new Color(255,255,255));
               
               }
           
           }
           
           catch(Exception ex){
               println("Error -> " + ex.getMessage(), trace, new Color(255,155,155));
           
           }


            }    
    
    
    
}