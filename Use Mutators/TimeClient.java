
/**
 * クラス TimeClient の注釈をここに書きます.
 * 
 * @author (HeinThu)
 * @version (1/17/2020)
 */
public class TimeClient{
    public static void main(String[] args){
        Time Time = new Time(11,12,13.0);
         Time.setHour(10);
         Time.setMinute(10);
         Time.setSecond(22);
           System.out.println(Time.getHour() + ":"+ Time.getMinute() +":"+ Time.getSecond());
    }
}
