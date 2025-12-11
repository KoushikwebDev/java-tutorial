import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

 class Student {

    String name;
    int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    };

    public int getAge(){
        return age;
    };

    
}

public class SortingObject {

    

    public static void main(String[] args){
        
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 23));

        System.out.println(students);

        // Sorting by name in ascending order
        students.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));

        // Sorting by age in descending order
        students.sort((s1, s2) -> s2.getAge() - s1.getAge());

        // Comparator to sort by age in ascending order
        Comparator<Student> comparator = Comparator.comparing(Student::getAge); // Method reference

        Comparator<Student> comparator2 = Comparator.comparing(Student::getAge).reversed().thenComparing(Student::getName); // Method reference, first by age descending, then by name ascending

        students.sort(comparator2);

        for(Student s : students){
            System.out.println(s.getName() + " - " + s.getAge());
        }
    }
}


// Sorting a list of objects based on their attributes using Comparator and lambda expressions