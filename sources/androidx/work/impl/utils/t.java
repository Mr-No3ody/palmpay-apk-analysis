package androidx.work.impl.utils;

import V0.C;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f18725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.work.impl.model.e f18726b;

    public t(u uVar, androidx.work.impl.model.e eVar) {
        this.f18725a = uVar;
        this.f18726b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f18725a.f18734d) {
            try {
                if (((t) this.f18725a.f18732b.remove(this.f18726b)) != null) {
                    WorkTimer$TimeLimitExceededListener workTimer$TimeLimitExceededListener = (WorkTimer$TimeLimitExceededListener) this.f18725a.f18733c.remove(this.f18726b);
                    if (workTimer$TimeLimitExceededListener != null) {
                        workTimer$TimeLimitExceededListener.onTimeLimitExceeded(this.f18726b);
                    }
                } else {
                    C c6 = C.c();
                    Objects.toString(this.f18726b);
                    c6.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
