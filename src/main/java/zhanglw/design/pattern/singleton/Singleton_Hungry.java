package zhanglw.design.pattern.singleton;

import zhanglw.design.pattern.base.BasePattern;

/**
 * Created by zhanglw on 2016/12/12.
 */
public class Singleton_Hungry extends BasePattern {

    private static final Singleton_Hungry singleton = new Singleton_Hungry();

    private Singleton_Hungry() {
    }

    public static Singleton_Hungry getInstance() {
        return singleton;
    }
}
