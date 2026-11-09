package com.transsnet.palmpay.core.ui.activity;

import Pa.n0;
import android.content.Intent;
import android.text.TextUtils;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.launcher.ARouter;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.bean.cashier.CalcOfPaymentMethodResultBean;
import com.transsnet.palmpay.core.bean.cashier.DefaultCalcOfPaymentMethodReq;
import com.transsnet.palmpay.core.bean.payment.PayByOrderReq;
import com.transsnet.palmpay.core.bean.req.PreviewCalcPayInfoReq;
import com.transsnet.palmpay.core.dialog.CashierSelectPayMethodDialog;
import com.transsnet.palmpay.core.dialog.SelectBankDialogV2;
import com.transsnet.palmpay.core.ui.dialog.CashierPaymentFeeDetailDialog;
import com.transsnet.palmpay.core.ui.dialog.CashierPaymentTaxDetailDialog;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.util.ActivityUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u00020\u00062\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/core/ui/activity/BaseCoreCashierPreviewActivity;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "VM", "Landroidx/viewbinding/ViewBinding;", "B", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/core/dialog/CashierSelectPayMethodDialog$CallBack;", "Lcom/transsnet/palmpay/core/dialog/SelectBankDialogV2$CallBack;", "<init>", "()V", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class BaseCoreCashierPreviewActivity<VM extends BaseViewModel, B extends ViewBinding> extends BaseMvvmVBActivity<VM, B> implements CashierSelectPayMethodDialog.CallBack, SelectBankDialogV2.CallBack {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final /* synthetic */ int f27451C = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final p355xf.t f27452A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final p355xf.t f27453B;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f27454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f27455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f27456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f27457g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f27458i;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f27460o;
    public String t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f27462v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p355xf.t f27463w;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f27459j = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f27461p = -1;

    public BaseCoreCashierPreviewActivity() {
        final int i7 = 0;
        this.f27463w = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseCoreCashierPreviewActivity f27775b;

            {
                this.f27775b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BaseCoreCashierPreviewActivity baseCoreCashierPreviewActivity = this.f27775b;
                switch (i7) {
                    case 0:
                        int i10 = BaseCoreCashierPreviewActivity.f27451C;
                        if (!ActivityUtils.isValidActivityContext(baseCoreCashierPreviewActivity)) {
                            return null;
                        }
                        SelectBankDialogV2 selectBankDialogV2 = new SelectBankDialogV2(baseCoreCashierPreviewActivity);
                        selectBankDialogV2.setCallBack(baseCoreCashierPreviewActivity);
                        return selectBankDialogV2;
                    case 1:
                        int i11 = BaseCoreCashierPreviewActivity.f27451C;
                        return new CashierPaymentFeeDetailDialog(baseCoreCashierPreviewActivity);
                    default:
                        int i12 = BaseCoreCashierPreviewActivity.f27451C;
                        return new CashierPaymentTaxDetailDialog(baseCoreCashierPreviewActivity);
                }
            }
        });
        final int i10 = 1;
        this.f27452A = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseCoreCashierPreviewActivity f27775b;

            {
                this.f27775b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BaseCoreCashierPreviewActivity baseCoreCashierPreviewActivity = this.f27775b;
                switch (i10) {
                    case 0:
                        int i11 = BaseCoreCashierPreviewActivity.f27451C;
                        if (!ActivityUtils.isValidActivityContext(baseCoreCashierPreviewActivity)) {
                            return null;
                        }
                        SelectBankDialogV2 selectBankDialogV2 = new SelectBankDialogV2(baseCoreCashierPreviewActivity);
                        selectBankDialogV2.setCallBack(baseCoreCashierPreviewActivity);
                        return selectBankDialogV2;
                    case 1:
                        int i12 = BaseCoreCashierPreviewActivity.f27451C;
                        return new CashierPaymentFeeDetailDialog(baseCoreCashierPreviewActivity);
                    default:
                        int i13 = BaseCoreCashierPreviewActivity.f27451C;
                        return new CashierPaymentTaxDetailDialog(baseCoreCashierPreviewActivity);
                }
            }
        });
        final int i11 = 2;
        this.f27453B = C2131j.b(new Function0(this) { // from class: com.transsnet.palmpay.core.ui.activity.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BaseCoreCashierPreviewActivity f27775b;

            {
                this.f27775b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BaseCoreCashierPreviewActivity baseCoreCashierPreviewActivity = this.f27775b;
                switch (i11) {
                    case 0:
                        int i12 = BaseCoreCashierPreviewActivity.f27451C;
                        if (!ActivityUtils.isValidActivityContext(baseCoreCashierPreviewActivity)) {
                            return null;
                        }
                        SelectBankDialogV2 selectBankDialogV2 = new SelectBankDialogV2(baseCoreCashierPreviewActivity);
                        selectBankDialogV2.setCallBack(baseCoreCashierPreviewActivity);
                        return selectBankDialogV2;
                    case 1:
                        int i13 = BaseCoreCashierPreviewActivity.f27451C;
                        return new CashierPaymentFeeDetailDialog(baseCoreCashierPreviewActivity);
                    default:
                        int i14 = BaseCoreCashierPreviewActivity.f27451C;
                        return new CashierPaymentTaxDetailDialog(baseCoreCashierPreviewActivity);
                }
            }
        });
    }

    /* JADX INFO: renamed from: getTransType, reason: from getter */
    public String getF27455e() {
        return this.f27455e;
    }

    public void n(DefaultCalcOfPaymentMethodReq req) {
        Intrinsics.checkNotNullParameter(req, "req");
    }

    public void o(PayByOrderReq params) {
        Intrinsics.checkNotNullParameter(params, "params");
    }

    @Override // com.transsnet.palmpay.core.dialog.CashierSelectPayMethodDialog.CallBack
    public final void onAddNewBankAccountClick() {
        u(2);
        n0 n0VarG = n0.g();
        ClickEvent clickEventAdd = new ClickEvent("UseNewBankClick").afEvt(true).add("module_name", "Cashier");
        String f27455e = getF27455e();
        if (f27455e == null) {
            f27455e = "";
        }
        ClickEvent clickEventAdd2 = clickEventAdd.add("TransType", f27455e);
        String f27456f = getF27456f();
        n0VarG.k(clickEventAdd2.add("SubTransType", f27456f != null ? f27456f : ""));
    }

    @Override // com.transsnet.palmpay.core.dialog.CashierSelectPayMethodDialog.CallBack
    public final void onAddNewBankCardClick() {
        u(1);
        n0 n0VarG = n0.g();
        ClickEvent clickEvent = (ClickEvent) C0.G.f("PalmPayCashierPreview_UseNewCard_Click", "module_name", "Cashier");
        String str = this.f27454d;
        if (str == null) {
            str = "";
        }
        ClickEvent clickEventAdd = clickEvent.add("OrderNo", str);
        String f27455e = getF27455e();
        if (f27455e == null) {
            f27455e = "";
        }
        ClickEvent clickEventAdd2 = clickEventAdd.add("TransType", f27455e);
        String f27456f = getF27456f();
        n0VarG.k(clickEventAdd2.add("SubTransType", f27456f != null ? f27456f : ""));
    }

    @Override // com.transsnet.palmpay.core.dialog.CashierSelectPayMethodDialog.CallBack
    public final void onAddNewBankCardOrBankAccountClick() {
        u(1);
        n0 n0VarG = n0.g();
        ClickEvent clickEvent = (ClickEvent) C0.G.f("PalmPayCashierPreview_UseNewCard_Click", "module_name", "Cashier");
        String str = this.f27454d;
        if (str == null) {
            str = "";
        }
        ClickEvent clickEventAdd = clickEvent.add("OrderNo", str);
        String f27455e = getF27455e();
        if (f27455e == null) {
            f27455e = "";
        }
        ClickEvent clickEventAdd2 = clickEventAdd.add("TransType", f27455e);
        String f27456f = getF27456f();
        n0VarG.k(clickEventAdd2.add("SubTransType", f27456f != null ? f27456f : ""));
    }

    @Override // com.transsnet.palmpay.core.dialog.SelectBankDialogV2.CallBack
    public void onChooseBankClick(BankInfo bankInfo) {
    }

    @Override // com.transsnet.palmpay.core.dialog.SelectBankDialogV2.CallBack
    public final void onClickPayMethod(PaymentMethod paymentMethod) {
    }

    @Override // com.transsnet.palmpay.core.dialog.CashierSelectPayMethodDialog.CallBack
    public final void onUseUSSDClick() {
        SelectBankDialogV2 selectBankDialogV2Q = q();
        if (selectBankDialogV2Q == null || !selectBankDialogV2Q.isShowing()) {
            SelectBankDialogV2 selectBankDialogV2Q2 = q();
            List<BankInfo> bankInfos = selectBankDialogV2Q2 != null ? selectBankDialogV2Q2.getBankInfos() : null;
            if (bankInfos == null || bankInfos.isEmpty()) {
                w(true);
            } else {
                SelectBankDialogV2 selectBankDialogV2Q3 = q();
                if (selectBankDialogV2Q3 != null) {
                    selectBankDialogV2Q3.show();
                }
            }
            n0 n0VarG = n0.g();
            ClickEvent clickEvent = (ClickEvent) C0.G.f("PalmPayCashierPreview_UseUssd_Click", "module_name", "Cashier");
            String str = this.f27454d;
            if (str == null) {
                str = "";
            }
            ClickEvent clickEventAdd = clickEvent.add("OrderNo", str);
            String f27455e = getF27455e();
            if (f27455e == null) {
                f27455e = "";
            }
            ClickEvent clickEventAdd2 = clickEventAdd.add("TransType", f27455e);
            String f27456f = getF27456f();
            n0VarG.k(clickEventAdd2.add("SubTransType", f27456f != null ? f27456f : ""));
        }
    }

    public void p(PreviewCalcPayInfoReq params) {
        Intrinsics.checkNotNullParameter(params, "params");
    }

    public final SelectBankDialogV2 q() {
        return (SelectBankDialogV2) this.f27463w.getValue();
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public String getF27457g() {
        return this.f27457g;
    }

    public abstract String s();

    /* JADX INFO: renamed from: t, reason: from getter */
    public String getF27456f() {
        return this.f27456f;
    }

    public final void u(int i7) {
        ARouter.getInstance().build("/coreImpl/add_new_card").withString("extra_data_1", getLocalClassName()).withInt("extra_type", i7).navigation();
    }

    public void v(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
    }

    public void w(boolean z3) {
    }

    public void x(String code, String message) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        O6.c cVar = new O6.c(this);
        cVar.e(p025ba.k.core_title_error_info);
        cVar.f6598d = message;
        cVar.f6605k = true;
        if ((!TextUtils.isEmpty(code) && kotlin.text.y.m(code, "CFRONT_TCE", false)) || CommonResult.CODE_ACCOUNT_STATE_ERROR.equalsIgnoreCase(code) || CommonResult.CODE_OUT_OF_TRANSACTION_LIMIT_ERROR.equalsIgnoreCase(code)) {
            cVar.d(p025ba.k.core_confirm, new W8.d(28));
        } else {
            cVar.d(p025ba.k.core_confirm, new Yd.i(this, 22));
        }
        O6.d dVarA = cVar.a();
        dVarA.setCancelable(false);
        dVarA.setCanceledOnTouchOutside(false);
        dVarA.show();
    }

    public void y(CalcOfPaymentMethodResultBean bean) {
        Intrinsics.checkNotNullParameter(bean, "bean");
    }
}
