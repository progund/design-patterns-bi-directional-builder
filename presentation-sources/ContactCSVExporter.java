public class ContactCSVExporter implements Contact.Exporter {
  
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

  @Override
  public String toString() {
    return new StringBuilder(name)
      .append(",")
      .append(email)
      .append(",")
      .append(phone)
      .append("\n")
      .toString();
  }
}
