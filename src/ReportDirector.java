
public class ReportDirector {
    public Report buildExamReport(ReportBuilder builder, String student, String course, double grade) {
        builder.reset();
        return builder
                .setTitle("Exam Report")
                .setStudentName(student)
                .setCourseName(course)
                .setGrade(grade)
                .setComments(grade >= 50 ? "Passed" : "Failed")
                .build();
    }

    public Report buildAttendanceReport(ReportBuilder builder, String student, String course, int missedClasses) {
        builder.reset();
        return builder
                .setTitle("Attendance Report")
                .setStudentName(student)
                .setCourseName(course)
                .setComments("Missed classes: " + missedClasses)
                .build();
    }
}