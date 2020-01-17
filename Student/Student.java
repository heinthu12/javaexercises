
/**
 * クラス student の注釈をここに書きます.
 * 
 * @author (Hein Thu)
 * @version (01/17/2020)
 */
//create a class called student
public class Student{
private String firstName;
private String lastName;
private int studentNumber;
private String email;
private String country;
  public Student(){
    this.firstName = "Hein";
    this.lastName = "Thu"; 
    this.studentNumber = 18;
    this.email = "heinthu6688@gmail.com";
    this.country = "Myanmar";
  }
  public String getFirstName(){
    return this.firstName;  
  }
  public String getLastName(){
    return this.lastName;
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
}
