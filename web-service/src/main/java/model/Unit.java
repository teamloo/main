package model;
// đơn vị - ví dụ hộ gia đình, ban quản lý rừng .....
public class Unit {
    private String id;
    private String name;
    private String organizationForm; // hình thức tổ chức: chí cho phép 3 loại: hộ gia đình, ban quản lý rừng, Công ty theo hợp đồng
    private String contract; // hợp đồng - chí áp dụng cho công ty, nếu không ghi không có;

    public Unit() {
    }

    public Unit(String id, String name, String organizationForm, String contract) {
        this.id = id;
        this.name = name;
        this.organizationForm = organizationForm;
        this.contract = contract;
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
}
