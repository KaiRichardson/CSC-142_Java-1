import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
/**
 * Client App for RBGReading and ReadingsArray
 * 
 * @author Kai Richardson
 * @version 1.0
 * @since Fall 2019
 * 
 */
public class ReadingsApp
{
    private JTextArea text; 
    private JButton save; // class scope to setEnabled() when needed
    private ReadingsArray ra;

    /**
     * Constructor for objects of class ReadingsApp
     */
    public ReadingsApp()
    {
        JFrame win = new JFrame("142 Readings App");
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.setSize(500, 400);

        // Create the button 
        JButton load = new JButton("Load Data");
        save = new JButton("Save Brightness");
        save.setEnabled(false);

        // put buttons in a panel and then into the frame
        JPanel back = new JPanel();
        back.setBackground(Color.blue); 
        back.add(load);
        back.add(save);
        win.add(back,BorderLayout.SOUTH );

        // now set up the event handler for reading from a file
        load.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    processLoad();
                }

            });

        // now set up the event handler for writing to a file
        save.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    processSave();
                }

            });

        // create the display area and place it
        text = new JTextArea();
        JScrollPane scrolltxt = new JScrollPane(text);
        win.add(scrolltxt, BorderLayout.CENTER);

        // get the frame ready to show
        win.validate();
        win.setVisible(true);
        win.toFront();
    }

    // processing the button click
    private void processLoad(){

        // get filename from user
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION){
            String filename = fc.getSelectedFile().getPath();

            // create a LocationSet and display results
            try {
                ra = new ReadingsArray(filename);
                String results = buildDisplay(ra);
                text.setText("File:\t" + filename + "\n\n");
                text.append(results);
                save.setEnabled(true);
            } catch (FileNotFoundException fnfe){
                text.setText(filename + " not found.\nPlease try again");
                save.setEnabled(false);
            } catch(Exception e) {  // handles any other problems, like wrong format
                text.setText(filename + " incompatible.\nPlease try again");
                save.setEnabled(false);
            }

        } 
    }

    private void processSave() {
        String outName = "";
        try
        {
            outName = JOptionPane.showInputDialog(null, "Please enter filename", "results.txt");
            ra.save(outName);
        }
        catch (FileNotFoundException e)
        {
            JOptionPane.showMessageDialog(null, "Problem writing to file " + outName);
        }

    }

    // build & return String for display using information from ra
    private String buildDisplay(ReadingsArray ra) {
        StringBuilder output = new StringBuilder();

        String date = ra.getDate();
        RGBReading[] minMax = ra.minMax();
        int rCC = ra.posRedChangeCount();
        RGBReading[] closest = ra.findSmallestGap();

        output.append("Number of sensors =  " + ra.getCount() + '\n');
        output.append("Pos Red Change Count    =  " + rCC + "\n\n");

        output.append("Smallest Brightness Gap between\n\t" + closest[0].getName() + 
            " brightness = " + closest[0].brightness() + 
            "\n\t" + closest[1].getName() +
            " brightness = " + closest[1].brightness()+"\n");
        output.append("\t        gap = " + Math.abs(closest[0].brightness() - closest[1].brightness())
            + "\n\n");
        output.append("Smallest and Largest times\n\t" + minMax[0] + "\n\t" + minMax[1] +"\n\n");

        output.append("\n==========================\n\n"+ ra);
        return output.toString();

    }

    public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    ReadingsApp b = new ReadingsApp();
                }
            });
    }

}