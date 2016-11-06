import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ContactSwingImporter implements Contact.Importer{

  private JFrame parent;
  private JDialog frame;
  private JPanel panel;
  private JTextField nameTextField;
  private JTextField emailTextField;
  private JTextField phoneTextField;
  private JLabel empty;
  private JLabel nameLabel;
  private JLabel emailLabel;
  private JLabel phoneLabel;
  private JButton okButton;
  public String provideName(){
    return nameTextField.getText();
  }
  public String provideEmail(){
    return emailTextField.getText();
  }
  public String providePhone(){
    return phoneTextField.getText();
  }
  
  private void initializeComponents(){
    parent = new JFrame();
    frame = new JDialog(parent, "New Contact Form", true);
    panel = new JPanel();
    // 4 rows, 2 cols
    panel.setLayout(new GridLayout(4,2));
    nameTextField  = new JTextField(20);
    emailTextField = new JTextField(20);
    phoneTextField = new JTextField(20);
    nameLabel   = new JLabel("Name:");
    emailLabel  = new JLabel("Email:");
    phoneLabel  = new JLabel("Phone:");
    empty       = new JLabel(""); // left of the button
    okButton    = new JButton("OK");
    okButton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent ae){
          parent.dispose();
        }
      });
  }

  private void layoutComponents(){
    panel.add(nameLabel); panel.add(nameTextField);
    panel.add(emailLabel); panel.add(emailTextField);
    panel.add(phoneLabel); panel.add(phoneTextField);
    panel.add(empty); panel.add(okButton);
    frame.add(panel, BorderLayout.CENTER);
    frame.pack();
  }
  public void open(){
    initializeComponents();
    layoutComponents();
    frame.setVisible(true);
  }
  public void close(){
    // possible cleanup
  }

}
