class FullTimeGameTester extends GameTester {
    public FullTimeGameTester(String name) {
        super(name, true);
    }

    @Override
    public double calculateSalary() {
        return 3000.0; // Full-time game testers get a base salary of $3000
    }
}