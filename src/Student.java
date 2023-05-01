public class Student {

    private int id, grade, fees_paid, fees_total;
    private String name;

    /**
     * Constructor create a new student object by initializing the values
     * Fees for every student is 30,000
     * Fees paid initially is 0
     * @param id    id for the student : unique
     * @param grade grade for the student
     * @param name  name for the student
     */
    public Student(int id, int grade, String name) { 
        this.id = id;  
        this.name = name;
        this.grade = grade;
        fees_paid= 0;
        fees_total = 30000;
    }

    /**
     * Used to upgrade the students' grade
     * @param grade new grade of the student 
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Add the fees to the feesPaid 
     * The school is going to receive the fund
     * @param payFees
     */
    public void payFees(int fees) {
        fees_paid += fees;
        School.updateTotalMoneyEarn(fees_paid);
    }


    /**
     * @return name of the student
     */
    public String getName() {
        return name;
    }
    
    /**
     * @return name of the student 
     */
    public int getId() {
        return id;
    }

    /**
     * @return grade of the student
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @return fees to be paid by the student
     */
    public int getFees_paid() {
        return fees_paid;
    }

    /**
     * @return the total fees of the student
     */
    public int getFees_total() {
        return fees_total;
    }

    /**
     * Return the remaining fees
     * @return
     */
    public int getRemainingFees() {
        return fees_total -= fees_paid;
    }

    /**
     * This is way to represent a object
     */
    @Override
    public String toString() {
        return "Student's name: " +  name + ", Total fees paid so far: $" + fees_paid;
    }

}
