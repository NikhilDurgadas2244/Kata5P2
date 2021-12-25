
package kata5P2.main;

import java.util.List;
import kata5P2.model.Histogram;
import kata5P2.model.Mail;
import kata5P2.view.HistogramDisplay;
import kata5P2.view.MailHistogramBuilder;
import kata5P2.view.MailListReader;


public class Kata5 {
    static List<Mail> mailList;
    static Histogram<String> histogram;
    public static void main(String[] args){
        execute();
    }
    
    public static void execute(){
        input();
        process();
        output();
    }
    
    public static void input(){
        String namefile = "email.txt";
        mailList = MailListReader.read(namefile);
    }
    
    public static void process(){
        histogram = MailHistogramBuilder.built(mailList);
    }
    
    public static void output(){
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram, "HistogramDisplay");
        histogramDisplay.execute();
    }
}
 