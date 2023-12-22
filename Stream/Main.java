import java.util.*;
import java.util.stream.Collectors;

class Employee{
    String name;
    int age;
    double salary;
    String gender;
    
    public Employee(String name, int age, double salary, String gender) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getSalary() {
        return salary;
    }
    public String getGender() {
        return gender;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

}
public class Main {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(33,14,56,12,11,78);
        List<Integer> ans = num.stream().filter(e->e.toString().startsWith("1")).collect(Collectors.toList());
        System.out.println(ans);

        List<Employee> list  = new ArrayList<Employee>();
        list.add(new Employee("A", 21, 90000, "M"));
        list.add(new Employee("B", 22, 80000, "M"));
        list.add(new Employee("C", 26, 75000, "F"));
        list.add(new Employee("D", 24, 60000, "F"));

        //NUMBER OF MALES AND FEMALES
        // Map<String,Long> map = list.stream().collect(Collectors.groupingBy(Employee::getGender),Collectors.counting());
    }
}


// i have list of employlees and i have to
//1. number of males and females
//2. average salary of both
//3. sum of them indivisualy