import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SwingDisplay{
  private JFrame frame;
  private JPanel panel;
  private JMenu fileMenu;
  private JMenuBar menuBar;
  private JMenuItem quit;
  private Contact contact;
  public SwingDisplay(JPanel contactPanel){
    this.panel = contactPanel;
    initComponents();
    layoutComponents();
    show();
  }
  private void show(){ frame.setVisible(true); }
  private void initComponents(){
    frame = new JFrame("Contact display");
    menuBar = new JMenuBar();
    fileMenu = new JMenu("File");
    quit = new JMenuItem("Quit");
  }
  private void layoutComponents(){
    quit.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){ frame.dispose(); }
      });
    fileMenu.add(quit);
    menuBar.add(fileMenu);
    frame.add(menuBar, BorderLayout.NORTH);
    frame.add(panel, BorderLayout.CENTER);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
  }
}
