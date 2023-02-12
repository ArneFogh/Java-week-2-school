class Headmaster extends Employee {

    private String responsibilities;

    public Headmaster(String name, int age, double salary, String responsibilities) {
        super(name, age, salary);
        this.responsibilities = responsibilities;

    }
}