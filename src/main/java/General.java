import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class General {

    public static void main(String[] args) {

        Student student = new Student("man", "Tom", 20, JobType.STUDENT, 5);
        Schoolchild schoolchild = new Schoolchild("man", "Sam", 12, JobType.SCHOOLCHILD);

        List<People> list = new ArrayList<>();
        list.add(student);
        list.add(schoolchild);
        System.out.println(list);

        Map<Integer, People> map = new HashMap<>();
        map.put(1, student);
        map.put(2, schoolchild);
        System.out.println(map);
    }
}
