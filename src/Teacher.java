public class Teacher {

    private int id, salary, salaryEarned;
    private String name;

    /**
     * Creating a new Teacher object
     * 
     * @param id     id for the teacher
     * @param name   name of the teacher
     * @param salary salary of the teacher
     * @param salaryEarned salary earned by the teacher
     */
    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     * @return the id
     */
    public int getId() {
        return this.id;
    }

    /**
     * @return name of the teacher
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return the salary of the teacher
     */
    public int getSalary() {
        return this.salary;
    }

    /**
     * Set the salary
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * Add to the salary
     * Remove from total money earned from NSV
     * @param salary
     */
    public void receiveSalary(int salary) {
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Teacher's name: " +  name + ", Total salary earned so far: $" + salaryEarned;
    }
}
