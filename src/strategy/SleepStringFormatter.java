package strategy;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: parkhimchikav
 * Date: 01.12.17
 * Time: 11:41
 * To change this template use File | Settings | File Templates.
 */
public class SleepStringFormatter implements Formatter {
     private String format;
    public SleepStringFormatter(String format) {
        this.format=format;
    }
    public String format(Date date) {
       long cur_time=new Date().getTime();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        SimpleDateFormat formatForDateNow = new SimpleDateFormat(format);
        return formatForDateNow.format(date)+" time for formatting "+String.valueOf(new Date().getTime()-cur_time)+" ms";
    }

}
