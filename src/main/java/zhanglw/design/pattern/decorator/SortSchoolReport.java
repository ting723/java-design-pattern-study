package zhanglw.design.pattern.decorator;

/**
 * Created by zhanglw on 2017/3/28.
 */
public class SortSchoolReport extends Decorator {


    public SortSchoolReport(SchoolReport schoolReport) {
        super(schoolReport);
    }

    @Override
    void report() {
        super.report();
        System.out.println("排名36");
    }
}
