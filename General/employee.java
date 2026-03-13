package General;

public class employee {
    protected int empid;
    private String ename;
    public employee(int empid, String ename) {
        this.empid = empid;
        this.ename = ename;
    }

    
    public double earnings(double basic) {
        double hra = 0.15 * basic;				
        double da = 0.80 * basic;
        return basic + da + hra;
    }

    public int getEmpid() {
        return this.empid;
    }
}