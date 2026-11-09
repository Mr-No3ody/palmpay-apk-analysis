package p162kg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class E extends O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f38783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38784b;

    @Override // p162kg.O
    public final Object a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f38783a, this.f38784b);
        Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
        return jArrCopyOf;
    }

    @Override // p162kg.O
    public final void b(int i7) {
        long[] jArr = this.f38783a;
        if (jArr.length < i7) {
            int length = jArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i7);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(...)");
            this.f38783a = jArrCopyOf;
        }
    }

    @Override // p162kg.O
    public final int d() {
        return this.f38784b;
    }
}
