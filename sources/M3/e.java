package M3;

import Q3.h;
import com.flexibank.sdk.cashier.bean.FlexiBankCashierPaymentMethodBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes.dex */
public final class e extends M1.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FlexiBankCashierPaymentMethodBean f5754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f5755c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f5757e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f5756d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f5758f = C2131j.b(new b(this, 0));

    static {
        new d(null);
    }

    public e() {
        C2131j.b(new b(this, 15));
        b getSelectPayMethod = new b(this, 16);
        b getPayAmount = new b(this, 1);
        b getItemClick = new b(this, 2);
        Intrinsics.checkNotNullParameter(getSelectPayMethod, "getSelectPayMethod");
        Intrinsics.checkNotNullParameter(getPayAmount, "getPayAmount");
        Intrinsics.checkNotNullParameter(getItemClick, "getItemClick");
        a(new N3.a(getSelectPayMethod, getPayAmount, getItemClick, 0));
        b getSelectPayMethod2 = new b(this, 3);
        b getPayAmount2 = new b(this, 4);
        b getItemClick2 = new b(this, 5);
        Intrinsics.checkNotNullParameter(getSelectPayMethod2, "getSelectPayMethod");
        Intrinsics.checkNotNullParameter(getPayAmount2, "getPayAmount");
        Intrinsics.checkNotNullParameter(getItemClick2, "getItemClick");
        a(new N3.a(getSelectPayMethod2, getPayAmount2, getItemClick2, 1));
        b getSelectPayMethod3 = new b(this, 6);
        b getPayAmount3 = new b(this, 7);
        b getItemClick3 = new b(this, 8);
        Intrinsics.checkNotNullParameter(getSelectPayMethod3, "getSelectPayMethod");
        Intrinsics.checkNotNullParameter(getPayAmount3, "getPayAmount");
        Intrinsics.checkNotNullParameter(getItemClick3, "getItemClick");
        a(new N3.a(getSelectPayMethod3, getPayAmount3, getItemClick3, 2));
        b getSelectPayMethod4 = new b(this, 9);
        b getPayAmount4 = new b(this, 10);
        b getItemClick4 = new b(this, 11);
        Intrinsics.checkNotNullParameter(getSelectPayMethod4, "getSelectPayMethod");
        Intrinsics.checkNotNullParameter(getPayAmount4, "getPayAmount");
        Intrinsics.checkNotNullParameter(getItemClick4, "getItemClick");
        a(new N3.a(getSelectPayMethod4, getPayAmount4, getItemClick4, 4));
        b getSelectPayMethod5 = new b(this, 12);
        b getPayAmount5 = new b(this, 13);
        b getItemClick5 = new b(this, 14);
        Intrinsics.checkNotNullParameter(getSelectPayMethod5, "getSelectPayMethod");
        Intrinsics.checkNotNullParameter(getPayAmount5, "getPayAmount");
        Intrinsics.checkNotNullParameter(getItemClick5, "getItemClick");
        a(new N3.a(getSelectPayMethod5, getPayAmount5, getItemClick5, 3));
        a(new N3.c(0));
    }

    @Override // M1.d
    public final int c(int i7, List data) {
        Intrinsics.checkNotNullParameter(data, "data");
        FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean = (FlexiBankCashierPaymentMethodBean) data.get(i7);
        if (flexiBankCashierPaymentMethodBean == null) {
            return 17;
        }
        if (flexiBankCashierPaymentMethodBean.getSenderAccountType() == 1) {
            return 19;
        }
        if (flexiBankCashierPaymentMethodBean.getSenderAccountType() == 46) {
            return 21;
        }
        if (flexiBankCashierPaymentMethodBean.getSenderAccountType() == 5 || flexiBankCashierPaymentMethodBean.getSenderAccountType() == 12 || flexiBankCashierPaymentMethodBean.getSenderAccountType() == 6) {
            return 20;
        }
        if (flexiBankCashierPaymentMethodBean.getSenderAccountType() == 8 || flexiBankCashierPaymentMethodBean.getSenderAccountType() == 13) {
            return 22;
        }
        return (flexiBankCashierPaymentMethodBean.getSenderAccountType() == 28 || flexiBankCashierPaymentMethodBean.getPayType() == 36) ? 18 : 17;
    }
}
