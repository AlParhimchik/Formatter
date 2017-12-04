package strategy;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: parkhimchikav
 * Date: 01.12.17
 * Time: 10:36
 * To change this template use File | Settings | File Templates.
 */
public class Printer {
    private Formatter formatter;
    private final Date date;

    public Printer(final Date date,
                   final Formatter formatter) {
        this.formatter = formatter;
        this.date = date;
    }

    public void setFormatter(final Formatter formatter) {
        this.formatter = formatter;
    }

    public void print() {
        final String asString = formatter.format(date);
        System.out.println(asString);
    }
}