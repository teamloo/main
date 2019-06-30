package model;

import java.sql.Date;

public class Offence {
    private String offenceId;
    private String offender;
    private long numberOfTreeLost;
    private String sanctionForm;
    private double compensationMoney;
    private Date date;
    private double areaOfDamage;

    public Offence(String offenceId, String offender, long numberOfTreeLost, String sanctionForm, double compensationMoney, Date date, double areaOfDamage) {
        this.offenceId = offenceId;
        this.offender = offender;
        this.numberOfTreeLost = numberOfTreeLost;
        this.sanctionForm = sanctionForm;
        this.compensationMoney = compensationMoney;
        this.date = date;
        this.areaOfDamage = areaOfDamage;
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
        return offenceId;
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
        this.offenceId = offenceId;
    }

    public void setOffender(String offender) {
        this.offender = offender;
    }

    public void setSanctionForm(String sanctionForm) {
        this.sanctionForm = sanctionForm;
    }

}
