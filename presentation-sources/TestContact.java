public class TestContact {
  
  public static void main(String[] args) {
    Contact c = null;
    if (args.length != 0) {
      if (args[0].equalsIgnoreCase("text")) {
        c = new Contact(new ContactTextImporter());
      } else if (args[0].equalsIgnoreCase("gui")) {
        c = new Contact(new ContactSwingImporter());
      }
    }
    System.out.println("Contact: " + c);
    ContactHTMLExporter html = new ContactHTMLExporter();
    c.export(html);
    System.out.println("HTML:");
    System.out.println(html);
    ContactCSVExporter csv = new ContactCSVExporter();
    c.export(csv);
    System.out.println("CSV:\n" + csv);
    System.out.println("Starting gui display...");
    GUIExporter gui = new GUIExporter();
    c.export(gui);
    new SwingDisplay(gui.getJPanel());
  }
}
