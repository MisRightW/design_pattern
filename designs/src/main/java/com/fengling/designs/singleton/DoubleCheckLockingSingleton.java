package com.fengling.designs.singleton;

/**
 * 双锁机制，安全且在多线程情况下能保持高性能。
 *
 * @author Administrator
 */
public class DoubleCheckLockingSingleton {

    private static volatile DoubleCheckLockingSingleton singleton = null;

    public DoubleCheckLockingSingleton() {
    }

    public static DoubleCheckLockingSingleton getInstance() {
        if (singleton == null) {
            synchronized (DoubleCheckLockingSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckLockingSingleton();
                }
            }
        }
        return singleton;
    }
}
