
class GradeCalculator {

    double marks_int;
    double marks_ext;
    double marks_proj;
    double total;

    void calculateGrade(double marks_int) {
        this.marks_int = marks_int;
        total = marks_int;
    }

    void calculateGrade(double marks_int, double marks_ext) {
        this.marks_int = marks_int;
        this.marks_ext = marks_ext;
        total = marks_int + marks_ext;
    }

    void calculateGrade(double marks_int, double marks_ext, double marks_proj) {
        this.marks_int = marks_int;
        this.marks_ext = marks_ext;
        this.marks_proj = marks_proj;
        total = marks_int + marks_proj + marks_ext;
    }
}

public class gradecalculator {

    public static void main(String[] args) {
        GradeCalculator g1 = new GradeCalculator();
        g1.calculateGrade(40);
        System.out.println(g1.total);
        g1.calculateGrade(40, 30);
        System.out.println(g1.total);
        g1.calculateGrade(40, 10, 23);
        System.out.println(g1.total);
    }
}
