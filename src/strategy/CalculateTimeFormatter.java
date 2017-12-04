package strategy;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: ParkhimchikAV
 * Date: 04.12.17
 * Time: 12:52
 * To change this template use File | Settings | File Templates.
 */
public class CalculateTimeFormatter implements  Formatter{
    Formatter formatter;
    public CalculateTimeFormatter(Formatter formatter){
        this.formatter=formatter;
    }
    public String format(Date date) {
        String string=formatter.format(date);
         return string + "time for formatting " + String.valueOf(calculateTime(date));
    }
     public long calculateTime(Date date){
        return new Date().getTime() - date.getTime();

    }
}
