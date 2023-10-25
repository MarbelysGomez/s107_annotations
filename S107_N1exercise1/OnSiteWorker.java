package s107_annotations.S107_N1exercise1;

public class OnSiteWorker extends Worker{
    private static double gasoline = 10.0;
    public OnSiteWorker(String name, String surname, double pricePerHour) {
        super(name, surname, pricePerHour);
    }
    @Override
    public double calculateSalary(int hoursWorked) {
        return (hoursWorked * pricePerHour) + gasoline;
    }
    @Override
    public String toString() {
        return "Onsite Worker name= " + name + ", Surname= " + surname + ", Price per Hour= " + pricePerHour + ".";
    }
}
