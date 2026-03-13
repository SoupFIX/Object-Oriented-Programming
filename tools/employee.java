package General;

 class employee 
 {
    protected int empid;
    private String ename;
    public double basic;

    employee(int id, String name, double basic) 
	{
        this.empid = id;
        this.ename = name;
        this.basic = basic;
    }

    public double earnings() 
	{
        return basic + (0.80 * basic) + (0.15 * basic);
    }
	
}