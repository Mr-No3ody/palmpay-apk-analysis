package com.transsnet.palmpay.core.ui.activity;

import Ce.p0;
import Pa.n0;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.api.Service;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.dialog.CashierCouponListDialog;
import com.transsnet.palmpay.core.dialog.CashierPayMethodRetryDialog;
import com.transsnet.palmpay.core.dialog.CashierSelectPayMethodDialog;
import com.transsnet.palmpay.core.ui.mvvm.CoreCashierViewModel;
import com.transsnet.palmpay.core.ui.widget.ModelPaymentManualGetLayout;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.custom_view.model.ModelPaymentEarnLayout;
import com.transsnet.palmpay.r2c.ui.activity.CashierRecharge2CashPreviewActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p052da.C1650w;

/* JADX INFO: renamed from: com.transsnet.palmpay.core.ui.activity.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1488w implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoreCashierPreviewActivity f27815b;

    public /* synthetic */ C1488w(CoreCashierPreviewActivity coreCashierPreviewActivity, int i7) {
        this.f27814a = i7;
        this.f27815b = coreCashierPreviewActivity;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x009b  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z3;
        CoreCashierPreviewActivity listener = this.f27815b;
        switch (this.f27814a) {
            case 0:
                int i7 = CoreCashierPreviewActivity.f27486Y0;
                return (TextView) listener.findViewById(p025ba.e.tv_confirm_to_pay);
            case 1:
                int i10 = CoreCashierPreviewActivity.f27486Y0;
                return (ViewStub) listener.findViewById(p025ba.e.previewEarlyRefundItemStub);
            case 2:
                int i11 = CoreCashierPreviewActivity.f27486Y0;
                return (LinearLayout) listener.findViewById(p025ba.e.ll_payment_info);
            case 3:
                int i12 = CoreCashierPreviewActivity.f27486Y0;
                return (ViewStub) listener.findViewById(p025ba.e.previewTaxesAmountItemStub);
            case 4:
                int i13 = CoreCashierPreviewActivity.f27486Y0;
                return (ViewStub) listener.findViewById(p025ba.e.previewOrderAmountItemStub);
            case 5:
                int i14 = CoreCashierPreviewActivity.f27486Y0;
                return (TextView) listener.findViewById(p025ba.e.tv_save_amount);
            case 6:
                int i15 = CoreCashierPreviewActivity.f27486Y0;
                return (TextView) listener.findViewById(p025ba.e.tv_pay_amount);
            case 7:
                int i16 = CoreCashierPreviewActivity.f27486Y0;
                return (ImageView) listener.findViewById(p025ba.e.iv_close);
            case 8:
                int i17 = CoreCashierPreviewActivity.f27486Y0;
                return listener.findViewById(p025ba.e.layoutPaymentMethodHeader);
            case 9:
                int i18 = CoreCashierPreviewActivity.f27486Y0;
                return (TextView) listener.findViewById(p025ba.e.tvTitle);
            case 10:
                int i19 = CoreCashierPreviewActivity.f27486Y0;
                return (TextView) listener.findViewById(p025ba.e.tv_payment_method);
            case 11:
                int i20 = CoreCashierPreviewActivity.f27486Y0;
                return (LinearLayout) listener.findViewById(p025ba.e.ll_cashier_activate_flexi_pay);
            case 12:
                int i21 = CoreCashierPreviewActivity.f27486Y0;
                return (ViewStub) listener.findViewById(p025ba.e.previewFeeAmountItemStub);
            case 13:
                int i22 = CoreCashierPreviewActivity.f27486Y0;
                C1650w c1650w = new C1650w();
                Intrinsics.checkNotNullParameter(listener, "listener");
                c1650w.f35821c = listener;
                listener.getClass();
                c1650w.f35825g = listener instanceof CashierRecharge2CashPreviewActivity;
                return c1650w;
            case 14:
                int i23 = CoreCashierPreviewActivity.f27486Y0;
                CashierCouponListDialog cashierCouponListDialog = new CashierCouponListDialog(listener);
                cashierCouponListDialog.setCallBack(listener);
                return cashierCouponListDialog;
            case 15:
                int i24 = CoreCashierPreviewActivity.f27486Y0;
                CoreCashierPreviewActivity coreCashierPreviewActivity = this.f27815b;
                CashierSelectPayMethodDialog cashierSelectPayMethodDialog = new CashierSelectPayMethodDialog(coreCashierPreviewActivity, 0, 0, 6, null);
                cashierSelectPayMethodDialog.setCallBack(coreCashierPreviewActivity);
                coreCashierPreviewActivity.getClass();
                cashierSelectPayMethodDialog.setIgnoreBalanceCheck(coreCashierPreviewActivity instanceof CashierRecharge2CashPreviewActivity);
                return cashierSelectPayMethodDialog;
            case 16:
                int i25 = CoreCashierPreviewActivity.f27486Y0;
                CoreCashierPreviewActivity coreCashierPreviewActivity2 = this.f27815b;
                CashierPayMethodRetryDialog cashierPayMethodRetryDialog = new CashierPayMethodRetryDialog(coreCashierPreviewActivity2, 0, 0, 6, null);
                cashierPayMethodRetryDialog.setCallBack(new C(coreCashierPreviewActivity2));
                cashierPayMethodRetryDialog.setOnDismissListener(new p0(7, cashierPayMethodRetryDialog, coreCashierPreviewActivity2));
                cashierPayMethodRetryDialog.setDialogTitle(coreCashierPreviewActivity2.getString(p025ba.k.core_select_payment_method));
                return cashierPayMethodRetryDialog;
            case 17:
                int i26 = CoreCashierPreviewActivity.f27486Y0;
                return (ImageView) listener.findViewById(p025ba.e.iv_flexi_pay_agreement);
            case 18:
                int i27 = CoreCashierPreviewActivity.f27486Y0;
                return (TextView) listener.findViewById(p025ba.e.tv_flexi_pay_agreement);
            case 19:
                int i28 = CoreCashierPreviewActivity.f27486Y0;
                return (PpButton) listener.findViewById(p025ba.e.tv_activate_flexi_pay);
            case 20:
                int i29 = CoreCashierPreviewActivity.f27486Y0;
                return (ModelPaymentManualGetLayout) listener.findViewById(p025ba.e.model_payment_manual_get_layout);
            case 21:
                int i30 = CoreCashierPreviewActivity.f27486Y0;
                return (ModelPaymentEarnLayout) listener.findViewById(p025ba.e.model_payment_earn_layout);
            case 22:
                int i31 = CoreCashierPreviewActivity.f27486Y0;
                return (RecyclerView) listener.findViewById(p025ba.e.ry_payment_method);
            case 23:
                int i32 = CoreCashierPreviewActivity.f27486Y0;
                return (ViewStub) listener.findViewById(p025ba.e.previewPromotionItemStub);
            case 24:
                int i33 = CoreCashierPreviewActivity.f27486Y0;
                return (ViewStub) listener.findViewById(p025ba.e.vs_extra_layout);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                int i34 = CoreCashierPreviewActivity.f27486Y0;
                Ma.p pVar = (Ma.p) ((CoreCashierViewModel) listener.l()).f28063g.f27356m;
                if (pVar != null) {
                    z3 = pVar.f5912b;
                }
                return Boolean.valueOf(z3);
            case 26:
                int i35 = CoreCashierPreviewActivity.f27486Y0;
                n0 n0VarG = n0.g();
                ClickEvent clickEvent = (ClickEvent) C0.G.f("PalmPayCashierPreview_ManualGetReward_Click", "module_name", "Cashier");
                String f27455e = listener.getF27455e();
                if (f27455e == null) {
                    f27455e = "";
                }
                ClickEvent clickEventAdd = clickEvent.add("TransType", f27455e);
                String f27456f = listener.getF27456f();
                n0VarG.k(clickEventAdd.add("SubTransType", f27456f != null ? f27456f : ""));
                return Unit.f38893a;
            case 27:
                int i36 = CoreCashierPreviewActivity.f27486Y0;
                return Long.valueOf(listener.f27461p);
            default:
                int i37 = CoreCashierPreviewActivity.f27486Y0;
                n0 n0VarG2 = n0.g();
                ClickEvent clickEvent2 = (ClickEvent) C0.G.f("PalmPayCashierPreview_EarnNotice_Click", "module_name", "Cashier");
                String str = listener.f27454d;
                if (str == null) {
                    str = "";
                }
                ClickEvent clickEventAdd2 = clickEvent2.add("OrderNo", str);
                String f27455e2 = listener.getF27455e();
                if (f27455e2 == null) {
                    f27455e2 = "";
                }
                ClickEvent clickEventAdd3 = clickEventAdd2.add("TransType", f27455e2);
                String f27456f2 = listener.getF27456f();
                n0VarG2.k(clickEventAdd3.add("SubTransType", f27456f2 != null ? f27456f2 : ""));
                return Unit.f38893a;
        }
    }
}
