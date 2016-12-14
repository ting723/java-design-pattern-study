package zhanglw.design.pattern.singleton;

/**
 * Created by zhanglw on 2016/12/14.
 */
public class Singleton_RegChild extends Singleton_Reg {

    public Singleton_RegChild() {
    }


    // 静态工厂
    public static Singleton_RegChild getInstance() {
        return (Singleton_RegChild) Singleton_Reg.getInstance(Singleton_RegChild.class.getName());
    }

    public static void main(String[] args) {
        Singleton_RegChild.getInstance();
    }
}
