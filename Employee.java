//Object Class
public class Employee {
    String name;
    double salary;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    /*Constructor Employee*/
    public Employee() {
        salary = 0;
        name = "";
    }
    //Constructor Parameter
    public Employee(String name, double salary) {
        this.name= name;
        this.salary= salary;
    }


    //method
    public void print() {
        System.out.println("name :"+ name);
        System.out.println("salary :"+ salary);

    }

}
