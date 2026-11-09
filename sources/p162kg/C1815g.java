package p162kg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kg.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1815g extends O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f38842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38843b;

    @Override // p162kg.O
    public final Object a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f38842a, this.f38843b);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @Override // p162kg.O
    public final void b(int i7) {
        byte[] bArr = this.f38842a;
        if (bArr.length < i7) {
            int length = bArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i7);
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
            this.f38842a = bArrCopyOf;
        }
    }

    @Override // p162kg.O
    public final int d() {
        return this.f38843b;
    }
}
