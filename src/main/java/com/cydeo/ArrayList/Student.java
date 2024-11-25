package ArrayList;

public class Student {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Student(int id, String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return "ArrayList.Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
