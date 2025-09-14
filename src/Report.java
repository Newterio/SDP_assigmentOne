public class Report {
    private final String title;
    private final String studentName;
    private final String courseName;
    private final double grade;
    private final String comments;

    Report(String title, String studentName, String courseName, double grade, String comments) {
        this.title = title;
        this.studentName = studentName;
        this.courseName = courseName;
        this.grade = grade;
        this.comments = comments;
    }

    public String getTitle() {
        return title;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getGrade() {
        return grade;
    }

    public String getComments() {
        return comments;
    }

    @Override
    public String toString() {
        return "Report{" +
                "title='" + title + '\'' +
                ", studentName='" + studentName + '\'' +
                ", courseName='" + courseName + '\'' +
                ", grade=" + grade +
                ", comments='" + comments + '\'' +
                '}';
    }
}