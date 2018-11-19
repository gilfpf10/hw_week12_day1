package Management;

public class Director extends Manager {

    private double budget;

    public Director(String name, int niNumber, int salary, double budget){
        super (name, niNumber, salary);
                this.budget = budget;

    }

    public double getBudget(){
        return budget;

    }
}
