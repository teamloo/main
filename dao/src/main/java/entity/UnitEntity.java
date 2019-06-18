package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

// đơn vị - ví dụ hộ gia đình, ban quản lý rừng .....
@Entity
@Table(name = "department")
public class UnitEntity {
    @Id
    private String id;
    private String name;
    private String organizationForm; // hình thức tổ chức: chí cho phép 3 loại: hộ gia đình, ban quản lý rừng, Công ty theo hợp đồng
    private String contract; // hợp đồng - chí áp dụng cho công ty, nếu không ghi không có;
    @OneToMany(mappedBy = "unit")
    private List<DepartmentEntity> departments;

    public UnitEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

}
