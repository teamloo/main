package entity;

import javax.persistence.*;

// cán bộ
@Entity
@Table(name = "department")
@NamedQuery(name = "Department.findAll", query = "SELECT e FROM Department e")
public class DepartmentEntity {

    @Id
    @Column(name = "department_id")
    private String id;

    private String name;
    private String Position;
    private String salary;
    private String phoneNumber;


    private UnitEntity unit; // cán bộ thuộc đơn vị nào đó
    @ManyToOne
    @JoinColumn(name = "unit_id")
    private UnitEntity entity;

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

    public UnitEntity getUnit() {
        return unit;
    }

    public void setUnit(UnitEntity unit) {
        this.unit = unit;
    }

    public UnitEntity getEntity() {
        return entity;
    }

    public void setEntity(UnitEntity entity) {
        this.entity = entity;
    }

}
