package entity;

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
    private UnitEntity unit;
    @OneToOne(mappedBy = "department")
    private DepartmentEntity department;

    public TreePlantedEntity() {
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

    public UnitEntity getUnit() {
        return unit;
    }

    public void setUnit(UnitEntity unit) {
        this.unit = unit;
    }

    public DepartmentEntity getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentEntity department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "TreePlantedEntity{" +
                "treePlantedID='" + treePlantedID + '\'' +
                ", forestID='" + forestID + '\'' +
                ", date=" + date +
                ", treeIncrease=" + treeIncrease +
                ", area=" + area +
                ", unit=" + unit +
                ", department=" + department +
                '}';
    }

    public TreePlantedEntity(String treePlantedID, String forestID, Date date, int treeIncrease, double area, UnitEntity unit, DepartmentEntity department) {
        this.treePlantedID = treePlantedID;
        this.forestID = forestID;
        this.date = date;
        this.treeIncrease = treeIncrease;
        this.area = area;
        this.unit = unit;
        this.department = department;
    }
}
