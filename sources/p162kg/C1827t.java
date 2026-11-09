package p162kg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kg.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1827t extends O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f38879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38880b;

    @Override // p162kg.O
    public final Object a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f38879a, this.f38880b);
        Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @Override // p162kg.O
    public final void b(int i7) {
        float[] fArr = this.f38879a;
        if (fArr.length < i7) {
            int length = fArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            float[] fArrCopyOf = Arrays.copyOf(fArr, i7);
            Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
            this.f38879a = fArrCopyOf;
        }
    }

    @Override // p162kg.O
    public final int d() {
        return this.f38880b;
    }
}
