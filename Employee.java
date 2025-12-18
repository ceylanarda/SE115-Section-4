public class Employee {
    private String name;
    private String department;
    private String email;
    public Employee(String name,String department,String email){
        this.name=name;
        this.department=department;
        this.email=email;
    }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public String getEmail() { return email; }
    public String toString() {
        return "Name: " + name + ", Dept: " + department + ", Email: " + email;
    }
}
