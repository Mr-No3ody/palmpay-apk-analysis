package Je;

import com.transsnet.palmpay.core.bean.style_config.CornerRadius;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f4795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f4796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f4798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f4799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Integer f4800f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f4801g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f4802h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Integer f4803i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CornerRadius f4804j;

    public g(Integer num, Integer num2, String str, Integer num3, Integer num4, Integer num5, Integer num6, String str2, Integer num7, CornerRadius cornerRadius) {
        this.f4795a = num;
        this.f4796b = num2;
        this.f4797c = str;
        this.f4798d = num3;
        this.f4799e = num4;
        this.f4800f = num5;
        this.f4801g = num6;
        this.f4802h = str2;
        this.f4803i = num7;
        this.f4804j = cornerRadius;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.c(this.f4795a, gVar.f4795a) && Intrinsics.c(this.f4796b, gVar.f4796b) && Intrinsics.c(this.f4797c, gVar.f4797c) && Intrinsics.c(this.f4798d, gVar.f4798d) && Intrinsics.c(this.f4799e, gVar.f4799e) && Intrinsics.c(this.f4800f, gVar.f4800f) && Intrinsics.c(this.f4801g, gVar.f4801g) && Intrinsics.c(this.f4802h, gVar.f4802h) && Intrinsics.c(this.f4803i, gVar.f4803i) && Intrinsics.c(this.f4804j, gVar.f4804j);
    }

    public final int hashCode() {
        Integer num = this.f4795a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f4796b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f4797c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.f4798d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f4799e;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f4800f;
        int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f4801g;
        int iHashCode7 = (iHashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str2 = this.f4802h;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num7 = this.f4803i;
        int iHashCode9 = (iHashCode8 + (num7 == null ? 0 : num7.hashCode())) * 31;
        CornerRadius cornerRadius = this.f4804j;
        return iHashCode9 + (cornerRadius != null ? cornerRadius.hashCode() : 0);
    }

    public final String toString() {
        return "TagStyle(widthDp=" + this.f4795a + ", heightDp=" + this.f4796b + ", bgColor=" + this.f4797c + ", strokeColor=" + this.f4798d + ", strokeWidthDp=" + this.f4799e + ", textColor=" + this.f4800f + ", textWeight=" + this.f4801g + ", text=" + this.f4802h + ", textSize=" + this.f4803i + ", cornerRadius=" + this.f4804j + ")";
    }
}
