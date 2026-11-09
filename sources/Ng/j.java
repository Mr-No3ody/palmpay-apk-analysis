package Ng;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f6429g = new i(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f6431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f6433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6435f;

    public j(boolean z3, Integer num, boolean z8, Integer num2, boolean z10, boolean z11) {
        this.f6430a = z3;
        this.f6431b = num;
        this.f6432c = z8;
        this.f6433d = num2;
        this.f6434e = z10;
        this.f6435f = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f6430a == jVar.f6430a && Intrinsics.c(this.f6431b, jVar.f6431b) && this.f6432c == jVar.f6432c && Intrinsics.c(this.f6433d, jVar.f6433d) && this.f6434e == jVar.f6434e && this.f6435f == jVar.f6435f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final int hashCode() {
        boolean z3 = this.f6430a;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i7 = r3 * 31;
        Integer num = this.f6431b;
        int iHashCode = (i7 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z8 = this.f6432c;
        ?? r10 = z8;
        if (z8) {
            r10 = 1;
        }
        int i10 = (iHashCode + r10) * 31;
        Integer num2 = this.f6433d;
        int iHashCode2 = (i10 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z10 = this.f6434e;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int i11 = (iHashCode2 + r11) * 31;
        boolean z11 = this.f6435f;
        return i11 + (z11 ? 1 : z11);
    }

    public final String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.f6430a + ", clientMaxWindowBits=" + this.f6431b + ", clientNoContextTakeover=" + this.f6432c + ", serverMaxWindowBits=" + this.f6433d + ", serverNoContextTakeover=" + this.f6434e + ", unknownValues=" + this.f6435f + ')';
    }
}
