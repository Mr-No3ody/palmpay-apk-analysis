package p162kg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import p355xf.y;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f38826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38827b;

    @Override // p162kg.O
    public final Object a() {
        byte[] storage = Arrays.copyOf(this.f38826a, this.f38827b);
        Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new y(storage);
    }

    @Override // p162kg.O
    public final void b(int i7) {
        byte[] bArr = this.f38826a;
        if (bArr.length < i7) {
            int length = bArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            byte[] storage = Arrays.copyOf(bArr, i7);
            Intrinsics.checkNotNullExpressionValue(storage, "copyOf(...)");
            Intrinsics.checkNotNullParameter(storage, "storage");
            this.f38826a = storage;
        }
    }

    @Override // p162kg.O
    public final int d() {
        return this.f38827b;
    }
}
