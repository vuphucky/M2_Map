import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestStudent {
    public static void main(String[] args) {
        Student st1 = new Student("nam", 20, "HN");
        Student st2 = new Student("hung",21,"HN");
        Student st3 = new Student("ha", 22,"HN");

        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1,st1);
        studentMap.put(2,st2);
        studentMap.put(3,st3);
        studentMap.put(4,st1);

        for (Map.Entry<Integer, Student> student : studentMap.entrySet()){
            System.out.println(student.toString());
        }

        System.out.println("---------- set");
        Set<Student> students = new HashSet<Student>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st1);

        for (Student student:students){
            System.out.println(student.toString());
        }
    }
}
