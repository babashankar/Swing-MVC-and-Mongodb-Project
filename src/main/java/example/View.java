package example;

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
  private JTextField EmployeeNameTextfield;
  private JTextField DesignationTextfield;
  private JTextField Emp_idTextfield;
  private JTextField SalaryTextfield;
  private JButton EmployeeNameSaveButton;
  private JButton DesignationSaveButton;
  private JButton Emp_idSaveButton;
  private JButton SalarySaveButton;
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
    frame.setSize(900, 500);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    // Create UI elements
    empNameLabel = new JLabel("Employee Name :");
    designationLabel = new JLabel("Designation :");
    empIdLabel = new JLabel("Employee id :");
    salaryLabel = new JLabel("Salary :");
    EmployeeNameTextfield = new JTextField();
    DesignationTextfield = new JTextField();
    Emp_idTextfield = new JTextField();
    SalaryTextfield = new JTextField();
    EmployeeNameSaveButton = new JButton("Save Employee Name");
    DesignationSaveButton = new JButton("Save Designation");
    Emp_idSaveButton = new JButton("Save Employee id");
    SalarySaveButton = new JButton("Save Salary");
    hello = new JButton("Save details");
    bye = new JButton("Exit ");
    searchTextField = new JTextField();
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
                    .addComponent(salaryLabel))
            .addGroup(
                layout
                    .createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(EmployeeNameTextfield)
                    .addComponent(DesignationTextfield)
                    .addComponent(Emp_idTextfield)
                    .addComponent(SalaryTextfield)
                    .addComponent(searchTextField)

            )
            .addGroup(
                layout
                    .createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(EmployeeNameSaveButton)
                    .addComponent(DesignationSaveButton)
                    .addComponent(Emp_idSaveButton)
                    .addComponent(SalarySaveButton)
                    .addComponent(search))
            .addGroup(
                layout
                    .createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(hello)
                    .addComponent(bye)));
    layout.setVerticalGroup(
        layout
            .createSequentialGroup()
            .addGroup(
                layout
                    .createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(empNameLabel)
                    .addComponent(EmployeeNameTextfield)
                    .addComponent(EmployeeNameSaveButton)
                    .addComponent(hello))
            .addGroup(
                layout
                    .createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(designationLabel)
                    .addComponent(DesignationTextfield)
                    .addComponent(DesignationSaveButton)
                    .addComponent(bye))
            .addGroup(
                layout
                    .createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(empIdLabel)
                    .addComponent(Emp_idTextfield)
                    .addComponent(Emp_idSaveButton))
            .addGroup(
                layout
                    .createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(salaryLabel)
                    .addComponent(SalaryTextfield)
                    .addComponent(SalarySaveButton))
            .addGroup(
                layout
                    .createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTextField)
                    .addComponent(search)

            ));

    layout.linkSize(
        SwingConstants.HORIZONTAL,
        EmployeeNameSaveButton,
        DesignationSaveButton,
        Emp_idSaveButton,
        SalarySaveButton);
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

  public JTextField getEmployeeNameTextfield() {
    return EmployeeNameTextfield;
  }

  public void setEmployeeNameTextfield(JTextField EmployeeNameTextfield) {
    this.EmployeeNameTextfield = EmployeeNameTextfield;
  }

  public JTextField getDesignationTextfield() {
    return DesignationTextfield;
  }

  public void setDesignationTextfield(JTextField DesignationTextfield) {
    this.DesignationTextfield = DesignationTextfield;
  }

  public JTextField getEmp_idTextfield() {
    return Emp_idTextfield;
  }

  public void setEmp_idTextfield(JTextField Emp_idTextfield) {
    this.Emp_idTextfield = Emp_idTextfield;
  }

  public JTextField getSalaryTextfield() {
    return SalaryTextfield;
  }

  public void setSalaryTextfield(JTextField SalaryTextfield) {
    this.SalaryTextfield = SalaryTextfield;
  }

  public JTextField getsearchTextField() {
    return searchTextField;
  }

  public void setsearchTextField(JTextField searchTextField) {
    this.searchTextField = searchTextField;
  }

  public JButton getEmployeeNameSaveButton() {
    return EmployeeNameSaveButton;
  }

  public void setEmployeeNameSaveButton(JButton EmployeeNameSaveButton) {
    this.EmployeeNameSaveButton = EmployeeNameSaveButton;
  }

  public JButton getDesignationSaveButton() {
    return DesignationSaveButton;
  }

  public void setDesignationSaveButton(JButton DesignationSaveButton) {
    this.DesignationSaveButton = DesignationSaveButton;
  }

  public JButton getEmp_idSaveButton() {
    return Emp_idSaveButton;
  }

  public void setEmp_idSaveButton(JButton Emp_idSaveButton) {
    this.Emp_idSaveButton = Emp_idSaveButton;
  }

  public JButton getSalarySaveButton() {
    return SalarySaveButton;
  }

  public void setSalarySaveButton(JButton SalarySaveButton) {
    this.SalarySaveButton = SalarySaveButton;
  }

  public JButton getHello() {
    return hello;
  }

  public void setHello(JButton hello) {
    this.hello = hello;
  }

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
