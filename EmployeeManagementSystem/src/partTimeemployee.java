import java.util.ArrayList;

public class  partTimeemployee extends Employee{
    private double hourRate;
    private int hoursWorked;

    public partTimeemployee(int id,String name,int hoursWorked, double hourRate) {
        super(id,name);
        this.hoursWorked = hoursWorked;
        this.hourRate = hourRate;

    }
    public double calculateSalary() {
        return hourRate * hoursWorked;
}}