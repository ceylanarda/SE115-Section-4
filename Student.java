public class Student {
    String name;
    int age;

    public Student() {
    name = "null";
    age = 0;
}
    public Student(int age, String name){
    this.age=age;
    this.name = name;
    }
    public void printStudentInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
 }
}


// name will be null and age will be 0.No errors occur because Java automatically provides a default constructor