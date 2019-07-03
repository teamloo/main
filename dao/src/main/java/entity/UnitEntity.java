package entity;

import javax.persistence.*;
import java.util.List;

// đơn vị - ví dụ hộ gia đình, ban quản lý rừng .....
@Entity
@Table(name = "department")
//@NamedQuery(name = "Unit.findAll", query = "SELECT e FROM Unit e")
public class UnitEntity {
    @Id
    @Column(name = "unit_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String organizationForm; // hình thức tổ chức: chí cho phép 3 loại: hộ gia đình, ban quản lý rừng, Công ty theo hợp đồng
    private String contract; // hợp đồng - chí áp dụng cho công ty, nếu không ghi không có;

    @OneToMany(mappedBy = "unit")
    private List<DepartmentEntity> departments;

    @OneToMany(mappedBy = "unit")
    private List<TreePlantedEntity> treePlanted;

    @OneToMany(mappedBy = "unit")
    private List<ExploitionEntity> exploition;

    @ManyToOne
    @JoinColumn(name = "forest_id")
    private ForestEntity forest;

    public UnitEntity() {
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

    public String getOrganizationForm() {
        return organizationForm;
    }

    public void setOrganizationForm(String organizationForm) {
        this.organizationForm = organizationForm;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public List<DepartmentEntity> getDepartments() {
        return departments;
    }

    public void setDepartments(List<DepartmentEntity> departments) {
        this.departments = departments;
    }

    public List<TreePlantedEntity> getTreePlanted() {
        return treePlanted;
    }

    public void setTreePlanted(List<TreePlantedEntity> treePlanted) {
        this.treePlanted = treePlanted;
    }

    public List<ExploitionEntity> getExploition() {
        return exploition;
    }

    public void setExploition(List<ExploitionEntity> exploition) {
        this.exploition = exploition;
    }

    public ForestEntity getForest() {
        return forest;
    }

    public void setForest(ForestEntity forest) {
        this.forest = forest;
    }

    //  tại sao phải có hàm addDepartment(DepartmentEntity department)<Thêm cán bộ vào đơn vị> ?
    // Trả lời: quan hệ cán bộ(department) - đơn vị(unit) là 1 - nhiều
    // nên cần thêm cán bộ vào biến List<Department> (Trong câu : getDepartments().add(department);)
    // và cán bộ đó có thuộc đơn vị (department.setUnit(this);)
    public DepartmentEntity addDepartment(DepartmentEntity department) {
        getDepartments().add(department);
        department.setUnit(this);
        return department;
    }

    //  tại sao phải có hàm removeDepartment(DepartmentEntity department)<loại cán bộ vào đơn vị> ?
    // Trả lời: quan hệ cán bộ(department) - đơn vị(unit) là 1 - nhiều
    // nên cần loại cán bộ vào biến List<Department> (Trong câu : getDepartments().remove(department);)
    // và cán bộ đó có bị loại khỏi đơn vị (department.setUnit(null);)
    public DepartmentEntity removeDepartment(DepartmentEntity department) {
        getDepartments().remove(department);
        department.setUnit(null);
        return department;
    }


    public TreePlantedEntity addTreePlanted(TreePlantedEntity treePlantedEntity) {
        getTreePlanted().add(treePlantedEntity);
        treePlantedEntity.setUnit(this);
        return treePlantedEntity;
    }

    public TreePlantedEntity removeTreePlanted(TreePlantedEntity treePlantedEntity) {
        getTreePlanted().remove(treePlantedEntity);
        treePlantedEntity.setUnit(null);
        return treePlantedEntity;
    }


    public ExploitionEntity addExplotion(ExploitionEntity exploitionEntity) {
        getExploition().add(exploitionEntity);
        exploitionEntity.setUnit(this);
        return exploitionEntity;
    }
    public ExploitionEntity remove(ExploitionEntity exploitionEntity){
        getExploition().remove(exploitionEntity);
        exploitionEntity.setUnit(null);
        return exploitionEntity;
    }


}
