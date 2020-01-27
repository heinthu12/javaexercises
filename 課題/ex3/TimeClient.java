/**
 * クラス TimeClient の注釈をここに書きます.
 * 
 * @author (HeinThu)
 * @version (1/17/2020)
 */
public class TimeClient{
    public static void main(String[] args){
        Time Time = new Time(11,12,13.9);
         Time.printTime(Time);
          // System.out.println(Time.getHour() + ":"+ Time.getMinute() +":"+ Time.getSecond());
    }
}