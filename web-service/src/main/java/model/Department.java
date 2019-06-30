package model;
// cán bộ
public class Department {
    private String id;
    private String name;
    private String Position;
    private String salary;
    private String phoneNumber;
    private Unit unit; // cán bộ thuộc đơn vị nào đó

    public Department() {
    }

    public Department(String id, String name, String position, String salary, String phoneNumber, Unit unit) {
        this.id = id;
        this.name = name;
        Position = position;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.unit = unit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}
