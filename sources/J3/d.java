package J3;

import C0.G;
import N8.q0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f4499f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f4500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f4501h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f4502i;

    public d(String orderNo, String transType, String str, long j6, String str2, String payeeAccountType, String str3, List displayFields, boolean z3) {
        Intrinsics.checkNotNullParameter(orderNo, "orderNo");
        Intrinsics.checkNotNullParameter(transType, "transType");
        Intrinsics.checkNotNullParameter(payeeAccountType, "payeeAccountType");
        Intrinsics.checkNotNullParameter(displayFields, "displayFields");
        this.f4494a = orderNo;
        this.f4495b = transType;
        this.f4496c = str;
        this.f4497d = j6;
        this.f4498e = str2;
        this.f4499f = payeeAccountType;
        this.f4500g = str3;
        this.f4501h = displayFields;
        this.f4502i = z3;
        if (StringsKt.F(orderNo)) {
            throw new IllegalArgumentException("orderNo must not be blank");
        }
        if (StringsKt.F(transType)) {
            throw new IllegalArgumentException("transType must not be blank");
        }
        if (j6 <= 0) {
            throw new IllegalArgumentException("amount must be greater than zero");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.c(this.f4494a, dVar.f4494a) && Intrinsics.c(this.f4495b, dVar.f4495b) && Intrinsics.c(this.f4496c, dVar.f4496c) && this.f4497d == dVar.f4497d && Intrinsics.c(this.f4498e, dVar.f4498e) && Intrinsics.c(this.f4499f, dVar.f4499f) && Intrinsics.c(this.f4500g, dVar.f4500g) && Intrinsics.c(this.f4501h, dVar.f4501h) && this.f4502i == dVar.f4502i;
    }

    public final int hashCode() {
        int iC = G.c(this.f4494a.hashCode() * 31, 31, this.f4495b);
        String str = this.f4496c;
        int iB = q0.b((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.f4497d);
        String str2 = this.f4498e;
        int iC2 = G.c((iB + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f4499f);
        String str3 = this.f4500g;
        return Boolean.hashCode(this.f4502i) + ((this.f4501h.hashCode() + ((iC2 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "FlexiBankCashierRequest(orderNo=" + this.f4494a + ", transType=" + this.f4495b + ", subTransType=" + this.f4496c + ", amount=" + this.f4497d + ", customerId=" + this.f4498e + ", payeeAccountType=" + this.f4499f + ", calculationExtInfo=" + this.f4500g + ", displayFields=" + this.f4501h + ", showCashierPreview=" + this.f4502i + ")";
    }
}
