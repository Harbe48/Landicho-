 public class Students {
   private final String name;
   private final int id;
   private final String grade;
   public Students(String name, int id, String grade) {
       this.name = name;
       this.id = id;
       this.grade = grade;
   }
   public String getname() {
       return name;
   }
   public int getId() {
       return id;
   }
   public String getgrade() {
       return grade;
   }
   public void displayInfo() {
       System.out.println("name: " + name);
       System.out.println("id: " + id + " id number");
       System.out.println("grade: " + grade);
   }
}
 
