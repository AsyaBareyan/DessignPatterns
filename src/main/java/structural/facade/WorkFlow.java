package structural.facade;

public class WorkFlow {
    Job job=new Job();
    Developer developer=new Developer();
    BugTracker bugTracker=new BugTracker();

    public void solveProblems(){
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }
}
