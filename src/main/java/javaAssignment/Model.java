package javaAssignment;

public class Model {
    private String firstname;
    private String lastname;
    private String SRN;
    private String section;
    private String semester;
    private String search;

    public Model(String firstname, String lastname, String SRN, String semester, String section,String search) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.SRN = SRN;
        this.section = section;
        this.semester = semester;
        this.search = search;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSRN() {
        return SRN;
    }

    public void setSRN(String SRN) {
        this.SRN = SRN;
    }

    public String getsection() {
        return section;
    }

    public void setsection(String section) {
        this.section = section;
    }

    public String getsemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
    public String getSearch() {
        return search;
    }
    public void setSearch(String search) {
        this.search = search;
    }

}

