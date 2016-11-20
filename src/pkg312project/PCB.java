package pkg312project;

public class PCB {

    import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

    public class PCB extends JPanel {
        private boolean DEBUG = false;

        public SimpleTableDemo() {
            super(new GridLayout(1,0));

            String[] columnNames = {"Properties ",
                    "Values",
                    // "Sport",
                    //"# of Years",
                    //"Vegetarian"
            };


            String test = "value";

            Object[][] data = {
                    {"Process State", test,

                    },
                    {"Process Number", test,

                    },
                    {"Program Counter", test,

                    },
                    {"Registers", test,

                    },
                    {"Memory Allocated", test,

                    }
                    {"Priority", test,

                    }
                    {"Time Elapsed", test,

                    }
            };

            final JTable PCBtable = new JTable(data, columnNames);
            PCBtable.setPreferredScrollableViewportSize(new Dimension(500, 70));

            if (DEBUG) {
                PCBtable.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        printDebugData(PCBtable);
                    }
                });
            }

            //Create the scroll pane and add the table to it.
            JScrollPane scrollPane = new JScrollPane(PCBtable);

            //Add the scroll pane to this panel.
            add(scrollPane);
        }

        private void printDebugData(JTable table) {
            int rows = table.getRowCount();
            int columns = table.getColumnCount();
            javax.swing.table.TableModel model = table.getModel();

            System.out.println("Value of data: ");
            for (int i=0; i < rows; i++) {
                System.out.print("    row " + i + ":");
                for (int j=0; j < columns; j++) {
                    System.out.print("  " + model.getValueAt(i, j));
                }
                System.out.println();
            }
            System.out.println("--------------------------");
        }

        /**
         * Create the GUI and show it.  For thread safety,
         * this method should be invoked from the
         * event-dispatching thread.
         */
        private static void createAndShowGUI() {
            //Create and set up the window.
            JFrame frame = new JFrame("PCB ");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //Create and set up the content pane.
            SimpleTableDemo newContentPane = new SimpleTableDemo();
            newContentPane.setOpaque(true); //content panes must be opaque
            frame.setContentPane(newContentPane);

            //Display the window.
            frame.pack();
            frame.setVisible(true);
        }

        public static void main(String[] args) {
            //Schedule a job for the event-dispatching thread:
            //creating and showing this application's GUI.


            //String test = "hey";
            //JOptionPane.showMessageDialog(null,"the answer is" + test, "the title", JOptionPane.PLAIN_MESSAGE);
            System.out.println("hey");
            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    createAndShowGUI();
                }
            });
        }
    }
    
}
