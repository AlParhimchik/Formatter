package strategy;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: parkhimchikav
 * Date: 01.12.17
 * Time: 11:33
 * To change this template use File | Settings | File Templates.
 */
public class StringSimpleFormatter extends Formatter {
    private String format;

    public StringSimpleFormatter(String format) {
        this.format=format;
    }

    public String format(Date date){

         SimpleDateFormat formatForDateNow = new SimpleDateFormat(format);
         return formatForDateNow.format(date);
    }
}
