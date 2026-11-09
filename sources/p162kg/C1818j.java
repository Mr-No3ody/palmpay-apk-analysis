package p162kg;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: kg.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1818j extends O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f38852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38853b;

    @Override // p162kg.O
    public final Object a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f38852a, this.f38853b);
        Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
        return cArrCopyOf;
    }

    @Override // p162kg.O
    public final void b(int i7) {
        char[] cArr = this.f38852a;
        if (cArr.length < i7) {
            int length = cArr.length * 2;
            if (i7 < length) {
                i7 = length;
            }
            char[] cArrCopyOf = Arrays.copyOf(cArr, i7);
            Intrinsics.checkNotNullExpressionValue(cArrCopyOf, "copyOf(...)");
            this.f38852a = cArrCopyOf;
        }
    }

    @Override // p162kg.O
    public final int d() {
        return this.f38853b;
    }
}
