package p162kg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kg.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1832y extends O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f38886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38887b;

    @Override // p162kg.O
    public final Object a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f38886a, this.f38887b);
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        return iArrCopyOf;
    }

    @Override // p162kg.O
    public final void b(int i7) {
        int[] iArr = this.f38886a;
        if (iArr.length < i7) {
            int length = iArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i7);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            this.f38886a = iArrCopyOf;
        }
    }

    @Override // p162kg.O
    public final int d() {
        return this.f38887b;
    }
}
