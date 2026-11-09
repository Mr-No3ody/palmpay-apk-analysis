package t0;

import E.AbstractC0198c;
import java.util.List;
import kotlin.collections.C1849p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class h extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f42280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f42281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f42282d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(List cubics, long j6, long j10, boolean z3) {
        super(cubics);
        Intrinsics.checkNotNullParameter(cubics, "cubics");
        this.f42280b = j6;
        this.f42281c = j10;
        this.f42282d = z3;
    }

    @Override // t0.j
    public final j a(p039cb.c f10) {
        Intrinsics.checkNotNullParameter(f10, "f");
        Af.d dVarB = C1849p.b();
        List list = this.f42283a;
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            dVarB.add(((e) list.get(i7)).e(f10));
        }
        return new h(C1849p.a(dVarB), AbstractC0198c.k0(this.f42280b, f10), AbstractC0198c.k0(this.f42281c, f10), this.f42282d);
    }

    public final String toString() {
        return "Corner: vertex=" + ((Object) M.h.b(this.f42280b)) + ", center=" + ((Object) M.h.b(this.f42281c)) + ", convex=" + this.f42282d;
    }
}
