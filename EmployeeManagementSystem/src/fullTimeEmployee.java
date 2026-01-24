public class fullTimeEmployee extends Employee{
    private double baseSalary;
    private double bonus;
    private double taxes;

    public fullTimeEmployee(int id, String name, double baseSalary, double bonus, double taxes) {
        super(id, name);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.taxes = taxes;
    }


    @Override
    public double calculateSalary() {
      return  baseSalary + bonus - taxes;
    }
}
