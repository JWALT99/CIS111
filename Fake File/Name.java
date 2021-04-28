public class Name
{
   
   //data
   
   private String firstName;
   private String lastName;
   
   //constructors
   
   public Name(String firstName, String lastName)
   {
      this.firstName = firstName;
      this.lastName = lastName;
   }
   
   public Name()
   {
      firstName = "Jim";
      lastName = "Bob";
   }   
   
   //methods
   
   public String lastFirst()
   {
   
      String answer;
      
      answer = lastName + "," + firstName;
      
      return answer;
   
   }
   
   public String gotModernMarried(String x)
   {
   
      String answer;
   
      answer = lastName + "-" + x;
      
      return answer;
   
   }
}
