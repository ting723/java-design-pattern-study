package zhanglw.design.pattern.decorator;

/**
 * Created by zhanglw on 2017/3/28.
 */
public class FourGradeSchoolReport extends SchoolReport {

    @Override
    void report() {
        System.out.println("四年级成绩 67");
    }

    @Override
    void sign(String name) {
        System.out.println("签字:" + name);
    }
}
