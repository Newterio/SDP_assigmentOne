
public class ReportBuilder {
    private String title;
    private String studentName;
    private String courseName;
    private double grade;
    private String comments;

    public ReportBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public ReportBuilder setStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }

    public ReportBuilder setCourseName(String courseName) {
        this.courseName = courseName;
        return this;
    }

    public ReportBuilder setGrade(double grade) {
        if (grade < 0 || grade > 100) {
            throw new IllegalArgumentException("Grade must be between 0 and 100");
        }
        this.grade = grade;
        return this;
    }

    public ReportBuilder setComments(String comments) {
        this.comments = comments;
        return this;
    }

    public Report build() {
        if (title == null || studentName == null || courseName == null) {
            throw new IllegalStateException("Required fields are not set");
        }
        return new Report(title, studentName, courseName, grade, comments);
    }

    public void reset() {
        this.title = null;
        this.studentName = null;
        this.courseName = null;
        this.grade = 0;
        this.comments = null;
    }
}