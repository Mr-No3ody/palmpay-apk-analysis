package K7;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f4953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f4954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f4955c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f4956d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4957e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CharSequence f4958f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f4959g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Integer f4960h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f4961i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f4962j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Integer f4963k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Integer f4964l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Integer f4965m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Integer f4966n;

    public a(Integer num, Integer num2, Integer num3, Integer num4, String str, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, int i7) {
        num = (i7 & 1) != 0 ? null : num;
        Integer num13 = (i7 & 2) != 0 ? null : num2;
        Integer num14 = (i7 & 4) != 0 ? null : num3;
        Integer num15 = (i7 & 8) != 0 ? null : num4;
        String contentDescription = (i7 & 512) != 0 ? "" : str;
        Integer num16 = (i7 & 1024) != 0 ? null : num5;
        Integer num17 = (i7 & 2048) != 0 ? null : num6;
        Integer num18 = (i7 & 4096) != 0 ? null : num7;
        Integer num19 = (i7 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? null : num8;
        Integer num20 = (32768 & i7) != 0 ? null : num10;
        Integer num21 = (65536 & i7) != 0 ? null : num11;
        Integer num22 = (i7 & 131072) == 0 ? num12 : null;
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        this.f4953a = num;
        this.f4954b = num13;
        this.f4955c = num14;
        this.f4956d = num15;
        this.f4957e = false;
        this.f4958f = contentDescription;
        this.f4959g = num16;
        this.f4960h = num17;
        this.f4961i = num18;
        this.f4962j = num19;
        this.f4963k = num9;
        this.f4964l = num20;
        this.f4965m = num21;
        this.f4966n = num22;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.c(this.f4953a, aVar.f4953a) && Intrinsics.c(this.f4954b, aVar.f4954b) && Intrinsics.c(this.f4955c, aVar.f4955c) && Intrinsics.c(this.f4956d, aVar.f4956d) && this.f4957e == aVar.f4957e && Intrinsics.c(this.f4958f, aVar.f4958f) && Intrinsics.c(this.f4959g, aVar.f4959g) && Intrinsics.c(this.f4960h, aVar.f4960h) && Intrinsics.c(this.f4961i, aVar.f4961i) && Intrinsics.c(this.f4962j, aVar.f4962j) && Intrinsics.c(this.f4963k, aVar.f4963k) && Intrinsics.c(this.f4964l, aVar.f4964l) && Intrinsics.c(this.f4965m, aVar.f4965m) && Intrinsics.c(this.f4966n, aVar.f4966n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v35 */
    public final int hashCode() {
        Integer num = this.f4953a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f4954b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f4955c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f4956d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 28629151;
        boolean z3 = this.f4957e;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int iHashCode5 = (this.f4958f.hashCode() + ((iHashCode4 + r3) * 31)) * 31;
        Integer num5 = this.f4959g;
        int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f4960h;
        int iHashCode7 = (iHashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f4961i;
        int iHashCode8 = (iHashCode7 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.f4962j;
        int iHashCode9 = (iHashCode8 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.f4963k;
        int iHashCode10 = (iHashCode9 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.f4964l;
        int iHashCode11 = (iHashCode10 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.f4965m;
        int iHashCode12 = (iHashCode11 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.f4966n;
        return iHashCode12 + (num12 != null ? num12.hashCode() : 0);
    }

    public final String toString() {
        return "VectorTextViewParams(drawableStartRes=" + this.f4953a + ", drawableEndRes=" + this.f4954b + ", drawableBottomRes=" + this.f4955c + ", drawableTopRes=" + this.f4956d + ", drawableStart=null, drawableEnd=null, drawableBottom=null, drawableTop=null, isRtlLayout=" + this.f4957e + ", contentDescription=" + ((Object) this.f4958f) + ", compoundDrawablePadding=" + this.f4959g + ", iconWidth=" + this.f4960h + ", iconHeight=" + this.f4961i + ", compoundDrawablePaddingRes=" + this.f4962j + ", tintColor=" + this.f4963k + ", widthRes=" + this.f4964l + ", heightRes=" + this.f4965m + ", squareSizeRes=" + this.f4966n + ')';
    }
}
