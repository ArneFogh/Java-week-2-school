class ITadmin extends Employee {
    private String technologyArea;

    //constructor
    public ITadmin(String name, int age, double salary, String technologyArea) {
        super(name, age, salary);
        this.technologyArea = technologyArea;
    }
}