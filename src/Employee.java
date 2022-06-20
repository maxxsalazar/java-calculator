public class Employee {

    // fields
    private String firstName;
    private String lastName;
    private String social;

    // setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    // getters
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getSocial() {
        return this.social;
    }

    // contructors
    public Employee(String firstName, String lastName, String social) {
        this.firstName = firstName;
    }

    public Employee() {
        this.firstName = null;
    }
}
