package s107_annotations.S107_N1exercise2;

public class OnlineWorker_Deprecated extends DeprecatedWorkerClass {
    private final double INTERNET_FLAT_RATE = 50.0;
    private static final double BONUS_RATE = 0.1;

    public OnlineWorker_Deprecated(String name, String surname, double pricePerHour) {
        super(name, surname, pricePerHour);
    }
    @Deprecated
    @Override
    public double calculateSalary(int hoursWorked){
        return (hoursWorked * pricePerHour) + INTERNET_FLAT_RATE;
    }
    public double newCalculateSalary(int hoursWorked) {
        double salary = (hoursWorked * pricePerHour) + INTERNET_FLAT_RATE;
        return salary + (salary * BONUS_RATE);
    }
    @Override
    public String toString() {
        return "Online Deprecated Worker: Name= " + name + ", Surname= " + surname + ", Price per Hour= " + pricePerHour + ".";
    }
}
