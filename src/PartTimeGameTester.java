class PartTimeGameTester extends GameTester {
    private int hoursWorked;

    public PartTimeGameTester(String name, int hoursWorked) {
        super(name, false);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return 20.0 * hoursWorked; // Part-time game testers get $20 per hour
    }
}