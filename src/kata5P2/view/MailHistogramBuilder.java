package kata5P2.view;

import java.util.List;
import kata5P2.model.Histogram;
import kata5P2.model.Mail;

public class MailHistogramBuilder {
    
    public static Histogram<String> built(List<Mail> mailList){
        Histogram<String> histogram = new Histogram<>();
            
        for (Mail mail : mailList){
            histogram.increment(mail.getDomain());
        }
        return histogram;
    }

}
