package strategy;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: ParkhimchikAV
 * Date: 04.12.17
 * Time: 12:41
 * To change this template use File | Settings | File Templates.
 */
public class ThreadLockFormatter implements Formatter {
    Formatter formatter;
    long time;

    public ThreadLockFormatter(Formatter formatter, long timeInMilliSeconds) {
        this.formatter = formatter;
        this.time = timeInMilliSeconds;
    }

    public static Exception lockThread(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            return e;
        }
        return null;
    }

    public String format(final Date date) {
        Exception ex = lockThread(time);
        if (ex != null) {
            return ex.getMessage();
        } else {
            return formatter.format(date);
        }
    }
}
