public class App {

    public static int SearchById(Employee arr[], int id) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getEmpid() == id) {
                return i;
            }
        }
        return -1;
    }

    public static int SearchByName(Employee arr[], String name)
    {

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getName()==name)
            {
                return i;
            }
        }
        return -1;
    }

    public static int SearchBySalary(Employee arr[], double Salary)
    {

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getSalary()==Salary)
            {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) throws Exception {

        Employee EmpArr[] = { new Employee(1, "Vatsal", 11000), new Employee(2, "Vaishnavi", 2000),
                new Employee(3, "Sachin", 10000) };
        // Search by Id
        System.out.println("Employee with id : 3 found at index = " + SearchById(EmpArr, 3));
        System.out.println("Employee with name : Vatsal found at index = " + SearchByName(EmpArr, "Vatsal"));
        System.out.println("Employee with salary : 10000 found at index = " + SearchBySalary(EmpArr, 10000));

    }
}

