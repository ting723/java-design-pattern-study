package zhanglw.design.pattern.singleton;

/**
 * Created by zhanglw on 2016/12/12.
 */
public class Singleton_DoubleCheck {
    private volatile static Singleton_DoubleCheck singleton;

    private Singleton_DoubleCheck() {
    }

    public static Singleton_DoubleCheck getInstance() {
        if (singleton == null) {
            synchronized (Singleton_DoubleCheck.class) {
                if (singleton == null) {
                    singleton = new Singleton_DoubleCheck();
                }
            }
        }
        return singleton;
    }
}
