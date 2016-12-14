package zhanglw.design.pattern.singleton;

import java.util.HashMap;

/**
 * Created by zhanglw on 2016/12/14.
 */
public class Singleton_Reg {

    private static HashMap m_reg = new HashMap<>();

    static {
        Singleton_Reg singleton_reg = new Singleton_Reg();
        m_reg.put(singleton_reg.getClass().getName(), singleton_reg);
    }

    protected Singleton_Reg() {
    }

    public static Singleton_Reg getInstance(String name) {
        if (name == null) {
            name = Singleton_Reg.class.getName();
        }
        if (m_reg.get(name) == null) {
            try {
                m_reg.put(name, Class.forName(name).newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return (Singleton_Reg) m_reg.get(name);
    }

}
