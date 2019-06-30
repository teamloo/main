package model;

import java.sql.Date;

public class ForestFire {
    private String fireId;
    private double area;
    private String cause;
    private double numberOfTreeLost;
    private Date date;

    public ForestFire(String fireId, double area, String cause, double numberOfTreeLost, Date date) {
        this.fireId = fireId;
        this.area = area;
        this.cause = cause;
        this.numberOfTreeLost = numberOfTreeLost;
        this.date = date;
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
        return fireId;
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
        this.fireId = fireId;
    }
}
