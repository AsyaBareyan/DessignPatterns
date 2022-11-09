package behavioral.interator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills={"Java","Spring","Maven","MySql"};
        JavaDeveloper javaDeveloper=new JavaDeveloper("Asya Bareyan",skills);
        Iterator iterator=javaDeveloper.getIterator();
        System.out.println("Developer: "+javaDeveloper.getName());
        System.out.println("skills: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next().toString()+" ");
        }

    }
}
