package com.fengling.designs.singleton;

/**
 * 内部类单例
 *
 * @author Administrator
 */
public class StaticClassSingleton {

    public static class StaticClassSingletonHelper {
        private static final StaticClassSingleton INSTANCE = new StaticClassSingleton();
    }

    public StaticClassSingleton() {
    }

    public static StaticClassSingleton getInstance() {
        return StaticClassSingletonHelper.INSTANCE;
    }
}
