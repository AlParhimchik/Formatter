package strategy;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: parkhimchikav
 * Date: 01.12.17
 * Time: 10:42
 * To change this template use File | Settings | File Templates.
 */
public class Program {
    public static void main(String[] args){
        Printer printer=new Printer(new Date(),new MilliSecondFormatter());
        printer.print();
        printer.setFormatter(new SleepStringFormatter("E yyyy.MM.dd 'и время' hh:mm:ss"));
        printer.print();
    }
}
