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
     * @param fees
     */
    public void updateFeesPaid(int fees) {
        fees_paid += fees;
    }
}
