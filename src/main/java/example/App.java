package example;

public class App {
    public static void main(String[] args) {
        // Assemble all the pieces of the MVC
        Model m = new Model("Employee Name", "Employee Designation", "Employee Id", "Employee Salary",
                "search key(can search with Employee Id)");
        View v = new View("Employee details MVC");
        Controller c = new Controller(m, v);
        c.initController();
    }
}
