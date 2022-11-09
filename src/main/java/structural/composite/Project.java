package structural.composite;

public class Project {
    public static void main(String[] args) {
        Team team=new Team();

        Developer firstJavaDeveloper=new JavaDeveloper();
        Developer secondJavaDeveloper=new JavaDeveloper();
        Developer cppDeveloperDeveloper=new CppDeveloper();

        team.addDeveloper(firstJavaDeveloper);
        team.addDeveloper(secondJavaDeveloper);
        team.addDeveloper(cppDeveloperDeveloper);

        team.createProject();
    }
}
