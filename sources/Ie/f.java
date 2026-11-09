package Ie;

import N8.q0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f4338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4339d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!f.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.f(obj, "null cannot be cast to non-null type com.transsnet.palmpay.ui.viewhandler.HomeAccountBarHandler.UiState");
        f fVar = (f) obj;
        return this.f4336a == fVar.f4336a && this.f4337b == fVar.f4337b && this.f4338c == fVar.f4338c && this.f4339d == fVar.f4339d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4339d) + q0.b(androidx.camera.video.u.d(Boolean.hashCode(this.f4336a) * 31, 31, this.f4337b), 31, this.f4338c);
    }
}
