package zhanglw.design.pattern.singleton;

/**
 * Created by zhanglw on 2016/12/12.
 */
public class Singleton_Hungry_New {

    private static Singleton_Hungry_New singleton = null;

    static {
        singleton = new Singleton_Hungry_New();
    }

    public static Singleton_Hungry_New getInstance() {
        return singleton;
    }
}
