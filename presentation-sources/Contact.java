public class Contact {
  
  private Email email;
  private Name name;
  private Phone phone;

  public interface Exporter {
    void addName(String name);

    void addEmail(String email);

    void addPhone(String phone);
  }

  public interface Importer {
    String provideName();

    String provideEmail();

    String providePhone();

    void open();

    void close();
  }

  // Constructs a Contact from the builder provided
  public Contact(Importer builder) {
    builder.open();
    this.name = new Name(builder.provideName());
    this.email = new Email(builder.provideEmail());
    this.phone = new Phone(builder.providePhone());
    builder.close();
  }

  // Exports this contact to the builder provided as argument
  public void export(Exporter builder) {
    builder.addName(name.toString());
    builder.addEmail(email.toString());
    builder.addPhone(phone.toString());
  }

  public String toString() {
    return String.format("%s %s %s", name, email, phone); 
  }

  private static class Name {
    private String name;

    public Name(String name) {
      this.name = name;
    }

    public String toString() {
      return name;
    }
  }
  
  private static class Email {
    private String email;
    
    public Email(String email) {
      this.email = email;
    }

    public String toString() {
      return email;
    }
  }
  
  private static class Phone {
    private String phone;
    
    public Phone(String phone) {
      this.phone = phone;
    }
    
    public String toString() {
      return phone;
    }
  }
}
