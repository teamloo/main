package entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.util.UUID;

@Entity
@Table(name = "treeplanted")
//@NamedQuery(name = "TreePlanted.findAll", query = "SELECT t FROM TreePlanted t")
public class TreePlantedEntity implements Serializable {

    @Id
    @JoinColumn(name = "treePlanted_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    @ManyToOne
    @JoinColumn(name = "unit_ID")
    private ForestEntity forest;
    
    private Date datee;
    private int treeIncrease;
    private double area;

    @ManyToOne
    private UnitEntity unit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ForestEntity getForest() {
        return forest;
    }

    public void setForest(ForestEntity forest) {
        this.forest = forest;
    }

    public Date getDatee() {
        return datee;
    }

    public void setDatee(Date datee) {
        this.datee = datee;
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
}
