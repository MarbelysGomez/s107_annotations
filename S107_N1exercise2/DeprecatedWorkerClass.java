package s107_annotations.S107_N1exercise2;

public class DeprecatedWorkerClass {
    protected String name;
    protected String surname;
    protected double pricePerHour;

    public DeprecatedWorkerClass(String name, String surname, double pricePerHour) {
        this.name = name;
        this.surname = surname;
        this.pricePerHour = pricePerHour;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public double getPricePerHour() {
        return pricePerHour;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }
    public double calculateSalary(int hoursWorked) {
        return hoursWorked * pricePerHour;
    }
    public String toString() {
        return "Deprecated Worker: "+ '\'' +"Name= " + name + ", Surname= " + surname + ", Price per Hour= " + pricePerHour + ".";
    }
}
