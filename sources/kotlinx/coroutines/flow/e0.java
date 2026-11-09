package kotlinx.coroutines.flow;

import Yf.EnumC0789a;
import kotlin.collections.C1849p;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class e0 implements SharingStarted {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f39155b;

    public e0(long j6, long j10) {
        this.f39154a = j6;
        this.f39155b = j10;
        if (j6 < 0) {
            throw new IllegalArgumentException(("stopTimeout(" + j6 + " ms) cannot be negative").toString());
        }
        if (j10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("replayExpiration(" + j10 + " ms) cannot be negative").toString());
    }

    @Override // kotlinx.coroutines.flow.SharingStarted
    public final Flow command(StateFlow stateFlow) {
        c0 c0Var = new c0(this, null);
        int i7 = F.f39062a;
        return X.i(new C1888u(new Zf.o(c0Var, stateFlow, kotlin.coroutines.f.f38943a, -2, EnumC0789a.f11390a), new d0(2, null), 2));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return this.f39154a == e0Var.f39154a && this.f39155b == e0Var.f39155b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f39155b) + (Long.hashCode(this.f39154a) * 31);
    }

    public final String toString() {
        Af.d dVar = new Af.d(2);
        long j6 = this.f39154a;
        if (j6 > 0) {
            dVar.add("stopTimeout=" + j6 + "ms");
        }
        long j10 = this.f39155b;
        if (j10 < Long.MAX_VALUE) {
            dVar.add("replayExpiration=" + j10 + "ms");
        }
        return androidx.camera.video.u.p(new StringBuilder("SharingStarted.WhileSubscribed("), CollectionsKt.J(C1849p.a(dVar), null, null, null, null, 63), ')');
    }
}
