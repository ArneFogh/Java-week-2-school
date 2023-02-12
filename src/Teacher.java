class Teacher extends Employee {
    private String subject;

    //constructor
    public Teacher(String name, int age, double salary, String subject) {
        super(name, age, salary);
        this.subject = subject;
    }

    Teacher teacher1 = new Teacher("John Smith", 40, 145345.42, "Mathematics");
    Teacher teacher2 = new Teacher("Mary Juan", 35, 32112.44, "English");
}