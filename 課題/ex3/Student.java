/**
 * クラス Student の注釈をここに書きます.
 * 
 * @author (Hein Thu)
 * @version (27/01/2020)
 */
public class Student{
    //instance variables
   private String fullName;
   private int studentNumber;
   private String email;
   private String country;
   //Constructor
  public Student(String fullName,int studentNumber,String email,String Country){
    this.fullName = fullName ; 
    this.studentNumber = 18;
    this.email = "heinthu6688@gmail.com";
    this.country = "Myanmar";
  }
  public String getFullName(){
    return this.fullName;  
  }
  
  public int getStudentNumber(){
    return this.studentNumber;
  }
  public String getEmail(){
    return this.email;
  }
  public String getCountry(){
    return this.country;  
  }
  public void setFullName(String fullName){
     this.fullName = fullName; 
   }
   public void setStudentNumber(int studentNumber){
     this.studentNumber = studentNumber; 
   }
   public void setEmail(String email){
     this.email = email;
   }
   public void setCountry(String country){
     this.country = country;
   }
  
  public static void printStudent(Student T){
    System.out.println("My name is" + T.fullName);
    System.out.println("Student number of in my class" + " " + T.studentNumber);
    System.out.println("My Email is" + " " + T.email);
    System.out.print("My Country name is" + " " + T.country);
    }
}