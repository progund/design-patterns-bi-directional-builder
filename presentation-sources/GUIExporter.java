import java.awt.*;
import javax.swing.*;

public class GUIExporter implements Contact.Exporter {
  
  private String name;
  private String email;
  private String phone;

  public void addName(String name) {
    this.name = name;
  }
  
  public void addEmail(String email) {
    this.email = email;
  }
  
  public void addPhone(String phone) {
    this.phone = phone;
  }

  /* A getter! */
  public JPanel getJPanel() {
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(3,2));
    panel.add(new JLabel("Name:"));
    panel.add(new JTextField(name));
    panel.add(new JLabel("Email:"));
    panel.add(new JTextField(email));
    panel.add(new JLabel("Phone:"));
    panel.add(new JTextField(phone));
    return panel;
  }
}
