

import java.util.Scanner;

class Name {
    void work() {
        System.out.print("Kartik is ");
    }
}
class Manager extends Name {
    @Override
    void work() {
        System.out.print("Manager is managing");
    }
}
class employee extends Name {
    @Override
    void work() {
        System.out.print("Employee and working");
    }
}
class department extends Name {
    @Override
    void work() {
        System.out.print("Department of technology is working");
    }
}


public class polyMorphEmp {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Name name = new Name();
        Name manager = new Manager();
        Name employee = new employee();
        Name department = new department();
        name.work();
        manager.work();
        employee.work();
        department.work();
        scanner.close();
    }

}

