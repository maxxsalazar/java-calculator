public class HourlyEmployee extends Employee {

    // Fields
    private double hours;
    private double wage;

    // setters
    public void setHours(double hours) {
        if (hours > 0 && hours <= 168) {
            this.hours = hours;
        } else {
            this.hours = 0;

        }
    }

    public void setWage(double wage) {
        if (wage <= 0) {
            this.wage = wage;
        } else {
            this.wage = 0;
        }
    }

    // getters
    public double getHours() {
        return this.hours;
    }

    public double getWage() {
        return this.wage;
    }

    // constructors
    public HourlyEmployee(String firstName, String lastName, String social, double wage, double hours) {
        setFirstName(firstName);
        setLastName(lastName);
        setSocial(social);
        this.wage = wage;
        this.hours = hours;

    }

    public HourlyEmployee() {
        this.hours = 0;
    }

    // earnings method
    public double earnings(double hours, double hourlyRate) {
        return hours * hourlyRate;
    }

    // toString
    public String toString() {
        return String.format(
                " Hourly Employee: %s %s \n Social security number: %s \n Wage: %.2f \n Weekly Hours: %.1f \n Earnings: %.2f",
                getFirstName(), getLastName(), getSocial(), this.wage, this.hours, earnings(this.hours, this.wage));
    }
}
