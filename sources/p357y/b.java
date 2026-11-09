package p357y;

import E.ThreadFactoryC0208m;
import X.a;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class b extends com.facebook.imagepipeline.nativecode.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f44020f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ExecutorService f44021g = Executors.newFixedThreadPool(4, new ThreadFactoryC0208m(4));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile Handler f44022h;

    public static Handler Z(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
