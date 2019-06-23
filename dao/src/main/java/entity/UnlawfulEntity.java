package entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "unlawfull")
public class UnlawfulEntity {

    @Id
    @Column(name = "unlawful_id")
    private String id;

    private String violator;

    @ManyToOne
    @JoinColumn(name = "forest_ID")
    private ForestEntity forest;

    private int numberTreeLost;

    private String sactionForm;

    private double compensation;

    @Temporal(TemporalType.TIMESTAMP)
    private Date time;

    private double areaDamaged;

    public UnlawfulEntity(String id, String violator, ForestEntity forest, int numberTreeLost, String sactionForm, double compensation, Date time, double areaDamaged) {
        this.id = id;
        this.violator = violator;
        this.forest = forest;
        this.numberTreeLost = numberTreeLost;
        this.sactionForm = sactionForm;
        this.compensation = compensation;
        this.time = time;
        this.areaDamaged = areaDamaged;
    }

    public UnlawfulEntity() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setViolator(String violator) {
        this.violator = violator;
    }

    public void setForest(ForestEntity forest) {
        this.forest = forest;
    }

    public void setNumberTreeLost(int numberTreeLost) {
        this.numberTreeLost = numberTreeLost;
    }

    public void setSactionForm(String sactionForm) {
        this.sactionForm = sactionForm;
    }

    public void setCompensation(double compensation) {
        this.compensation = compensation;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public void setAreaDamaged(double areaDamaged) {
        this.areaDamaged = areaDamaged;
    }

    public String getId() {
        return id;
    }

    public String getViolator() {
        return violator;
    }

    public ForestEntity getForest() {
        return forest;
    }

    public int getNumberTreeLost() {
        return numberTreeLost;
    }

    public String getSactionForm() {
        return sactionForm;
    }

    public double getCompensation() {
        return compensation;
    }

    public Date getTime() {
        return time;
    }

    public double getAreaDamaged() {
        return areaDamaged;
    }
}
