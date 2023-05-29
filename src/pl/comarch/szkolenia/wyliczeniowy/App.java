package pl.comarch.szkolenia.wyliczeniowy;

public class App {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setPosition(Employee.Position.LOW);

        Employee employee2 = new Employee();
        employee2.setPosition(Employee.Position.HIGH);

        Employee.Position p = Employee.Position.MID;
        NewEmployee.Position p2 = NewEmployee.Position.OFFICE;

        if(employee2.getPosition() == Employee.Position.HIGH) {
            System.out.println("cos tam !!!");
        }
    }
}
