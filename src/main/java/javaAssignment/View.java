package javaAssignment;

import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class View {

  // View uses Swing framework to display UI to user
  private JFrame frame;
  private JLabel empNameLabel;
  private JLabel designationLabel;
  private JLabel empIdLabel;
  private JLabel salaryLabel;
  private JTextField firstnameTextfield;
  private JTextField lastnameTextfield;
  private JTextField SRNTextfield;
  private JTextField sectionTextfield;
  private JButton firstnameSaveButton;
  private JButton lastnameSaveButton;
  private JButton SRNSaveButton;
  private JButton sectionSaveButton;
  private JButton hello;
  private JButton bye;
  private JTextField searchTextField;
  private JButton search;
  
  // private JButton print;
  private JButton dummy;

  public View(String title) {
    frame = new JFrame(title);
    frame.getContentPane().setLayout(new BorderLayout());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(700, 300);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    // Create UI elements
    empNameLabel = new JLabel("Employee Name :");
    designationLabel = new JLabel("Designation :");
    empIdLabel = new JLabel("Employee id :");
    salaryLabel = new JLabel("Salary :");
    firstnameTextfield = new JTextField();
    lastnameTextfield = new JTextField();
    SRNTextfield = new JTextField();
    sectionTextfield = new JTextField();
    firstnameSaveButton = new JButton("Save Employee Name");
    lastnameSaveButton = new JButton("Save Designation");
    SRNSaveButton = new JButton("Save Employee id");
    sectionSaveButton = new JButton("Save Salary");
    hello = new JButton("Save details");
    bye = new JButton("Exit ");
    searchTextField=new JTextField();
    search = new JButton("search ");
    
    // print = new JButton("Ok Bye Print ");
    dummy = new JButton("Dummy button");
    // Add UI element to frame
    GroupLayout layout = new GroupLayout(frame.getContentPane());
    layout.setAutoCreateGaps(true);
    layout.setAutoCreateContainerGaps(true);
    layout.setHorizontalGroup(
      layout
        .createSequentialGroup()
        .addGroup(
          layout
            .createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(empNameLabel)
            .addComponent(designationLabel)
            .addComponent(empIdLabel)
            .addComponent(salaryLabel)
        )
        .addGroup(
          layout
            .createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(firstnameTextfield)
            .addComponent(lastnameTextfield)
            .addComponent(SRNTextfield)
            .addComponent(sectionTextfield)
            .addComponent(searchTextField)
            
        )
        .addGroup(
          layout
            .createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(firstnameSaveButton)
            .addComponent(lastnameSaveButton)
            .addComponent(SRNSaveButton)
            .addComponent(sectionSaveButton)
            .addComponent(search)
        )
        .addGroup(
          layout
            .createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(hello)
            .addComponent(bye)
        )
    );
    layout.setVerticalGroup(
      layout
        .createSequentialGroup()
        .addGroup(
          layout
            .createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(empNameLabel)
            .addComponent(firstnameTextfield)
            .addComponent(firstnameSaveButton)
            .addComponent(hello)
        )
        .addGroup(
          layout
            .createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(designationLabel)
            .addComponent(lastnameTextfield)
            .addComponent(lastnameSaveButton)
            .addComponent(bye)
        )
        .addGroup(
          layout
            .createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(empIdLabel)
            .addComponent(SRNTextfield)
            .addComponent(SRNSaveButton)
        )
        .addGroup(
          layout
            .createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(salaryLabel)
            .addComponent(sectionTextfield)
            .addComponent(sectionSaveButton)
        )
        .addGroup(
                layout
                  .createParallelGroup(GroupLayout.Alignment.BASELINE)
                  .addComponent(searchTextField)
                  .addComponent(search)
                  
              )
    );

    layout.linkSize(
      SwingConstants.HORIZONTAL,
      firstnameSaveButton,
      lastnameSaveButton,
      SRNSaveButton,
      sectionSaveButton
    );
    layout.linkSize(SwingConstants.HORIZONTAL, hello, bye);
    frame.getContentPane().setLayout(layout);
  }

  public JFrame getFrame() {
    return frame;
  }

  public void setFrame(JFrame frame) {
    this.frame = frame;
  }

  public JLabel getempNameLabel() {
    return empNameLabel;
  }

  public void setempNameLabel(JLabel empNameLabel) {
    this.empNameLabel = empNameLabel;
  }

  public JLabel getdesignationLabel() {
    return designationLabel;
  }

  public void setdesignationLabel(JLabel designationLabel) {
    this.designationLabel = designationLabel;
  }

  public JLabel getempIdLabel() {
    return empIdLabel;
  }

  public void setempIdLabel(JLabel empIdLabel) {
    this.empIdLabel = empIdLabel;
  }

  public JLabel getsalaryLabel() {
    return salaryLabel;
  }

  public void setsalaryLabel(JLabel salaryLabel) {
    this.salaryLabel = salaryLabel;
  }

  public JTextField getFirstnameTextfield() {
    return firstnameTextfield;
  }

  public void setFirstnameTextfield(JTextField firstnameTextfield) {
    this.firstnameTextfield = firstnameTextfield;
  }

  public JTextField getLastnameTextfield() {
    return lastnameTextfield;
  }

  public void setLastnameTextfield(JTextField lastnameTextfield) {
    this.lastnameTextfield = lastnameTextfield;
  }

  public JTextField getSRNTextfield() {
    return SRNTextfield;
  }

  public void setSRNTextfield(JTextField SRNTextfield) {
    this.SRNTextfield = SRNTextfield;
  }

  public JTextField getsectionTextfield() {
    return sectionTextfield;
  }

  public void setsectionTextfield(JTextField sectionTextfield) {
    this.sectionTextfield = sectionTextfield;
  }
  public JTextField getsearchTextField() {
	    return searchTextField;
  }
  public void setsearchTextField(JTextField searchTextField) {
	    this.searchTextField = searchTextField;
	  }
  public JButton getFirstnameSaveButton() {
    return firstnameSaveButton;
  }

  public void setFirstnameSaveButton(JButton firstnameSaveButton) {
    this.firstnameSaveButton = firstnameSaveButton;
  }

  public JButton getLastnameSaveButton() {
    return lastnameSaveButton;
  }

  public void setLastnameSaveButton(JButton lastnameSaveButton) {
    this.lastnameSaveButton = lastnameSaveButton;
  }

  public JButton getSRNSaveButton() {
    return SRNSaveButton;
  }

  public void setSRNSaveButton(JButton SRNSaveButton) {
    this.SRNSaveButton = SRNSaveButton;
  }

  public JButton getsectionSaveButton() {
    return sectionSaveButton;
  }

  public void setsectionSaveButton(JButton sectionSaveButton) {
    this.sectionSaveButton = sectionSaveButton;
  }

  public JButton getHello() {
    return hello;
  }
  

  public void setHello(JButton hello) {
    this.hello = hello;
  }

  // public JButton getprint() {
  // return print;
  // }

  // public void setprint(JButton print) {
  // this.print = print;
  // }

  public JButton getBye() {
    return bye;
  }

  public void setBye(JButton bye) {
    this.bye = bye;
  }
 
	  

  public JButton getSearch() {
	    return search;
	    }
  public void setSearch(JButton search) {
	    this.search = search;
	  }
	 
  
}

