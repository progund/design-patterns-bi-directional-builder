public class ContactHTMLExporter implements Contact.Exporter {
  
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
    return new StringBuilder("<table>\n")
      .append("\t<tr>\n")
      .append("\t\t<th>Name</th>\n")
      .append("\t\t<th>Email</th>\n")
      .append("\t\t<th>Phone</th>\n")
      .append("\t</tr>")
      .append("\t<tr>\n")
      .append("\t\t<td>").append(name).append("</td>\n")
      .append("\t\t<td>").append(email).append("</td>\n")
      .append("\t\t<td>").append(phone).append("</td>\n")
      .append("\t</tr>\n")
      .append("</table>\n")
      .toString();
  }
}
