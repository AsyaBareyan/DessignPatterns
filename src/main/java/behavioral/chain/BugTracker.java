package behavioral.chain;

public class BugTracker {
    public static void main(String[] args) {
         Notifier reportNotifier=new SimpleReportNotifier(Priority.ROUTINE);
         Notifier emailNotifier=new EmailNotifier(Priority.IMPORTANT);
         Notifier smsNotifier=new SmsNotifier(Priority.ASAP);

         reportNotifier.setNextNotifier(emailNotifier);
         emailNotifier.setNextNotifier(smsNotifier);

         reportNotifier.notifierManager("everything is ok",Priority.ROUTINE);
         reportNotifier.notifierManager("something went wrong",Priority.IMPORTANT);
         reportNotifier.notifierManager("we have a problem here!!!",Priority.ASAP);

    }
}
