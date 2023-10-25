package s107_annotations.S107_N1exercise2;

public class OnsiteWorker_Deprecated extends DeprecatedWorkerClass{
    private static final double GASOLINE = 10.0;
    private static final double TRANSPORT_DEDUCTION = 50.0;

    public OnsiteWorker_Deprecated(String name, String surname, double pricePerHour) {
        super(name, surname, pricePerHour);
    }
    @Deprecated
    @Override
    public double calculateSalary(int hoursWorked) {
        return(hoursWorked * pricePerHour) + GASOLINE;
    }
    public double newCalculateSalary(int hoursWorked) {
        double salary = (hoursWorked * pricePerHour) + GASOLINE;
        return salary - TRANSPORT_DEDUCTION;
    }
    @Override
    public String toString() {
        return "Onsite Deprecated Worker: Name= " + name + ", Surname= " + surname + ", Price per Hour= " + pricePerHour + ".";
    }
}
