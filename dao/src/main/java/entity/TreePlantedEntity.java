package entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.UUID;

@Entity
@Table(name = "treeplanted")
@NamedQuery(name = "TreePlanted.findAll", query = "SELECT t FROM TreePlanted t")
public class TreePlantedEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @JoinColumn(name = "treePlanted_id")
    private String treePlantedID = UUID.randomUUID().toString();
    @ManyToOne
    @JoinColumn(name = "unit_ID")
    private ForestEntity forest;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    private int treeIncrease;
    private double area;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "unit_id", referencedColumnName = "id")
    private UnitEntity unit;

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

    public ForestEntity getForest() {
        return forest;
    }

    public void setForest(ForestEntity forest) {
        this.forest = forest;
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


    @Override
    public String toString() {
        return "TreePlantedEntity{" +
                "treePlantedID='" + treePlantedID + '\'' +
                ", forest='" + forest + '\'' +
                ", date=" + date +
                ", treeIncrease=" + treeIncrease +
                ", area=" + area +
                ", unit=" + unit +
                '}';
    }
}
