package entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "Forest")
@NamedQuery(name = "Forest.findAll", query = "SELECT t FROM Forest t")
public class ForestEntity {

    @Id
    @Column(name = "forest_id")
    private String id;


    private String name;
    private Double areenErea;
    private String address;
    private String typeOfTrees;
    private Integer totalNumberOfTree;
    private String functionForest;
    private String lifeTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date timeadded;

    @ManyToOne(targetEntity = UnitEntity.class)
    private List<UnitEntity> unit;

    @ManyToOne(targetEntity = ExploitionEntity.class)
    private List<ExploitionEntity> exploition;

    @ManyToOne(targetEntity = TreePlantedEntity.class )
    private List<TreePlantedEntity> treePlanted;

    public String getId() {
        return id;
    }

    public void setId(String forestId) {
        this.id = forestId;
    }

    public void setAreenErea(Double areenErea) {
        this.areenErea = areenErea;
    }

    public void setTotalNumberOfTree(Integer totalNumberOfTree) {
        this.totalNumberOfTree = totalNumberOfTree;
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

    public List<UnitEntity> getUnit() {
        return unit;
    }

    public void setUnit(List<UnitEntity> unit) {
        this.unit = unit;
    }

    public List<ExploitionEntity> getExploition() {
        return exploition;
    }

    public void setExploition(List<ExploitionEntity> exploition) {
        this.exploition = exploition;
    }

    public List<TreePlantedEntity> getTreePlanted() {
        return treePlanted;
    }

    public void setTreePlanted(List<TreePlantedEntity> treePlanted) {
        this.treePlanted = treePlanted;
    }

    public UnitEntity addUnit(UnitEntity unit) {
        getUnit().add(unit);
        unit.setForest(this);
        return unit;
    }

    public UnitEntity removeUnit(UnitEntity unit) {
        getUnit().remove(unit);
        unit.setForest(null);
        return unit;
    }

    public ExploitionEntity addExploition(ExploitionEntity exploition) {
        getExploition().add(exploition);
        exploition.setForest(this);
        return exploition;
    }

    public ExploitionEntity removeDepartment(ExploitionEntity exploition) {
        getExploition().remove(exploition);
        exploition.setForest(null);
        return exploition;
    }

    public TreePlantedEntity addExploition(TreePlantedEntity treePlanted) {
        getTreePlanted().add(treePlanted);
        treePlanted.setForest(this);
        return treePlanted;
    }

    public TreePlantedEntity removeDepartment(TreePlantedEntity treePlanted) {
        getExploition().remove(treePlanted);
        treePlanted.setForest(null);
        return treePlanted;
    }
}
