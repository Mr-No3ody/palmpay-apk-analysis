package Ma;

import com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CashierPaymentMethodBean f5911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function2 f5913c;

    public p(CashierPaymentMethodBean paymentMethod, boolean z3, Function2 function2) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        this.f5911a = paymentMethod;
        this.f5912b = z3;
        this.f5913c = function2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.c(this.f5911a, pVar.f5911a) && this.f5912b == pVar.f5912b && Intrinsics.c(this.f5913c, pVar.f5913c);
    }

    public final int hashCode() {
        int iD = androidx.camera.video.u.d(this.f5911a.hashCode() * 31, 31, this.f5912b);
        Function2 function2 = this.f5913c;
        return iD + (function2 == null ? 0 : function2.hashCode());
    }

    public final String toString() {
        return "ManualCalcOfPaymentMethodParam(paymentMethod=" + this.f5911a + ", showLoading=" + this.f5912b + ", onManualCalcResultCallback=" + this.f5913c + ")";
    }
}
