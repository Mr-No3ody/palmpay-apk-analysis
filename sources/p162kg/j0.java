package p162kg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import p355xf.I;

/* JADX INFO: loaded from: classes4.dex */
public final class j0 extends O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[] f38854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38855b;

    @Override // p162kg.O
    public final Object a() {
        short[] storage = Arrays.copyOf(this.f38854a, this.f38855b);
        Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new I(storage);
    }

    @Override // p162kg.O
    public final void b(int i7) {
        short[] sArr = this.f38854a;
        if (sArr.length < i7) {
            int length = sArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            short[] storage = Arrays.copyOf(sArr, i7);
            Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.f38854a = storage;
        }
    }

    @Override // p162kg.O
    public final int d() {
        return this.f38855b;
    }
}
