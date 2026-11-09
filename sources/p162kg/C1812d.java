package p162kg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kg.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1812d extends O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean[] f38832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38833b;

    @Override // p162kg.O
    public final Object a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f38832a, this.f38833b);
        Intrinsics.checkNotNullExpressionValue(zArrCopyOf, "copyOf(...)");
        return zArrCopyOf;
    }

    @Override // p162kg.O
    public final void b(int i7) {
        boolean[] zArr = this.f38832a;
        if (zArr.length < i7) {
            int length = zArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, i7);
            Intrinsics.checkNotNullExpressionValue(zArrCopyOf, "copyOf(...)");
            this.f38832a = zArrCopyOf;
        }
    }

    @Override // p162kg.O
    public final int d() {
        return this.f38833b;
    }
}
