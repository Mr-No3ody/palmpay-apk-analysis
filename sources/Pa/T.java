package Pa;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Handler f7044a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f7045b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f7046c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f7047d = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Timer f7048e = new Timer();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static androidx.camera.core.impl.utils.executor.a f7049f;

    public static void a(N n10, int i7) {
        ExecutorService executorServiceB = b(-4);
        long j6 = i7;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ConcurrentHashMap concurrentHashMap = f7046c;
        synchronized (concurrentHashMap) {
            try {
                if (concurrentHashMap.get(n10) != null) {
                    F6.d.c("ThreadUtils", "Task can only be executed once.");
                    return;
                }
                concurrentHashMap.put(n10, executorServiceB);
                if (j6 == 0) {
                    executorServiceB.execute(n10);
                } else {
                    f7048e.schedule(new L(executorServiceB, n10), timeUnit.toMillis(j6));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ExecutorService b(int i7) {
        ExecutorService executorServiceA;
        HashMap map = f7045b;
        synchronized (map) {
            try {
                Map map2 = (Map) map.get(Integer.valueOf(i7));
                if (map2 == null) {
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    executorServiceA = O.a(i7);
                    concurrentHashMap.put(5, executorServiceA);
                    map.put(Integer.valueOf(i7), concurrentHashMap);
                } else {
                    executorServiceA = (ExecutorService) map2.get(5);
                    if (executorServiceA == null) {
                        executorServiceA = O.a(i7);
                        map2.put(5, executorServiceA);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return executorServiceA;
    }

    public static void c(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            f7044a.post(runnable);
        }
    }
}
