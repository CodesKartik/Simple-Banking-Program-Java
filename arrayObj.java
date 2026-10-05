class Student {
    String name;
    String course;
    int age;
    Student(String name, String course, int age){
        this.name = name;
        this.course = course;
        this.age = age;
    }
}
public class arrayObj {
    public static void main(String[] args) {
        Student[] arr = new Student[2];
        arr[0] = new Student("Kartik", "B.Tech", 19);
        arr[1] = new Student("Sujal", "B.Tech", 20);
        System.out.println();
        System.out.println(arr[1].name + " " + arr[1].course + " " + arr[1].age);
    }
}
