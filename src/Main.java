public class Main {
    public static void main(String[] args) {
        ReportBuilder builder = new ReportBuilder();
        ReportDirector director = new ReportDirector();

        Report customReport = builder
                .setTitle("Custom Student Report")
                .setStudentName("Aitbek")
                .setCourseName("Java Programming")
                .setGrade(98.5)
                .setComments("Excellent performance")
                .build();

        Report examReport = director.buildExamReport(builder, "Aitbek", "Algorithms", 72.0);
        Report attendanceReport = director.buildAttendanceReport(builder, "Aitbek", "Software Design", 3);

        System.out.println(customReport);
        System.out.println(examReport);
        System.out.println(attendanceReport);
    }
}
