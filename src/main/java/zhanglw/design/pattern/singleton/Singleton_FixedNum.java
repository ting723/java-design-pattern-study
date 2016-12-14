package zhanglw.design.pattern.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by zhanglw on 2016/12/14.
 */
public class Singleton_FixedNum {

    // 产生的最大实例数
    private static int MAX_NUM = 30;

    // 存放实例集合
    private static List<Singleton_FixedNum> list = new ArrayList<>();

    private static Random random = new Random();

    // 类加载时,初始化到最大
    static {
        for (int i = 0; i < MAX_NUM; i++) {
            list.add(new Singleton_FixedNum(i));
        }
    }

    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    private Singleton_FixedNum() {
    }


    private Singleton_FixedNum(int num) {
        this.num = num;
    }

    public static Singleton_FixedNum getInstance() {
        return list.get(random.nextInt(MAX_NUM));
    }

    public static void main(String[] args) {
        System.out.println(Singleton_FixedNum.getInstance().getNum());
    }
}
