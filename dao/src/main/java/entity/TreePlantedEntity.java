package entity;

import model.Department;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.UUID;

@Entity
@Table(name = "treeplanted")
@NamedQuery(name = "TreePlanted.findAll",query ="SELECT t FROM TreePlanted t" )
public class TreePlantedEntity implements Serializable {
    private static final long serialVersionUID=1L;

    @Id
    private String treePlantedID = UUID.randomUUID().toString();
    @OneToOne(mappedBy = "forest")
    private String forestID;

    private Date date;

    private int treeIncrease;

    private double area;
    @OneToOne(mappedBy = "unit")
    private Unit unitID;
    @OneToOne(mappedBy = "department")
    private Department department;

    @Override
    public String toString() {
        return "TreePlantedEntity{" +
                "treePlantedID='" + treePlantedID + '\'' +
                ", forestID='" + forestID + '\'' +
                ", date=" + date +
                ", treeIncrease=" + treeIncrease +
                ", area=" + area +
                ", unitID=" + unitID +
                ", department=" + department +
                '}';
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getTreePlantedID() {
        return treePlantedID;
    }

    public void setTreePlantedID(String treePlantedID) {
        this.treePlantedID = treePlantedID;
    }

    public String getForestID() {
        return forestID;
    }

    public void setForestID(String forestID) {
        this.forestID = forestID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTreeIncrease() {
        return treeIncrease;
    }

    public void setTreeIncrease(int treeIncrease) {
        this.treeIncrease = treeIncrease;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Unit getUnitID() {
        return unitID;
    }

    public void setUnitID(Unit unitID) {
        this.unitID = unitID;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public TreePlantedEntity() {
    }

    public TreePlantedEntity(String treePlantedID, String forestID, Date date, int treeIncrease, double area, Unit unitID, Department department) {
        this.treePlantedID = treePlantedID;
        this.forestID = forestID;
        this.date = date;
        this.treeIncrease = treeIncrease;
        this.area = area;
        this.unitID = unitID;
        this.department = department;
    }
}
