package com.transsnet.palmpay.core.ui.activity;

import Bc.C0107d;
import N8.q0;
import Pa.C0525w;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Wf.AbstractC0780y;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.imageutils.JfifUtil;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.BankInfo;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.PaymentMethod;
import com.transsnet.palmpay.core.bean.cashier.CalcOfCombinationInfoBean;
import com.transsnet.palmpay.core.bean.cashier.CalcOfPaymentMethodResultBean;
import com.transsnet.palmpay.core.bean.cashier.CalcPaymentEarnInfoBean;
import com.transsnet.palmpay.core.bean.cashier.CalcPaymentEarnItem;
import com.transsnet.palmpay.core.bean.cashier.CalcPaymentFeeInfoBean;
import com.transsnet.palmpay.core.bean.cashier.CalcPaymentPromotionBean;
import com.transsnet.palmpay.core.bean.cashier.CalcPaymentPromotionItemBean;
import com.transsnet.palmpay.core.bean.cashier.CashierAddablePaymentMethodsBean;
import com.transsnet.palmpay.core.bean.cashier.CashierCombinationPaymentMethodBean;
import com.transsnet.palmpay.core.bean.cashier.CashierCouponItem;
import com.transsnet.palmpay.core.bean.cashier.CashierFlexiPreCreditInfoBean;
import com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean;
import com.transsnet.palmpay.core.bean.cashier.CashierTaxDetailBean;
import com.transsnet.palmpay.core.bean.cashier.CoreCashierPaymentExtra;
import com.transsnet.palmpay.core.bean.cashier.DefaultCalcOfPaymentMethodReq;
import com.transsnet.palmpay.core.bean.cashier.DefaultCalcOfPaymentMethodResp;
import com.transsnet.palmpay.core.bean.cashier.FeeTips;
import com.transsnet.palmpay.core.bean.cashier.FlexiPayGuideBean;
import com.transsnet.palmpay.core.bean.cashier.PaymentFeeDetailBean;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.payment.CashierManualGet;
import com.transsnet.palmpay.core.bean.payment.CashierManualGetRewardItem;
import com.transsnet.palmpay.core.bean.payment.CheckPayReq;
import com.transsnet.palmpay.core.bean.payment.PayByOrderReq;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.bean.req.PreviewCalcPayInfoReq;
import com.transsnet.palmpay.core.bean.req.QueryBankListReq;
import com.transsnet.palmpay.core.bean.req.USSDFundResultReq;
import com.transsnet.palmpay.core.dialog.CashierCouponListDialog;
import com.transsnet.palmpay.core.dialog.CashierPayMethodRetryDialog;
import com.transsnet.palmpay.core.dialog.CashierSelectPayMethodDialog;
import com.transsnet.palmpay.core.dialog.SelectBankDialogV2;
import com.transsnet.palmpay.core.ui.mvvm.CoreCashierViewModel;
import com.transsnet.palmpay.core.ui.widget.AmountUnitLayout;
import com.transsnet.palmpay.core.ui.widget.ModelPaymentManualGetLayout;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.custom_view.C1548f;
import com.transsnet.palmpay.custom_view.model.ModelDiscountPromotionItem;
import com.transsnet.palmpay.custom_view.model.ModelPaymentEarnLayout;
import com.transsnet.palmpay.custom_view.model.ModelPaymentInfoItem;
import com.transsnet.palmpay.custom_view.model.ModelPaymentPromotionItem;
import com.transsnet.palmpay.custom_view.model.ModelPaymentPromotionLayout;
import com.transsnet.palmpay.custom_view.model.ModelPointPromotionItem;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.r2c.ui.activity.CashierRecharge2CashPreviewActivity;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import p052da.C1650w;
import p355xf.C2131j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\fB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/core/ui/activity/CoreCashierPreviewActivity;", "Lcom/transsnet/palmpay/core/ui/activity/BaseCoreCashierPreviewActivity;", "Lcom/transsnet/palmpay/core/ui/mvvm/CoreCashierViewModel;", "LBc/d;", "Lcom/transsnet/palmpay/core/dialog/CashierCouponListDialog$CallBack;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCoreCashierPreviewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreCashierPreviewActivity.kt\ncom/transsnet/palmpay/core/ui/activity/CoreCashierPreviewActivity\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2715:1\n562#2,10:2716\n574#2,4:2726\n1#3:2730\n260#4,10:2731\n296#4:2741\n260#4,10:2742\n296#4:2752\n260#4,10:2753\n296#4:2763\n295#5,2:2764\n774#5:2766\n865#5,2:2767\n295#5,2:2769\n1869#5,2:2771\n*S KotlinDebug\n*F\n+ 1 CoreCashierPreviewActivity.kt\ncom/transsnet/palmpay/core/ui/activity/CoreCashierPreviewActivity\n*L\n334#1:2716,10\n340#1:2726,4\n1306#1:2731,10\n1306#1:2741\n1332#1:2742,10\n1332#1:2752\n1381#1:2753,10\n1381#1:2763\n1735#1:2764,2\n1850#1:2766\n1850#1:2767,2\n1865#1:2769,2\n2120#1:2771,2\n*E\n"})
public abstract class CoreCashierPreviewActivity extends BaseCoreCashierPreviewActivity<CoreCashierViewModel, C0107d> implements CashierCouponListDialog.CallBack {

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public static final /* synthetic */ int f27486Y0 = 0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public FlexiPayGuideBean f27489C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public boolean f27490D0;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public String f27491E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public boolean f27492F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public CashierFlexiPreCreditInfoBean f27493G0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public CashierCombinationPaymentMethodBean f27497J0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public CalcOfPaymentMethodResultBean f27502M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public CashierCouponItem f27503N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public CashierPaymentMethodBean f27504O0;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public ArrayList f27505P0;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public ModelPaymentInfoItem f27507Q0;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public ModelPaymentInfoItem f27508R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public ModelPaymentInfoItem f27509S0;
    public ViewGroup T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public ModelPaymentPromotionLayout f27510U0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final p355xf.t f27494H = C2131j.b(new C1488w(this, 0));

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final p355xf.t f27499L = C2131j.b(new C1488w(this, 11));

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final p355xf.t f27501M = C2131j.b(new C1488w(this, 17));

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final p355xf.t f27506Q = C2131j.b(new C1488w(this, 18));

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final p355xf.t f27513X = C2131j.b(new C1488w(this, 19));

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final p355xf.t f27515Y = C2131j.b(new C1488w(this, 20));

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final p355xf.t f27516Z = C2131j.b(new C1488w(this, 21));

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final p355xf.t f27517k0 = C2131j.b(new C1488w(this, 22));

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final p355xf.t f27518p0 = C2131j.b(new C1488w(this, 23));

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final p355xf.t f27519q0 = C2131j.b(new C1488w(this, 24));

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final p355xf.t f27520r0 = C2131j.b(new C1488w(this, 1));

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final p355xf.t f27521s0 = C2131j.b(new C1488w(this, 2));

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final p355xf.t f27522t0 = C2131j.b(new C1488w(this, 3));

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final p355xf.t f27523u0 = C2131j.b(new C1488w(this, 4));

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final p355xf.t f27524v0 = C2131j.b(new C1488w(this, 5));

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final p355xf.t f27525w0 = C2131j.b(new C1488w(this, 6));

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final p355xf.t f27526x0 = C2131j.b(new C1488w(this, 7));

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final p355xf.t f27527y0 = C2131j.b(new C1488w(this, 8));

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final p355xf.t f27528z0 = C2131j.b(new C1488w(this, 9));

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final p355xf.t f27487A0 = C2131j.b(new C1488w(this, 10));

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final p355xf.t f27488B0 = C2131j.b(new C1488w(this, 12));

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public final ArrayList f27495H0 = new ArrayList();

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public final ArrayList f27496I0 = new ArrayList();

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final p355xf.t f27498K0 = C2131j.b(new C1488w(this, 13));

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public final ArrayList f27500L0 = new ArrayList();

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public final p355xf.t f27511V0 = C2131j.b(new C1488w(this, 14));

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public final p355xf.t f27512W0 = C2131j.b(new C1488w(this, 15));

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public final p355xf.t f27514X0 = C2131j.b(new C1488w(this, 16));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public static final void A(CoreCashierPreviewActivity coreCashierPreviewActivity) {
        int iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorTextNormal, coreCashierPreviewActivity);
        int iColorInt2 = CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, coreCashierPreviewActivity);
        TextView textView = (TextView) coreCashierPreviewActivity.f27506Q.getValue();
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setHighlightColor(0);
            textView.setText(new SpanUtils().append(coreCashierPreviewActivity.getString(p025ba.k.core_flexi_pay_agreement_prefix)).setForegroundColor(iColorInt).append(coreCashierPreviewActivity.getString(p025ba.k.core_flexi_pay_terms)).setClickSpan(new Dd.d(iColorInt2, 13)).append(coreCashierPreviewActivity.getString(p025ba.k.core_flexi_pay_agreement_register)).setForegroundColor(iColorInt).append(coreCashierPreviewActivity.getString(p025ba.k.core_flexi_mfb)).setClickSpan(new Dd.d(iColorInt2, 14)).append(coreCashierPreviewActivity.getString(p025ba.k.core_flexi_pay_agreement_suffix)).setForegroundColor(iColorInt).create());
        }
    }

    public static final void B(CoreCashierPreviewActivity coreCashierPreviewActivity, String str) {
        O6.c cVar = new O6.c(coreCashierPreviewActivity);
        cVar.e(p025ba.k.core_title_error_info);
        if (str == null) {
            str = coreCashierPreviewActivity.getString(p025ba.k.core_fail_to_pay_order);
            Intrinsics.checkNotNullExpressionValue(str, "getString(...)");
        }
        cVar.f6598d = str;
        cVar.d(p025ba.k.core_confirm, null);
        cVar.g();
    }

    public static /* synthetic */ void a0(CoreCashierPreviewActivity coreCashierPreviewActivity, CashierPaymentMethodBean cashierPaymentMethodBean, Function2 function2, int i7) {
        Boolean bool = Boolean.TRUE;
        if ((i7 & 4) != 0) {
            function2 = null;
        }
        coreCashierPreviewActivity.Z(cashierPaymentMethodBean, bool, function2);
    }

    public static final void z(CoreCashierPreviewActivity coreCashierPreviewActivity) {
        View viewFindViewById;
        View viewFindViewById2;
        ViewOnClickListenerC1489x viewOnClickListenerC1489x = new ViewOnClickListenerC1489x(coreCashierPreviewActivity, 0);
        p355xf.t tVar = coreCashierPreviewActivity.f27527y0;
        View view = (View) tVar.getValue();
        if (view != null && (viewFindViewById2 = view.findViewById(p025ba.e.iv_payment_method_arrow)) != null) {
            viewFindViewById2.setOnClickListener(viewOnClickListenerC1489x);
        }
        View view2 = (View) tVar.getValue();
        if (view2 != null && (viewFindViewById = view2.findViewById(p025ba.e.tv_payment_method_all)) != null) {
            viewFindViewById.setOnClickListener(viewOnClickListenerC1489x);
        }
        ImageView imageView = (ImageView) coreCashierPreviewActivity.f27526x0.getValue();
        if (imageView != null) {
            imageView.setOnClickListener(new ViewOnClickListenerC1489x(coreCashierPreviewActivity, 1));
        }
        TextView textView = (TextView) coreCashierPreviewActivity.f27494H.getValue();
        if (textView != null) {
            textView.setOnClickListener(new ViewOnClickListenerC1489x(coreCashierPreviewActivity, 2));
        }
        ImageView imageView2 = (ImageView) coreCashierPreviewActivity.f27501M.getValue();
        if (imageView2 != null) {
            imageView2.setOnClickListener(new ViewOnClickListenerC1489x(coreCashierPreviewActivity, 3));
        }
        PpButton ppButton = (PpButton) coreCashierPreviewActivity.f27513X.getValue();
        if (ppButton != null) {
            ppButton.setOnClickListener(new ViewOnClickListenerC1489x(coreCashierPreviewActivity, 4));
        }
    }

    public final void C(CashierPaymentMethodBean paymentMethod) {
        Object next;
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        ArrayList arrayList = this.f27500L0;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!r0.l(paymentMethod, (CashierPaymentMethodBean) next));
        if (((CashierPaymentMethodBean) next) != null) {
            return;
        }
        CashierPaymentMethodBean cashierPaymentMethodBean = (CashierPaymentMethodBean) CollectionsKt.G(0, arrayList);
        if (cashierPaymentMethodBean == null) {
            arrayList.add(0, paymentMethod);
        } else if (cashierPaymentMethodBean.senderAccountType == 1) {
            arrayList.add(1, paymentMethod);
        } else {
            arrayList.add(0, paymentMethod);
        }
    }

    public final PreviewCalcPayInfoReq D(CashierPaymentMethodBean cashierPaymentMethodBean) {
        String string;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        if (cashierPaymentMethodBean == null || (string = Integer.valueOf(cashierPaymentMethodBean.senderAccountType).toString()) == null) {
            string = "1";
        }
        PreviewCalcPayInfoReq previewCalcPayInfoReq = new PreviewCalcPayInfoReq();
        previewCalcPayInfoReq.orderAmount = Long.valueOf(this.f27458i);
        ModelPaymentPromotionLayout modelPaymentPromotionLayout = this.f27510U0;
        if (modelPaymentPromotionLayout == null || (bool = modelPaymentPromotionLayout.isUsedPoint) == null) {
            bool = Boolean.FALSE;
        }
        previewCalcPayInfoReq.isRedeemPoint = bool;
        if (modelPaymentPromotionLayout == null || (bool2 = modelPaymentPromotionLayout.isUsedDiscount) == null) {
            bool2 = Boolean.FALSE;
        }
        previewCalcPayInfoReq.useDiscount = bool2;
        previewCalcPayInfoReq.payerAccountType = string;
        previewCalcPayInfoReq.payeeAccountType = s();
        previewCalcPayInfoReq.orderNo = this.f27454d;
        previewCalcPayInfoReq.orderType = getF27457g();
        previewCalcPayInfoReq.transType = getF27455e();
        previewCalcPayInfoReq.subTransTypeCode = getF27456f();
        ModelPaymentPromotionLayout modelPaymentPromotionLayout2 = this.f27510U0;
        if (modelPaymentPromotionLayout2 == null || (bool3 = modelPaymentPromotionLayout2.isUsedCoupon) == null) {
            bool3 = Boolean.FALSE;
        }
        previewCalcPayInfoReq.isUseCoupon = bool3;
        Boolean bool4 = Boolean.TRUE;
        if (bool3.equals(bool4)) {
            CashierCouponItem cashierCouponItem = this.f27503N0;
            previewCalcPayInfoReq.couponId = cashierCouponItem != null ? cashierCouponItem.couponId : null;
            previewCalcPayInfoReq.couponAmount = cashierCouponItem != null ? cashierCouponItem.nominaValue : null;
        }
        previewCalcPayInfoReq.usePayDiscount = bool4;
        if (!TextUtils.isEmpty(this.f27460o)) {
            previewCalcPayInfoReq.calculationExtInfo = this.f27460o;
        }
        if (cashierPaymentMethodBean != null) {
            previewCalcPayInfoReq.combinationPaymentMethodFlag = Boolean.valueOf(cashierPaymentMethodBean instanceof CashierCombinationPaymentMethodBean);
            previewCalcPayInfoReq.payType = Integer.valueOf(cashierPaymentMethodBean.payType);
        }
        p(previewCalcPayInfoReq);
        return previewCalcPayInfoReq;
    }

    public final void E(String str) {
        String string;
        String str2;
        if (str == null || (string = StringsKt.V(str).toString()) == null) {
            return;
        }
        if (string.length() <= 0) {
            string = null;
        }
        if (string == null || (str2 = this.f27454d) == null) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = null;
        }
        if (str2 == null) {
            return;
        }
        String f27455e = getF27455e();
        Wf.V v3 = Wf.V.f10828a;
        p042cg.f fVar = Wf.I.f10809a;
        AbstractC0780y.m(v3, p042cg.e.f19009c, null, new B(string, f27455e, str2, null), 2);
    }

    public final boolean F() {
        View viewFindViewById = findViewById(p025ba.e.groupPreview);
        return viewFindViewById != null && viewFindViewById.getVisibility() == 0;
    }

    public final void G() {
        if (this.f27492F0) {
            b0();
            finish();
            return;
        }
        O6.c cVar = new O6.c(this);
        cVar.e(p025ba.k.core_payment_not_complete);
        String string = this.f27491E0;
        if (string == null) {
            string = getString(p025ba.k.core_confirm_leave_pin);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        cVar.f6598d = string;
        String string2 = getString(p025ba.k.core_leave);
        ViewOnClickListenerC1489x viewOnClickListenerC1489x = new ViewOnClickListenerC1489x(this, 5);
        cVar.f6601g = string2;
        cVar.f6603i = viewOnClickListenerC1489x;
        cVar.d(p025ba.k.core_continue, new ViewOnClickListenerC1478l(2));
        cVar.g();
        this.f27492F0 = true;
    }

    public final void H() {
        if (this.f27504O0 instanceof FlexiPayGuideBean) {
            this.f27504O0 = null;
            N().f35823e = null;
            N().notifyDataSetChanged();
        }
    }

    public final void I() {
        CashierPayMethodRetryDialog cashierPayMethodRetryDialogO = O();
        if (cashierPayMethodRetryDialogO != null) {
            cashierPayMethodRetryDialogO.setPaymentRetryToken(null);
        }
        CashierPayMethodRetryDialog cashierPayMethodRetryDialogO2 = O();
        if (cashierPayMethodRetryDialogO2 != null) {
            cashierPayMethodRetryDialogO2.clearPayMethods();
        }
        CashierPayMethodRetryDialog cashierPayMethodRetryDialogO3 = O();
        if (cashierPayMethodRetryDialogO3 != null) {
            cashierPayMethodRetryDialogO3.setConfirmLoading(false);
        }
    }

    public final void J() {
        if (r0.U0()) {
            return;
        }
        CashierPaymentMethodBean cashierPaymentMethodBean = this.f27504O0;
        if (cashierPaymentMethodBean == null) {
            ToastUtils.showLong(p025ba.k.core_msg_select_payment_method);
            return;
        }
        if (cashierPaymentMethodBean instanceof CashierCombinationPaymentMethodBean) {
            CashierCombinationPaymentMethodBean cashierCombinationPaymentMethodBean = (CashierCombinationPaymentMethodBean) cashierPaymentMethodBean;
            long j6 = cashierCombinationPaymentMethodBean.availableBalance;
            CashierCombinationPaymentMethodBean subPaymentMethodBean = cashierCombinationPaymentMethodBean.getSubPaymentMethodBean();
            if (j6 + (subPaymentMethodBean != null ? subPaymentMethodBean.availableBalance : 0L) < this.f27461p) {
                i0();
                return;
            }
        } else if (!r0.k(cashierPaymentMethodBean, Long.valueOf(this.f27461p)) && !(this instanceof CashierRecharge2CashPreviewActivity)) {
            i0();
            return;
        }
        if (this.f27502M0 == null) {
            K();
            return;
        }
        c0();
        n0 n0VarG = n0.g();
        ClickEvent clickEventAdd = new ClickEvent("PalmPayCashierPreview_PayButton_Click").afEvt(false).add("module_name", "Cashier");
        String str = this.f27454d;
        if (str == null) {
            str = "";
        }
        ClickEvent clickEventAdd2 = clickEventAdd.add("OrderNo", str);
        String f27455e = getF27455e();
        if (f27455e == null) {
            f27455e = "";
        }
        ClickEvent clickEventAdd3 = clickEventAdd2.add("TransType", f27455e);
        String f27456f = getF27456f();
        ClickEvent clickEventAdd4 = clickEventAdd3.add("SubTransType", f27456f != null ? f27456f : "");
        CashierPaymentMethodBean cashierPaymentMethodBean2 = this.f27504O0;
        ClickEvent clickEventAdd5 = clickEventAdd4.add("PaymentMethod", String.valueOf(cashierPaymentMethodBean2 != null ? Integer.valueOf(cashierPaymentMethodBean2.senderAccountType) : null));
        CashierPaymentMethodBean cashierPaymentMethodBean3 = this.f27504O0;
        n0VarG.k(clickEventAdd5.add("IsCombinePayment", String.valueOf(cashierPaymentMethodBean3 != null && (cashierPaymentMethodBean3 instanceof CashierCombinationPaymentMethodBean))));
    }

    public final void K() {
        DefaultCalcOfPaymentMethodReq req = new DefaultCalcOfPaymentMethodReq();
        req.transType = getF27455e();
        req.payeeAccountType = s();
        req.orderAmount = this.f27458i;
        req.isRedeemPoint = true;
        req.isUseCoupon = true;
        req.orderNo = this.f27454d;
        req.subTransTypeCode = getF27456f();
        req.usePayDiscount = true;
        if (!TextUtils.isEmpty(this.f27460o)) {
            req.calculationExtInfo = this.f27460o;
        }
        n(req);
        CoreCashierViewModel coreCashierViewModel = (CoreCashierViewModel) l();
        coreCashierViewModel.getClass();
        Intrinsics.checkNotNullParameter(req, "req");
        p140j8.f.s(coreCashierViewModel, new Ma.a(req, null), coreCashierViewModel.f28062f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    public final void L(PayByOrderResp payByOrderResp, PayByOrderReq payByOrderReq) {
        String str;
        String str2;
        if (payByOrderResp.isSuccess()) {
            PayByOrderResp.DataBean data = payByOrderResp.getData();
            if ((data != null ? Intrinsics.c(data.needPaymentRetry, Boolean.TRUE) : false) && F()) {
                j0(payByOrderResp.getData().paymentRetryToken);
                return;
            }
        }
        String str3 = "";
        if (!payByOrderResp.isSuccess() || payByOrderResp.getData() == null) {
            if (CommonResult.CODE_BALANCE_ACCOUNT_LOCK.equals(payByOrderResp.getRespCode())) {
                com.palmpay.lib.apm.launchcounter.util.d.F("/account/ask_apply_for_balance");
                if (F()) {
                    return;
                }
                finish();
                return;
            }
            if (CommonResult.CODE_REQUIRE_VERIFY_BVN.equals(payByOrderResp.getRespCode())) {
                io.fastkv.n.O(this, 0, Integer.valueOf(p025ba.k.core_tips), null, null, null, null, payByOrderResp.getRespMsg(), Integer.valueOf(p025ba.k.core_add_bvn), null, new ViewOnClickListenerC1478l(1), Integer.valueOf(p025ba.k.core_cancel), null, null, null, false, 0, 8385149).setOnDismissListener(new Dd.b(this, 20));
                return;
            }
            String respCode = payByOrderResp.getRespCode();
            if (Intrinsics.c(respCode, "33000039") || Intrinsics.c(respCode, "33000040") || Intrinsics.c(respCode, "33000041") || Intrinsics.c(respCode, "33000093")) {
                String respCode2 = payByOrderResp.getRespCode();
                String respMsg = payByOrderResp.getRespMsg();
                i0.i0(this, respCode2, respMsg != null ? respMsg : "", true);
                return;
            } else {
                String respCode3 = payByOrderResp.getRespCode();
                Intrinsics.checkNotNullExpressionValue(respCode3, "getRespCode(...)");
                String respMsg2 = payByOrderResp.getRespMsg();
                Intrinsics.checkNotNullExpressionValue(respMsg2, "getRespMsg(...)");
                x(respCode3, respMsg2);
                return;
            }
        }
        n0 n0VarG = n0.g();
        ViewEvent viewEvent = (ViewEvent) C0.G.g("Cashier_Order_Creation", true);
        if (payByOrderReq == null || (str = payByOrderReq.transType) == null) {
            str = "";
        }
        ViewEvent viewEventAdd = viewEvent.add("TransType", str);
        if (payByOrderReq != null && (str2 = payByOrderReq.orderNo) != null) {
            str3 = str2;
        }
        n0VarG.u(viewEventAdd.add("OrderNo", str3));
        this.t = payByOrderResp.getData().payId;
        if (!payByOrderResp.getData().flag) {
            String businessData = payByOrderResp.getData().businessData;
            Intrinsics.checkNotNullExpressionValue(businessData, "businessData");
            Integer num = 8;
            if (Intrinsics.c(num.toString(), C0525w.j(businessData, "payStatus"))) {
                Pa.K.c(getF27457g(), businessData);
                finish();
                return;
            }
            Integer numH = C0525w.h(businessData, "extVerifyMethod");
            if (Pa.K.b(numH, getF27457g(), businessData)) {
                if (numH != null && numH.intValue() == 3) {
                    return;
                }
                finish();
                return;
            }
            Pa.J j6 = new Pa.J();
            j6.f7022a = getF27457g();
            j6.f7023b = payByOrderResp.getData();
            j6.f7024c = this.f27454d;
            j6.f7025d = getF27455e();
            j6.f7026e = payByOrderReq != null ? payByOrderReq.amount : this.f27461p;
            j6.f7028g = this.f27460o;
            j6.f7027f = getF27456f();
            if (Pa.K.a(j6)) {
                finish();
                return;
            }
            return;
        }
        if (!Intrinsics.c(this.f27454d, payByOrderResp.getData().orderNo)) {
            showErrorMessageDialog(getString(p025ba.k.core_fail_to_pay_order));
            F6.d.c(this.TAG, "orderNo not Match");
            return;
        }
        CheckPayReq checkPayReq = new CheckPayReq();
        checkPayReq.orderNo = payByOrderResp.getData().orderNo;
        checkPayReq.orderType = getF27457g();
        checkPayReq.payId = payByOrderResp.getData().payId;
        checkPayReq.subPayId = payByOrderResp.getData().subPayId;
        checkPayReq.url = payByOrderResp.getData().url;
        checkPayReq.verifyMethod = payByOrderResp.getData().verifyMethod;
        checkPayReq.payRouteId = payByOrderResp.getData().payRouteId;
        checkPayReq.transType = getF27455e();
        checkPayReq.otpReference = payByOrderResp.getData().otpReference;
        checkPayReq.payAmount = payByOrderReq != null ? payByOrderReq.amount : this.f27461p;
        checkPayReq.orderAmount = this.f27458i;
        checkPayReq.feeAmount = payByOrderReq != null ? payByOrderReq.fee : 0L;
        checkPayReq.subTransTypeCode = getF27456f();
        Intrinsics.checkNotNullParameter(checkPayReq, "checkPayReq");
        d0 d0Var = new d0(this);
        d0Var.f27748b = checkPayReq;
        d0Var.f27751e = this.f27504O0;
        d0Var.f27756j = true;
        d0Var.f27754h = this.f27460o;
        d0Var.f27749c = payByOrderResp;
        d0Var.f27757k = isForceNoNightMode();
        d0Var.f27753g = this.f27491E0;
        d0Var.f27755i = this.f27492F0;
        d0Var.f27759m = payByOrderResp.getData().paymentRetryToken;
        d0Var.a();
    }

    public final CashierCouponListDialog M() {
        return (CashierCouponListDialog) this.f27511V0.getValue();
    }

    public final C1650w N() {
        return (C1650w) this.f27498K0.getValue();
    }

    public final CashierPayMethodRetryDialog O() {
        return (CashierPayMethodRetryDialog) this.f27514X0.getValue();
    }

    public final ModelPaymentEarnLayout P() {
        return (ModelPaymentEarnLayout) this.f27516Z.getValue();
    }

    public final ModelPaymentManualGetLayout Q() {
        return (ModelPaymentManualGetLayout) this.f27515Y.getValue();
    }

    public final ModelPaymentInfoItem R() {
        if (this.f27507Q0 == null) {
            try {
                ViewStub viewStub = (ViewStub) this.f27520r0.getValue();
                View viewInflate = viewStub != null ? viewStub.inflate() : null;
                if (viewInflate != null) {
                    this.f27507Q0 = (ModelPaymentInfoItem) viewInflate.findViewById(p025ba.e.previewEarlyRefundItem);
                }
            } catch (Exception e10) {
                F6.d.c(this.TAG, "getMonthEarlyRefundLayout: ", e10);
            }
        }
        return this.f27507Q0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    public final ModelPaymentInfoItem S() {
        CoreCashierPreviewActivity coreCashierPreviewActivity;
        TextView itemLineValueTv;
        TextView itemValueTv;
        if (this.f27508R0 == null) {
            try {
                ViewStub viewStub = (ViewStub) this.f27488B0.getValue();
                View viewInflate = viewStub != null ? viewStub.inflate() : null;
                if (viewInflate != null) {
                    ModelPaymentInfoItem modelPaymentInfoItem = (ModelPaymentInfoItem) viewInflate.findViewById(p025ba.e.previewFeeAmountItem);
                    this.f27508R0 = modelPaymentInfoItem;
                    if (modelPaymentInfoItem != null) {
                        coreCashierPreviewActivity = this;
                        try {
                            modelPaymentInfoItem.e(G8.a.x(coreCashierPreviewActivity, S6.a.pay_InformationOutline, null, Integer.valueOf(L6.b.ppColorTextAssist), 16.0f, 114));
                        } catch (Exception e10) {
                            e = e10;
                            F6.d.c(coreCashierPreviewActivity.TAG, "getPreviewFeeItem: ", e);
                        }
                    } else {
                        coreCashierPreviewActivity = this;
                    }
                    ModelPaymentInfoItem modelPaymentInfoItem2 = coreCashierPreviewActivity.f27508R0;
                    if (modelPaymentInfoItem2 != null && (itemValueTv = modelPaymentInfoItem2.getItemValueTv()) != null) {
                        itemValueTv.setPadding(0, CommonViewExtKt.getDp(3), 0, CommonViewExtKt.getDp(3));
                        r0.R1(itemValueTv, "fonts/PalmPayNum-Regular.ttf");
                    }
                    ModelPaymentInfoItem modelPaymentInfoItem3 = coreCashierPreviewActivity.f27508R0;
                    if (modelPaymentInfoItem3 != null && (itemLineValueTv = modelPaymentInfoItem3.getItemLineValueTv()) != null) {
                        itemLineValueTv.setPadding(0, CommonViewExtKt.getDp(3), 0, CommonViewExtKt.getDp(3));
                        r0.R1(itemLineValueTv, "fonts/PalmPayNum-Regular.ttf");
                    }
                } else {
                    coreCashierPreviewActivity = this;
                }
            } catch (Exception e11) {
                e = e11;
                coreCashierPreviewActivity = this;
            }
        } else {
            coreCashierPreviewActivity = this;
        }
        return coreCashierPreviewActivity.f27508R0;
    }

    public final ViewGroup T() {
        if (this.T0 == null) {
            try {
                ViewStub viewStub = (ViewStub) this.f27523u0.getValue();
                View viewInflate = viewStub != null ? viewStub.inflate() : null;
                if (viewInflate != null) {
                    this.T0 = (ViewGroup) viewInflate.findViewById(p025ba.e.previewOrderAmountItem);
                }
            } catch (Exception e10) {
                F6.d.c(this.TAG, "getPreviewOrderAmountItem: ", e10);
            }
        }
        return this.T0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0073  */
    public final ModelPaymentInfoItem U() {
        CoreCashierPreviewActivity coreCashierPreviewActivity;
        TextView itemLineValueTv;
        TextView itemValueTv;
        if (this.f27509S0 == null) {
            try {
                ViewStub viewStub = (ViewStub) this.f27522t0.getValue();
                View viewInflate = viewStub != null ? viewStub.inflate() : null;
                if (viewInflate != null) {
                    ModelPaymentInfoItem modelPaymentInfoItem = (ModelPaymentInfoItem) viewInflate.findViewById(p025ba.e.previewFeeAmountItem);
                    this.f27509S0 = modelPaymentInfoItem;
                    if (modelPaymentInfoItem != null) {
                        coreCashierPreviewActivity = this;
                        try {
                            modelPaymentInfoItem.e(G8.a.x(coreCashierPreviewActivity, S6.a.pay_InformationOutline, null, Integer.valueOf(L6.b.ppColorTextAssist), 16.0f, 114));
                        } catch (Exception e10) {
                            e = e10;
                            F6.d.c(coreCashierPreviewActivity.TAG, "getPreviewTaxesItem: ", e);
                        }
                    } else {
                        coreCashierPreviewActivity = this;
                    }
                    ModelPaymentInfoItem modelPaymentInfoItem2 = coreCashierPreviewActivity.f27509S0;
                    if (modelPaymentInfoItem2 != null && (itemValueTv = modelPaymentInfoItem2.getItemValueTv()) != null) {
                        itemValueTv.setPadding(0, CommonViewExtKt.getDp(3), 0, CommonViewExtKt.getDp(3));
                        r0.R1(itemValueTv, "fonts/PalmPayNum-Regular.ttf");
                    }
                    ModelPaymentInfoItem modelPaymentInfoItem3 = coreCashierPreviewActivity.f27509S0;
                    if (modelPaymentInfoItem3 != null && (itemLineValueTv = modelPaymentInfoItem3.getItemLineValueTv()) != null) {
                        itemLineValueTv.setPadding(0, CommonViewExtKt.getDp(3), 0, CommonViewExtKt.getDp(3));
                        r0.R1(itemLineValueTv, "fonts/PalmPayNum-Regular.ttf");
                    }
                } else {
                    coreCashierPreviewActivity = this;
                }
            } catch (Exception e11) {
                e = e11;
                coreCashierPreviewActivity = this;
            }
        } else {
            coreCashierPreviewActivity = this;
        }
        return coreCashierPreviewActivity.f27509S0;
    }

    public final void V() {
        ModelPaymentPromotionLayout modelPaymentPromotionLayout = this.f27510U0;
        if (modelPaymentPromotionLayout != null) {
            p220oa.h.c(modelPaymentPromotionLayout);
        }
        ModelPaymentEarnLayout modelPaymentEarnLayoutP = P();
        if (modelPaymentEarnLayoutP != null) {
            p220oa.h.c(modelPaymentEarnLayoutP);
        }
        ModelPaymentManualGetLayout modelPaymentManualGetLayoutQ = Q();
        if (modelPaymentManualGetLayoutQ != null) {
            p220oa.h.c(modelPaymentManualGetLayoutQ);
        }
        RecyclerView recyclerView = (RecyclerView) this.f27517k0.getValue();
        if (recyclerView != null) {
            p220oa.h.c(recyclerView);
        }
    }

    public final void W() {
        ModelPaymentPromotionLayout modelPaymentPromotionLayout = this.f27510U0;
        if (modelPaymentPromotionLayout != null) {
            p220oa.h.C(modelPaymentPromotionLayout);
        }
        ModelPaymentEarnLayout modelPaymentEarnLayoutP = P();
        if (modelPaymentEarnLayoutP != null) {
            p220oa.h.C(modelPaymentEarnLayoutP);
        }
        ModelPaymentManualGetLayout modelPaymentManualGetLayoutQ = Q();
        if (modelPaymentManualGetLayoutQ != null) {
            p220oa.h.C(modelPaymentManualGetLayoutQ);
        }
        RecyclerView recyclerView = (RecyclerView) this.f27517k0.getValue();
        if (recyclerView != null) {
            p220oa.h.C(recyclerView);
        }
    }

    public final void X() {
        if (this.f27510U0 != null) {
            return;
        }
        try {
            ViewStub viewStub = (ViewStub) this.f27518p0.getValue();
            View viewInflate = viewStub != null ? viewStub.inflate() : null;
            if (viewInflate != null) {
                this.f27510U0 = (ModelPaymentPromotionLayout) viewInflate.findViewById(p025ba.e.model_payment_promotion_layout);
            }
        } catch (Exception e10) {
            F6.d.c(this.TAG, "initPromotionLayout: ", e10);
        }
        ModelPaymentPromotionLayout modelPaymentPromotionLayout = this.f27510U0;
        if (modelPaymentPromotionLayout != null) {
            modelPaymentPromotionLayout.getPromotionInfoLayout().addView(modelPaymentPromotionLayout.getPointPromotionItem());
            modelPaymentPromotionLayout.getPromotionInfoLayout().addView(modelPaymentPromotionLayout.getDiscountPromotionItem());
            modelPaymentPromotionLayout.getPromotionInfoLayout().addView(modelPaymentPromotionLayout.getCouponPromotionItem());
        }
        final ModelPaymentPromotionLayout modelPaymentPromotionLayout2 = this.f27510U0;
        if (modelPaymentPromotionLayout2 != null) {
            final int i7 = 0;
            modelPaymentPromotionLayout2.getPointPromotionItem().setPromotionListener(new ModelPaymentPromotionItem.OnPromotionItemListener(this) { // from class: com.transsnet.palmpay.core.ui.activity.z

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CoreCashierPreviewActivity f27820b;

                {
                    this.f27820b = this;
                }

                @Override // com.transsnet.palmpay.custom_view.model.ModelPaymentPromotionItem.OnPromotionItemListener
                public final void onPromotionItemClick() {
                    ModelPaymentPromotionLayout modelPaymentPromotionLayout3 = modelPaymentPromotionLayout2;
                    CoreCashierPreviewActivity coreCashierPreviewActivity = this.f27820b;
                    switch (i7) {
                        case 0:
                            int i10 = CoreCashierPreviewActivity.f27486Y0;
                            n0 n0VarG = n0.g();
                            ClickEvent clickEvent = (ClickEvent) C0.G.f("PalmPayCashierPreview_UsePalmPoints_Click", "module_name", "Cashier");
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
                            Boolean bool = modelPaymentPromotionLayout3.isUsedPoint;
                            ModelPaymentPromotionLayout.b(modelPaymentPromotionLayout3, Boolean.valueOf(!(bool != null ? bool.booleanValue() : false)), null, null, 62);
                            CashierPaymentMethodBean cashierPaymentMethodBean = coreCashierPreviewActivity.f27504O0;
                            if (cashierPaymentMethodBean != null) {
                                CoreCashierPreviewActivity.a0(coreCashierPreviewActivity, cashierPaymentMethodBean, null, 6);
                            }
                            break;
                        default:
                            int i11 = CoreCashierPreviewActivity.f27486Y0;
                            n0 n0VarG2 = n0.g();
                            ClickEvent clickEvent2 = (ClickEvent) C0.G.f("PalmPayCashierPreview_UseDiscount_Click", "module_name", "Cashier");
                            String str2 = coreCashierPreviewActivity.f27454d;
                            if (str2 == null) {
                                str2 = "";
                            }
                            ClickEvent clickEventAdd3 = clickEvent2.add("OrderNo", str2);
                            String f27455e2 = coreCashierPreviewActivity.getF27455e();
                            if (f27455e2 == null) {
                                f27455e2 = "";
                            }
                            ClickEvent clickEventAdd4 = clickEventAdd3.add("TransType", f27455e2);
                            String f27456f2 = coreCashierPreviewActivity.getF27456f();
                            n0VarG2.k(clickEventAdd4.add("SubTransType", f27456f2 != null ? f27456f2 : ""));
                            Boolean bool2 = modelPaymentPromotionLayout3.isUsedDiscount;
                            ModelPaymentPromotionLayout.b(modelPaymentPromotionLayout3, null, Boolean.valueOf(!(bool2 != null ? bool2.booleanValue() : false)), null, 61);
                            CashierPaymentMethodBean cashierPaymentMethodBean2 = coreCashierPreviewActivity.f27504O0;
                            if (cashierPaymentMethodBean2 != null) {
                                CoreCashierPreviewActivity.a0(coreCashierPreviewActivity, cashierPaymentMethodBean2, null, 6);
                            }
                            break;
                    }
                }
            });
            final int i10 = 1;
            modelPaymentPromotionLayout2.getDiscountPromotionItem().setPromotionListener(new ModelPaymentPromotionItem.OnPromotionItemListener(this) { // from class: com.transsnet.palmpay.core.ui.activity.z

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ CoreCashierPreviewActivity f27820b;

                {
                    this.f27820b = this;
                }

                @Override // com.transsnet.palmpay.custom_view.model.ModelPaymentPromotionItem.OnPromotionItemListener
                public final void onPromotionItemClick() {
                    ModelPaymentPromotionLayout modelPaymentPromotionLayout3 = modelPaymentPromotionLayout2;
                    CoreCashierPreviewActivity coreCashierPreviewActivity = this.f27820b;
                    switch (i10) {
                        case 0:
                            int i11 = CoreCashierPreviewActivity.f27486Y0;
                            n0 n0VarG = n0.g();
                            ClickEvent clickEvent = (ClickEvent) C0.G.f("PalmPayCashierPreview_UsePalmPoints_Click", "module_name", "Cashier");
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
                            Boolean bool = modelPaymentPromotionLayout3.isUsedPoint;
                            ModelPaymentPromotionLayout.b(modelPaymentPromotionLayout3, Boolean.valueOf(!(bool != null ? bool.booleanValue() : false)), null, null, 62);
                            CashierPaymentMethodBean cashierPaymentMethodBean = coreCashierPreviewActivity.f27504O0;
                            if (cashierPaymentMethodBean != null) {
                                CoreCashierPreviewActivity.a0(coreCashierPreviewActivity, cashierPaymentMethodBean, null, 6);
                            }
                            break;
                        default:
                            int i12 = CoreCashierPreviewActivity.f27486Y0;
                            n0 n0VarG2 = n0.g();
                            ClickEvent clickEvent2 = (ClickEvent) C0.G.f("PalmPayCashierPreview_UseDiscount_Click", "module_name", "Cashier");
                            String str2 = coreCashierPreviewActivity.f27454d;
                            if (str2 == null) {
                                str2 = "";
                            }
                            ClickEvent clickEventAdd3 = clickEvent2.add("OrderNo", str2);
                            String f27455e2 = coreCashierPreviewActivity.getF27455e();
                            if (f27455e2 == null) {
                                f27455e2 = "";
                            }
                            ClickEvent clickEventAdd4 = clickEventAdd3.add("TransType", f27455e2);
                            String f27456f2 = coreCashierPreviewActivity.getF27456f();
                            n0VarG2.k(clickEventAdd4.add("SubTransType", f27456f2 != null ? f27456f2 : ""));
                            Boolean bool2 = modelPaymentPromotionLayout3.isUsedDiscount;
                            ModelPaymentPromotionLayout.b(modelPaymentPromotionLayout3, null, Boolean.valueOf(!(bool2 != null ? bool2.booleanValue() : false)), null, 61);
                            CashierPaymentMethodBean cashierPaymentMethodBean2 = coreCashierPreviewActivity.f27504O0;
                            if (cashierPaymentMethodBean2 != null) {
                                CoreCashierPreviewActivity.a0(coreCashierPreviewActivity, cashierPaymentMethodBean2, null, 6);
                            }
                            break;
                    }
                }
            });
            modelPaymentPromotionLayout2.getCouponPromotionItem().setPromotionListener(new C1490y(this));
        }
    }

    public final void Y(String str) {
        n0 n0VarG = n0.g();
        ClickEvent clickEvent = new ClickEvent(str);
        String strK = C0.G.k();
        if (strK == null) {
            strK = "";
        }
        ClickEvent clickEventAdd = clickEvent.add("member_id", strK);
        String str2 = this.f27454d;
        if (str2 == null) {
            str2 = "";
        }
        ClickEvent clickEventAdd2 = clickEventAdd.add("OrderNo", str2);
        String f27455e = getF27455e();
        if (f27455e == null) {
            f27455e = "";
        }
        ClickEvent clickEventAdd3 = clickEventAdd2.add("TransType", f27455e);
        String f27456f = getF27456f();
        n0VarG.k(clickEventAdd3.add("SubTransType", f27456f != null ? f27456f : ""));
    }

    public final void Z(CashierPaymentMethodBean paymentMethod, Boolean bool, Function2 function2) {
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        CoreCashierViewModel coreCashierViewModel = (CoreCashierViewModel) l();
        PreviewCalcPayInfoReq req = D(paymentMethod);
        coreCashierViewModel.getClass();
        Intrinsics.checkNotNullParameter(req, "req");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Ma.b bVar = new Ma.b(req, null);
        Ma.p pVar = new Ma.p(paymentMethod, bool.booleanValue(), function2);
        com.transsnet.palmpay.core.base.l lVar = coreCashierViewModel.f28063g;
        lVar.f27356m = pVar;
        Unit unit = Unit.f38893a;
        p140j8.f.v(coreCashierViewModel, bVar, lVar, 0L);
    }

    public final void b0() {
        String str = this.f27454d;
        if (str == null) {
            str = "";
        }
        String f27455e = getF27455e();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Wf.V v3 = Wf.V.f10828a;
        p042cg.f fVar = Wf.I.f10809a;
        AbstractC0780y.m(v3, p042cg.e.f19009c, null, new D(f27455e, str, null), 2);
    }

    public void c0() {
        CashierPaymentMethodBean cashierPaymentMethodBean = this.f27504O0;
        if (cashierPaymentMethodBean == null) {
            if (F()) {
                return;
            }
            finish();
        } else if ((28 == cashierPaymentMethodBean.senderAccountType || cashierPaymentMethodBean.payType == 36) && cashierPaymentMethodBean.needSign) {
            ARouter.getInstance().build("/credit_score/oc_apply_lite_activity").withLong("extra_data_1", cashierPaymentMethodBean.availableBalance).withLong("extra_data_2", cashierPaymentMethodBean.paymentMethodsDiscount).withString("CORE_FROM", "BasePreviewActivity").navigation(this, 1001);
        } else {
            k0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    public final void d0() {
        CashierPaymentMethodBean cashierPaymentMethodBean = this.f27497J0;
        if (cashierPaymentMethodBean == null) {
            cashierPaymentMethodBean = (CashierPaymentMethodBean) CollectionsKt.firstOrNull(this.f27496I0);
            if (cashierPaymentMethodBean == null) {
                cashierPaymentMethodBean = null;
            } else if (cashierPaymentMethodBean instanceof CashierCombinationPaymentMethodBean) {
                long j6 = cashierPaymentMethodBean.availableBalance;
                CashierCombinationPaymentMethodBean subPaymentMethodBean = ((CashierCombinationPaymentMethodBean) cashierPaymentMethodBean).getSubPaymentMethodBean();
                if (j6 + (subPaymentMethodBean != null ? subPaymentMethodBean.availableBalance : 0L) < this.f27461p) {
                    cashierPaymentMethodBean = null;
                }
            } else if (cashierPaymentMethodBean.isSelfMethod() && cashierPaymentMethodBean.availableBalance < this.f27461p) {
                cashierPaymentMethodBean = null;
            }
        }
        if (cashierPaymentMethodBean != null) {
            Z(cashierPaymentMethodBean, Boolean.TRUE, new A(this, 8));
        } else {
            g0(false);
            H();
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0148  */
    public void e0(CalcPaymentFeeInfoBean calcPaymentFeeInfoBean) {
        CashierTaxDetailBean taxInfo;
        long j6;
        String title;
        PaymentFeeDetailBean feeDetail;
        ImageView itemKeyIconIv;
        TextView itemKeyTv;
        ImageView itemKeyIconIv2;
        String tipsText;
        FeeTips feeTips;
        Long platformVat;
        Long platformFee;
        Long vat;
        Long fee;
        long jLongValue = ((calcPaymentFeeInfoBean == null || (fee = calcPaymentFeeInfoBean.getFee()) == null) ? 0L : fee.longValue()) + ((calcPaymentFeeInfoBean == null || (vat = calcPaymentFeeInfoBean.getVat()) == null) ? 0L : vat.longValue());
        long jLongValue2 = ((calcPaymentFeeInfoBean == null || (platformFee = calcPaymentFeeInfoBean.getPlatformFee()) == null) ? 0L : platformFee.longValue()) + ((calcPaymentFeeInfoBean == null || (platformVat = calcPaymentFeeInfoBean.getPlatformVat()) == null) ? 0L : platformVat.longValue());
        ModelPaymentInfoItem modelPaymentInfoItemS = S();
        if (modelPaymentInfoItemS != null) {
            modelPaymentInfoItemS.setVisibility(jLongValue + jLongValue2 > 0 ? 0 : 8);
        }
        ModelPaymentInfoItem modelPaymentInfoItemS2 = S();
        if (modelPaymentInfoItemS2 != null) {
            modelPaymentInfoItemS2.g(r0.B(jLongValue, true));
        }
        if (jLongValue2 > 0) {
            ModelPaymentInfoItem modelPaymentInfoItemS3 = S();
            if (modelPaymentInfoItemS3 != null) {
                modelPaymentInfoItemS3.f(r0.B(jLongValue + jLongValue2, true));
            }
        } else {
            ModelPaymentInfoItem modelPaymentInfoItemS4 = S();
            if (modelPaymentInfoItemS4 != null) {
                modelPaymentInfoItemS4.f("");
            }
        }
        ModelPaymentInfoItem modelPaymentInfoItemS5 = S();
        if (modelPaymentInfoItemS5 != null) {
            if (calcPaymentFeeInfoBean == null || (feeTips = calcPaymentFeeInfoBean.getFeeTips()) == null || (tipsText = feeTips.getTipsText()) == null) {
                tipsText = "";
            }
            modelPaymentInfoItemS5.c(tipsText);
        }
        if (calcPaymentFeeInfoBean != null && (feeDetail = calcPaymentFeeInfoBean.getFeeDetail()) != null) {
            ModelPaymentInfoItem modelPaymentInfoItemS6 = S();
            if (modelPaymentInfoItemS6 != null && (itemKeyIconIv2 = modelPaymentInfoItemS6.getItemKeyIconIv()) != null) {
                p220oa.h.s(itemKeyIconIv2, true);
            }
            p010a9.b bVar = new p010a9.b(14, this, feeDetail);
            ModelPaymentInfoItem modelPaymentInfoItemS7 = S();
            if (modelPaymentInfoItemS7 != null && (itemKeyTv = modelPaymentInfoItemS7.getItemKeyTv()) != null) {
                itemKeyTv.setOnClickListener(bVar);
            }
            ModelPaymentInfoItem modelPaymentInfoItemS8 = S();
            if (modelPaymentInfoItemS8 != null && (itemKeyIconIv = modelPaymentInfoItemS8.getItemKeyIconIv()) != null) {
                itemKeyIconIv.setOnClickListener(bVar);
            }
        }
        if (calcPaymentFeeInfoBean == null || (taxInfo = calcPaymentFeeInfoBean.getTaxInfo()) == null) {
            return;
        }
        Long totalPayerTax = taxInfo.getTotalPayerTax();
        long jLongValue3 = totalPayerTax != null ? totalPayerTax.longValue() : 0L;
        Long totalPlatformTax = taxInfo.getTotalPlatformTax();
        long jLongValue4 = totalPlatformTax != null ? totalPlatformTax.longValue() : 0L;
        long j10 = jLongValue3 + jLongValue4;
        if (j10 <= 0) {
            ModelPaymentInfoItem modelPaymentInfoItemU = U();
            if (modelPaymentInfoItemU != null) {
                modelPaymentInfoItemU.setVisibility(8);
                return;
            }
            return;
        }
        ModelPaymentInfoItem modelPaymentInfoItemU2 = U();
        if (modelPaymentInfoItemU2 != null) {
            modelPaymentInfoItemU2.setVisibility(0);
            List<CashierTaxDetailBean.TaxDetail> payerTaxDetails = taxInfo.getPayerTaxDetails();
            String title2 = "Tax";
            if (payerTaxDetails == null) {
                j6 = 0;
            } else {
                if (payerTaxDetails.isEmpty()) {
                    payerTaxDetails = null;
                }
                if (payerTaxDetails != null) {
                    j6 = 0;
                    if (payerTaxDetails.size() > 1) {
                        title2 = taxInfo.getTitle();
                        if (title2 == null) {
                            title2 = "Taxes";
                        }
                    } else if (payerTaxDetails.size() == 1 && (title = payerTaxDetails.get(0).getTitle()) != null) {
                        title2 = title;
                    }
                } else {
                    j6 = 0;
                }
            }
            modelPaymentInfoItemU2.d(title2);
            modelPaymentInfoItemU2.g(r0.B(jLongValue3, true));
            if (jLongValue4 > j6) {
                modelPaymentInfoItemU2.f(r0.B(j10, true));
            } else {
                modelPaymentInfoItemU2.f("");
            }
            modelPaymentInfoItemU2.c(taxInfo.getPayerTaxTips());
            ImageView itemKeyIconIv3 = modelPaymentInfoItemU2.getItemKeyIconIv();
            if (itemKeyIconIv3 != null) {
                p220oa.h.s(itemKeyIconIv3, true);
            }
            p010a9.b bVar2 = new p010a9.b(15, this, taxInfo);
            TextView itemKeyTv2 = modelPaymentInfoItemU2.getItemKeyTv();
            if (itemKeyTv2 != null) {
                itemKeyTv2.setOnClickListener(bVar2);
            }
            ImageView itemKeyIconIv4 = modelPaymentInfoItemU2.getItemKeyIconIv();
            if (itemKeyIconIv4 != null) {
                itemKeyIconIv4.setOnClickListener(bVar2);
            }
        }
    }

    public final void f0(CalcOfPaymentMethodResultBean calcOfPaymentMethodResultBean) {
        Long l5;
        if (calcOfPaymentMethodResultBean != null && (l5 = calcOfPaymentMethodResultBean.discountPackageAmount) != null) {
            Unit unit = null;
            if (l5.longValue() <= 0) {
                l5 = null;
            }
            if (l5 != null) {
                long jLongValue = l5.longValue();
                ViewGroup viewGroupT = T();
                if (viewGroupT != null) {
                    AmountUnitLayout.a((AmountUnitLayout) viewGroupT.findViewById(p025ba.e.amountUnitLayout), jLongValue);
                    ((TextView) viewGroupT.findViewById(p025ba.e.tvAmountLineValue)).setText(r0.B(this.f27458i, true));
                    unit = Unit.f38893a;
                }
                if (unit != null) {
                    return;
                }
            }
        }
        ViewGroup viewGroupT2 = T();
        if (viewGroupT2 != null) {
            AmountUnitLayout.a((AmountUnitLayout) viewGroupT2.findViewById(p025ba.e.amountUnitLayout), this.f27458i);
            Unit unit2 = Unit.f38893a;
        }
    }

    public final void g0(boolean z3) {
        if (z3) {
            this.f27490D0 = true;
            n0();
        }
        LinearLayout linearLayout = (LinearLayout) this.f27499L.getValue();
        if (linearLayout != null) {
            p220oa.h.s(linearLayout, z3);
        }
        TextView textView = (TextView) this.f27494H.getValue();
        if (textView != null) {
            p220oa.h.s(textView, !z3);
        }
    }

    public void h0() {
        View viewFindViewById = findViewById(p025ba.e.groupPreview);
        if (viewFindViewById != null) {
            p220oa.h.s(viewFindViewById, true);
        }
    }

    public final void i0() {
        p355xf.t tVar = this.f27512W0;
        CashierSelectPayMethodDialog cashierSelectPayMethodDialog = (CashierSelectPayMethodDialog) tVar.getValue();
        if (cashierSelectPayMethodDialog != null) {
            cashierSelectPayMethodDialog.setTransType(getF27455e());
            cashierSelectPayMethodDialog.setSubTransType(getF27456f());
            cashierSelectPayMethodDialog.setOrderNo(this.f27454d);
            cashierSelectPayMethodDialog.setPaymentMethodOptions(7);
            cashierSelectPayMethodDialog.setOkCardPreCreditInfo(this.f27493G0);
            cashierSelectPayMethodDialog.setPayMethods(this.f27500L0, this.f27497J0);
            CashierPaymentMethodBean cashierPaymentMethodBean = this.f27504O0;
            if (cashierPaymentMethodBean != null) {
                cashierSelectPayMethodDialog.setSelectedPayMethod(cashierPaymentMethodBean);
            }
            long j6 = this.f27461p;
            if (j6 < 0) {
                cashierSelectPayMethodDialog.setPayAmount(this.f27458i);
            } else {
                cashierSelectPayMethodDialog.setPayAmount(j6);
            }
            cashierSelectPayMethodDialog.setAddablePaymentMethods(this.f27495H0);
        }
        CashierSelectPayMethodDialog cashierSelectPayMethodDialog2 = (CashierSelectPayMethodDialog) tVar.getValue();
        if (cashierSelectPayMethodDialog2 != null) {
            cashierSelectPayMethodDialog2.show();
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00e1  */
    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        ModelPaymentInfoItem modelPaymentInfoItem;
        Intent intent = getIntent();
        if (intent != null) {
            this.f27454d = intent.getStringExtra("mOrderNo");
            this.f27455e = intent.getStringExtra("mTransType");
            this.f27456f = intent.getStringExtra("mSubTransType");
            this.f27457g = intent.getStringExtra("mOrderType");
            intent.getStringExtra("mCustomerId");
            this.f27458i = intent.getLongExtra("mOrderAmount", 0L);
            this.f27459j = intent.getStringExtra("mDisplayOrderAmount");
            this.f27460o = intent.getStringExtra("mCalculationExtInfo");
            this.f27505P0 = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("mExtras", CoreCashierPaymentExtra.class) : intent.getParcelableArrayListExtra("mExtras");
            v(intent);
        }
        AttributeSet attributeSet = null;
        f0(null);
        ModelPaymentInfoItem modelPaymentInfoItemS = S();
        if (modelPaymentInfoItemS != null) {
            modelPaymentInfoItemS.i(1);
        }
        ModelPaymentInfoItem modelPaymentInfoItemU = U();
        if (modelPaymentInfoItemU != null) {
            modelPaymentInfoItemU.i(1);
        }
        p355xf.t tVar = this.f27521s0;
        LinearLayout linearLayout = (LinearLayout) tVar.getValue();
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        ArrayList arrayList = this.f27505P0;
        int i7 = 0;
        if (arrayList != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            Iterator it = arrayList.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                CoreCashierPaymentExtra coreCashierPaymentExtra = (CoreCashierPaymentExtra) next;
                ModelPaymentInfoItem modelPaymentInfoItem2 = new ModelPaymentInfoItem(this, attributeSet, 6, i7);
                modelPaymentInfoItem2.d(coreCashierPaymentExtra.getKey());
                modelPaymentInfoItem2.g(coreCashierPaymentExtra.getValue());
                Integer style = coreCashierPaymentExtra.getStyle();
                if (style == null) {
                    modelPaymentInfoItem2.i(2);
                } else {
                    int iIntValue = style.intValue();
                    if (iIntValue == 5) {
                        modelPaymentInfoItem2.i(iIntValue);
                        if (coreCashierPaymentExtra.getTagIvValue() != null) {
                            modelPaymentInfoItem2.h(coreCashierPaymentExtra.getTagIvValue());
                        } else {
                            modelPaymentInfoItem = null;
                        }
                        if (modelPaymentInfoItem == null) {
                            modelPaymentInfoItem2.i(2);
                        }
                    } else {
                        modelPaymentInfoItem2.i(iIntValue);
                    }
                    modelPaymentInfoItem = modelPaymentInfoItem2;
                    if (modelPaymentInfoItem == null) {
                        modelPaymentInfoItem2.i(2);
                    }
                }
                if (!TextUtils.isEmpty(coreCashierPaymentExtra.getSubVaule())) {
                    modelPaymentInfoItem2.f(coreCashierPaymentExtra.getSubVaule());
                }
                modelPaymentInfoItem2.getItemValueTv().setMaxLines(2);
                LinearLayout linearLayout2 = (LinearLayout) tVar.getValue();
                if (linearLayout2 != null) {
                    linearLayout2.addView(modelPaymentInfoItem2, layoutParams);
                }
            }
        }
        RecyclerView recyclerView = (RecyclerView) this.f27517k0.getValue();
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this, 1, false));
            int dp = CommonViewExtKt.getDp(16);
            C1548f c1548f = new C1548f(getColor(L6.b.ppColorDividerLine), CommonViewExtKt.getDp(1), dp, dp);
            c1548f.f31336e = false;
            recyclerView.addItemDecoration(c1548f);
            recyclerView.setAdapter(N());
            N().setOnItemClickListener(new C1490y(this));
            N().setOnItemChildClickListener(new com.palmpay.lib.bridgewrapper.photo.upload.a(19));
        }
        K();
        w(false);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        super.initStatusBar(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isMainBusiness() {
        return true;
    }

    public final void j0(String str) {
        String string;
        if (str == null || (string = StringsKt.V(str).toString()) == null) {
            return;
        }
        if (string.length() <= 0) {
            string = null;
        }
        if (string == null) {
            return;
        }
        CashierPayMethodRetryDialog cashierPayMethodRetryDialogO = O();
        if (cashierPayMethodRetryDialogO != null) {
            cashierPayMethodRetryDialogO.setPaymentRetryToken(string);
        }
        CoreCashierViewModel coreCashierViewModel = (CoreCashierViewModel) l();
        String str2 = this.f27454d;
        coreCashierViewModel.getClass();
        p140j8.f.s(coreCashierViewModel, new Ma.h(string, str2, null), coreCashierViewModel.f28066o, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
    }

    public final void k0() {
        CalcPaymentFeeInfoBean calcPaymentFeeInfoBean;
        Long fee;
        PayByOrderReq req = new PayByOrderReq();
        req.amount = this.f27461p;
        req.currency = BaseApplication.getCurrency();
        req.orderNo = this.f27454d;
        req.orderType = getF27457g();
        req.transType = getF27455e();
        req.cacheKey = this.f27462v;
        CalcOfPaymentMethodResultBean calcOfPaymentMethodResultBean = this.f27502M0;
        req.fee = (calcOfPaymentMethodResultBean == null || (calcPaymentFeeInfoBean = calcOfPaymentMethodResultBean.feeInfo) == null || (fee = calcPaymentFeeInfoBean.getFee()) == null) ? 0L : fee.longValue();
        CashierPaymentMethodBean cashierPaymentMethodBean = this.f27504O0;
        if (cashierPaymentMethodBean != null) {
            int i7 = cashierPaymentMethodBean.payType;
            req.payType = i7;
            req.payerAccountId = cashierPaymentMethodBean.accountId;
            req.payerCardCvv = cashierPaymentMethodBean.cvv;
            req.payerCardPin = cashierPaymentMethodBean.cardPin;
            req.payerCardExpiryMon = cashierPaymentMethodBean.expiryMonth;
            req.payerCardExpiryYear = cashierPaymentMethodBean.expiryYear;
            req.payerCardNo = cashierPaymentMethodBean.cardNo;
            String str = cashierPaymentMethodBean.bankCode;
            req.payerBankCode = str;
            req.payerBankName = cashierPaymentMethodBean.bankName;
            req.reUseable = cashierPaymentMethodBean.reUseable;
            if (i7 == 11) {
                req.walletChannel = str;
                req.walletPhone = cashierPaymentMethodBean.bankAccountNo;
            }
        }
        o(req);
        CoreCashierViewModel coreCashierViewModel = (CoreCashierViewModel) l();
        coreCashierViewModel.getClass();
        Intrinsics.checkNotNullParameter(req, "req");
        Ma.c cVar = new Ma.c(req, null);
        com.transsnet.palmpay.core.base.l lVar = coreCashierViewModel.f28065j;
        lVar.f27356m = req;
        Unit unit = Unit.f38893a;
        p140j8.f.v(coreCashierViewModel, cVar, lVar, 0L);
        CashierPaymentMethodBean cashierPaymentMethodBean2 = this.f27504O0;
        if (cashierPaymentMethodBean2 == null || cashierPaymentMethodBean2.payType != 2) {
            return;
        }
        n0.g().k(new ClickEvent(n0.h(getF27457g(), !TextUtils.isEmpty(cashierPaymentMethodBean2.accountId))).afEvt(true));
    }

    public final void l0() {
        int i7;
        boolean z3;
        boolean z8;
        C1650w c1650wN = N();
        C1488w payAmount = new C1488w(this, 27);
        c1650wN.getClass();
        Intrinsics.checkNotNullParameter(payAmount, "payAmount");
        c1650wN.f35824f = payAmount;
        N().f35823e = this.f27504O0;
        C1650w c1650wN2 = N();
        ArrayList addablePaymentMethods = this.f27495H0;
        c1650wN2.getClass();
        Intrinsics.checkNotNullParameter(addablePaymentMethods, "addablePaymentMethods");
        ArrayList arrayList = c1650wN2.f35820b;
        arrayList.clear();
        arrayList.addAll(addablePaymentMethods);
        C1650w c1650wN3 = N();
        ArrayList<CashierPaymentMethodBean> preViewPaymentMethod = this.f27496I0;
        c1650wN3.getClass();
        Intrinsics.checkNotNullParameter(preViewPaymentMethod, "preViewPaymentMethod");
        boolean z10 = false;
        c1650wN3.f35830v = false;
        c1650wN3.t = null;
        c1650wN3.f35829p = preViewPaymentMethod;
        if (preViewPaymentMethod == null || !preViewPaymentMethod.isEmpty()) {
            i7 = 0;
            for (CashierPaymentMethodBean cashierPaymentMethodBean : preViewPaymentMethod) {
                if (cashierPaymentMethodBean.availableBalance >= ((Number) c1650wN3.f35824f.invoke()).longValue() || !cashierPaymentMethodBean.isSelfMethod()) {
                    i7++;
                    if (i7 < 0) {
                        C1850q.j();
                        throw null;
                    }
                }
            }
        } else {
            i7 = 0;
        }
        if (i7 == 0 && preViewPaymentMethod.size() < 2) {
            ArrayList arrayList2 = c1650wN3.f35820b;
            if (arrayList2 != null && arrayList2.isEmpty()) {
                z3 = false;
                break;
            }
            Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z3 = false;
                    break;
                }
                Integer num = ((CashierAddablePaymentMethodsBean) it.next()).senderAccountType;
                if (num != null && num.intValue() == 5) {
                    z3 = true;
                    break;
                }
            }
            if (z3) {
                if (arrayList2 != null && arrayList2.isEmpty()) {
                    z8 = false;
                    break;
                }
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z8 = false;
                        break;
                    }
                    Integer num2 = ((CashierAddablePaymentMethodsBean) it2.next()).senderAccountType;
                    if (num2 != null && num2.intValue() == 6) {
                        z8 = true;
                        break;
                    }
                }
                if (z8) {
                    z10 = true;
                }
            }
        }
        c1650wN3.f35827j = z10;
        c1650wN3.e();
        c1650wN3.f();
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewM;
        View viewInflate = getLayoutInflater().inflate(p025ba.g.core_activity_cashier_preview, (ViewGroup) null, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i7 = p025ba.e.iv_flexi_pay_agreement;
        if (((ImageView) p059e1.a.m(i7, viewInflate)) != null) {
            i7 = p025ba.e.ll_cashier_activate_flexi_pay;
            if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                i7 = p025ba.e.ll_cashier_confirm_to_pay;
                if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                    i7 = p025ba.e.tv_activate_flexi_pay;
                    if (((PpButton) p059e1.a.m(i7, viewInflate)) != null) {
                        i7 = p025ba.e.tv_confirm_to_pay;
                        TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                        if (textView != null) {
                            i7 = p025ba.e.tv_flexi_pay_agreement;
                            TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                            if (textView2 != null && (viewM = p059e1.a.m((i7 = p025ba.e.view_top_transparent_bg), viewInflate)) != null) {
                                C0107d c0107d = new C0107d(constraintLayout, textView, textView2, viewM, 18);
                                Intrinsics.checkNotNullExpressionValue(c0107d, "inflate(...)");
                                return c0107d;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    /* JADX WARN: Code duplicated, block: B:89:0x01a3  */
    public void m0(DefaultCalcOfPaymentMethodResp.DataBean data) {
        String string;
        boolean z3;
        String string2;
        Intrinsics.checkNotNullParameter(data, "data");
        h0();
        this.f27491E0 = data.detainmentContent;
        if (data.calculationDto == null) {
            V();
            return;
        }
        W();
        CalcOfPaymentMethodResultBean data2 = data.calculationDto;
        if (data2 != null) {
            Intrinsics.checkNotNullParameter(data2, "data");
            this.f27502M0 = data2;
            this.f27462v = data2.cacheKey;
            Long l5 = data2.payAmount;
            this.f27461p = l5 != null ? l5.longValue() : 0L;
        }
        List<CashierAddablePaymentMethodsBean> list = data.payUnable;
        ArrayList arrayList = this.f27495H0;
        arrayList.clear();
        if (list != null) {
            arrayList.addAll(list);
        }
        o0(data.paymentMethodList, data.calculationDto);
        DefaultCalcOfPaymentMethodResp.CashierOpenAccountInfoRsp cashierOpenAccountInfoRsp = data.openAccountInfo;
        this.f27493G0 = cashierOpenAccountInfoRsp != null ? cashierOpenAccountInfoRsp.okcardPayInfoRes : null;
        FlexiPayGuideBean flexiPayGuideBean = data.flexiPayGuide;
        this.f27489C0 = flexiPayGuideBean;
        C1650w c1650wN = N();
        c1650wN.f35828o = flexiPayGuideBean;
        if (flexiPayGuideBean == null && (c1650wN.f35823e instanceof FlexiPayGuideBean)) {
            c1650wN.f35823e = null;
        }
        c1650wN.e();
        String str = "";
        if (flexiPayGuideBean != null) {
            n0 n0VarG = n0.g();
            ViewEvent viewEvent = new ViewEvent("PalmPayCashierPreview_FlexiPayGuide_view");
            String strK = C0.G.k();
            if (strK == null) {
                strK = "";
            }
            ViewEvent viewEventAdd = viewEvent.add("member_id", strK);
            String str2 = this.f27454d;
            if (str2 == null) {
                str2 = "";
            }
            ViewEvent viewEventAdd2 = viewEventAdd.add("OrderNo", str2);
            String f27455e = getF27455e();
            if (f27455e == null) {
                f27455e = "";
            }
            ViewEvent viewEventAdd3 = viewEventAdd2.add("TransType", f27455e);
            String f27456f = getF27456f();
            if (f27456f == null) {
                f27456f = "";
            }
            n0VarG.u(viewEventAdd3.add("SubTransType", f27456f));
        }
        CalcOfPaymentMethodResultBean calcOfPaymentMethodResultBean = data.calculationDto;
        if (calcOfPaymentMethodResultBean != null) {
            CashierPaymentMethodBean cashierPaymentMethodBean = this.f27504O0;
            Long l6 = calcOfPaymentMethodResultBean.paymentMethodsDiscount;
            if (cashierPaymentMethodBean != null) {
                cashierPaymentMethodBean.paymentMethodsDiscount = l6 != null ? l6.longValue() : 0L;
            }
            p0(calcOfPaymentMethodResultBean, true);
        }
        n0 n0VarG2 = n0.g();
        ViewEvent viewEvent2 = (ViewEvent) C0.G.g("PalmPayCashierPreview_View", false);
        String str3 = this.f27454d;
        if (str3 == null) {
            str3 = "";
        }
        ViewEvent viewEventAdd4 = viewEvent2.add("OrderNo", str3);
        String f27455e2 = getF27455e();
        if (f27455e2 == null) {
            f27455e2 = "";
        }
        ViewEvent viewEventAdd5 = viewEventAdd4.add("TransType", f27455e2);
        String f27456f2 = getF27456f();
        if (f27456f2 == null) {
            f27456f2 = "";
        }
        ViewEvent viewEventAdd6 = viewEventAdd5.add("SubTransType", f27456f2);
        CashierPaymentMethodBean cashierPaymentMethodBean2 = this.f27504O0;
        if (cashierPaymentMethodBean2 == null || (string = Integer.valueOf(cashierPaymentMethodBean2.senderAccountType).toString()) == null) {
            string = "";
        }
        ViewEvent viewEventAdd7 = viewEventAdd6.add("DefaultPaymentMethod", string);
        ArrayList arrayList2 = this.f27496I0;
        CashierPaymentMethodBean cashierPaymentMethodBean3 = (CashierPaymentMethodBean) CollectionsKt.G(1, arrayList2);
        if (cashierPaymentMethodBean3 != null && (string2 = Integer.valueOf(cashierPaymentMethodBean3.senderAccountType).toString()) != null) {
            str = string2;
        }
        ViewEvent viewEventAdd8 = viewEventAdd7.add("SecondPaymentMethod", str).add("PayMethodNum", String.valueOf(arrayList2.size()));
        X();
        ModelPaymentPromotionLayout modelPaymentPromotionLayout = this.f27510U0;
        ViewEvent viewEventAdd9 = viewEventAdd8.add("HaveDiscount", String.valueOf(modelPaymentPromotionLayout != null ? modelPaymentPromotionLayout.isShowDiscount : false));
        X();
        ModelPaymentPromotionLayout modelPaymentPromotionLayout2 = this.f27510U0;
        ViewEvent viewEventAdd10 = viewEventAdd9.add("HavePalmPoints", String.valueOf(modelPaymentPromotionLayout2 != null ? modelPaymentPromotionLayout2.isShowPoint : false));
        X();
        ModelPaymentPromotionLayout modelPaymentPromotionLayout3 = this.f27510U0;
        ViewEvent viewEventAdd11 = viewEventAdd10.add("HaveCoupons", String.valueOf(modelPaymentPromotionLayout3 != null ? modelPaymentPromotionLayout3.isShowCoupon : false));
        CalcOfPaymentMethodResultBean calcOfPaymentMethodResultBean2 = data.calculationDto;
        if ((calcOfPaymentMethodResultBean2 != null ? calcOfPaymentMethodResultBean2.earlyRefund : null) == null) {
            z3 = false;
        } else {
            if (calcOfPaymentMethodResultBean2 != null ? Intrinsics.c(calcOfPaymentMethodResultBean2.earlyRefundEnable, Boolean.FALSE) : false) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        ViewEvent viewEventAdd12 = viewEventAdd11.add("HaveEarlyRefund", String.valueOf(z3)).add("HaveFlexiOpen", String.valueOf(this.f27493G0 != null));
        CashierPaymentMethodBean cashierPaymentMethodBean4 = this.f27504O0;
        n0VarG2.u(viewEventAdd12.add("IsCombinePayment", String.valueOf(cashierPaymentMethodBean4 != null && (cashierPaymentMethodBean4 instanceof CashierCombinationPaymentMethodBean))));
    }

    public final void n0() {
        CoreCashierPreviewActivity coreCashierPreviewActivity;
        ImageView imageView = (ImageView) this.f27501M.getValue();
        if (imageView != null) {
            boolean z3 = this.f27490D0;
            coreCashierPreviewActivity = this;
            imageView.setImageDrawable(G8.a.x(coreCashierPreviewActivity, z3 ? S6.a.pay_CheckboxFill : S6.a.pay_CheckboxOutline, null, Integer.valueOf(z3 ? L6.b.ppColorTextPrimary : L6.b.ppColorTextAssist), 18.0f, 114));
        } else {
            coreCashierPreviewActivity = this;
        }
        PpButton ppButton = (PpButton) coreCashierPreviewActivity.f27513X.getValue();
        if (ppButton != null) {
            ppButton.setEnabled(coreCashierPreviewActivity.f27490D0);
        }
    }

    public final void o0(List list, CalcOfPaymentMethodResultBean calcOfPaymentMethodResultBean) {
        CalcOfCombinationInfoBean calcOfCombinationInfoBean;
        ArrayList arrayList = this.f27496I0;
        arrayList.clear();
        ArrayList arrayList2 = this.f27500L0;
        arrayList2.clear();
        Object obj = null;
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                arrayList2.addAll(list);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            CashierPaymentMethodBean cashierPaymentMethodBean = (CashierPaymentMethodBean) obj2;
            if (cashierPaymentMethodBean.defaultMethodFlag || cashierPaymentMethodBean.showInPreview) {
                arrayList3.add(obj2);
            }
        }
        List listU = CollectionsKt.U(arrayList3, 2);
        if (!listU.isEmpty()) {
            arrayList.addAll(listU);
        }
        if (((calcOfPaymentMethodResultBean == null || (calcOfCombinationInfoBean = calcOfPaymentMethodResultBean.combinationInfo) == null) ? null : calcOfCombinationInfoBean.getMainPaymentMethod()) == null) {
            this.f27497J0 = null;
            for (Object obj3 : arrayList2) {
                if (((CashierPaymentMethodBean) obj3).defaultMethodFlag) {
                    obj = obj3;
                    break;
                }
            }
            CashierPaymentMethodBean cashierPaymentMethodBean2 = (CashierPaymentMethodBean) obj;
            if (cashierPaymentMethodBean2 != null) {
                this.f27504O0 = cashierPaymentMethodBean2;
            }
            l0();
            return;
        }
        CalcOfCombinationInfoBean calcOfCombinationInfoBean2 = calcOfPaymentMethodResultBean.combinationInfo;
        CashierCombinationPaymentMethodBean mainPaymentMethod = calcOfCombinationInfoBean2 != null ? calcOfCombinationInfoBean2.getMainPaymentMethod() : null;
        this.f27497J0 = mainPaymentMethod;
        this.f27504O0 = mainPaymentMethod;
        N().f35823e = this.f27497J0;
        C1650w c1650wN = N();
        CashierCombinationPaymentMethodBean item = this.f27497J0;
        Intrinsics.e(item);
        c1650wN.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        c1650wN.f35830v = true;
        c1650wN.t = item;
        c1650wN.f35827j = false;
        c1650wN.e();
        c1650wN.f();
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i10 == 0) {
            if (Intrinsics.c(intent != null ? intent.getStringExtra("cancel_reason") : null, "close_cashier")) {
                finish();
                return;
            }
        }
        if (i7 == 1001 && i10 == -1) {
            CashierPaymentMethodBean cashierPaymentMethodBean = this.f27504O0;
            if ((cashierPaymentMethodBean == null || 28 != cashierPaymentMethodBean.senderAccountType) && (cashierPaymentMethodBean == null || cashierPaymentMethodBean.payType != 36)) {
                return;
            }
            if (cashierPaymentMethodBean != null) {
                cashierPaymentMethodBean.needSign = true;
            }
            k0();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        if (F()) {
            return;
        }
        finish();
    }

    @Override // com.transsnet.palmpay.core.ui.activity.BaseCoreCashierPreviewActivity, com.transsnet.palmpay.core.dialog.SelectBankDialogV2.CallBack
    public final void onChooseBankClick(BankInfo bankInfo) {
        CashierPaymentMethodBean cashierPaymentMethodBean = new CashierPaymentMethodBean();
        cashierPaymentMethodBean.bankCode = bankInfo != null ? bankInfo.bankCode : null;
        cashierPaymentMethodBean.bankName = bankInfo != null ? bankInfo.bankName : null;
        cashierPaymentMethodBean.bankUrl = bankInfo != null ? bankInfo.bankUrl : null;
        cashierPaymentMethodBean.countryCode = bankInfo != null ? bankInfo.countryCode : null;
        cashierPaymentMethodBean.payType = 13;
        cashierPaymentMethodBean.senderAccountType = 23;
        C(cashierPaymentMethodBean);
        a0(this, cashierPaymentMethodBean, new A(this, 10), 2);
        SelectBankDialogV2 selectBankDialogV2Q = q();
        if (selectBankDialogV2Q != null) {
            selectBankDialogV2Q.dismiss();
        }
    }

    @Override // com.transsnet.palmpay.core.dialog.CashierCouponListDialog.CallBack
    public final void onCouponClick(CashierCouponItem cashierCouponItem) {
        this.f27503N0 = cashierCouponItem;
        X();
        ModelPaymentPromotionLayout modelPaymentPromotionLayout = this.f27510U0;
        if (modelPaymentPromotionLayout != null) {
            CashierCouponItem cashierCouponItem2 = this.f27503N0;
            ModelPaymentPromotionLayout.b(modelPaymentPromotionLayout, null, null, Boolean.valueOf((cashierCouponItem2 == null || cashierCouponItem2.couponId == null) ? false : true), 59);
        }
        CashierPaymentMethodBean cashierPaymentMethodBean = this.f27504O0;
        if (cashierPaymentMethodBean != null) {
            a0(this, cashierPaymentMethodBean, null, 6);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity, com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(@NotNull MessageEvent event) {
        String strJ;
        String string;
        Intrinsics.checkNotNullParameter(event, "event");
        int eventType = event.getEventType();
        if (eventType != 7) {
            if (eventType != 275 && eventType != 283) {
                if (eventType != 344) {
                    if (eventType != 406) {
                        String str = null;
                        if (eventType == 536) {
                            String eventContent = event.getEventContent();
                            if (eventContent != null && !StringsKt.F(eventContent) && (strJ = C0525w.j(eventContent, "paymentRetryToken")) != null && (string = StringsKt.V(strJ).toString()) != null && string.length() > 0) {
                                str = string;
                            }
                            if (str == null || str.length() == 0 || !F()) {
                                finish();
                                return;
                            } else {
                                j0(str);
                                return;
                            }
                        }
                        if (eventType != 291) {
                            if (eventType == 292) {
                                String eventContent2 = event.getEventContent();
                                if (TextUtils.isEmpty(eventContent2) || Intrinsics.c(getLocalClassName(), eventContent2)) {
                                    CoreCashierViewModel coreCashierViewModel = (CoreCashierViewModel) l();
                                    USSDFundResultReq req = new USSDFundResultReq();
                                    req.amout = this.f27461p;
                                    CashierPaymentMethodBean cashierPaymentMethodBean = this.f27504O0;
                                    req.bankCode = cashierPaymentMethodBean != null ? cashierPaymentMethodBean.bankCode : null;
                                    req.payId = this.t;
                                    req.transType = getF27455e();
                                    req.orderNo = this.f27454d;
                                    coreCashierViewModel.getClass();
                                    Intrinsics.checkNotNullParameter(req, "req");
                                    Ma.i iVar = new Ma.i(req, null);
                                    com.transsnet.palmpay.core.base.l lVar = coreCashierViewModel.f28064i;
                                    lVar.f27356m = req;
                                    Unit unit = Unit.f38893a;
                                    p140j8.f.v(coreCashierViewModel, iVar, lVar, 0L);
                                    return;
                                }
                                return;
                            }
                            if (eventType != 307 && eventType != 308) {
                                return;
                            }
                        }
                    }
                    finish();
                    return;
                }
            }
            String eventContent3 = event.getEventContent();
            if ((TextUtils.isEmpty(eventContent3) || Intrinsics.c(getLocalClassName(), eventContent3)) && (event.getEventObj() instanceof PaymentMethod)) {
                Object eventObj = event.getEventObj();
                Intrinsics.f(eventObj, "null cannot be cast to non-null type com.transsnet.palmpay.core.bean.cashier.CashierPaymentMethodBean");
                CashierPaymentMethodBean cashierPaymentMethodBean2 = (CashierPaymentMethodBean) eventObj;
                C(cashierPaymentMethodBean2);
                a0(this, cashierPaymentMethodBean2, new A(this, 9), 2);
                return;
            }
            return;
        }
        K();
    }

    @Override // com.transsnet.palmpay.core.dialog.CashierSelectPayMethodDialog.CallBack
    public final void onPaymentMethodClick(CashierPaymentMethodBean cashierPaymentMethodBean) {
        if (cashierPaymentMethodBean != null) {
            a0(this, cashierPaymentMethodBean, new A(this, 5), 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:161:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:163:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:164:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:171:0x0331  */
    /* JADX WARN: Code duplicated, block: B:184:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:187:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:85:0x0147  */
    public void p0(CalcOfPaymentMethodResultBean bean, boolean z3) {
        ModelPaymentPromotionLayout modelPaymentPromotionLayout;
        List<CashierManualGetRewardItem> list;
        List<CalcPaymentEarnItem> earnItemList;
        String earnTips;
        List<CalcPaymentEarnItem> earnItemList2;
        Unit unit;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        String strJ;
        String strO;
        long j6;
        String strO2;
        String strJ2;
        long jLongValue;
        boolean z8;
        boolean z10;
        CalcPaymentPromotionBean calcPaymentPromotionBean;
        String string;
        String str;
        Long l5;
        int iIntValue;
        boolean zBooleanValue3;
        String couponType;
        boolean z11;
        ModelPaymentPromotionLayout modelPaymentPromotionLayout2;
        CalcPaymentPromotionBean calcPaymentPromotionBean2;
        ModelPaymentPromotionLayout modelPaymentPromotionLayout3;
        ModelPaymentPromotionLayout modelPaymentPromotionLayout4;
        ModelDiscountPromotionItem discountPromotionItem;
        ModelPointPromotionItem pointPromotionItem;
        List<CalcPaymentPromotionItemBean> promotionItemList;
        Object next;
        List<CalcPaymentPromotionItemBean> promotionItemList2;
        Object next2;
        List<CalcPaymentPromotionItemBean> promotionItemList3;
        Object next3;
        String promotionTips;
        List<CalcPaymentPromotionItemBean> promotionItemList4;
        Intrinsics.checkNotNullParameter(bean, "bean");
        if (!TextUtils.isEmpty(bean.riskMsg)) {
            ToastUtils.showLong(bean.riskMsg, new Object[0]);
        }
        setPayAmount(this.f27461p);
        f0(bean);
        e0(bean.feeInfo);
        ModelPaymentInfoItem modelPaymentInfoItemR = R();
        if (modelPaymentInfoItemR != null) {
            p220oa.h.s(modelPaymentInfoItemR, Intrinsics.c(bean.earlyRefundEnable, Boolean.TRUE));
        }
        Long l6 = bean.totalDiscountAmount;
        long j10 = 0;
        long jLongValue2 = l6 != null ? l6.longValue() : 0L;
        p355xf.t tVar = this.f27524v0;
        if (jLongValue2 > 0) {
            TextView textView = (TextView) tVar.getValue();
            if (textView != null) {
                p220oa.h.s(textView, true);
            }
            Long l8 = bean.totalDiscountAmount;
            long jLongValue3 = l8 != null ? l8.longValue() : 0L;
            Long l10 = bean.payAmount;
            long jLongValue4 = jLongValue3 + (l10 != null ? l10.longValue() : 0L);
            TextView textView2 = (TextView) tVar.getValue();
            if (textView2 != null) {
                textView2.setText(r0.B(jLongValue4, true));
            }
            TextView textView3 = (TextView) tVar.getValue();
            if (textView3 != null) {
                textView3.setPaintFlags(textView3.getPaintFlags() | 16);
            }
        } else {
            TextView textView4 = (TextView) tVar.getValue();
            if (textView4 != null) {
                p220oa.h.s(textView4, false);
            }
        }
        String str2 = "";
        if (bean.promotion != null) {
            X();
            ModelPaymentPromotionLayout modelPaymentPromotionLayout5 = this.f27510U0;
            if (modelPaymentPromotionLayout5 != null) {
                p220oa.h.s(modelPaymentPromotionLayout5, true);
                unit = Unit.f38893a;
            } else {
                unit = null;
            }
            if (unit == null) {
                str2 = "";
                X();
                modelPaymentPromotionLayout = this.f27510U0;
                if (modelPaymentPromotionLayout != null) {
                    p220oa.h.s(modelPaymentPromotionLayout, false);
                }
            } else {
                CalcPaymentPromotionBean calcPaymentPromotionBean3 = bean.promotion;
                if (calcPaymentPromotionBean3 != null && (promotionTips = calcPaymentPromotionBean3.getPromotionTips()) != null) {
                    X();
                    ModelPaymentPromotionLayout modelPaymentPromotionLayout6 = this.f27510U0;
                    if (modelPaymentPromotionLayout6 != null) {
                        CalcPaymentPromotionBean calcPaymentPromotionBean4 = bean.promotion;
                        modelPaymentPromotionLayout6.c((calcPaymentPromotionBean4 == null || (promotionItemList4 = calcPaymentPromotionBean4.getPromotionItemList()) == null) ? 0 : promotionItemList4.size(), promotionTips);
                    }
                }
                CalcPaymentPromotionBean calcPaymentPromotionBean5 = bean.promotion;
                if (calcPaymentPromotionBean5 == null || (promotionItemList3 = calcPaymentPromotionBean5.getPromotionItemList()) == null) {
                    zBooleanValue = false;
                    zBooleanValue2 = false;
                    strJ = "";
                    strO = strJ;
                } else {
                    Iterator<T> it = promotionItemList3.iterator();
                    do {
                        if (!it.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it.next();
                    } while (!CalcPaymentPromotionItemBean.PROMOTION_TYPE_POINT.equalsIgnoreCase(((CalcPaymentPromotionItemBean) next3).getPromotionType()));
                    CalcPaymentPromotionItemBean calcPaymentPromotionItemBean = (CalcPaymentPromotionItemBean) next3;
                    if (calcPaymentPromotionItemBean != null) {
                        Boolean boolIsUsed = calcPaymentPromotionItemBean.isUsed();
                        zBooleanValue = boolIsUsed != null ? boolIsUsed.booleanValue() : false;
                        Long promotionValue = calcPaymentPromotionItemBean.getPromotionValue();
                        strO = C0.G.o("- ", r0.x0(promotionValue != null ? promotionValue.longValue() : 0L));
                        Boolean boolIsShow = calcPaymentPromotionItemBean.isShow();
                        zBooleanValue2 = boolIsShow != null ? boolIsShow.booleanValue() : false;
                        Long promotionValue2 = calcPaymentPromotionItemBean.getPromotionValue();
                        strJ = q0.j(r0.x0(promotionValue2 != null ? promotionValue2.longValue() : 0L), " available");
                    } else {
                        zBooleanValue = false;
                        zBooleanValue2 = false;
                        strJ = "";
                        strO = strJ;
                    }
                }
                CalcPaymentPromotionBean calcPaymentPromotionBean6 = bean.promotion;
                if (calcPaymentPromotionBean6 == null || (promotionItemList2 = calcPaymentPromotionBean6.getPromotionItemList()) == null) {
                    j6 = 0;
                } else {
                    Iterator<T> it2 = promotionItemList2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            j6 = j10;
                            next2 = null;
                            break;
                        } else {
                            next2 = it2.next();
                            j6 = j10;
                            if ("DISCOUNT".equalsIgnoreCase(((CalcPaymentPromotionItemBean) next2).getPromotionType())) {
                                break;
                            } else {
                                j10 = j6;
                            }
                        }
                    }
                    CalcPaymentPromotionItemBean calcPaymentPromotionItemBean2 = (CalcPaymentPromotionItemBean) next2;
                    if (calcPaymentPromotionItemBean2 != null) {
                        Boolean boolIsUsed2 = calcPaymentPromotionItemBean2.isUsed();
                        boolean zBooleanValue4 = boolIsUsed2 != null ? boolIsUsed2.booleanValue() : false;
                        Long promotionAmount = calcPaymentPromotionItemBean2.getPromotionAmount();
                        jLongValue = promotionAmount != null ? promotionAmount.longValue() : j6;
                        Long promotionAmount2 = calcPaymentPromotionItemBean2.getPromotionAmount();
                        strO2 = C0.G.o("-", r0.B(promotionAmount2 != null ? promotionAmount2.longValue() : j6, true));
                        Boolean boolIsShow2 = calcPaymentPromotionItemBean2.isShow();
                        boolean zBooleanValue5 = boolIsShow2 != null ? boolIsShow2.booleanValue() : false;
                        Long promotionAmount3 = calcPaymentPromotionItemBean2.getPromotionAmount();
                        strJ2 = q0.j(r0.B(promotionAmount3 != null ? promotionAmount3.longValue() : j6, true), " available");
                        z10 = zBooleanValue5;
                        z8 = zBooleanValue4;
                    }
                    calcPaymentPromotionBean = bean.promotion;
                    if (calcPaymentPromotionBean != null || (promotionItemList = calcPaymentPromotionBean.getPromotionItemList()) == null) {
                        z8 = z8;
                        z10 = z10;
                        string = str2;
                        str = string;
                        l5 = null;
                        iIntValue = 0;
                        zBooleanValue3 = false;
                        couponType = null;
                        z11 = false;
                    } else {
                        Iterator<T> it3 = promotionItemList.iterator();
                        do {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                        } while (!CalcPaymentPromotionItemBean.PROMOTION_TYPE_COUPON.equalsIgnoreCase(((CalcPaymentPromotionItemBean) next).getPromotionType()));
                        CalcPaymentPromotionItemBean calcPaymentPromotionItemBean3 = (CalcPaymentPromotionItemBean) next;
                        if (calcPaymentPromotionItemBean3 != null) {
                            Boolean boolIsUsed3 = calcPaymentPromotionItemBean3.isUsed();
                            boolean zBooleanValue6 = boolIsUsed3 != null ? boolIsUsed3.booleanValue() : false;
                            Integer availableCoupon = calcPaymentPromotionItemBean3.getAvailableCoupon();
                            iIntValue = availableCoupon != null ? availableCoupon.intValue() : 0;
                            Long promotionAmount4 = calcPaymentPromotionItemBean3.getPromotionAmount();
                            String strO3 = C0.G.o("-", r0.B(promotionAmount4 != null ? promotionAmount4.longValue() : j6, true));
                            Boolean boolIsShow3 = calcPaymentPromotionItemBean3.isShow();
                            zBooleanValue3 = boolIsShow3 != null ? boolIsShow3.booleanValue() : false;
                            Long couponId = calcPaymentPromotionItemBean3.getCouponId();
                            couponType = calcPaymentPromotionItemBean3.getCouponType();
                            int i7 = p025ba.k.core_x_max_available;
                            Long promotionAmount5 = calcPaymentPromotionItemBean3.getPromotionAmount();
                            z11 = zBooleanValue6;
                            string = getString(i7, r0.B(promotionAmount5 != null ? promotionAmount5.longValue() : j6, true));
                            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                            str = strO3;
                            l5 = couponId;
                        } else {
                            z8 = z8;
                            z10 = z10;
                            string = str2;
                            str = string;
                            l5 = null;
                            iIntValue = 0;
                            zBooleanValue3 = false;
                            couponType = null;
                            z11 = false;
                        }
                    }
                    if (!z11) {
                        this.f27503N0 = null;
                    } else if (z3 && l5 != null && l5.longValue() != j6) {
                        CashierCouponItem cashierCouponItem = new CashierCouponItem(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 2047, null);
                        cashierCouponItem.couponId = l5;
                        cashierCouponItem.couponType = couponType;
                        this.f27503N0 = cashierCouponItem;
                    }
                    X();
                    modelPaymentPromotionLayout2 = this.f27510U0;
                    if (modelPaymentPromotionLayout2 != null) {
                        modelPaymentPromotionLayout2.getCouponPromotionItem().e(string);
                        X();
                        modelPaymentPromotionLayout3 = this.f27510U0;
                        if (modelPaymentPromotionLayout3 != null && (pointPromotionItem = modelPaymentPromotionLayout3.getPointPromotionItem()) != null) {
                            pointPromotionItem.e(strJ);
                        }
                        X();
                        modelPaymentPromotionLayout4 = this.f27510U0;
                        if (modelPaymentPromotionLayout4 != null && (discountPromotionItem = modelPaymentPromotionLayout4.getDiscountPromotionItem()) != null) {
                            discountPromotionItem.e(strJ2);
                        }
                        modelPaymentPromotionLayout2.a(kotlin.collections.G.e(new Pair("DATA_PROMOTION_USED", Boolean.valueOf(zBooleanValue)), new Pair("DATA_PROMOTION_SHOW", Boolean.valueOf(zBooleanValue2)), new Pair("DATA_POINT_PROMOTION_VALUE", strO)), kotlin.collections.G.e(new Pair("DATA_PROMOTION_USED", Boolean.valueOf(z8)), new Pair("DATA_PROMOTION_SHOW", Boolean.valueOf(z10)), new Pair("DATA_DISCOUNT_PROMOTION_AMOUNT", Long.valueOf(jLongValue)), new Pair("DATA_DISCOUNT_PROMOTION_AMOUNT_STR", strO2)), kotlin.collections.G.e(new Pair("DATA_PROMOTION_USED", Boolean.valueOf(z11)), new Pair("DATA_PROMOTION_SHOW", Boolean.valueOf(zBooleanValue3)), new Pair("DATA_COUPON_PROMOTION_AMOUNT_STR", str), new Pair("DATA_COUPON_NUMBER_VALUE", Integer.valueOf(iIntValue))));
                    }
                    calcPaymentPromotionBean2 = bean.promotion;
                    if (calcPaymentPromotionBean2 != null) {
                        calcPaymentPromotionBean2.getPromotionItemList();
                    }
                }
                str2 = "";
                strO2 = str2;
                strJ2 = strO2;
                jLongValue = j6;
                z8 = false;
                z10 = false;
                calcPaymentPromotionBean = bean.promotion;
                if (calcPaymentPromotionBean != null) {
                    z8 = z8;
                    z10 = z10;
                    string = str2;
                    str = string;
                    l5 = null;
                    iIntValue = 0;
                    zBooleanValue3 = false;
                    couponType = null;
                    z11 = false;
                } else {
                    z8 = z8;
                    z10 = z10;
                    string = str2;
                    str = string;
                    l5 = null;
                    iIntValue = 0;
                    zBooleanValue3 = false;
                    couponType = null;
                    z11 = false;
                }
                if (!z11) {
                    this.f27503N0 = null;
                } else if (z3) {
                    CashierCouponItem cashierCouponItem2 = new CashierCouponItem(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 2047, null);
                    cashierCouponItem2.couponId = l5;
                    cashierCouponItem2.couponType = couponType;
                    this.f27503N0 = cashierCouponItem2;
                }
                X();
                modelPaymentPromotionLayout2 = this.f27510U0;
                if (modelPaymentPromotionLayout2 != null) {
                    modelPaymentPromotionLayout2.getCouponPromotionItem().e(string);
                    X();
                    modelPaymentPromotionLayout3 = this.f27510U0;
                    if (modelPaymentPromotionLayout3 != null) {
                        pointPromotionItem.e(strJ);
                    }
                    X();
                    modelPaymentPromotionLayout4 = this.f27510U0;
                    if (modelPaymentPromotionLayout4 != null) {
                        discountPromotionItem.e(strJ2);
                    }
                    modelPaymentPromotionLayout2.a(kotlin.collections.G.e(new Pair("DATA_PROMOTION_USED", Boolean.valueOf(zBooleanValue)), new Pair("DATA_PROMOTION_SHOW", Boolean.valueOf(zBooleanValue2)), new Pair("DATA_POINT_PROMOTION_VALUE", strO)), kotlin.collections.G.e(new Pair("DATA_PROMOTION_USED", Boolean.valueOf(z8)), new Pair("DATA_PROMOTION_SHOW", Boolean.valueOf(z10)), new Pair("DATA_DISCOUNT_PROMOTION_AMOUNT", Long.valueOf(jLongValue)), new Pair("DATA_DISCOUNT_PROMOTION_AMOUNT_STR", strO2)), kotlin.collections.G.e(new Pair("DATA_PROMOTION_USED", Boolean.valueOf(z11)), new Pair("DATA_PROMOTION_SHOW", Boolean.valueOf(zBooleanValue3)), new Pair("DATA_COUPON_PROMOTION_AMOUNT_STR", str), new Pair("DATA_COUPON_NUMBER_VALUE", Integer.valueOf(iIntValue))));
                }
                calcPaymentPromotionBean2 = bean.promotion;
                if (calcPaymentPromotionBean2 != null) {
                    calcPaymentPromotionBean2.getPromotionItemList();
                }
            }
        } else {
            str2 = "";
            X();
            modelPaymentPromotionLayout = this.f27510U0;
            if (modelPaymentPromotionLayout != null) {
                p220oa.h.s(modelPaymentPromotionLayout, false);
            }
        }
        CalcPaymentEarnInfoBean calcPaymentEarnInfoBean = bean.earnInfo;
        if (calcPaymentEarnInfoBean == null || (earnItemList = calcPaymentEarnInfoBean.getEarnItemList()) == null || !(!earnItemList.isEmpty())) {
            ModelPaymentEarnLayout modelPaymentEarnLayoutP = P();
            if (modelPaymentEarnLayoutP != null) {
                modelPaymentEarnLayoutP.setVisibility(8);
            }
        } else {
            ModelPaymentEarnLayout modelPaymentEarnLayoutP2 = P();
            if (modelPaymentEarnLayoutP2 != null) {
                modelPaymentEarnLayoutP2.setVisibility(0);
            }
            ArrayList arrayList = new ArrayList();
            CalcPaymentEarnInfoBean calcPaymentEarnInfoBean2 = bean.earnInfo;
            if (calcPaymentEarnInfoBean2 != null && (earnItemList2 = calcPaymentEarnInfoBean2.getEarnItemList()) != null) {
                for (CalcPaymentEarnItem calcPaymentEarnItem : earnItemList2) {
                    arrayList.add(new Vb.d(calcPaymentEarnItem.getShowName(), calcPaymentEarnItem.getShowValue()));
                }
            }
            ModelPaymentEarnLayout modelPaymentEarnLayoutP3 = P();
            if (modelPaymentEarnLayoutP3 != null) {
                modelPaymentEarnLayoutP3.setTipsClickListener(new C1488w(this, 28));
            }
            ModelPaymentEarnLayout modelPaymentEarnLayoutP4 = P();
            if (modelPaymentEarnLayoutP4 != null) {
                CalcPaymentEarnInfoBean calcPaymentEarnInfoBean3 = bean.earnInfo;
                if (calcPaymentEarnInfoBean3 == null || (earnTips = calcPaymentEarnInfoBean3.getEarnTips()) == null) {
                    earnTips = str2;
                }
                modelPaymentEarnLayoutP4.setEarnInfoTips(earnTips);
            }
            ModelPaymentEarnLayout modelPaymentEarnLayoutP5 = P();
            if (modelPaymentEarnLayoutP5 != null) {
                modelPaymentEarnLayoutP5.setEarnInfoList(arrayList);
            }
        }
        CashierManualGet cashierManualGet = bean.manualGet;
        if (cashierManualGet == null || (list = cashierManualGet.getList()) == null || !(!list.isEmpty())) {
            ModelPaymentManualGetLayout modelPaymentManualGetLayoutQ = Q();
            if (modelPaymentManualGetLayoutQ != null) {
                modelPaymentManualGetLayoutQ.setVisibility(8);
            }
        } else {
            ModelPaymentManualGetLayout modelPaymentManualGetLayoutQ2 = Q();
            if (modelPaymentManualGetLayoutQ2 != null) {
                modelPaymentManualGetLayoutQ2.setVisibility(0);
            }
            ModelPaymentManualGetLayout modelPaymentManualGetLayoutQ3 = Q();
            if (modelPaymentManualGetLayoutQ3 != null) {
                modelPaymentManualGetLayoutQ3.setTipsClickListener(new C1488w(this, 26));
            }
            ModelPaymentManualGetLayout modelPaymentManualGetLayoutQ4 = Q();
            if (modelPaymentManualGetLayoutQ4 != null) {
                modelPaymentManualGetLayoutQ4.setManualGetInfoData(bean.manualGet);
            }
        }
        y(bean);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        io.fastkv.n.B(this, ((CoreCashierViewModel) l()).f28063g, this, new A(this, 0), new p010a9.m(this, 9), false, new C1488w(this, 25), JfifUtil.MARKER_RST0);
        com.transsnet.palmpay.core.base.l lVar = ((CoreCashierViewModel) l()).f28062f;
        if (lVar != null) {
            lVar.e(this, new p054dd.q(new E(this, this, 0), 2));
        }
        com.transsnet.palmpay.core.base.l lVar2 = ((CoreCashierViewModel) l()).f28061e;
        if (lVar2 != null) {
            lVar2.e(this, new p054dd.q(new E(this, this, 1), 2));
        }
        io.fastkv.n.B(this, ((CoreCashierViewModel) l()).f28064i, this, new A(this, 1), new com.facebook.react.packagerconnection.a(6), true, null, 224);
        io.fastkv.n.B(this, ((CoreCashierViewModel) l()).f28065j, this, new A(this, 2), new com.facebook.react.packagerconnection.a(7), true, null, 224);
        com.transsnet.palmpay.core.base.l lVar3 = ((CoreCashierViewModel) l()).f28066o;
        if (lVar3 != null) {
            lVar3.e(this, new p054dd.q(new E(this, this, 2), 2));
        }
        io.fastkv.n.B(this, ((CoreCashierViewModel) l()).f28067p, this, new A(this, 3), new com.facebook.react.packagerconnection.a(8), true, null, 224);
        io.fastkv.n.B(this, ((CoreCashierViewModel) l()).t, this, new A(this, 4), new com.facebook.react.packagerconnection.a(5), false, null, 224);
    }

    public final void setPayAmount(long j6) {
        boolean zIsEmpty = TextUtils.isEmpty(this.f27459j);
        p355xf.t tVar = this.f27525w0;
        if (!zIsEmpty) {
            TextView textView = (TextView) tVar.getValue();
            if (textView != null) {
                textView.setText(this.f27459j);
                return;
            }
            return;
        }
        if (j6 > 0) {
            TextView textView2 = (TextView) tVar.getValue();
            if (textView2 != null) {
                textView2.setText(r0.B(j6, true));
                return;
            }
            return;
        }
        TextView textView3 = (TextView) tVar.getValue();
        if (textView3 != null) {
            textView3.setText(r0.B(0L, true));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public void setupView() {
        super.setupView();
        setWindowBackground(com.transsnet.palmpay.custom_view.p.cv_preview_window_bg);
        org.greenrobot.eventbus.c.b().j(this);
        View viewFindViewById = findViewById(p025ba.e.groupPreview);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        p220oa.h.s(viewFindViewById, false);
        getWindow().getDecorView().post(new androidx.core.provider.m(11, new Handler(Looper.getMainLooper()), this));
        V();
        androidx.activity.u.a(getOnBackPressedDispatcher(), this, new V8.w(this, 4));
    }

    @Override // com.transsnet.palmpay.core.ui.activity.BaseCoreCashierPreviewActivity
    public final void w(boolean z3) {
        CoreCashierViewModel coreCashierViewModel = (CoreCashierViewModel) l();
        coreCashierViewModel.getClass();
        QueryBankListReq queryBankListReq = new QueryBankListReq(7, 0);
        String strB = Pa.H.b("queryBankList", queryBankListReq);
        Intrinsics.checkNotNullExpressionValue(strB, "createCacheKey(...)");
        Boolean boolValueOf = Boolean.valueOf(z3);
        com.transsnet.palmpay.core.base.l lVar = coreCashierViewModel.t;
        lVar.f27356m = boolValueOf;
        AbstractC0780y.m(androidx.lifecycle.V.h(coreCashierViewModel), null, null, new Ma.f(lVar, q0.y(strB, "_", BaseApplication.getCountryLocale()), null, queryBankListReq), 3);
    }
}
