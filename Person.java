
public class Person {
   private final String name;
   private final int id;
   public Person(String name, int id) {
       this.name = name;
       this.id = id;
       
   }
   public String getname() {
       return name;
   }
   public int getId() {
       return id;
   }
   public void displayInfo() {
       System.out.println("name: " + name);
       System.out.println("id: " + id + " id number");
   }
}
 
    

