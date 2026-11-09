package p377z5;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.hjq.toast.config.IToastStrategy;
import java.lang.ref.WeakReference;
import p353xd.B;
import p7.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k implements IToastStrategy {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Handler f44475e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Application f44476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakReference f44477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f44478c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f44479d = new Object();

    @Override // com.hjq.toast.config.IToastStrategy
    public final void cancelToast() {
        Handler handler = f44475e;
        Object obj = this.f44479d;
        handler.removeCallbacksAndMessages(obj);
        handler.postAtTime(new B(this, 4), obj, SystemClock.uptimeMillis());
    }

    @Override // com.hjq.toast.config.IToastStrategy
    public final void registerStrategy(Application application) {
        this.f44476a = application;
    }

    @Override // com.hjq.toast.config.IToastStrategy
    public final void showToast(j jVar) {
        Handler handler = f44475e;
        Object obj = this.f44478c;
        handler.removeCallbacksAndMessages(obj);
        long jUptimeMillis = SystemClock.uptimeMillis();
        jVar.getClass();
        handler.postAtTime(new h(26, this, jVar), obj, jUptimeMillis + ((long) 200));
    }
}
