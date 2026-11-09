package p052da;

import M1.d;
import M1.j;
import Pa.r0;
import Xd.i;
import com.transsnet.palmpay.core.bean.cashier.CashierCombinationPaymentMethodBean;
import com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean;
import com.transsnet.palmpay.core.bean.cashier.FlexiPayGuideBean;
import com.transsnet.palmpay.core.dialog.CashierSelectPayMethodDialog;
import com.transsnet.palmpay.core.viewmodel.CashierPayMethodItem;
import com.transsnet.palmpay.managemoney.ui.view.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p025ba.e;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: renamed from: da.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1650w extends d {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f35819w = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CashierSelectPayMethodDialog.CallBack f35821c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CashierPaymentMethodBean f35823e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f35825g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f35826i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f35827j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public FlexiPayGuideBean f35828o;
    public CashierCombinationPaymentMethodBean t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f35830v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f35820b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f35822d = C2131j.b(new C1647t(this, 0));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Function0 f35824f = new c(3);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f35829p = new ArrayList();

    public C1650w() {
        addChildClickViewIds(e.tv_cashier_item_top_up);
        a(new p067ea.c(new C1648u(this, 0), new C1647t(this, 1), new C1647t(this, 2)));
        a(new i(new C1648u(this, 1), (byte) 0));
        a(new i(new C1648u(this, 2)));
    }

    @Override // M1.d
    public final int c(int i7, List data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return ((CashierPaymentMethodBean) data.get(i7)).itemViewType;
    }

    public final boolean d(CashierPaymentMethodBean cashierPaymentMethodBean) {
        CashierPaymentMethodBean cashierPaymentMethodBean2 = this.f35823e;
        if (cashierPaymentMethodBean2 == null) {
            return false;
        }
        if (cashierPaymentMethodBean instanceof FlexiPayGuideBean) {
            return cashierPaymentMethodBean2 instanceof FlexiPayGuideBean;
        }
        if (cashierPaymentMethodBean2 instanceof FlexiPayGuideBean) {
            return false;
        }
        if (cashierPaymentMethodBean instanceof CashierCombinationPaymentMethodBean) {
            return cashierPaymentMethodBean2 instanceof CashierCombinationPaymentMethodBean;
        }
        if (cashierPaymentMethodBean2 instanceof CashierCombinationPaymentMethodBean) {
            return false;
        }
        return r0.l(cashierPaymentMethodBean2, cashierPaymentMethodBean);
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        if (this.f35830v) {
            CashierCombinationPaymentMethodBean cashierCombinationPaymentMethodBean = this.t;
            if (cashierCombinationPaymentMethodBean != null) {
                arrayList.add(cashierCombinationPaymentMethodBean);
            }
        } else {
            arrayList.addAll(this.f35829p);
        }
        FlexiPayGuideBean flexiPayGuideBean = this.f35828o;
        if (flexiPayGuideBean != null) {
            arrayList.add(flexiPayGuideBean);
        }
        setList(arrayList);
    }

    public final void f() {
        boolean z3 = this.f35827j;
        t tVar = this.f35822d;
        if (z3) {
            if (this.f35826i) {
                return;
            }
            j.addFooterView$default(this, (CashierPayMethodItem) tVar.getValue(), 0, 0, 6, null);
            this.f35826i = true;
            return;
        }
        if (this.f35826i) {
            removeFooterView((CashierPayMethodItem) tVar.getValue());
            this.f35826i = false;
        }
    }
}
