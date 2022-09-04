package com.fengling.designs.singleton;

/**
 *
 * // 懒汉式 线程安全 : synchronized
 * @author Administrator
 */
public class SingletonSynchronized {

    private static SingletonSynchronized singleton = null;

    public SingletonSynchronized(){}

    public static synchronized SingletonSynchronized getInstance() {
        if (singleton == null) {
            singleton = new SingletonSynchronized();
        }
        return singleton;
    }
}
