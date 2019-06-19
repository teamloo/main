package entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "Forest")
public class ForestEntity {
    @Id
    @Column(name = "forestId")
    private Long forestId;
    private String name;
    private Double areenErea;
    private String address;
    private String typeOfTrees;
    private Integer totalNumberOfTree;
    private String functionForest;
    private String lifeTime;

    public String getUnitID() {
        return unitID;
    }

    public Long getForestId() {
        return forestId;
    }

    @ManyToOne
    @JoinColumn(name = "unitID")
    private String unitID;


    public void setForestId(Long forestId) {
        this.forestId = forestId;
    }

    public void setAreenErea(Double areenErea) {
        this.areenErea = areenErea;
    }

    public void setTotalNumberOfTree(Integer totalNumberOfTree) {
        this.totalNumberOfTree = totalNumberOfTree;
    }

    public void setUnitID(String unitID) {
        this.unitID = unitID;
    }

    public ForestEntity(Long id, String name, double areenErea, String address, String typeOfTrees, int totalNumberOfTree, String functionForest, String lifeTime, Date timeadded) {
        this.forestId = id;
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
        this.forestId = id;
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

    public Long getId() {
        return forestId;
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
