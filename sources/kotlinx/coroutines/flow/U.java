package kotlinx.coroutines.flow;

import Wf.C0765i;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DisposableHandle;

/* JADX INFO: loaded from: classes4.dex */
public final class U implements DisposableHandle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final W f39105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f39106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f39107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0765i f39108d;

    public U(W w3, long j6, Object obj, C0765i c0765i) {
        this.f39105a = w3;
        this.f39106b = j6;
        this.f39107c = obj;
        this.f39108d = c0765i;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public final void dispose() {
        W w3 = this.f39105a;
        synchronized (w3) {
            if (this.f39106b < w3.k()) {
                return;
            }
            Object[] objArr = w3.f39118g;
            Intrinsics.e(objArr);
            long j6 = this.f39106b;
            if (objArr[((int) j6) & (objArr.length - 1)] != this) {
                return;
            }
            X.c(objArr, j6, X.f39123a);
            w3.f();
            Unit unit = Unit.f38893a;
        }
    }
}
