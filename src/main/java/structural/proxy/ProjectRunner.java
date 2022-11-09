package structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project=new ProxyProject("http://github/asyabareyan/designpatterns") ;
        project.run();
    }
}
