public class Grade {
    protected double midtermGrade;
    protected double finalGrade;
    protected double quizGrade;
    protected double homeworkGrade;
    protected Student student;
    protected Lecture lecture;

    public double getMidtermGrade() {
        return midtermGrade;
    }

    public void setMidtermGrade(double midtermGrade) {
        this.midtermGrade = midtermGrade;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }

    public double getQuizGrade() {
        return quizGrade;
    }

    public void setQuizGrade(double quizGrade) {
        this.quizGrade = quizGrade;
    }

    public double getHomeworkGrade() {
        return homeworkGrade;
    }

    public void setHomeworkGrade(double homeworkGrade) {
        this.homeworkGrade = homeworkGrade;
    }

    public Grade() {

    }


    public Grade(double midtermGrade, double finalGrade, double quizGrade, double homeworkGrade, Lecture lecture){
        this.midtermGrade = midtermGrade;
        this.finalGrade = finalGrade;
        this.quizGrade = quizGrade;
        this.homeworkGrade = homeworkGrade;
        this.lecture = lecture;
    }

    public void displayGrade() {
        System.out.println();
        System.out.println("Grades for " + lecture.getName());
        System.out.println("Homework Grade: " +getHomeworkGrade());
        System.out.println("Quiz Grade: " +getQuizGrade());
        System.out.println("Midterm Grade: " +getMidtermGrade());
        System.out.println("Final Grade: " +getFinalGrade());
    }


}

