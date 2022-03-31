package javaAssignment;


public class App {
    public static void main(String[] args) {
        // Assemble all the pieces of the MVC
        Model m = new Model("BABA SHANKAR", "Software developer", "PES1UG19CS104", "6", "60000","search key");
        View v = new View("Employee details MVC");
        Controller c = new Controller(m, v);
        c.initController();
    }
}
