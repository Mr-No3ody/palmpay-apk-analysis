package df;

import android.os.Handler;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.SchedulerRunnableIntrospection;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements Disposable, Runnable, SchedulerRunnableIntrospection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f35925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f35926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f35927d;

    public /* synthetic */ f(int i7, Object obj, Object obj2) {
        this.f35924a = i7;
        this.f35926c = obj;
        this.f35927d = obj2;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        switch (this.f35924a) {
            case 0:
                this.f35925b = true;
                ((h) this.f35927d).dispose();
                break;
            default:
                ((Handler) this.f35926c).removeCallbacks(this);
                this.f35925b = true;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.lang.Runnable] */
    @Override // io.reactivex.schedulers.SchedulerRunnableIntrospection
    public Runnable getWrappedRunnable() {
        return this.f35926c;
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean isDisposed() {
        switch (this.f35924a) {
            case 0:
                break;
        }
        return this.f35925b;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35924a) {
            case 0:
                if (this.f35925b) {
                    return;
                }
                try {
                    this.f35926c.run();
                    return;
                } catch (Throwable th) {
                    D3.a.H(th);
                    ((h) this.f35927d).dispose();
                    throw p239pf.c.a(th);
                }
            default:
                try {
                    ((Runnable) this.f35927d).run();
                    return;
                } catch (Throwable th2) {
                    org.chromium.support_lib_boundary.util.b.V(th2);
                    return;
                }
        }
    }
}
