package model;

import java.sql.Date;

public class TreePlanted {
    private String treePlantedID;
    private String forestID;
    private Date date;
    private int treeIncrease;
    private double area;
    private int unitID;
    private int departmentID;

    @Override
    public String toString() {
        return "TreePlanted{" +
                "treePlantedID=" + treePlantedID +
                ", forestID=" + forestID +
                ", date=" + date +
                ", treeIncrease=" + treeIncrease +
                ", area=" + area +
                ", unitID=" + unitID +
                ", departmentID=" + departmentID +
                '}';
    }

    public TreePlanted() {
    }

    public TreePlanted(String treePlantedID, String forestID, Date date, int treeIncrease, double area, int unitID, int departmentID) {
        this.treePlantedID = treePlantedID;
        this.forestID = forestID;
        this.date = date;
        this.treeIncrease = treeIncrease;
        this.area = area;
        this.unitID = unitID;
        this.departmentID = departmentID;
    }

    public String getTreePlantedID() {
        return treePlantedID;
    }

    public void setTreePlantedID(String treePlantedID) {
        this.treePlantedID = treePlantedID;
    }

    public String getForestID() {
        return forestID;
    }

    public void setForestID(String forestID) {
        this.forestID = forestID;
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

    public int getUnitID() {
        return unitID;
    }

    public void setUnitID(int unitID) {
        this.unitID = unitID;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

}
