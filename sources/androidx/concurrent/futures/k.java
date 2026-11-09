package androidx.concurrent.futures;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f15060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f15061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f15062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15063d;

    public final void a(Runnable runnable, Executor executor) {
        o oVar = this.f15062c;
        if (oVar != null) {
            oVar.addListener(runnable, executor);
        }
    }

    public final boolean b(Object obj) {
        this.f15063d = true;
        m mVar = this.f15061b;
        boolean z3 = mVar != null && mVar.f15066b.set(obj);
        if (z3) {
            this.f15060a = null;
            this.f15061b = null;
            this.f15062c = null;
        }
        return z3;
    }

    public final void c() {
        this.f15063d = true;
        m mVar = this.f15061b;
        if (mVar == null || !mVar.f15066b.cancel(true)) {
            return;
        }
        this.f15060a = null;
        this.f15061b = null;
        this.f15062c = null;
    }

    public final boolean d(Throwable th) {
        this.f15063d = true;
        m mVar = this.f15061b;
        boolean z3 = mVar != null && mVar.f15066b.setException(th);
        if (z3) {
            this.f15060a = null;
            this.f15061b = null;
            this.f15062c = null;
        }
        return z3;
    }

    public final void finalize() {
        o oVar;
        m mVar = this.f15061b;
        if (mVar != null) {
            l lVar = mVar.f15066b;
            if (!lVar.isDone()) {
                lVar.setException(new c("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f15060a, 1));
            }
        }
        if (this.f15063d || (oVar = this.f15062c) == null) {
            return;
        }
        oVar.set(null);
    }
}
