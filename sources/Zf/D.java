package Zf;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.W;

/* JADX INFO: loaded from: classes4.dex */
public final class D extends W implements StateFlow {
    @Override // kotlinx.coroutines.flow.StateFlow
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            Object[] objArr = this.f39118g;
            Intrinsics.e(objArr);
            numValueOf = Integer.valueOf(((Number) objArr[((int) ((this.f39119i + ((long) ((int) ((k() + ((long) this.f39121o)) - this.f39119i)))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return numValueOf;
    }

    public final void r(int i7) {
        synchronized (this) {
            Object[] objArr = this.f39118g;
            Intrinsics.e(objArr);
            tryEmit(Integer.valueOf(((Number) objArr[((int) ((this.f39119i + ((long) ((int) ((k() + ((long) this.f39121o)) - this.f39119i)))) - 1)) & (objArr.length - 1)]).intValue() + i7));
        }
    }
}
