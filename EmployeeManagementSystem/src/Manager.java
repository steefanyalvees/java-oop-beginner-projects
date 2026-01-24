public class Manager extends Employee {

    private double baseSalary;
    private double bonusPercentage;

    public Manager(int id, String name, double baseSalary, double bonusPercentage) {
        super(id, name);
        this.baseSalary = baseSalary;
        this.bonusPercentage = bonusPercentage;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (baseSalary * bonusPercentage);
    }
}