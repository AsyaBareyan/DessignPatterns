package structural.decorator;

public class SenioeDeveloper extends DeveloperDecorator {
    public SenioeDeveloper(Developer developer) {
        super(developer);
    }


    public String makeCodeReview() {
        return "Make code review";
    }

    @Override
    public String makeJob() {
        return super.makeJob()+makeCodeReview();
    }
}
