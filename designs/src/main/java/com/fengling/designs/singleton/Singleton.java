package com.fengling.designs.singleton;

/**
 *
 * // 懒汉式 线程不安全
 * @author Administrator
 */
public class Singleton {

    private static Singleton singleton = null;

    public Singleton(){}

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
