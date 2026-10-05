class employee{
    String name;
    String emp_id;
    int salary;

    public employee(String name, String emp_id, int salary) {
        this.name = name;
        this.emp_id = emp_id;
        this.salary = salary;
    }
        
}
public class arrayEmpobj {
    public static void main(String[] args) {
        employee[] emp = new employee[10];
        emp[0] = new employee("Kartik", "A10" , 200000);
        emp[1] = new employee("Sujal", "S10", 200000);
        emp[2] = new employee("Shivam", "Sh10", 200000);
        emp[3] = new employee("Prince", "P10", 200000);
        emp[4] = new employee("Himanshu", "H10", 200000);
        System.out.println(emp[0].name + " " + emp[0].emp_id + " " + emp[0].salary);
        System.out.println(emp[1].name + " " + emp[1].emp_id + " " + emp[1].salary);
        System.out.println(emp[2].name + " " + emp[2].emp_id + " " + emp[2].salary);
        System.out.println(emp[3].name + " " + emp[3].emp_id + " " + emp[3].salary);
        System.out.println(emp[4].name + " " + emp[4].emp_id + " " + emp[4].salary);
    }
}
