package model;

import java.util.Date;

public class Forest {
    private String id;
    private String name;
    private Double areenErea;
    private String address;
    private String typeOfTrees;
    private Integer totalNumberOfTree;
    private String functionForest;
    private String lifeTime;

    public Forest(String id, String name, double areenErea, String address, String typeOfTrees, int totalNumberOfTree, String functionForest, String lifeTime, Date timeadded) {
        this.id = id;
        this.name = name;
        this.areenErea = areenErea;
        this.address = address;
        this.typeOfTrees = typeOfTrees;
        this.totalNumberOfTree = totalNumberOfTree;
        this.functionForest = functionForest;
        this.lifeTime = lifeTime;
        this.timeadded = timeadded;
    }

    private Date timeadded;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAreenErea(double areenErea) {
        this.areenErea = areenErea;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTypeOfTrees(String typeOfTrees) {
        this.typeOfTrees = typeOfTrees;
    }

    public void setTotalNumberOfTree(int totalNumberOfTree) {
        this.totalNumberOfTree = totalNumberOfTree;
    }

    public void setFunctionForest(String functionForest) {
        this.functionForest = functionForest;
    }

    public void setLifeTime(String lifeTime) {
        this.lifeTime = lifeTime;
    }

    public void setTimeadded(Date timeadded) {
        this.timeadded = timeadded;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAreenErea() {
        return areenErea;
    }

    public String getAddress() {
        return address;
    }

    public String getTypeOfTrees() {
        return typeOfTrees;
    }

    public int getTotalNumberOfTree() {
        return totalNumberOfTree;
    }

    public String getFunctionForest() {
        return functionForest;
    }

    public String getLifeTime() {
        return lifeTime;
    }

    public Date getTimeadded() {
        return timeadded;
    }
}
