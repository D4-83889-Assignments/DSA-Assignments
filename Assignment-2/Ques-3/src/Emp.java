public class Emp {
    private int id;
    private double salary;
    private String name;

    public Emp(){

    }
    public Emp(int id, String name, double salary) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Emp [id=" + id + ", salary=" + salary + ", name=" + name + "]";
    }

    
    
}