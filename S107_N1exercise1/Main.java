package s107_annotations.S107_N1exercise1;

public class Main {
    public static void main(String[] args) {
        OnlineWorker onlineWorker = new OnlineWorker ("Mar", "Falcon", 40.0);
        System.out.println(onlineWorker.toString());

        OnSiteWorker onSiteWorker = new OnSiteWorker ("Toni", "Cortes", 60.0);
        System.out.println(onSiteWorker.toString());

        System.out.println("Online Worker Salary: " + onlineWorker.calculateSalary(160));
        System.out.println("Onsite Worker Salary: " + onSiteWorker.calculateSalary(160));
    }
}
