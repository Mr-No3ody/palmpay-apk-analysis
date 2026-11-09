package com.transsnet.palmpay.send_money.ui.activity;

import Ed.ViewOnFocusChangeListenerC0235o;
import Ed.ViewOnTouchListenerC0223c;
import Kd.C0417u;
import Kd.C0420v;
import Kd.C0423w;
import Kd.C0426x;
import Kd.C0429y;
import Kd.C0432z;
import Oc.A;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import R3.e;
import V8.w;
import Wd.C0751z;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.palmpay.lib.ui.edit.AmountEditText;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.transsnet.adsdk.b;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.BalanceAndLimitResp;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CreateBizOrderReq;
import com.transsnet.palmpay.core.bean.CreateBizOrderResp;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.cashier.CoreCashierPaymentExtra;
import com.transsnet.palmpay.core.bean.req.ConfigReq;
import com.transsnet.palmpay.core.bean.req.ParseInstalmentsQrcodeReq;
import com.transsnet.palmpay.core.bean.rsp.ParseInstalmentsQrcodeRsp;
import com.transsnet.palmpay.core.config.c;
import com.transsnet.palmpay.core.dialog.ConfirmLargeAndRecipientInfoDialog;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.send_money.bean.resp.CheckCreateOrderResp;
import com.transsnet.palmpay.send_money.ui.activity.PayShopInputAmountActivity;
import com.transsnet.palmpay.send_money.ui.dialog.ConfirmDuplicateTransferDialog;
import com.transsnet.palmpay.send_money.ui.dialog.ExceedsDailyLimitDialog;
import com.transsnet.palmpay.send_money.viewmodel.PayShopInputAmountViewModel;
import com.transsnet.palmpay.util.ToastUtils;
import io.fastkv.n;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.D;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import p025ba.k;
import p054dd.q;
import p140j8.f;
import p220oa.h;
import p223od.a;
import p270rd.C1966i;
import p270rd.C1969l;
import p270rd.C1973p;
import p270rd.C1974q;
import p270rd.ViewOnClickListenerC1968k;
import p270rd.ViewOnTouchListenerC1971n;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/sm/pay_shop_input_amount")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/send_money/ui/activity/PayShopInputAmountActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/send_money/viewmodel/PayShopInputAmountViewModel;", "Lod/a;", "<init>", "()V", "module_money_transfer_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPayShopInputAmountActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayShopInputAmountActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/PayShopInputAmountActivity\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,697:1\n55#2,12:698\n84#2,3:710\n171#3,12:713\n215#3:725\n115#3,8:726\n145#3:734\n171#3,12:735\n215#3:747\n171#3,12:748\n215#3:760\n1#4:761\n*S KotlinDebug\n*F\n+ 1 PayShopInputAmountActivity.kt\ncom/transsnet/palmpay/send_money/ui/activity/PayShopInputAmountActivity\n*L\n188#1:698,12\n188#1:710,3\n273#1:713,12\n273#1:725\n280#1:726,8\n280#1:734\n287#1:735,12\n287#1:747\n297#1:748,12\n297#1:760\n*E\n"})
public final class PayShopInputAmountActivity extends BaseMvvmVBActivity<PayShopInputAmountViewModel, a> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f33176p = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ParseInstalmentsQrcodeRsp.DataBean f33177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f33178e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public P8.a f33179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ConfirmDuplicateTransferDialog f33180g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f33181i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f33182j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public BalanceAndLimitResp.BalanceAndLimitData f33183o;

    public static final void n(PayShopInputAmountActivity payShopInputAmountActivity) {
        ParseInstalmentsQrcodeRsp.DataBean dataBean = payShopInputAmountActivity.f33177d;
        if (dataBean != null) {
            a aVar = (a) payShopInputAmountActivity.f27334c;
            r0.u1(aVar != null ? aVar.f40292i : null, dataBean.merchantUrl, r.cv_default_merchant_avatar);
            a aVar2 = (a) payShopInputAmountActivity.f27334c;
            if (aVar2 != null) {
                aVar2.f40280C.setText(dataBean.merchantName);
            }
            String str = dataBean.shopName;
            if (str != null) {
                if (TextUtils.isEmpty(str)) {
                    str = null;
                }
                if (str != null) {
                    String strReplace = new Regex("(?i)'s\\s*Shop\\s*$").replace(str, "");
                    a aVar3 = (a) payShopInputAmountActivity.f27334c;
                    if (aVar3 != null) {
                        h.C(aVar3.f40282L);
                    }
                    a aVar4 = (a) payShopInputAmountActivity.f27334c;
                    if (aVar4 != null) {
                        aVar4.f40282L.setText(strReplace);
                    }
                }
            }
            String str2 = (!payShopInputAmountActivity.isDarkMode() || TextUtils.isEmpty(dataBean.darkAccountMark)) ? dataBean.accountMark : dataBean.darkAccountMark;
            if (str2 != null) {
                if (TextUtils.isEmpty(str2)) {
                    str2 = null;
                }
                if (str2 != null) {
                    a aVar5 = (a) payShopInputAmountActivity.f27334c;
                    r0.l1(str2, aVar5 != null ? aVar5.f40293j : null);
                }
            }
            a aVar6 = (a) payShopInputAmountActivity.f27334c;
            if (aVar6 != null) {
                aVar6.f40281H.setText(!TextUtils.isEmpty(dataBean.shopName) ? payShopInputAmountActivity.getString(p159kd.h.sm_merchant_shop_suffix, payShopInputAmountActivity.f33181i) : payShopInputAmountActivity.f33181i);
            }
            if (dataBean.soNoType == 2) {
                a aVar7 = (a) payShopInputAmountActivity.f27334c;
                if (aVar7 != null) {
                    h.C(aVar7.f40291g);
                }
                a aVar8 = (a) payShopInputAmountActivity.f27334c;
                r0.l1(dataBean.pictureUrl, aVar8 != null ? aVar8.f40291g : null);
                a aVar9 = (a) payShopInputAmountActivity.f27334c;
                if (aVar9 != null) {
                    h.l(new ViewOnClickListenerC1968k(dataBean, 0), aVar9.f40291g);
                }
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        a aVarA = a.a(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(aVarA, "inflate(...)");
        return aVarA;
    }

    public final boolean o() {
        String strO;
        CharSequence text;
        Long l5;
        a aVar = (a) this.f27334c;
        if ((aVar != null ? aVar.f40287c.getDoubleAmount() : 0.0d) <= 0.0d) {
            ToastUtils.showShort(getString(p159kd.h.sm_please_enter_the_amount), new Object[0]);
            return false;
        }
        if (this.f33183o == null) {
            return false;
        }
        long jP = p();
        BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData = this.f33183o;
        long jLongValue = 0;
        if (jP < (balanceAndLimitData != null ? balanceAndLimitData.minAmount : 0L)) {
            ToastUtils.showLong(getString(p159kd.h.sm_amount_must_be_above_, r0.B(balanceAndLimitData != null ? balanceAndLimitData.minAmount : 0L, false)), new Object[0]);
            return false;
        }
        long jP2 = p();
        BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData2 = this.f33183o;
        if (jP2 > (balanceAndLimitData2 != null ? balanceAndLimitData2.maxAmount : 0L)) {
            ToastUtils.showLong(getString(p159kd.h.sm_amount_must_be_below_, r0.B(balanceAndLimitData2 != null ? balanceAndLimitData2.maxAmount : 0L, false)), new Object[0]);
            return false;
        }
        String string = null;
        if ((balanceAndLimitData2 != null ? balanceAndLimitData2.reminderAmount : null) != null) {
            long jP3 = p();
            BalanceAndLimitResp.BalanceAndLimitData balanceAndLimitData3 = this.f33183o;
            if (balanceAndLimitData3 != null && (l5 = balanceAndLimitData3.reminderAmount) != null) {
                jLongValue = l5.longValue();
            }
            if (jP3 >= jLongValue) {
                ParseInstalmentsQrcodeRsp.DataBean dataBean = this.f33177d;
                Integer numValueOf = dataBean != null ? Integer.valueOf(dataBean.type) : null;
                if (numValueOf != null && numValueOf.intValue() == 1) {
                    strO = r0.T1(this.f33181i);
                } else {
                    strO = (numValueOf != null && numValueOf.intValue() == 2) ? i0.o(this.f33181i) : this.f33181i;
                }
                String str = strO;
                ConfirmLargeAndRecipientInfoDialog confirmLargeAndRecipientInfoDialog = new ConfirmLargeAndRecipientInfoDialog(this);
                confirmLargeAndRecipientInfoDialog.show();
                String string2 = getString(p159kd.h.sm_palmpay_text);
                a aVar2 = (a) this.f27334c;
                if (aVar2 != null && (text = aVar2.f40280C.getText()) != null) {
                    string = text.toString();
                }
                confirmLargeAndRecipientInfoDialog.updateUi(1, string2, str, string, p(), false);
                confirmLargeAndRecipientInfoDialog.setResultCallback(new C1966i(this));
                confirmLargeAndRecipientInfoDialog.setRecheckCallback(new C1969l(confirmLargeAndRecipientInfoDialog, 0));
                return false;
            }
        }
        return true;
    }

    public final long p() {
        PpAmountEditText ppAmountEditText;
        a aVar = (a) this.f27334c;
        return r0.f((aVar == null || (ppAmountEditText = aVar.f40287c) == null) ? 0.0d : ppAmountEditText.getDoubleAmount());
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        l lVar = ((PayShopInputAmountViewModel) l()).f33986e;
        if (lVar != null) {
            lVar.e(this, new q(new C1973p(this, this, 0), 17));
        }
        l lVar2 = ((PayShopInputAmountViewModel) l()).f33991o;
        if (lVar2 != null) {
            lVar2.e(this, new q(new w(this, 20), 17));
        }
        l lVar3 = ((PayShopInputAmountViewModel) l()).f33989i;
        if (lVar3 != null) {
            lVar3.e(this, new q(new C1973p(this, this, 1), 17));
        }
        l lVar4 = ((PayShopInputAmountViewModel) l()).f33990j;
        if (lVar4 != null) {
            lVar4.e(this, new q(new C1973p(this, this, 2), 17));
        }
        final int i7 = 0;
        n.B(this, ((PayShopInputAmountViewModel) l()).f33988g, this, new Function2(this) { // from class: rd.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopInputAmountActivity f41753b;

            {
                this.f41753b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                PayShopInputAmountActivity payShopInputAmountActivity = this.f41753b;
                CreateBizOrderReq req = (CreateBizOrderReq) obj;
                CommonBeanResult resp = (CommonBeanResult) obj2;
                switch (i7) {
                    case 0:
                        int i10 = PayShopInputAmountActivity.f33176p;
                        Intrinsics.checkNotNullParameter(resp, "resp");
                        if (req != null) {
                            if (!resp.isSuccess()) {
                                h.x(payShopInputAmountActivity, resp.getRespMsg());
                            } else {
                                CheckCreateOrderResp checkCreateOrderResp = (CheckCreateOrderResp) resp.data;
                                if (checkCreateOrderResp != null ? Intrinsics.c(checkCreateOrderResp.getRepeatedTransfer(), Boolean.TRUE) : false) {
                                    if (payShopInputAmountActivity.f33180g == null) {
                                        payShopInputAmountActivity.f33180g = new ConfirmDuplicateTransferDialog(payShopInputAmountActivity, "Transfer_ToPalmPayAmount_DuplicatedTransfers", "_U4");
                                    }
                                    ConfirmDuplicateTransferDialog confirmDuplicateTransferDialog = payShopInputAmountActivity.f33180g;
                                    if (confirmDuplicateTransferDialog != null && !confirmDuplicateTransferDialog.isShowing()) {
                                        confirmDuplicateTransferDialog.show();
                                        confirmDuplicateTransferDialog.setOnContinueClickListener(new b(12, payShopInputAmountActivity, req));
                                    }
                                } else {
                                    PayShopInputAmountViewModel payShopInputAmountViewModel = (PayShopInputAmountViewModel) payShopInputAmountActivity.l();
                                    payShopInputAmountViewModel.getClass();
                                    Intrinsics.checkNotNullParameter(req, "req");
                                    C0420v c0420v = new C0420v(req, null);
                                    l lVar5 = payShopInputAmountViewModel.f33987f;
                                    lVar5.f27356m = req;
                                    Unit unit = Unit.f38893a;
                                    f.v(payShopInputAmountViewModel, c0420v, lVar5, 0L);
                                }
                            }
                        }
                        break;
                    default:
                        int i11 = PayShopInputAmountActivity.f33176p;
                        Intrinsics.checkNotNullParameter(resp, "resp");
                        if (resp.isSuccess()) {
                            CreateBizOrderResp createBizOrderResp = (CreateBizOrderResp) resp.data;
                            if (createBizOrderResp != null) {
                                if (Intrinsics.c(createBizOrderResp.amountLimitPopUp, Boolean.TRUE)) {
                                    ExceedsDailyLimitDialog exceedsDailyLimitDialog = new ExceedsDailyLimitDialog(payShopInputAmountActivity);
                                    exceedsDailyLimitDialog.show();
                                    exceedsDailyLimitDialog.setData(createBizOrderResp);
                                } else {
                                    c.f27371a.getInstance().getClass();
                                    Intrinsics.checkNotNullParameter(TransType.TRANS_TYPE_PAY_SHOP, "type");
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(new CoreCashierPaymentExtra(payShopInputAmountActivity.getString(k.core_account_number), i0.o(createBizOrderResp.accountNo)));
                                    if (!TextUtils.isEmpty(createBizOrderResp.payeeMerchantName)) {
                                        String string = payShopInputAmountActivity.getString(k.core_name);
                                        String str = createBizOrderResp.payeeMerchantName;
                                        if (str == null) {
                                            str = "";
                                        }
                                        arrayList.add(new CoreCashierPaymentExtra(string, str));
                                    }
                                    arrayList.add(new CoreCashierPaymentExtra(payShopInputAmountActivity.getString(k.core_bank), payShopInputAmountActivity.getString(p159kd.h.sm_palmpay_text)));
                                    C0751z c0751z = new C0751z(payShopInputAmountActivity, 9);
                                    c0751z.f4971b = createBizOrderResp.orderNo;
                                    c0751z.c(createBizOrderResp.amount);
                                    c0751z.f4978i = createBizOrderResp.calculationExtInfo;
                                    c0751z.f4972c = TransType.TRANS_TYPE_PAY_SHOP;
                                    c0751z.f4974e = "68";
                                    c0751z.f4976g = createBizOrderResp.payeeAccountType;
                                    c0751z.b(arrayList);
                                    c0751z.d();
                                }
                            }
                        } else {
                            h.x(payShopInputAmountActivity, resp.getRespMsg());
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new D(11), false, null, 240);
        final int i10 = 1;
        n.B(this, ((PayShopInputAmountViewModel) l()).f33987f, this, new Function2(this) { // from class: rd.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PayShopInputAmountActivity f41753b;

            {
                this.f41753b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                PayShopInputAmountActivity payShopInputAmountActivity = this.f41753b;
                CreateBizOrderReq req = (CreateBizOrderReq) obj;
                CommonBeanResult resp = (CommonBeanResult) obj2;
                switch (i10) {
                    case 0:
                        int i11 = PayShopInputAmountActivity.f33176p;
                        Intrinsics.checkNotNullParameter(resp, "resp");
                        if (req != null) {
                            if (!resp.isSuccess()) {
                                h.x(payShopInputAmountActivity, resp.getRespMsg());
                            } else {
                                CheckCreateOrderResp checkCreateOrderResp = (CheckCreateOrderResp) resp.data;
                                if (checkCreateOrderResp != null ? Intrinsics.c(checkCreateOrderResp.getRepeatedTransfer(), Boolean.TRUE) : false) {
                                    if (payShopInputAmountActivity.f33180g == null) {
                                        payShopInputAmountActivity.f33180g = new ConfirmDuplicateTransferDialog(payShopInputAmountActivity, "Transfer_ToPalmPayAmount_DuplicatedTransfers", "_U4");
                                    }
                                    ConfirmDuplicateTransferDialog confirmDuplicateTransferDialog = payShopInputAmountActivity.f33180g;
                                    if (confirmDuplicateTransferDialog != null && !confirmDuplicateTransferDialog.isShowing()) {
                                        confirmDuplicateTransferDialog.show();
                                        confirmDuplicateTransferDialog.setOnContinueClickListener(new b(12, payShopInputAmountActivity, req));
                                    }
                                } else {
                                    PayShopInputAmountViewModel payShopInputAmountViewModel = (PayShopInputAmountViewModel) payShopInputAmountActivity.l();
                                    payShopInputAmountViewModel.getClass();
                                    Intrinsics.checkNotNullParameter(req, "req");
                                    C0420v c0420v = new C0420v(req, null);
                                    l lVar5 = payShopInputAmountViewModel.f33987f;
                                    lVar5.f27356m = req;
                                    Unit unit = Unit.f38893a;
                                    f.v(payShopInputAmountViewModel, c0420v, lVar5, 0L);
                                }
                            }
                        }
                        break;
                    default:
                        int i12 = PayShopInputAmountActivity.f33176p;
                        Intrinsics.checkNotNullParameter(resp, "resp");
                        if (resp.isSuccess()) {
                            CreateBizOrderResp createBizOrderResp = (CreateBizOrderResp) resp.data;
                            if (createBizOrderResp != null) {
                                if (Intrinsics.c(createBizOrderResp.amountLimitPopUp, Boolean.TRUE)) {
                                    ExceedsDailyLimitDialog exceedsDailyLimitDialog = new ExceedsDailyLimitDialog(payShopInputAmountActivity);
                                    exceedsDailyLimitDialog.show();
                                    exceedsDailyLimitDialog.setData(createBizOrderResp);
                                } else {
                                    c.f27371a.getInstance().getClass();
                                    Intrinsics.checkNotNullParameter(TransType.TRANS_TYPE_PAY_SHOP, "type");
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.add(new CoreCashierPaymentExtra(payShopInputAmountActivity.getString(k.core_account_number), i0.o(createBizOrderResp.accountNo)));
                                    if (!TextUtils.isEmpty(createBizOrderResp.payeeMerchantName)) {
                                        String string = payShopInputAmountActivity.getString(k.core_name);
                                        String str = createBizOrderResp.payeeMerchantName;
                                        if (str == null) {
                                            str = "";
                                        }
                                        arrayList.add(new CoreCashierPaymentExtra(string, str));
                                    }
                                    arrayList.add(new CoreCashierPaymentExtra(payShopInputAmountActivity.getString(k.core_bank), payShopInputAmountActivity.getString(p159kd.h.sm_palmpay_text)));
                                    C0751z c0751z = new C0751z(payShopInputAmountActivity, 9);
                                    c0751z.f4971b = createBizOrderResp.orderNo;
                                    c0751z.c(createBizOrderResp.amount);
                                    c0751z.f4978i = createBizOrderResp.calculationExtInfo;
                                    c0751z.f4972c = TransType.TRANS_TYPE_PAY_SHOP;
                                    c0751z.f4974e = "68";
                                    c0751z.f4976g = createBizOrderResp.payeeAccountType;
                                    c0751z.b(arrayList);
                                    c0751z.d();
                                }
                            }
                        } else {
                            h.x(payShopInputAmountActivity, resp.getRespMsg());
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new D(12), false, null, 240);
        if (TextUtils.equals(this.f33182j, "PAYSHOP")) {
            PayShopInputAmountViewModel payShopInputAmountViewModel = (PayShopInputAmountViewModel) l();
            ParseInstalmentsQrcodeReq req = new ParseInstalmentsQrcodeReq("", this.f33181i);
            payShopInputAmountViewModel.getClass();
            Intrinsics.checkNotNullParameter(req, "req");
            f.s(payShopInputAmountViewModel, new C0432z(req, null), payShopInputAmountViewModel.f33989i, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        } else {
            PayShopInputAmountViewModel payShopInputAmountViewModel2 = (PayShopInputAmountViewModel) l();
            String str = this.f33181i;
            payShopInputAmountViewModel2.getClass();
            f.s(payShopInputAmountViewModel2, new C0429y(str, null), payShopInputAmountViewModel2.f33990j, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
        ConfigReq req2 = new ConfigReq();
        req2.setPayeeAccountType(4);
        PayShopInputAmountViewModel payShopInputAmountViewModel3 = (PayShopInputAmountViewModel) l();
        payShopInputAmountViewModel3.getClass();
        Intrinsics.checkNotNullParameter(req2, "req");
        f.s(payShopInputAmountViewModel3, new C0426x(req2, null), payShopInputAmountViewModel3.f33986e, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        PayShopInputAmountViewModel payShopInputAmountViewModel4 = (PayShopInputAmountViewModel) l();
        payShopInputAmountViewModel4.getClass();
        f.s(payShopInputAmountViewModel4, new C0423w(1, null), payShopInputAmountViewModel4.f33991o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    public final void q() {
        int i7;
        Editable text;
        String string;
        a aVar = (a) this.f27334c;
        if ((aVar != null ? aVar.f40287c.getDoubleAmount() : 0.0d) <= 0.0d) {
            ToastUtils.showShort(getString(p159kd.h.sm_please_enter_the_amount), new Object[0]);
            return;
        }
        String str = this.f33182j;
        if (str != null) {
            switch (str) {
                case "WITHDRAW":
                    i7 = 2;
                    break;
                case "PAYSHOP":
                    i7 = 1;
                    break;
                case "SCAN":
                    i7 = 7;
                    break;
                case "DEEPLINK":
                    i7 = 8;
                    break;
                default:
                    i7 = 3;
                    break;
            }
        } else {
            i7 = 3;
        }
        Integer numValueOf = Integer.valueOf(i7);
        String str2 = this.f33181i;
        Long lValueOf = Long.valueOf(p());
        a aVar2 = (a) this.f27334c;
        String string2 = (aVar2 == null || (text = aVar2.f40289e.getText()) == null || (string = text.toString()) == null) ? null : StringsKt.V(string).toString();
        if (string2 == null) {
            string2 = "";
        }
        CreateBizOrderReq req = new CreateBizOrderReq(TransType.TRANS_TYPE_PAY_SHOP, numValueOf, str2, lValueOf, string2);
        PayShopInputAmountViewModel payShopInputAmountViewModel = (PayShopInputAmountViewModel) l();
        payShopInputAmountViewModel.getClass();
        Intrinsics.checkNotNullParameter(req, "req");
        C0417u c0417u = new C0417u(req, null);
        l lVar = payShopInputAmountViewModel.f33988g;
        lVar.f27356m = req;
        Unit unit = Unit.f38893a;
        f.v(payShopInputAmountViewModel, c0417u, lVar, 0L);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        TextView textView;
        final int i7 = 1;
        final int i10 = 0;
        super.setupView();
        ARouter.getInstance().inject(this);
        initStatusBar(CommonViewExtKt.colorInt(L6.b.ppColorBackgroundDark, this));
        a aVar = (a) this.f27334c;
        AmountEditText amountEditText = aVar != null ? (AmountEditText) aVar.f40287c.findViewById(L6.f.edit_amount) : null;
        if (amountEditText != null) {
            amountEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(13)});
        }
        if (amountEditText != null) {
            amountEditText.setShowSoftInputOnFocus(false);
        }
        a aVar2 = (a) this.f27334c;
        if (aVar2 != null) {
            aVar2.f40287c.setOnErrorVisibilityChangeListener(new C1966i(this));
        }
        a aVar3 = (a) this.f27334c;
        if (aVar3 != null) {
            aVar3.f40287c.setTextInputListener(new C1966i(this));
        }
        a aVar4 = (a) this.f27334c;
        if (aVar4 != null) {
            RecyclerView recyclerView = aVar4.f40296v;
            recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
            if (recyclerView.getItemDecorationCount() == 0) {
                recyclerView.addItemDecoration(new Qb.b(3, CommonViewExtKt.getDp(8), 0));
            }
        }
        P8.a aVar5 = new P8.a(5);
        this.f33179f = aVar5;
        a aVar6 = (a) this.f27334c;
        if (aVar6 != null) {
            aVar6.f40296v.setAdapter(aVar5);
        }
        P8.a aVar7 = this.f33179f;
        if (aVar7 != null) {
            aVar7.setOnItemClickListener(new C1966i(this));
        }
        B8.b bVar = new B8.b(4);
        a aVar8 = (a) this.f27334c;
        if (aVar8 != null) {
            aVar8.f40289e.setFilters(new InputFilter[]{bVar});
        }
        a aVar9 = (a) this.f27334c;
        if (aVar9 != null) {
            aVar9.f40290f.setOnClickListener(new View.OnClickListener(this) { // from class: rd.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PayShopInputAmountActivity f41759b;

                {
                    this.f41759b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EditText editText;
                    PayShopInputAmountActivity payShopInputAmountActivity = this.f41759b;
                    switch (i10) {
                        case 0:
                            int i11 = PayShopInputAmountActivity.f33176p;
                            a aVar10 = (a) payShopInputAmountActivity.f27334c;
                            if (aVar10 != null && (editText = aVar10.f40289e) != null) {
                                editText.setText("");
                                break;
                            }
                            break;
                        default:
                            int i12 = PayShopInputAmountActivity.f33176p;
                            if (payShopInputAmountActivity.o()) {
                                payShopInputAmountActivity.q();
                            }
                            break;
                    }
                }
            });
        }
        a aVar10 = (a) this.f27334c;
        if (aVar10 != null) {
            aVar10.f40289e.setHint(p159kd.h.sm_transfer_note_hint);
        }
        a aVar11 = (a) this.f27334c;
        if (aVar11 != null) {
            aVar11.f40289e.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0235o(this, 19));
        }
        a aVar12 = (a) this.f27334c;
        if (aVar12 != null) {
            aVar12.f40289e.addTextChangedListener(new e(this, 17));
        }
        a aVar13 = (a) this.f27334c;
        if (aVar13 != null) {
            aVar13.f40289e.setOnEditorActionListener(new A(this, 4));
        }
        a aVar14 = (a) this.f27334c;
        if (aVar14 != null) {
            aVar14.f40289e.setOnTouchListener(new ViewOnTouchListenerC0223c(this, 10));
        }
        a aVar15 = (a) this.f27334c;
        if (aVar15 != null && (textView = (TextView) aVar15.f40287c.findViewById(L6.f.tv_error)) != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        a aVar16 = (a) this.f27334c;
        if (aVar16 != null) {
            aVar16.f40278A.setOnClickListener(new View.OnClickListener(this) { // from class: rd.m

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ PayShopInputAmountActivity f41759b;

                {
                    this.f41759b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    EditText editText;
                    PayShopInputAmountActivity payShopInputAmountActivity = this.f41759b;
                    switch (i7) {
                        case 0:
                            int i11 = PayShopInputAmountActivity.f33176p;
                            a aVar17 = (a) payShopInputAmountActivity.f27334c;
                            if (aVar17 != null && (editText = aVar17.f40289e) != null) {
                                editText.setText("");
                                break;
                            }
                            break;
                        default:
                            int i12 = PayShopInputAmountActivity.f33176p;
                            if (payShopInputAmountActivity.o()) {
                                payShopInputAmountActivity.q();
                            }
                            break;
                    }
                }
            });
        }
        a aVar17 = (a) this.f27334c;
        if (aVar17 != null) {
            aVar17.f40295p.setActionButtonEnable(false);
        }
        a aVar18 = (a) this.f27334c;
        if (aVar18 != null) {
            aVar18.f40295p.setDigitalKeyboardClickListener(new C1974q(amountEditText, this));
        }
        if (amountEditText != null) {
            amountEditText.setOnTouchListener(new ViewOnTouchListenerC1971n(this, amountEditText, i10));
        }
        n0.g().l("Transfer_Merchant_View_U4");
    }
}
