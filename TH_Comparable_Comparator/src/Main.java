import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Student st = new Student("Kien", 30, "HT");
        Student st1 = new Student("Nam", 26,"HN");
        Student st2 = new Student("Anh", 38, "HT");
        Student st3 = new Student("Tung", 38, "HT");

        List<Student> list = new ArrayList<Student>();
        list.add(st);
        list.add(st1);
        list.add(st2);
        list.add(st3);

        Collections.sort(list);

        for (Student student:list){
            System.out.println(student.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(list,ageComparator);
        System.out.println("so sanh theo tuoi: ");
        for (Student student:list){
            System.out.println(student.toString());
        }
    }
}