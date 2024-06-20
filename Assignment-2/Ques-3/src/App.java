
public class App {

    public static void Insertion_Sort(Emp arr[]) {
        Emp temp = null;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (temp.getSalary() < arr[j].getSalary()) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }

            arr[j + 1] = temp;
        }

    }

    public static void main(String[] args) throws Exception {

        Emp arr[] = new Emp[3];
        arr[0] = new Emp(1, "Vatsal", 10000);
        arr[1] = new Emp(2, "Vaishnavi", 9000);
        arr[2] = new Emp(3, "Vishal", 21000);

        for (Emp emp : arr) {
            System.out.println(emp.toString());
        }
        System.out.println("____________________________________");
        System.out.println();
        Insertion_Sort(arr);
        for (Emp emp : arr) {
            System.out.println(emp.toString());
        }
    }
}