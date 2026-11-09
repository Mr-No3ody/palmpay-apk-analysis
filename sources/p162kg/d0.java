package p162kg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import p355xf.B;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f38834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38835b;

    @Override // p162kg.O
    public final Object a() {
        int[] storage = Arrays.copyOf(this.f38834a, this.f38835b);
        Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new B(storage);
    }

    @Override // p162kg.O
    public final void b(int i7) {
        int[] iArr = this.f38834a;
        if (iArr.length < i7) {
            int length = iArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            int[] storage = Arrays.copyOf(iArr, i7);
            Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.f38834a = storage;
        }
    }

    @Override // p162kg.O
    public final int d() {
        return this.f38835b;
    }
}
