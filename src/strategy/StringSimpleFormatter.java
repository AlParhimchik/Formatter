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
public class StringSimpleFormatter implements Formatter {
    private final String format;

    public StringSimpleFormatter(final String format) {
        this.format = format;
    }

    public String format(final Date date) {
        SimpleDateFormat formatForDateNow = new SimpleDateFormat(format);
        return formatForDateNow.format(date);
    }
}
