package example;

import static com.mongodb.client.model.Filters.eq;

import javax.swing.JOptionPane;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

public class Controller {
  private Model model;
  private View view;

  public Controller(Model m, View v) {
    model = m;
    view = v;
    initView();
  }

  public void initView() {
    view.getEmployeeNameTextfield().setText(model.getEmployeeName());
    view.getDesignationTextfield().setText(model.getDesignation());
    view.getEmp_idTextfield().setText(model.getEmp_id());
    view.getSalaryTextfield().setText(model.getSalary());
    view.getsearchTextField().setText(model.getSearch());
  }

  public void initController() {
    view.getEmployeeNameSaveButton().addActionListener(e -> saveEmployeeName());
    view.getDesignationSaveButton().addActionListener(e -> saveDesignation());
    view.getEmp_idSaveButton().addActionListener(e -> saveEmp_id());
    view.getSalarySaveButton().addActionListener(e -> saveSalary());
    view.getHello().addActionListener(e -> sayHello());
    view.getBye().addActionListener(e -> sayBye());
    view.getSearch().addActionListener(e -> search());
    // view.getprint().addActionListener(e -> sayprint());
  }

  private void saveEmp_id() {
    model.setEmp_id(view.getEmp_idTextfield().getText());

    JOptionPane.showMessageDialog(null, "Emp id saved : " + model.getEmp_id(), "Info", JOptionPane.INFORMATION_MESSAGE);

    // TODO Auto-generated method stub
  }

  private void saveSalary() {
    model.setSalary(view.getSalaryTextfield().getText());
    MongoClient mongoClient = new MongoClient("localhost", 27017);
    MongoDatabase db = mongoClient.getDatabase("EmployeeDB");
    MongoCollection<Document> collection = db.getCollection("employee database");
    collection.updateOne(Filters.eq("empid", model.getEmp_id()), Updates.set("Salary", model.getSalary()));
    JOptionPane.showMessageDialog(null, "Salary saved : " + model.getSalary(), "Info",
        JOptionPane.INFORMATION_MESSAGE);

    // TODO Auto-generated method stub
  }

  private void saveEmployeeName() {
    model.setEmployeeName(view.getEmployeeNameTextfield().getText());
    MongoClient mongoClient = new MongoClient("localhost", 27017);
    MongoDatabase db = mongoClient.getDatabase("EmployeeDB");
    MongoCollection<Document> collection = db.getCollection("employee database");
    collection.updateOne(Filters.eq("empid", model.getEmp_id()), Updates.set("name", model.getEmployeeName()));
    JOptionPane.showMessageDialog(null, "Employee Name saved : " + model.getEmployeeName(), "Info",
        JOptionPane.INFORMATION_MESSAGE);
  }

  private void saveDesignation() {
    model.setDesignation(view.getDesignationTextfield().getText());
    MongoClient mongoClient = new MongoClient("localhost", 27017);
    MongoDatabase db = mongoClient.getDatabase("EmployeeDB");
    MongoCollection<Document> collection = db.getCollection("employee database");
    collection.updateOne(Filters.eq("empid", model.getEmp_id()), Updates.set("Designation", model.getDesignation()));

    JOptionPane.showMessageDialog(null, "Designation Saved : " + model.getDesignation(), "Info",
        JOptionPane.INFORMATION_MESSAGE);
  }

  private void sayHello() {
    model.setEmp_id(view.getEmp_idTextfield().getText());
    model.setSalary(view.getSalaryTextfield().getText());
    model.setEmployeeName(view.getEmployeeNameTextfield().getText());
    model.setDesignation(view.getDesignationTextfield().getText());
    MongoClient mongoClient = new MongoClient("localhost", 27017);

    MongoDatabase db = mongoClient.getDatabase("EmployeeDB");
    MongoCollection<Document> collection = db.getCollection("employee database");

    Document d = collection.find(eq("empid", model.getEmp_id())).first();
    if (d == null) {
      Document doc = new Document("name", model.getEmployeeName());
      doc.append("empid", model.getEmp_id());
      doc.append("Designation", model.getDesignation());
      doc.append("Salary", model.getSalary());
      collection.insertOne(doc);

    }

    JOptionPane.showMessageDialog(null,
        "Hello " + model.getEmployeeName() + "\n" + "Your details are succesfully saved \n" + "emp id : "
            + model.getEmp_id() + "\nDesignation : " + model.getDesignation() + "\nSalary : " + model.getSalary(),
        "Details Saved",
        JOptionPane.INFORMATION_MESSAGE);
  }

  // private void sayBye() {
  // JOptionPane.showMessageDialog(null, "Ok Bye " + model.getEmployeeName() + " "
  // +
  // model.getDesignation(), "Info",
  // JOptionPane.INFORMATION_MESSAGE);
  // }

  private void sayBye() {
    System.exit(0);
  }

  private void search() {
    model.setSearch(view.getsearchTextField().getText());
    MongoClient mongoClient = new MongoClient("localhost", 27017);
    MongoDatabase db = mongoClient.getDatabase("EmployeeDB");
    MongoCollection<Document> collection = db.getCollection("employee database");
    Document d = collection.find(eq("empid", model.getSearch())).first();
    if (d == null) {
      JOptionPane.showMessageDialog(null, "DETAILS NOT FOUND", "Error!",
          JOptionPane.INFORMATION_MESSAGE);

    } else {

      JOptionPane.showMessageDialog(null, d, "deatils",
          JOptionPane.INFORMATION_MESSAGE);

    }

  }
}
