package zhanglw.design.pattern.decorator;

/**
 * Created by zhanglw on 2017/3/28.
 */
public class MainTest {

    public static void main(String[] args) {

        SchoolReport sr = new FourGradeSchoolReport();

        sr = new HighScoreSchoolReport(sr);

        sr = new SortSchoolReport(sr);

        sr.report();
        sr.sign("老张");
    }
}
