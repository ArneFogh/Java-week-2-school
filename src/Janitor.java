class Janitor extends Employee {
    private String cleaningArea;

    //constructor
    public Janitor(String name, int age, double salary, String cleaningArea) {
        super(name, age, salary);
        this.cleaningArea = cleaningArea;
    }

}