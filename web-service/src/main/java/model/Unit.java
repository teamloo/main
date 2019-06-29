package model;

public class Unit {
    private String id;
    private String name;
    private String organizationForm;
    private String contract;
    private String forestID;

    @Override
    public String toString() {
        return "Unit{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", organizationForm='" + organizationForm + '\'' +
                ", contract='" + contract + '\'' +
                ", forestID='" + forestID + '\'' +
                '}';
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

    public String getForestID() {
        return forestID;
    }

    public void setForestID(String forestID) {
        this.forestID = forestID;
    }

    public Unit() {
    }

    public Unit(String id, String name, String organizationForm, String contract, String forestID) {
        this.id = id;
        this.name = name;
        this.organizationForm = organizationForm;
        this.contract = contract;
        this.forestID = forestID;
    }
}
