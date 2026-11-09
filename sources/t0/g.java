package t0;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M.m f42278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M.m f42279b;

    static {
        new f(null);
        Float fValueOf = Float.valueOf(0.0f);
        new g(new Pair(fValueOf, fValueOf), new Pair(Float.valueOf(0.5f), Float.valueOf(0.5f)));
    }

    public g(Pair... mappings) {
        Intrinsics.checkNotNullParameter(mappings, "mappings");
        this.f42278a = new M.m(mappings.length);
        this.f42279b = new M.m(mappings.length);
        int length = mappings.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.f42278a.a(((Number) mappings[i7].f38891a).floatValue());
            this.f42279b.a(((Number) mappings[i7].f38892b).floatValue());
        }
        D3.a.R(this.f42278a);
        D3.a.R(this.f42279b);
    }
}
