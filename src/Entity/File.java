package Entity;

public class File {
   private String author;
   private String name;
   private byte[] content;

   public String getAuthor() {
      return author;
   }

   public void setAuthor(String author) {
      this.author = author;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public byte[] getContent() {
      return content;
   }

   public void setContent(byte[] content) {
      this.content = content;
   }
}
