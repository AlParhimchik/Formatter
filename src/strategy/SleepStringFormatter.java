package strategy;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: parkhimchikav
 * Date: 01.12.17
 * Time: 11:41
 * To change this template use File | Settings | File Templates.
 */
public class SleepStringFormatter extends StringSimpleFormatter{
    public SleepStringFormatter(String format) {
        super(format);
    }
    public String format(Date date){
        try {

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return super.format(date)+" time for formatting 1000 ms";
    }

}
