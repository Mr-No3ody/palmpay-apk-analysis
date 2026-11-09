package p052da;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.transsnet.palmpay.core.adapter.CashierPaymentMethodAdapter$CashierAddPaymentMethodItem;
import com.transsnet.palmpay.credit.ui.dialog.ViewOnClickListenerC1533v;
import kotlin.jvm.functions.Function0;
import p025ba.g;

/* JADX INFO: renamed from: da.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1644p implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1646s f35802b;

    public /* synthetic */ C1644p(C1646s c1646s, int i7) {
        this.f35801a = i7;
        this.f35802b = c1646s;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C1646s c1646s = this.f35802b;
        switch (this.f35801a) {
            case 0:
                return new CashierPaymentMethodAdapter$CashierAddPaymentMethodItem(c1646s, c1646s.getContext());
            case 1:
                return Long.valueOf(c1646s.f35807c);
            case 2:
                return LayoutInflater.from(c1646s.getContext()).inflate(g.core_item_cashier_apply_flexi, (ViewGroup) null);
            case 3:
                return c1646s.f35810f;
            case 4:
                return c1646s.f35806b;
            case 5:
                return Long.valueOf(c1646s.f35807c);
            case 6:
                return c1646s.f35810f;
            case 7:
                return c1646s.f35806b;
            case 8:
                return Long.valueOf(c1646s.f35807c);
            case 9:
                return c1646s.f35810f;
            case 10:
                return c1646s.f35806b;
            case 11:
                return Long.valueOf(c1646s.f35807c);
            case 12:
                return Long.valueOf(c1646s.f35807c);
            case 13:
                return c1646s.f35810f;
            case 14:
                return Boolean.valueOf(c1646s.f35808d);
            case 15:
                return c1646s.f35806b;
            case 16:
                return c1646s.f35810f;
            case 17:
                return c1646s.f35806b;
            case 18:
                return Long.valueOf(c1646s.f35807c);
            case 19:
                return c1646s.f35810f;
            case 20:
                return c1646s.f35806b;
            case 21:
                return Long.valueOf(c1646s.f35807c);
            case 22:
                return c1646s.f35810f;
            case 23:
                return c1646s.f35806b;
            default:
                int i7 = CashierPaymentMethodAdapter$CashierAddPaymentMethodItem.f27310g;
                return new ViewOnClickListenerC1533v(c1646s, 29);
        }
    }
}
