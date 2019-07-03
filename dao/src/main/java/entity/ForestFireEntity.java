package entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "fire")
public class ForestFireEntity {
    @Id
    private String id;
    private double area;
    private String cause;
    private double numberOfTreeLost;
    private Date datee;

    @ManyToOne
    @JoinColumn(name = "forest_id")
    private ForestEntity forest;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public double getNumberOfTreeLost() {
        return numberOfTreeLost;
    }

    public void setNumberOfTreeLost(double numberOfTreeLost) {
        this.numberOfTreeLost = numberOfTreeLost;
    }

    public Date getDatee() {
        return datee;
    }

    public void setDatee(Date datee) {
        this.datee = datee;
    }

    public ForestEntity getForest() {
        return forest;
    }

    public void setForest(ForestEntity forest) {
        this.forest = forest;
    }
}
