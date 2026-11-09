package p162kg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kg.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1822n extends O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double[] f38865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38866b;

    @Override // p162kg.O
    public final Object a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f38865a, this.f38866b);
        Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
        return dArrCopyOf;
    }

    @Override // p162kg.O
    public final void b(int i7) {
        double[] dArr = this.f38865a;
        if (dArr.length < i7) {
            int length = dArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            double[] dArrCopyOf = Arrays.copyOf(dArr, i7);
            Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "copyOf(...)");
            this.f38865a = dArrCopyOf;
        }
    }

    @Override // p162kg.O
    public final int d() {
        return this.f38866b;
    }
}
