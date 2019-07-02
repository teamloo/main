package entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "offence")

public class OffenceEntity {
    @Id
    private String id;
    private String offender;
    private long numberOfTreeLost;
    private String sanctionForm;
    private double compensationMoney;
    private Date datee;
    private double areaOfDamage;

    @ManyToOne
    @JoinColumn(name = "forest_ID")
    private ForestEntity forest;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOffender() {
        return offender;
    }

    public void setOffender(String offender) {
        this.offender = offender;
    }

    public long getNumberOfTreeLost() {
        return numberOfTreeLost;
    }

    public void setNumberOfTreeLost(long numberOfTreeLost) {
        this.numberOfTreeLost = numberOfTreeLost;
    }

    public String getSanctionForm() {
        return sanctionForm;
    }

    public void setSanctionForm(String sanctionForm) {
        this.sanctionForm = sanctionForm;
    }

    public double getCompensationMoney() {
        return compensationMoney;
    }

    public void setCompensationMoney(double compensationMoney) {
        this.compensationMoney = compensationMoney;
    }

    public Date getDatee() {
        return datee;
    }

    public void setDatee(Date datee) {
        this.datee = datee;
    }

    public double getAreaOfDamage() {
        return areaOfDamage;
    }

    public void setAreaOfDamage(double areaOfDamage) {
        this.areaOfDamage = areaOfDamage;
    }

    public ForestEntity getForest() {
        return forest;
    }

    public void setForest(ForestEntity forest) {
        this.forest = forest;
    }
}
