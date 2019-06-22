package entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "offence")

public class OffenceEntity {
    @Id
    private String id;
    private String offender;
    private long numberOfTreeLost;
    private String sanctionForm;
    private double compensationMoney;
    private Date date;
    private double areaOfDamage;
    @ManyToOne
    @JoinColumn(name = "forest_ID")
    private ForestEntity forest;
    public OffenceEntity(){}

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

    public double getCompensationMoney() {
        return compensationMoney;
    }

    public Date getDate() {
        return date;
    }

    public double getAreaOfDamage() {
        return areaOfDamage;
    }

    public long getNumberOfTreeLost() {
        return numberOfTreeLost;
    }

    public String getOffenceId() {
        return id;
    }

    public String getOffender() {
        return offender;
    }

    public String getSanctionForm() {
        return sanctionForm;
    }

    public void setAreaOfDamage(double areaOfDamage) {
        this.areaOfDamage = areaOfDamage;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setCompensationMoney(double compensationMoney) {
        this.compensationMoney = compensationMoney;
    }

    public void setNumberOfTreeLost(long numberOfTreeLost) {
        this.numberOfTreeLost = numberOfTreeLost;
    }

    public void setOffenceId(String offenceId) {
        this.id = offenceId;
    }

    public void setOffender(String offender) {
        this.offender = offender;
    }

    public void setSanctionForm(String sanctionForm) {
        this.sanctionForm = sanctionForm;
    }

}
