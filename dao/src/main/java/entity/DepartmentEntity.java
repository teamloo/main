package entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

// cán bộ
@Entity
@Table(name = "department")
//@NamedQuery(name = "Department.findAll", query = "SELECT e FROM Department e")
public class DepartmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String name;
    private String position;
    private String salary;
    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "unit_id")
    private UnitEntity unit;

    public DepartmentEntity() {
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
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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

    public UnitEntity getUnit() {
        return unit;
    }

    public void setUnit(UnitEntity unit) {
        this.unit = unit;
    }


}
