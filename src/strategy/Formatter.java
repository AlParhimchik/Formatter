package strategy;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: parkhimchikav
 * Date: 01.12.17
 * Time: 10:36
 * To change this template use File | Settings | File Templates.
 */
public abstract class Formatter  {
    public String format(Date date){
        return date.toString();
    }
}
