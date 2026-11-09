package P3;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.flexibank.sdk.cashier.bean.FlexiBankCalcOfPaymentMethodResultBean;
import com.flexibank.sdk.cashier.bean.FlexiBankCalcPaymentFeeInfoBean;
import com.flexibank.sdk.cashier.bean.FlexiBankCashierPaymentMethodBean;
import com.flexibank.sdk.cashier.ui.view.FlexiBankModelPaymentPromotionItem;
import com.flexibank.sdk.cashier.viewmodel.FlexiBankCoreCashierViewModel;
import com.flexibank.sdk.r;
import com.transsnet.palmpay.util.ToastUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements FlexiBankModelPaymentPromotionItem.OnPromotionItemListener, OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.flexibank.sdk.cashier.ui.activity.a f6897a;

    public /* synthetic */ i(com.flexibank.sdk.cashier.ui.activity.a aVar) {
        this.f6897a = aVar;
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(M1.j adapter, View view, int i7) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(view, "view");
        Object item = adapter.getItem(i7);
        Intrinsics.f(item, "null cannot be cast to non-null type com.flexibank.sdk.cashier.bean.FlexiBankCashierPaymentMethodBean");
        FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean = (FlexiBankCashierPaymentMethodBean) item;
        long availableBalance = flexiBankCashierPaymentMethodBean.getAvailableBalance();
        com.flexibank.sdk.cashier.ui.activity.a aVar = this.f6897a;
        if (availableBalance >= aVar.f6882M || !flexiBankCashierPaymentMethodBean.x()) {
            aVar.r(flexiBankCashierPaymentMethodBean);
        }
    }

    @Override // com.flexibank.sdk.cashier.ui.view.FlexiBankModelPaymentPromotionItem.OnPromotionItemListener
    public void onPromotionItemClick() {
        Long fee;
        Long vat;
        com.flexibank.sdk.cashier.ui.activity.a aVar = this.f6897a;
        FlexiBankCalcOfPaymentMethodResultBean flexiBankCalcOfPaymentMethodResultBean = aVar.f21989s0;
        if (flexiBankCalcOfPaymentMethodResultBean != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime - D3.a.f1586b < 500) {
                return;
            }
            D3.a.f1586b = jElapsedRealtime;
            if (aVar.f21991u0 == null) {
                ToastUtils.showLong(r.fb_msg_select_payment_method);
                return;
            }
            O3.c req = new O3.c();
            req.c(Long.valueOf(aVar.f6880H));
            req.f(aVar.f6878B);
            FlexiBankCalcPaymentFeeInfoBean feeInfo = flexiBankCalcOfPaymentMethodResultBean.getFeeInfo();
            long jLongValue = 0;
            long jLongValue2 = (feeInfo == null || (vat = feeInfo.getVat()) == null) ? 0L : vat.longValue();
            FlexiBankCalcPaymentFeeInfoBean feeInfo2 = flexiBankCalcOfPaymentMethodResultBean.getFeeInfo();
            if (feeInfo2 != null && (fee = feeInfo2.getFee()) != null) {
                jLongValue = fee.longValue();
            }
            req.b(Long.valueOf(jLongValue2 + jLongValue));
            req.e(aVar.f6879C);
            FlexiBankCashierPaymentMethodBean flexiBankCashierPaymentMethodBean = aVar.f21991u0;
            req.g(flexiBankCashierPaymentMethodBean != null ? Integer.valueOf(flexiBankCashierPaymentMethodBean.getSenderAccountType()).toString() : null);
            req.d(aVar.f6877A);
            if (!TextUtils.isEmpty(aVar.f6881L)) {
                req.a(aVar.f6881L);
            }
            Intrinsics.checkNotNullParameter(req, "req");
            FlexiBankCoreCashierViewModel flexiBankCoreCashierViewModel = (FlexiBankCoreCashierViewModel) aVar.e();
            Intrinsics.checkNotNullParameter(req, "req");
            p118hf.a.A(flexiBankCoreCashierViewModel, new U3.k(req, null), flexiBankCoreCashierViewModel.f22087e);
        }
    }
}
