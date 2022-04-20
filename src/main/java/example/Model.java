package example;

public class Model {
    private String EmployeeName;
    private String Designation;
    private String Emp_id;
    private String Salary;
    // private String semester;
    private String search;

    public Model(String EmployeeName, String Designation, String Emp_id, String Salary,
            String search) {
        this.EmployeeName = EmployeeName;
        this.Designation = Designation;
        this.Emp_id = Emp_id;
        this.Salary = Salary;
        this.search = search;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public String getEmp_id() {
        return Emp_id;
    }

    public void setEmp_id(String Emp_id) {
        this.Emp_id = Emp_id;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String Salary) {
        this.Salary = Salary;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

}
