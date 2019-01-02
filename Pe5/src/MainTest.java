

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTest {
    public List<Student> studentInfo() {
        Student obj1 = new Student(1, "Saurabh", 22);
        Student obj2 = new Student(3, "Sam", 24);
        Student obj3 = new Student(2, "Bhanu", 20);
        Student obj4 = new Student(4, "Evangeline", 10);
        Student obj5 = new Student(5, "Jaanu", 22);
        List<Student> list = new ArrayList<Student>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);
        System.out.println(list);

        Collections.sort(list, new StudentSorter());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId() + " " + list.get(i).getName() + " " + list.get(i).getAge());
        }
        System.out.println(list);
        return list;
    }
}