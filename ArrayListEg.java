import java.util.ArrayList;

public class ArrayListEg { 
   public static void main(String[] args) {
      ArrayList<String> names = new ArrayList<String>();
      ArrayList<Integer> age = new ArrayList<Integer>();
      ArrayList greet = new ArrayList();
      
      names.add("Diether");
      names.add("Delapena");
      names.add("Catan");
      age.add(21);
      greet.add("Hello, Good morning.");
      names.remove(1);
      names.set(0, "Marianne");
      
      System.out.println("First Name: " + names.get(0));
      System.out.println("Last Name: " + names.get(1));
      System.out.println("Age: " + age.get(0));
      System.out.println(greet.get(0));
   }
}