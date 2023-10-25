package s107_annotations.S107_N1exercise2;

public class Main {
    public static void main(String[] args) {
        OnlineWorker_Deprecated onlineWorker = new OnlineWorker_Deprecated("Julia", "Martinez", 20.0);
        System.out.println(onlineWorker.toString());

        OnsiteWorker_Deprecated onsiteWorker = new OnsiteWorker_Deprecated("Luisa", "Tomas", 25.0);
        System.out.println(onsiteWorker.toString());

        System.out.println("Online Deprecated Worker Salary: " +onlineWorker.newCalculateSalary(160));
        System.out.println("Onsite Deprecated Worker Salary: " +onsiteWorker.newCalculateSalary(160));
    }
}

