package model;

import java.sql.Date;

public class TreePlanted {
    private String treePlantedID;
    private Forest forest;
    private Date date;
    private int treeIncrease;
    private double area;
    private Unit unit;
    private Department department;

    @Override
    public String toString() {
        return "TreePlanted{" +
                "treePlantedID='" + treePlantedID + '\'' +
                ", forest=" + forest +
                ", date=" + date +
                ", treeIncrease=" + treeIncrease +
                ", area=" + area +
                ", unit=" + unit +
                ", department=" + department +
                '}';
    }

    public String getTreePlantedID() {
        return treePlantedID;
    }

    public void setTreePlantedID(String treePlantedID) {
        this.treePlantedID = treePlantedID;
    }

    public Forest getForest() {
        return forest;
    }

    public void setForest(Forest forest) {
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

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public TreePlanted() {
    }

    public TreePlanted(String treePlantedID, Forest forest, Date date, int treeIncrease, double area, Unit unit, Department department) {
        this.treePlantedID = treePlantedID;
        this.forest = forest;
        this.date = date;
        this.treeIncrease = treeIncrease;
        this.area = area;
        this.unit = unit;
        this.department = department;
    }
}
