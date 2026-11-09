package com.didiglobal.booster.instrument;

import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public class FinalizerWatchdogDaemonKiller {
    private static final int MAX_RETRY_TIMES = 10;
    private static final long THREAD_SLEEP_TIME = 5000;

    private static Collection<Thread> getAllThreads() {
        try {
            ThreadGroup parent = Looper.getMainLooper().getThread().getThreadGroup().getParent();
            int iActiveCount = parent.activeCount();
            Thread[] threadArr = new Thread[iActiveCount];
            int iEnumerate = parent.enumerate(threadArr);
            if (iEnumerate == iActiveCount) {
                return Arrays.asList(threadArr);
            }
            Thread[] threadArr2 = new Thread[iEnumerate];
            System.arraycopy(threadArr, 0, threadArr2, 0, iEnumerate);
            return Arrays.asList(threadArr2);
        } catch (Throwable unused) {
            return Thread.getAllStackTraces().keySet();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isFinalizerWatchdogDaemonExists() {
        try {
            for (Thread thread : getAllThreads()) {
                if (thread != null && "FinalizerWatchdogDaemon".equals(thread.getName())) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void kill() {
        new Thread(new Runnable() { // from class: com.didiglobal.booster.instrument.FinalizerWatchdogDaemonKiller.1
            /* JADX WARN: Code duplicated, block: B:25:0x006c  */
            /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            public void run() {
                for (int i7 = 0; FinalizerWatchdogDaemonKiller.isFinalizerWatchdogDaemonExists() && i7 < 10; i7++) {
                    try {
                        Class<?> cls = Class.forName("java.lang.Daemons$FinalizerWatchdogDaemon");
                        Field declaredField = cls.getDeclaredField("INSTANCE");
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(null);
                        try {
                            Field declaredField2 = cls.getSuperclass().getDeclaredField("thread");
                            declaredField2.setAccessible(true);
                            declaredField2.set(obj, null);
                        } catch (Throwable th) {
                            Log.e(Constants.TAG, "Clearing reference of thread `FinalizerWatchdogDaemon` failed", th);
                            try {
                                Method declaredMethod = cls.getSuperclass().getDeclaredMethod("stop", new Class[0]);
                                declaredMethod.setAccessible(true);
                                declaredMethod.invoke(obj, new Object[0]);
                            } catch (Throwable th2) {
                                Log.e(Constants.TAG, "Interrupting thread `FinalizerWatchdogDaemon` failed", th2);
                                if (FinalizerWatchdogDaemonKiller.isFinalizerWatchdogDaemonExists()) {
                                    Log.e(Constants.TAG, "Killing thread `FinalizerWatchdogDaemon` failed");
                                }
                            }
                        }
                        try {
                            Thread.sleep(5000L);
                        } catch (InterruptedException unused) {
                        }
                    } catch (Throwable th3) {
                        Log.e(Constants.TAG, "Killing thread `FinalizerWatchdogDaemon` failed", th3);
                    }
                }
                if (FinalizerWatchdogDaemonKiller.isFinalizerWatchdogDaemonExists()) {
                    Log.e(Constants.TAG, "Killing thread `FinalizerWatchdogDaemon` failed");
                }
            }
        }, "FinalizerWatchdogDaemonKiller").start();
    }
}
