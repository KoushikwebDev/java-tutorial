class Student {
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + ", toString()=" + super.toString() + "]";
    }

    
    
}

public class array2 {
    
    public static void main(String[] args){

        Student students[] = new Student[3];
        students[0] = new Student(101, "Koushik", 20);
        students[1] = new Student(102, "Saha", 22);
        students[2] = new Student(103, "Java", 21);

        for(int i = 0; i < students.length; i++){
            System.out.println(students[i].id + " " + students[i].name + " " + students[i].age);
        }

        // enhanced for loop
        for (Student s : students){
            System.out.println(s);
        }
    }
}


//? here we have created an array of Object type, so that we can store different data types in the same array from a class
