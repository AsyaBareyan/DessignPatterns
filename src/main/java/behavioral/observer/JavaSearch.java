package behavioral.observer;

public class JavaSearch {
    public static void main(String[] args) {
        JavaDeveloperWebsite website=new JavaDeveloperWebsite();
        website.addVacancy("First java position");
        website.addVacancy("Second java position");

        Observer  firstSubsciber=new Subscriber("Asya Bareyan");
        Observer  secondSubsciber=new Subscriber("Ani Gasparyan");

        website.addObserver(firstSubsciber);
        website.addObserver(secondSubsciber);
        website.addVacancy("Third java position");
        website.removeVacancy("First java position");

    }
}
