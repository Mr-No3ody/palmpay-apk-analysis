package com.transsnet.palmpay.core.ui.activity;

import Pa.n0;
import Pa.r0;
import android.content.Intent;
import android.view.View;
import com.transsnet.palmpay.core.bean.cashier.FlexiPayGuideBean;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.util.ToastUtils;

/* JADX INFO: renamed from: com.transsnet.palmpay.core.ui.activity.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC1489x implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoreCashierPreviewActivity f27817b;

    public /* synthetic */ ViewOnClickListenerC1489x(CoreCashierPreviewActivity coreCashierPreviewActivity, int i7) {
        this.f27816a = i7;
        this.f27817b = coreCashierPreviewActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CoreCashierPreviewActivity coreCashierPreviewActivity = this.f27817b;
        switch (this.f27816a) {
            case 0:
                int i7 = CoreCashierPreviewActivity.f27486Y0;
                n0 n0VarG = n0.g();
                ClickEvent clickEvent = (ClickEvent) C0.G.f("PalmPayCashierPreview_PaymentList_Click", "module_name", "Cashier");
                String str = coreCashierPreviewActivity.f27454d;
                if (str == null) {
                    str = "";
                }
                ClickEvent clickEventAdd = clickEvent.add("OrderNo", str);
                String f27455e = coreCashierPreviewActivity.getF27455e();
                if (f27455e == null) {
                    f27455e = "";
                }
                ClickEvent clickEventAdd2 = clickEventAdd.add("TransType", f27455e);
                String f27456f = coreCashierPreviewActivity.getF27456f();
                n0VarG.k(clickEventAdd2.add("SubTransType", f27456f != null ? f27456f : ""));
                coreCashierPreviewActivity.i0();
                break;
            case 1:
                int i10 = CoreCashierPreviewActivity.f27486Y0;
                if (!r0.U0()) {
                    n0 n0VarG2 = n0.g();
                    ClickEvent clickEventAdd3 = new ClickEvent("PalmPayCashierPreview_CashierClose_Click").afEvt(true).add("module_name", "Cashier");
                    String str2 = coreCashierPreviewActivity.f27454d;
                    if (str2 == null) {
                        str2 = "";
                    }
                    ClickEvent clickEventAdd4 = clickEventAdd3.add("OrderNo", str2);
                    String f27455e2 = coreCashierPreviewActivity.getF27455e();
                    if (f27455e2 == null) {
                        f27455e2 = "";
                    }
                    ClickEvent clickEventAdd5 = clickEventAdd4.add("TransType", f27455e2);
                    String f27456f2 = coreCashierPreviewActivity.getF27456f();
                    n0VarG2.k(clickEventAdd5.add("SubTransType", f27456f2 != null ? f27456f2 : ""));
                    coreCashierPreviewActivity.G();
                    break;
                }
                break;
            case 2:
                int i11 = CoreCashierPreviewActivity.f27486Y0;
                coreCashierPreviewActivity.J();
                break;
            case 3:
                coreCashierPreviewActivity.f27490D0 = !coreCashierPreviewActivity.f27490D0;
                coreCashierPreviewActivity.n0();
                break;
            case 4:
                int i12 = CoreCashierPreviewActivity.f27486Y0;
                if (!r0.U0()) {
                    if (!(coreCashierPreviewActivity.f27504O0 instanceof FlexiPayGuideBean)) {
                        coreCashierPreviewActivity.g0(false);
                        coreCashierPreviewActivity.H();
                    } else if (!coreCashierPreviewActivity.f27490D0) {
                        ToastUtils.showLong(p025ba.k.core_flexi_pay_agreement);
                    } else {
                        coreCashierPreviewActivity.Y("PalmPayCashierPreview_FlexiPayActive_Click");
                        coreCashierPreviewActivity.getF28604i().f(new Intent(coreCashierPreviewActivity, (Class<?>) FlexiPayOneClickOpenActivity.class), new C1490y(coreCashierPreviewActivity));
                    }
                    break;
                }
                break;
            default:
                int i13 = CoreCashierPreviewActivity.f27486Y0;
                coreCashierPreviewActivity.b0();
                coreCashierPreviewActivity.finish();
                break;
        }
    }
}
