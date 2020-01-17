
/**
 * クラス Time の注釈をここに書きます.
 * 
 * @author (Hein Thu)
 * @version (01/1/2020)
 */
public class Time{
  //instance veriables
  private int hour;
  private int minute;
  private double second;
   public Time(int hour,int minute,double second){
     this.hour = hour;
     this.minute = minute;
     this.second = second;
   }
   public int getHour(){
      return this.hour; 
   }
   public int getMinute(){
      return this.minute;
   }
   public double getSecond(){
      return this.second;
   }
   //Mutators OR Setters
   public void setHour(int hour){
     this.hour = hour; 
   }
   public void setMinute(int minute){
     this.minute = minute; 
   }
   public void setSecond(double second){
     this.second = second;
   }
}
