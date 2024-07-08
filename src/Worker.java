public class Worker {
    private String name;
    private WorkerLevel worker;
    private Double baseSalary;

    public Worker(String name, WorkerLevel worker, Double baseSalary){
        this.name = name;
        this.worker = worker;
        this.baseSalary = baseSalary;
    }

    public Worker(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getWorker() {
        return worker;
    }

    public void setWorker(WorkerLevel worker) {
        this.worker = worker;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void addContract(HourContract contract) {

    }

    public void removeContract(HourContract contract) {

    }

    public Double income(Integer year, Integer month) {
        return 0.0;
    }
}