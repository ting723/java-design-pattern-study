package zhanglw.design.pattern.singleton;

/**
 * Created by zhanglw on 2016/12/12.
 */
public class Singleton_InnerClass {

    private static class SingletonHolder {
        private static Singleton_InnerClass singleton = new Singleton_InnerClass();
    }

    private Singleton_InnerClass() {
    }

    private static final Singleton_InnerClass getInstance() {
        return SingletonHolder.singleton;
    }
}
