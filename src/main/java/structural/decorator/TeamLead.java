package structural.decorator;

public class TeamLead extends DeveloperDecorator{
    public TeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport(){
        return "send week report to customer";
    }

    @Override
    public String makeJob() {
        return super.makeJob()+sendWeekReport();
    }
}
