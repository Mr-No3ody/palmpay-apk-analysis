package J3;

import C0.G;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f4503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f4505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f4508f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f4509g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f4510h;

    public e(f status, String str, Integer num, String str2, String str3, String str4, String str5, String str6, int i7) {
        str = (i7 & 2) != 0 ? null : str;
        num = (i7 & 4) != 0 ? null : num;
        str2 = (i7 & 8) != 0 ? null : str2;
        str3 = (i7 & 16) != 0 ? null : str3;
        str4 = (i7 & 32) != 0 ? null : str4;
        str5 = (i7 & 64) != 0 ? null : str5;
        str6 = (i7 & 128) != 0 ? null : str6;
        Intrinsics.checkNotNullParameter(status, "status");
        this.f4503a = status;
        this.f4504b = str;
        this.f4505c = num;
        this.f4506d = str2;
        this.f4507e = str3;
        this.f4508f = str4;
        this.f4509g = str5;
        this.f4510h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f4503a == eVar.f4503a && Intrinsics.c(this.f4504b, eVar.f4504b) && Intrinsics.c(this.f4505c, eVar.f4505c) && Intrinsics.c(this.f4506d, eVar.f4506d) && Intrinsics.c(this.f4507e, eVar.f4507e) && Intrinsics.c(this.f4508f, eVar.f4508f) && Intrinsics.c(this.f4509g, eVar.f4509g) && Intrinsics.c(this.f4510h, eVar.f4510h);
    }

    public final int hashCode() {
        int iHashCode = this.f4503a.hashCode() * 31;
        String str = this.f4504b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f4505c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f4506d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f4507e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f4508f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f4509g;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f4510h;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FlexiBankCashierResult(status=");
        sb2.append(this.f4503a);
        sb2.append(", orderNo=");
        sb2.append(this.f4504b);
        sb2.append(", payStatus=");
        sb2.append(this.f4505c);
        sb2.append(", payStatusDesc=");
        sb2.append(this.f4506d);
        sb2.append(", channelTransactionId=");
        sb2.append(this.f4507e);
        sb2.append(", businessData=");
        sb2.append(this.f4508f);
        sb2.append(", errorCode=");
        sb2.append(this.f4509g);
        sb2.append(", errorMessage=");
        return G.r(sb2, this.f4510h, ")");
    }
}
