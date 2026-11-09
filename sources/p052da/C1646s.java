package p052da;

import M1.d;
import N3.c;
import com.transsnet.palmpay.core.adapter.CashierPaymentMethodAdapter$OnPaymentMethodClickListener;
import com.transsnet.palmpay.core.bean.cashier.CashierCombinationPaymentMethodBean;
import com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p067ea.a;
import p067ea.b;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: renamed from: da.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1646s extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CashierPaymentMethodBean f35806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f35807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f35808d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CashierPaymentMethodAdapter$OnPaymentMethodClickListener f35810f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f35809e = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f35811g = C2131j.b(new C1644p(this, 0));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f35812i = C2131j.b(new C1644p(this, 2));

    static {
        new r(null);
    }

    public C1646s() {
        C1644p getSelectPayMethod = new C1644p(this, 7);
        C1644p getPayAmount = new C1644p(this, 8);
        C1644p getItemClick = new C1644p(this, 9);
        Intrinsics.checkNotNullParameter(getSelectPayMethod, "getSelectPayMethod");
        Intrinsics.checkNotNullParameter(getPayAmount, "getPayAmount");
        Intrinsics.checkNotNullParameter(getItemClick, "getItemClick");
        a(new a(getSelectPayMethod, getPayAmount, getItemClick, 0));
        a(new b(new C1644p(this, 10), new C1644p(this, 12), new C1644p(this, 13), new C1644p(this, 14)));
        C1644p getSelectPayMethod2 = new C1644p(this, 15);
        C1644p getPayAmount2 = new C1644p(this, 11);
        C1644p getItemClick2 = new C1644p(this, 16);
        Intrinsics.checkNotNullParameter(getSelectPayMethod2, "getSelectPayMethod");
        Intrinsics.checkNotNullParameter(getPayAmount2, "getPayAmount");
        Intrinsics.checkNotNullParameter(getItemClick2, "getItemClick");
        a(new a(getSelectPayMethod2, getPayAmount2, getItemClick2, 1));
        C1644p getSelectPayMethod3 = new C1644p(this, 17);
        C1644p getPayAmount3 = new C1644p(this, 18);
        C1644p getItemClick3 = new C1644p(this, 19);
        Intrinsics.checkNotNullParameter(getSelectPayMethod3, "getSelectPayMethod");
        Intrinsics.checkNotNullParameter(getPayAmount3, "getPayAmount");
        Intrinsics.checkNotNullParameter(getItemClick3, "getItemClick");
        a(new a(getSelectPayMethod3, getPayAmount3, getItemClick3, 2));
        C1644p getSelectPayMethod4 = new C1644p(this, 20);
        C1644p getPayAmount4 = new C1644p(this, 21);
        C1644p getItemClick4 = new C1644p(this, 22);
        Intrinsics.checkNotNullParameter(getSelectPayMethod4, "getSelectPayMethod");
        Intrinsics.checkNotNullParameter(getPayAmount4, "getPayAmount");
        Intrinsics.checkNotNullParameter(getItemClick4, "getItemClick");
        a(new a(getSelectPayMethod4, getPayAmount4, getItemClick4, 5));
        C1644p getSelectPayMethod5 = new C1644p(this, 23);
        C1644p getPayAmount5 = new C1644p(this, 1);
        C1644p getItemClick5 = new C1644p(this, 3);
        Intrinsics.checkNotNullParameter(getSelectPayMethod5, "getSelectPayMethod");
        Intrinsics.checkNotNullParameter(getPayAmount5, "getPayAmount");
        Intrinsics.checkNotNullParameter(getItemClick5, "getItemClick");
        a(new a(getSelectPayMethod5, getPayAmount5, getItemClick5, 3));
        C1644p getSelectPayMethod6 = new C1644p(this, 4);
        C1644p getPayAmount6 = new C1644p(this, 5);
        C1644p getItemClick6 = new C1644p(this, 6);
        Intrinsics.checkNotNullParameter(getSelectPayMethod6, "getSelectPayMethod");
        Intrinsics.checkNotNullParameter(getPayAmount6, "getPayAmount");
        Intrinsics.checkNotNullParameter(getItemClick6, "getItemClick");
        a(new a(getSelectPayMethod6, getPayAmount6, getItemClick6, 4));
        a(new c(4));
    }

    @Override // M1.d
    public final int c(int i7, List data) {
        Intrinsics.checkNotNullParameter(data, "data");
        CashierPaymentMethodBean cashierPaymentMethodBean = (CashierPaymentMethodBean) data.get(i7);
        if (cashierPaymentMethodBean == null) {
            return 17;
        }
        if (cashierPaymentMethodBean instanceof CashierCombinationPaymentMethodBean) {
            return 24;
        }
        int i10 = cashierPaymentMethodBean.senderAccountType;
        if (i10 == 1) {
            return 19;
        }
        if (i10 == 40) {
            return 21;
        }
        if (i10 == 5 || i10 == 12 || i10 == 6) {
            return 20;
        }
        if (i10 == 8 || i10 == 13) {
            return 22;
        }
        if (i10 == 23) {
            return 23;
        }
        if (i10 == 57 || i10 == 29) {
            return 25;
        }
        return (i10 == 28 || cashierPaymentMethodBean.payType == 36) ? 18 : 17;
    }
}
