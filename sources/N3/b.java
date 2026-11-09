package N3;

import Pa.r0;
import android.view.View;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.flexibank.sdk.cashier.adapter.FlexiBankCashierPaymentMethodAdapter$OnPaymentMethodClickListener;
import com.flexibank.sdk.cashier.bean.FlexiBankCashierPaymentMethodBean;
import com.transsnet.palmpay.core.adapter.CashierPaymentMethodAdapter$OnPaymentMethodClickListener;
import com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean;
import io.fastkv.n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends T1.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function0 f6072f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Function0 f6073g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Function0 f6074i;

    public b(Function0 getSelectPayMethod, Function0 getPayAmount, Function0 getItemClick, int i7) {
        this.f6071e = i7;
        switch (i7) {
            case 1:
                Intrinsics.checkNotNullParameter(getSelectPayMethod, "getSelectPayMethod");
                Intrinsics.checkNotNullParameter(getPayAmount, "getPayAmount");
                Intrinsics.checkNotNullParameter(getItemClick, "getItemClick");
                this.f6072f = getSelectPayMethod;
                this.f6073g = getPayAmount;
                this.f6074i = getItemClick;
                break;
            default:
                Intrinsics.checkNotNullParameter(getSelectPayMethod, "getSelectPayMethod");
                Intrinsics.checkNotNullParameter(getPayAmount, "getPayAmount");
                Intrinsics.checkNotNullParameter(getItemClick, "getItemClick");
                this.f6072f = getSelectPayMethod;
                this.f6073g = getPayAmount;
                this.f6074i = getItemClick;
                break;
        }
    }

    @Override // T1.b
    public final void g(BaseViewHolder helper, View view, Object obj, int i7) {
        FlexiBankCashierPaymentMethodAdapter$OnPaymentMethodClickListener flexiBankCashierPaymentMethodAdapter$OnPaymentMethodClickListener;
        CashierPaymentMethodAdapter$OnPaymentMethodClickListener cashierPaymentMethodAdapter$OnPaymentMethodClickListener;
        switch (this.f6071e) {
            case 0:
                FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean = (FlexiBankCashierPaymentMethodBean) obj;
                Intrinsics.checkNotNullParameter(helper, "helper");
                Intrinsics.checkNotNullParameter(view, "view");
                if ((flexiBankCashierPaymentMethodBean == null || !flexiBankCashierPaymentMethodBean.getExpiryFlag()) && (flexiBankCashierPaymentMethodAdapter$OnPaymentMethodClickListener = (FlexiBankCashierPaymentMethodAdapter$OnPaymentMethodClickListener) this.f6074i.invoke()) != null) {
                    flexiBankCashierPaymentMethodAdapter$OnPaymentMethodClickListener.onPaymentMethodClick(i7, flexiBankCashierPaymentMethodBean);
                }
                break;
            default:
                CashierPaymentMethodBean cashierPaymentMethodBean = (CashierPaymentMethodBean) obj;
                Intrinsics.checkNotNullParameter(helper, "helper");
                Intrinsics.checkNotNullParameter(view, "view");
                if ((cashierPaymentMethodBean == null || !cashierPaymentMethodBean.expiryFlag) && (cashierPaymentMethodAdapter$OnPaymentMethodClickListener = (CashierPaymentMethodAdapter$OnPaymentMethodClickListener) this.f6074i.invoke()) != null) {
                    cashierPaymentMethodAdapter$OnPaymentMethodClickListener.onPaymentMethodClick(i7, cashierPaymentMethodBean);
                }
                break;
        }
    }

    public boolean j(FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean) {
        FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean2 = (FlexiBankCashierPaymentMethodBean) this.f6072f.invoke();
        if (flexiBankCashierPaymentMethodBean2 != null) {
            return n.c(flexiBankCashierPaymentMethodBean2, flexiBankCashierPaymentMethodBean);
        }
        return false;
    }

    public boolean k(CashierPaymentMethodBean cashierPaymentMethodBean) {
        CashierPaymentMethodBean cashierPaymentMethodBean2 = (CashierPaymentMethodBean) this.f6072f.invoke();
        if (cashierPaymentMethodBean2 != null) {
            return r0.l(cashierPaymentMethodBean2, cashierPaymentMethodBean);
        }
        return false;
    }
}
