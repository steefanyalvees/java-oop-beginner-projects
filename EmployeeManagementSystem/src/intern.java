public class intern extends Employee {

    private double scholarship;
    private double transportationAllowance;

    public intern(int id, String name, double scholarship, double transportationAllowance) {
        super(id, name);
        this.scholarship = scholarship;
        this.transportationAllowance = transportationAllowance;
    }

    @Override
    public double calculateSalary() {
        return scholarship + transportationAllowance;
    }
}
