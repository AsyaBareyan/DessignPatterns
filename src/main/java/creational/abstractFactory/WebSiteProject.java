package creational.abstractFactory;

import creational.abstractFactory.website.ManualTester;
import creational.abstractFactory.website.PhpDeveloper;
import creational.abstractFactory.website.websitePM;

public class WebSiteProject {
    public static void main(String[] args) {
        PhpDeveloper phpDeveloper=new PhpDeveloper();
        ManualTester manualTester=new ManualTester();
        websitePM projectManager=new websitePM();

        System.out.println("creating project...");
        phpDeveloper.writeCode();
        manualTester.testCode();
        projectManager.manageProject();
    }
}
