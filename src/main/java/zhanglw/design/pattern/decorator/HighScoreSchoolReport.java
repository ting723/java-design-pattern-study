package zhanglw.design.pattern.decorator;

/**
 * Created by zhanglw on 2017/3/28.
 */
public class HighScoreSchoolReport extends Decorator {

    public HighScoreSchoolReport(SchoolReport schoolReport) {
        super(schoolReport);
    }

    @Override
    void report() {
        System.out.println("本次最高分70");
        super.report();
    }
}
