package pl.comarch.szkolenia.wyliczeniowy;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private int salary;
    private Position position;

    public Employee() {
    }

    public Employee(int id, String name, String surname, int salary, Position position) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public enum Position {
        LOW,
        MID,
        HIGH
    }
}
