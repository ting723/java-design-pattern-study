package zhanglw.design.pattern.singleton;

import zhanglw.design.pattern.base.BasePattern;

/**
 * Created by zhanglw on 2016/12/12.
 */
public class Singleton_Lazy extends BasePattern {

    private static Singleton_Lazy singleton = null;

    private Singleton_Lazy() {
    }

    public static Singleton_Lazy getInstance() {
        if (singleton == null) singleton = new Singleton_Lazy();
        return singleton;
    }

}
