import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
public class EmployeeManager {private Employee[] employees;
    private int count;
    private String filePath;

    public EmployeeManager(int capacity) {
        this.employees = new Employee[capacity];
        this.count = 0;
    }

    public void loadEmployeesFromFile(String filePath) {
        this.filePath = filePath;
        try (Scanner fileScanner = new Scanner(Paths.get(filePath))) {
            while (fileScanner.hasNextLine() && count < employees.length) {
                String line = fileScanner.nextLine();
                String[] data = line.split(",");
                if (data.length == 3) {
                    employees[count] = new Employee(data[0], data[1], data[2]);
                    count++;
                }
            }
        } catch (IOException e) {
            System.out.println("Dosya bulunamadi, yeni dosya olusturulacak.");
        }
    }

    public void displayEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i].toString());
        }
    }

    public void addEmployee(String name, String department, String email) {
        if (count < employees.length) {
            Employee newEmp = new Employee(name, department, email);
            employees[count] = newEmp;
            count++;


            try (FileWriter fw = new FileWriter(filePath, true)) {
                fw.write(name + "," + department + "," + email + System.lineSeparator());
            } catch (IOException e) {
                System.out.println("Dosyaya yazılırken hata olustu.");
            }
        }
    }

    public void searchEmployee(String name) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (employees[i].getName().equalsIgnoreCase(name)) {
                System.out.println("Calışan Bulundu: " + employees[i].toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(name + " isimli calısan bulunamadı.");
        }
    }
}

