package behavioral.momento;

public class SaveProjectRunner {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GitHubRepo gitHub = new GitHubRepo();

        System.out.println("Creating new project, version: 1.0");
        project.setVersionAndDate("Version: 1.0");
        System.out.println(project);

        System.out.println("Saving current version to gitHub");
        gitHub.setSave(project.save());
        System.out.println("Updating project, version to 1.1");
        System.out.println("writing poor code");
        Thread.sleep(5000);
        project.setVersionAndDate("Version 1.1");
        System.out.println(project);
        System.out.println("Something went wrong, Rollback to version 1.0");
        project.load(gitHub.getSave());
        System.out.println("project after roll back");
        System.out.println(project);


    }
}
