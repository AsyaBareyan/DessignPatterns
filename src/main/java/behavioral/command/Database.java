package behavioral.command;

public class Database {
    public void insert(){
        System.out.println("Insert record");
    };

    public void update(){
        System.out.println("Updating record");
    };

    public void select(){
        System.out.println("Reading record");
    };

    public void remove(){
        System.out.println("Deleting record");
    };
}
