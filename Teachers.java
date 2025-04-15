public class Teachers{
   private final String name;
   private final int id;
   private final String subject;
   public Teachers(String name, int id, String subject) {
       this.name = name;
       this.id = id;
       this.subject = subject;
   }
   public String getname() {
       return name;
   }
   public int getId() {
       return id;
   }
   public String getsubject() {
       return subject;
   }
   public void displayInfo() {
       System.out.println("name: " + name);
       System.out.println("id: " + id + " id number");
       System.out.println("subject: " + subject);
   }
}
 