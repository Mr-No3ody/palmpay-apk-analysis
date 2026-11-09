package p162kg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class W extends O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[] f38819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38820b;

    @Override // p162kg.O
    public final Object a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f38819a, this.f38820b);
        Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
        return sArrCopyOf;
    }

    @Override // p162kg.O
    public final void b(int i7) {
        short[] sArr = this.f38819a;
        if (sArr.length < i7) {
            int length = sArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i7);
            Intrinsics.checkNotNullExpressionValue(sArrCopyOf, "copyOf(...)");
            this.f38819a = sArrCopyOf;
        }
    }

    @Override // p162kg.O
    public final int d() {
        return this.f38820b;
    }
}
