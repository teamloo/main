package entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "fire")
public class FireForestEntity {
    private String id;
    private double area;
    private String cause;
    private double numberOfTreeLost;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "forest_ID")
    private ForestEntity forest;

    public FireForestEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public double getArea() {
        return area;
    }

    public double getNumberOfTreeLost() {
        return numberOfTreeLost;
    }

    public String getCause() {
        return cause;
    }

    public String getFireId() {
        return id;
    }

    public void setNumberOfTreeLost(double numberOfTreeLost) {
        this.numberOfTreeLost = numberOfTreeLost;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public void setFireId(String fireId) {
        this.id = fireId;
    }
}
