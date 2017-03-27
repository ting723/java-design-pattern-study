package zhanglw.design.pattern.decorator;

/**
 * Created by zhanglw on 2017/3/28.
 */
public class Decorator extends SchoolReport {
    private SchoolReport schoolReport;

    public Decorator(SchoolReport schoolReport) {
        this.schoolReport = schoolReport;
    }

    @Override
    void report() {
        this.schoolReport.report();
    }

    @Override
    void sign(String name) {
        this.schoolReport.sign(name);
    }
}
