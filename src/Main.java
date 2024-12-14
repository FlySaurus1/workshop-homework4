import java.util.ArrayList;
import java.util.List;

public class Main extends Object {
    public static void main(String[] args) {
        IUStudent iustudent1 = new IUStudent("Korben", "Dallas", "Pablusovich", "TopStrelok", 5);
        IUStudent iustudent2 = new IUStudent("Canned", "Juice", "WhyAkuareamazingbutBehemothisbad", "YTchannel", 5);
        MathStudent mathstudent1 = new MathStudent("Socrates", "Zero", "Legendovich", "BeingCarriedbyFSHI", 4);
        MathStudent mathstudent2 = new MathStudent("Cat", "God", "(Floating)", "cool dude", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(iustudent1);
        studentList.add(iustudent2);
        studentList.add(mathstudent1);
        studentList.add(mathstudent2);

        for (Student s:studentList){
            System.out.println(s);
        }

    }
}
