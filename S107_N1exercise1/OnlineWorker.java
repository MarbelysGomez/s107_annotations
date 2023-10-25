package s107_annotations.S107_N1exercise1;

public class OnlineWorker extends Worker {
    private final double INTERNET_FLAT_RATE = 50.0;
    public OnlineWorker(String name, String surname, double pricePerHour) {
        super(name, surname, pricePerHour);
    }
    @Override 
    public double calculateSalary(int hoursWorked) {
        return (hoursWorked * pricePerHour) + INTERNET_FLAT_RATE;
    }
    @Override
    public String toString() {
        return "Online Worker name= " + name + ", Surname= " + surname + ", Price per Hour= " + pricePerHour + ".";
    }
}
