package t0;

import java.util.List;
import kotlin.collections.C1849p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i extends j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(List cubics) {
        super(cubics);
        Intrinsics.checkNotNullParameter(cubics, "cubics");
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
        return new i(C1849p.a(dVarB));
    }

    public final String toString() {
        return "Edge";
    }
}
