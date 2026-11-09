package p162kg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import p355xf.E;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f38844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38845b;

    @Override // p162kg.O
    public final Object a() {
        long[] storage = Arrays.copyOf(this.f38844a, this.f38845b);
        Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new E(storage);
    }

    @Override // p162kg.O
    public final void b(int i7) {
        long[] jArr = this.f38844a;
        if (jArr.length < i7) {
            int length = jArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            long[] storage = Arrays.copyOf(jArr, i7);
            Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.f38844a = storage;
        }
    }

    @Override // p162kg.O
    public final int d() {
        return this.f38845b;
    }
}
