package javaAssignment;
import static com.mongodb.client.model.Filters.eq;

import javax.swing.JOptionPane;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
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
    view.getFirstnameTextfield().setText(model.getFirstname());
    view.getLastnameTextfield().setText(model.getLastname());
    view.getSRNTextfield().setText(model.getSRN());
    view.getsectionTextfield().setText(model.getsection());
    view.getsearchTextField().setText(model.getSearch());
  }

  public void initController() {
    view.getFirstnameSaveButton().addActionListener(e -> saveFirstname());
    view.getLastnameSaveButton().addActionListener(e -> saveLastname());
    view.getSRNSaveButton().addActionListener(e -> saveSRN());
    view.getsectionSaveButton().addActionListener(e -> savesection());
    view.getHello().addActionListener(e -> sayHello());
    view.getBye().addActionListener(e -> sayBye());
    view.getSearch().addActionListener(e -> search());
    // view.getprint().addActionListener(e -> sayprint());
  }

  private void saveSRN() {
    model.setSRN(view.getSRNTextfield().getText());

    JOptionPane.showMessageDialog(null, "Emp id saved : " + model.getSRN(), "Info", JOptionPane.INFORMATION_MESSAGE);

    // TODO Auto-generated method stub
  }

  private void savesection() {
    model.setsection(view.getsectionTextfield().getText());
    MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb+srv://admin:admin@cluster0.jfrg2.mongodb.net/myFirstDatabase?retryWrites=true&w=majority"));
    MongoDatabase db = mongoClient.getDatabase("EmployeeDB");
	MongoCollection<Document> collection=db.getCollection("employee database");
    collection.updateOne(Filters.eq("empid",model.getSRN()), Updates.set("Salary", model.getsection()));
    JOptionPane.showMessageDialog(null, "Salary saved : " + model.getsection(), "Info",
        JOptionPane.INFORMATION_MESSAGE);
    mongoClient.close();

    // TODO Auto-generated method stub
  }

  private void saveFirstname() {
    model.setFirstname(view.getFirstnameTextfield().getText());
    MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb+srv://admin:admin@cluster0.jfrg2.mongodb.net/myFirstDatabase?retryWrites=true&w=majority"));
    MongoDatabase db = mongoClient.getDatabase("EmployeeDB");
	MongoCollection<Document> collection=db.getCollection("employee database");
    collection.updateOne(Filters.eq("empid",model.getSRN()), Updates.set("name",model.getFirstname()));
    JOptionPane.showMessageDialog(null, "Employee Name saved : " + model.getFirstname(), "Info",
        JOptionPane.INFORMATION_MESSAGE);
    mongoClient.close();
  }

  private void saveLastname() {
    model.setLastname(view.getLastnameTextfield().getText());
    MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb+srv://admin:admin@cluster0.jfrg2.mongodb.net/myFirstDatabase?retryWrites=true&w=majority"));
    MongoDatabase db = mongoClient.getDatabase("EmployeeDB");
	MongoCollection<Document> collection=db.getCollection("employee database");
    collection.updateOne(Filters.eq("empid",model.getSRN()), Updates.set("Designation",model.getLastname()));
    
    JOptionPane.showMessageDialog(null, "Designation Saved : " + model.getLastname(), "Info",
        JOptionPane.INFORMATION_MESSAGE);
    mongoClient.close();
  }

  private void sayHello() {
	  model.setSRN(view.getSRNTextfield().getText());
	  model.setsection(view.getsectionTextfield().getText());
	  model.setFirstname(view.getFirstnameTextfield().getText());
	  model.setLastname(view.getLastnameTextfield().getText());
	   MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb+srv://admin:admin@cluster0.jfrg2.mongodb.net/myFirstDatabase?retryWrites=true&w=majority"));
		
		MongoDatabase db = mongoClient.getDatabase("EmployeeDB");
		MongoCollection<Document> collection=db.getCollection("employee database");
		
		Document d=collection.find(eq("empid",model.getSRN())).first();
		if(d==null) {
			Document doc =new Document("name",model.getFirstname());
			doc.append("empid",model.getSRN());  
			doc.append("Designation",model.getLastname());  
			doc.append("Salary", model.getsection());
			collection.insertOne(doc);
			
		}

		
			
			
			
		
		
		
    JOptionPane.showMessageDialog(null, "Hello " + model.getFirstname() +"\n"+"Your details are succesfully saved \n"+"emp id : "+model.getSRN()+"\nDesignation : "+model.getLastname()+"\nSalary : "+model.getsection() , "Details Saved",
        JOptionPane.INFORMATION_MESSAGE); 
    mongoClient.close();
  }

  // private void sayBye() {
  // JOptionPane.showMessageDialog(null, "Ok Bye " + model.getFirstname() + " " +
  // model.getLastname(), "Info",
  // JOptionPane.INFORMATION_MESSAGE);
  // }

  private void sayBye() {
    System.exit(0);
  }
  private void search() {
	  model.setSearch(view.getsearchTextField().getText());
	  MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb+srv://admin:admin@cluster0.jfrg2.mongodb.net/myFirstDatabase?retryWrites=true&w=majority"));
	 MongoDatabase db = mongoClient.getDatabase("EmployeeDB");
	MongoCollection<Document> collection=db.getCollection("employee database");
	Document d=collection.find(eq("empid",model.getSearch())).first();
	if(d==null) {
		JOptionPane.showMessageDialog(null, "DETAILS NOT FOUND", "Error!",
		        JOptionPane.INFORMATION_MESSAGE);
		
	}
	else {
		
		  JOptionPane.showMessageDialog(null, d , "details",
			        JOptionPane.INFORMATION_MESSAGE);
		
	}
	mongoClient.close();
	  
	  
	  
	  
  }
}

