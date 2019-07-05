package entity;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "Forest")
//@NamedQuery(name = "Forest.findAll", query = "SELECT t FROM Forest t")
public class ForestEntity {

    @Id
    @Column(name = "forest_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private Double greenErea;
    private String address;
    private String typeOfTrees;
    private Integer totalNumberOfTree;
    private String functionForest;
    private String lifeTime;

    private Date timeadded;

    @OneToMany(mappedBy = "forest",
            cascade= {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH}, fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<UnitEntity> unit;

    @OneToMany(mappedBy = "forest",
            cascade= {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH}, fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<ExploitionEntity> exploition;

    @OneToMany(mappedBy = "forest",
            cascade= {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH}, fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<TreePlantedEntity> treePlanted;


    @OneToMany(mappedBy = "forest",
            cascade= {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH}, fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    private List<ForestFireEntity> fireForest;

    public void setFireForest(List<ForestFireEntity> fireForest) {
        this.fireForest = fireForest;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGreenErea() {
        return greenErea;
    }

    public void setGreenErea(Double greenErea) {
        this.greenErea = greenErea;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTypeOfTrees() {
        return typeOfTrees;
    }

    public void setTypeOfTrees(String typeOfTrees) {
        this.typeOfTrees = typeOfTrees;
    }

    public Integer getTotalNumberOfTree() {
        return totalNumberOfTree;
    }

    public void setTotalNumberOfTree(Integer totalNumberOfTree) {
        this.totalNumberOfTree = totalNumberOfTree;
    }

    public String getFunctionForest() {
        return functionForest;
    }

    public void setFunctionForest(String functionForest) {
        this.functionForest = functionForest;
    }

    public String getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(String lifeTime) {
        this.lifeTime = lifeTime;
    }

    public Date getTimeadded() {
        return timeadded;
    }

    public void setTimeadded(Date timeadded) {
        this.timeadded = timeadded;
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

    public List<ForestFireEntity> getFireForest() {
        return fireForest;
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

    public ExploitionEntity removeExploition(ExploitionEntity exploition) {
        getExploition().remove(exploition);
        exploition.setForest(null);
        return exploition;
    }


    public TreePlantedEntity addTreePlanted(TreePlantedEntity treePlanted) {
        getTreePlanted().add(treePlanted);
        treePlanted.setForest(this);
        return treePlanted;
    }

    public TreePlantedEntity removeTreePlanted(TreePlantedEntity treePlanted) {
        getTreePlanted().remove(treePlanted);
        treePlanted.setForest(null);
        return treePlanted;
    }


    public ForestFireEntity addFireForest(ForestFireEntity fireForest) {
        getFireForest().add(fireForest);
        fireForest.setForest(this);
        return fireForest;
    }

    public ForestFireEntity removeFireForest(ForestFireEntity fireForest) {
        getFireForest().remove(fireForest);
        fireForest.setForest(null);
        return fireForest;
    }


}
