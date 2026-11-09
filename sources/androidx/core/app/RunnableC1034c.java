package androidx.core.app;

import android.app.Application;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.core.app.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1034c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15962c;

    public /* synthetic */ RunnableC1034c(int i7, Object obj, Object obj2) {
        this.f15960a = i7;
        this.f15962c = obj;
        this.f15961b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15960a) {
            case 0:
                ((C1035d) this.f15961b).f15963a = this.f15962c;
                return;
            case 1:
                ((Application) this.f15962c).unregisterActivityLifecycleCallbacks((C1035d) this.f15961b);
                return;
            default:
                try {
                    Method method = AbstractC1036e.f15972d;
                    Object obj = this.f15961b;
                    Object obj2 = this.f15962c;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC1036e.f15973e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e10) {
                    if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                        throw e10;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
        }
    }

    public RunnableC1034c(C1035d c1035d, Object obj) {
        this.f15960a = 0;
        this.f15961b = c1035d;
        this.f15962c = obj;
    }
}
