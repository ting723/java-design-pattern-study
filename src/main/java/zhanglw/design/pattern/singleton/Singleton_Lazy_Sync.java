package zhanglw.design.pattern.singleton;

/**
 * Created by zhanglw on 2016/12/12.
 */
public class Singleton_Lazy_Sync {

    private static Singleton_Lazy_Sync singleton = null;

    private Singleton_Lazy_Sync() {
    }

//    public static synchronized Singleton_Lazy_Sync getInstance() {
//        if (singleton == null) singleton = new Singleton_Lazy_Sync();
//        return singleton;
//    }

    public static Singleton_Lazy_Sync getInstance() {
        synchronized (Singleton_Lazy_Sync.class){
            if (singleton == null) singleton = new Singleton_Lazy_Sync();
            return singleton;
        }
    }

}
