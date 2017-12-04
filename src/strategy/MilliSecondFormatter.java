package strategy;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: parkhimchikav
 * Date: 01.12.17
 * Time: 10:39
 * To change this template use File | Settings | File Templates.
 */
public class MilliSecondFormatter implements  Formatter{

   public String format(Date date){
       return  String.valueOf(date.getTime()/1000);
   }
}
