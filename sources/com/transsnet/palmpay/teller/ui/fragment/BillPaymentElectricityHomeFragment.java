package com.transsnet.palmpay.teller.ui.fragment;

import Ce.H;
import Ed.U;
import Ed.ViewOnFocusChangeListenerC0235o;
import G1.d;
import Hb.L;
import N8.C0463g;
import N8.q0;
import Oc.A;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Pd.f;
import Rd.f0;
import Wd.C0751z;
import Wd.I;
import Wf.AbstractC0780y;
import Wf.t0;
import Xd.C0784c;
import Zd.C0801f;
import Zd.C0802g;
import Zd.C0803h;
import Zd.C0804i;
import Zd.j;
import Zd.l;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.camera.camera2.internal.P0;
import androidx.camera.video.u;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.E;
import androidx.lifecycle.V;
import androidx.lifecycle.b0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.c;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.launcher.ARouter;
import com.bumptech.glide.load.resource.bitmap.z;
import com.bumptech.glide.m;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.cashier.CoreCashierPaymentExtra;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.req.AddFamilyAccontReq;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import com.transsnet.palmpay.core.viewmodel.ModelAvailableCouponItem;
import com.transsnet.palmpay.core.viewmodel.ModelAvailablePointItem;
import com.transsnet.palmpay.core.viewmodel.ModelBillQuickAccessItem;
import com.transsnet.palmpay.custom_view.ModelItemSelection;
import com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.utils.CommonExtKt;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.teller.bean.BillPaymentHomeParams;
import com.transsnet.palmpay.teller.bean.BillerListItemBean;
import com.transsnet.palmpay.teller.bean.BillerListRsp;
import com.transsnet.palmpay.teller.bean.ChannelDataItemBean;
import com.transsnet.palmpay.teller.bean.CreateTellerOrderReq;
import com.transsnet.palmpay.teller.bean.CreateTellerOrderRsp;
import com.transsnet.palmpay.teller.bean.ElectricitytemTipsBean;
import com.transsnet.palmpay.teller.bean.PaymentAmountItemBean;
import com.transsnet.palmpay.teller.bean.PaymentItemBean;
import com.transsnet.palmpay.teller.bean.PaymentItemListRsp;
import com.transsnet.palmpay.teller.bean.resp.BillOrderInfoConfirmData;
import com.transsnet.palmpay.teller.bean.resp.QueryElectricCustomerIdIsExitBean;
import com.transsnet.palmpay.teller.ui.activity.BillPaymentHomeActivity;
import com.transsnet.palmpay.teller.ui.dialog.BillOrderInfoConfirmDialog;
import com.transsnet.palmpay.teller.ui.dialog.PickBillerNewDialog;
import com.transsnet.palmpay.teller.ui.dialog.PickPaymentItemDialog;
import com.transsnet.palmpay.teller.ui.fragment.BillPaymentElectricityHomeFragment;
import com.transsnet.palmpay.teller.ui.view.ModelBillerTipsInfo;
import com.transsnet.palmpay.teller.viewmodel.BillPaymentElectricityHomeViewModel;
import com.transsnet.palmpay.util.KeyboardUtils;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.ToastUtils;
import io.fastkv.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C1850q;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.y;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p070ee.b;
import p086fe.B0;
import p086fe.C1668h;
import p086fe.C1670i;
import p086fe.C1689s;
import p086fe.C1701y;
import p086fe.C1702z;
import p155k9.i;
import p220oa.h;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001\rB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/fragment/BillPaymentElectricityHomeFragment;", "Lcom/transsnet/palmpay/teller/ui/fragment/BaseBillerFragment;", "Lcom/transsnet/palmpay/teller/viewmodel/BillPaymentElectricityHomeViewModel;", "LRd/f0;", "Lcom/transsnet/palmpay/teller/ui/dialog/PickBillerNewDialog$CallBack;", "Lcom/transsnet/palmpay/teller/ui/dialog/PickPaymentItemDialog$CallBack;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "messageEvent", "", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBillPaymentElectricityHomeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BillPaymentElectricityHomeFragment.kt\ncom/transsnet/palmpay/teller/ui/fragment/BillPaymentElectricityHomeFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n*L\n1#1,1624:1\n172#2,9:1625\n1#3:1634\n171#4,12:1635\n215#4:1647\n383#4:1648\n401#4:1649\n383#4:1650\n401#4:1651\n260#4,10:1652\n296#4:1662\n260#4,10:1663\n296#4:1673\n115#4,8:1674\n145#4:1682\n1869#5:1683\n295#5,2:1684\n1870#5:1686\n629#6,11:1687\n*S KotlinDebug\n*F\n+ 1 BillPaymentElectricityHomeFragment.kt\ncom/transsnet/palmpay/teller/ui/fragment/BillPaymentElectricityHomeFragment\n*L\n101#1:1625,9\n532#1:1635,12\n532#1:1647\n541#1:1648\n541#1:1649\n653#1:1650\n653#1:1651\n673#1:1652,10\n673#1:1662\n689#1:1663,10\n689#1:1673\n823#1:1674,8\n823#1:1682\n851#1:1683\n856#1:1684,2\n851#1:1686\n968#1:1687,11\n*E\n"})
public class BillPaymentElectricityHomeFragment extends BaseBillerFragment<BillPaymentElectricityHomeViewModel, f0> implements PickBillerNewDialog.CallBack, PickPaymentItemDialog.CallBack {

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final /* synthetic */ int f34255z0 = 0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public String f34259H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ChannelDataItemBean f34260L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public String f34261M;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public BillerListItemBean f34265Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public PaymentItemBean f34266k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public long f34267p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f34268q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public String f34269r0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public long f34271t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public long f34272u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public QueryElectricCustomerIdIsExitBean f34273v;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ModelAvailableCouponItem f34276w0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f34275w = new LinkedHashMap();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f34256A = 5;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final b0 f34257B = p002a.a.h(this, G.a(B0.class), new l(this, 0), new l(this, 1), new l(this, 2));

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final String f34258C = "1";

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final HashMap f34262Q = new HashMap();

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final ArrayList f34263X = new ArrayList();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final ArrayList f34264Y = new ArrayList();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public long f34270s0 = Long.MAX_VALUE;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public long f34274v0 = Long.MAX_VALUE;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final t f34277x0 = C2131j.b(new C0801f(this, 1));

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final t f34278y0 = C2131j.b(new Pa.b0(28));

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

    public final void A() {
        PpAmountEditText ppAmountEditText;
        PpAmountEditText ppAmountEditText2;
        f0 f0Var = (f0) this.f27335j;
        if (f0Var != null && (ppAmountEditText2 = f0Var.f8297g) != null) {
            ppAmountEditText2.clearFocus();
        }
        f0 f0Var2 = (f0) this.f27335j;
        if (f0Var2 == null || (ppAmountEditText = f0Var2.f8297g) == null) {
            return;
        }
        ppAmountEditText.setError("");
    }

    public final c B() {
        return (c) this.f34277x0.getValue();
    }

    public final String C() {
        ModelNumberInputLayout modelNumberInputLayout;
        String number;
        f0 f0Var = (f0) this.f27335j;
        return (f0Var == null || (modelNumberInputLayout = f0Var.f8303w) == null || (number = modelNumberInputLayout.getNumber()) == null) ? "" : number;
    }

    public final C0784c D() {
        return (C0784c) this.f34278y0.getValue();
    }

    public final void E() {
        String string;
        String billerId;
        String billerName;
        String institutionLogo;
        String customerField1;
        Long debtAmount;
        Long debtAmount2;
        Long debtAmount3;
        Long maxAmount;
        Long maxAmount2;
        BillerListItemBean billerListItemBean;
        Long minAmount;
        if (!BaseApplication.hasLogin()) {
            i0.K(null, null);
            return;
        }
        if (TextUtils.isEmpty(C())) {
            f0 f0Var = (f0) this.f27335j;
            if (f0Var != null) {
                f0Var.f8303w.setErrorMessage(getString(f.qt_please_enter_user_id));
                return;
            }
            return;
        }
        BillerListItemBean billerListItemBean2 = this.f34265Z;
        if (billerListItemBean2 != null) {
            Integer status = billerListItemBean2.getStatus();
            if (status == null || status.intValue() != 1) {
                f0 f0Var2 = (f0) this.f27335j;
                if (f0Var2 != null) {
                    f0Var2.f8283C.e(getString(f.qt_service_temporarily_unavailable_3, billerListItemBean2.getBillerName()));
                    return;
                }
                return;
            }
            String str = this.f34258C;
            if (Intrinsics.c(str, "2")) {
                n0.g().l("TV_click_Next");
            } else if (Intrinsics.c(str, "1")) {
                n0.g().l("Electricity_click_Next");
            }
            f0 f0Var3 = (f0) this.f27335j;
            if (f0Var3 != null) {
                PpAmountEditText ppAmountEditText = f0Var3.f8297g;
                if (!ppAmountEditText.f24359C) {
                    long longAmount = f0Var3 != null ? ppAmountEditText.getLongAmount() : 0L;
                    if (longAmount <= 0) {
                        ToastUtils.showLong(getString(f.qt_msg_amount_above_desc, r0.B(0L, false)), new Object[0]);
                        return;
                    }
                    long j6 = this.f34271t0;
                    BillerListItemBean billerListItemBean3 = this.f34265Z;
                    long jMax = Math.max(j6, Math.max((billerListItemBean3 == null || (minAmount = billerListItemBean3.getMinAmount()) == null) ? 0L : minAmount.longValue(), this.f34272u0));
                    if (longAmount < jMax) {
                        f0 f0Var4 = (f0) this.f27335j;
                        if (f0Var4 != null) {
                            f0Var4.f8297g.setError(getString(f.qt_msg_amount_above_desc, r0.B(jMax, false)));
                            return;
                        }
                        return;
                    }
                    long jLongValue = Long.MAX_VALUE;
                    if (this.f34270s0 == 0) {
                        this.f34270s0 = Long.MAX_VALUE;
                    }
                    BillerListItemBean billerListItemBean4 = this.f34265Z;
                    if (billerListItemBean4 != null && (maxAmount2 = billerListItemBean4.getMaxAmount()) != null && maxAmount2.longValue() == 0 && (billerListItemBean = this.f34265Z) != null) {
                        billerListItemBean.setMaxAmount(Long.MAX_VALUE);
                    }
                    if (this.f34274v0 == 0) {
                        this.f34274v0 = Long.MAX_VALUE;
                    }
                    long j10 = this.f34270s0;
                    BillerListItemBean billerListItemBean5 = this.f34265Z;
                    if (billerListItemBean5 != null && (maxAmount = billerListItemBean5.getMaxAmount()) != null) {
                        jLongValue = maxAmount.longValue();
                    }
                    long jMin = Math.min(j10, Math.min(jLongValue, this.f34274v0));
                    if (jMin >= jMax) {
                        jMax = jMin;
                    }
                    if (longAmount > jMax) {
                        f0 f0Var5 = (f0) this.f27335j;
                        if (f0Var5 != null) {
                            f0Var5.f8297g.setError(getString(f.qt_msg_amount_below_desc, r0.B(jMax, false)));
                            return;
                        }
                        return;
                    }
                    QueryElectricCustomerIdIsExitBean queryElectricCustomerIdIsExitBean = this.f34273v;
                    if (queryElectricCustomerIdIsExitBean != null ? Intrinsics.c(queryElectricCustomerIdIsExitBean.getDebtValidation(), Boolean.TRUE) : false) {
                        QueryElectricCustomerIdIsExitBean queryElectricCustomerIdIsExitBean2 = this.f34273v;
                        if (longAmount < ((queryElectricCustomerIdIsExitBean2 == null || (debtAmount3 = queryElectricCustomerIdIsExitBean2.getDebtAmount()) == null) ? 0L : debtAmount3.longValue())) {
                            QueryElectricCustomerIdIsExitBean queryElectricCustomerIdIsExitBean3 = this.f34273v;
                            if (queryElectricCustomerIdIsExitBean3 != null ? Intrinsics.c(queryElectricCustomerIdIsExitBean3.getDebtValidation(), Boolean.TRUE) : false) {
                                f0 f0Var6 = (f0) this.f27335j;
                                if ((f0Var6 != null ? f0Var6.f8297g.getLongAmount() : 0L) < ((queryElectricCustomerIdIsExitBean3 == null || (debtAmount2 = queryElectricCustomerIdIsExitBean3.getDebtAmount()) == null) ? 0L : debtAmount2.longValue())) {
                                    String strJ = q0.j(r0.B((queryElectricCustomerIdIsExitBean3 == null || (debtAmount = queryElectricCustomerIdIsExitBean3.getDebtAmount()) == null) ? 0L : debtAmount.longValue(), false), " (Current Arrears)");
                                    f0 f0Var7 = (f0) this.f27335j;
                                    if (f0Var7 != null) {
                                        f0Var7.f8297g.setError(getString(f.qt_msg_amount_above_desc, strJ));
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                }
            }
            PaymentItemBean paymentItemBean = this.f34266k0;
            if (paymentItemBean != null) {
                if (TextUtils.isEmpty(paymentItemBean.billerId)) {
                    BillerListItemBean billerListItemBean6 = this.f34265Z;
                    billerId = billerListItemBean6 != null ? billerListItemBean6.getBillerId() : null;
                } else {
                    billerId = paymentItemBean.billerId;
                }
                paymentItemBean.billerId = billerId;
                if (TextUtils.isEmpty(paymentItemBean.billerName)) {
                    BillerListItemBean billerListItemBean7 = this.f34265Z;
                    billerName = billerListItemBean7 != null ? billerListItemBean7.getBillerName() : null;
                } else {
                    billerName = paymentItemBean.billerName;
                }
                paymentItemBean.billerName = billerName;
                if (TextUtils.isEmpty(paymentItemBean.institutionLogo)) {
                    BillerListItemBean billerListItemBean8 = this.f34265Z;
                    institutionLogo = billerListItemBean8 != null ? billerListItemBean8.getInstitutionLogo() : null;
                } else {
                    institutionLogo = paymentItemBean.institutionLogo;
                }
                paymentItemBean.institutionLogo = institutionLogo;
                if (TextUtils.isEmpty(paymentItemBean.customerField1)) {
                    BillerListItemBean billerListItemBean9 = this.f34265Z;
                    customerField1 = billerListItemBean9 != null ? billerListItemBean9.getCustomerField1() : null;
                } else {
                    customerField1 = paymentItemBean.customerField1;
                }
                paymentItemBean.customerField1 = customerField1;
            }
            CreateTellerOrderReq req = new CreateTellerOrderReq();
            f0 f0Var8 = (f0) this.f27335j;
            req.businessAmount = f0Var8 != null ? f0Var8.f8297g.getLongAmount() : 0L;
            req.customerId = C();
            BillerListItemBean billerListItemBean10 = this.f34265Z;
            if (TextUtils.isEmpty(billerListItemBean10 != null ? billerListItemBean10.getUserIdTips() : null)) {
                string = getString(p070ee.c.e(str));
                Intrinsics.e(string);
            } else {
                BillerListItemBean billerListItemBean11 = this.f34265Z;
                if (billerListItemBean11 == null || (string = billerListItemBean11.getUserIdTips()) == null) {
                    string = "";
                }
            }
            req.customerDisplayName = string;
            req.transType = b.b(str);
            req.businessType = b.a(str);
            PaymentItemBean paymentItemBean2 = this.f34266k0;
            req.billerName = paymentItemBean2 != null ? paymentItemBean2.billerName : null;
            if (TextUtils.isEmpty(paymentItemBean2 != null ? paymentItemBean2.billerId : null)) {
                BillerListItemBean billerListItemBean12 = this.f34265Z;
                if (TextUtils.isEmpty(billerListItemBean12 != null ? billerListItemBean12.getBillerId() : null)) {
                    h.y(this, getString(f.qt_select_biller_to_pay));
                    return;
                } else {
                    BillerListItemBean billerListItemBean13 = this.f34265Z;
                    req.billerId = billerListItemBean13 != null ? billerListItemBean13.getBillerId() : null;
                }
            } else {
                PaymentItemBean paymentItemBean3 = this.f34266k0;
                req.billerId = paymentItemBean3 != null ? paymentItemBean3.billerId : null;
            }
            req.categoryId = str;
            PaymentItemBean paymentItemBean4 = this.f34266k0;
            req.paymentItemId = paymentItemBean4 != null ? paymentItemBean4.paymentItemId : null;
            req.icon = paymentItemBean4 != null ? paymentItemBean4.institutionLogo : null;
            req.paymentItemName = paymentItemBean4 != null ? paymentItemBean4.paymentItemName : null;
            req.dataBundleItemName = paymentItemBean4 != null ? paymentItemBean4.paymentItemName : null;
            req.familyAccountCheck = true;
            req.outSourceId = this.f34261M;
            BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel = (BillPaymentElectricityHomeViewModel) this.f27333i;
            if (billPaymentElectricityHomeViewModel != null) {
                Intrinsics.checkNotNullParameter(req, "req");
                C1670i c1670i = new C1670i(req, null);
                com.transsnet.palmpay.core.base.l lVar = billPaymentElectricityHomeViewModel.f34394p;
                lVar.f27356m = req;
                Unit unit = Unit.f38893a;
                p140j8.f.v(billPaymentElectricityHomeViewModel, c1670i, lVar, 0L);
            }
        }
    }

    public final void F(BillerListItemBean billerListItemBean, boolean z3, boolean z8) {
        AppCompatAutoCompleteTextView numberEdit;
        String inputTips;
        TextView titleTv;
        ImageView startIconView;
        AppCompatAutoCompleteTextView numberEdit2;
        if (i0.W(requireActivity()) && billerListItemBean != null) {
            String string = "";
            if (this.f34265Z != null) {
                String billerId = billerListItemBean.getBillerId();
                BillerListItemBean billerListItemBean2 = this.f34265Z;
                if (!Intrinsics.c(billerId, billerListItemBean2 != null ? billerListItemBean2.getBillerId() : null) && z3) {
                    f0 f0Var = (f0) this.f27335j;
                    if (f0Var != null && (numberEdit2 = f0Var.f8303w.getNumberEdit()) != null) {
                        numberEdit2.setText("");
                    }
                    J();
                }
            }
            this.f34265Z = billerListItemBean;
            f0 f0Var2 = (f0) this.f27335j;
            if (f0Var2 != null) {
                ModelBillerTipsInfo modelBillerTipsInfo = f0Var2.f8281A;
                String billerId2 = billerListItemBean.getBillerId();
                BillerListItemBean billerListItemBean3 = this.f34265Z;
                modelBillerTipsInfo.b(billerId2, billerListItemBean3 != null ? billerListItemBean3.getBillerName() : null);
            }
            String shortName = !TextUtils.isEmpty(billerListItemBean.getShortName()) ? billerListItemBean.getShortName() : billerListItemBean.getBillerName();
            f0 f0Var3 = (f0) this.f27335j;
            if (f0Var3 != null) {
                f0Var3.f8283C.h(shortName);
            }
            Integer status = billerListItemBean.getStatus();
            if (status != null && status.intValue() == 1) {
                f0 f0Var4 = (f0) this.f27335j;
                if (f0Var4 != null) {
                    f0Var4.f8283C.d(true);
                }
                f0 f0Var5 = (f0) this.f27335j;
                if (f0Var5 != null) {
                    f0Var5.f8284H.d(true);
                }
                f0 f0Var6 = (f0) this.f27335j;
                if (f0Var6 != null) {
                    h.s(f0Var6.f8303w, true);
                }
                f0 f0Var7 = (f0) this.f27335j;
                if (f0Var7 != null) {
                    h.s(f0Var7.f8299j, true);
                }
            } else {
                f0 f0Var8 = (f0) this.f27335j;
                if (f0Var8 != null) {
                    f0Var8.f8283C.e(getString(f.qt_service_temporarily_unavailable_3, shortName));
                }
                f0 f0Var9 = (f0) this.f27335j;
                if (f0Var9 != null && (numberEdit = f0Var9.f8303w.getNumberEdit()) != null) {
                    numberEdit.setText("");
                }
                f0 f0Var10 = (f0) this.f27335j;
                if (f0Var10 != null) {
                    h.s(f0Var10.f8300o, false);
                }
                f0 f0Var11 = (f0) this.f27335j;
                if (f0Var11 != null) {
                    h.s(f0Var11.t, false);
                }
                f0 f0Var12 = (f0) this.f27335j;
                if (f0Var12 != null) {
                    f0Var12.f8283C.d(false);
                }
                f0 f0Var13 = (f0) this.f27335j;
                if (f0Var13 != null) {
                    f0Var13.f8284H.d(false);
                }
                f0 f0Var14 = (f0) this.f27335j;
                if (f0Var14 != null) {
                    h.s(f0Var14.f8303w, false);
                }
                f0 f0Var15 = (f0) this.f27335j;
                if (f0Var15 != null) {
                    h.s(f0Var15.f8299j, false);
                }
            }
            f0 f0Var16 = (f0) this.f27335j;
            if (f0Var16 != null && (startIconView = f0Var16.f8283C.getStartIconView()) != null) {
                ((m) com.bumptech.glide.b.c(getContext()).d(this).load(billerListItemBean.getInstitutionLogo()).a(new d().I(new z(CommonViewExtKt.getDp(8)), true)).x(r.cv_palmpay_logo_6)).S(startIconView);
            }
            f0 f0Var17 = (f0) this.f27335j;
            if (f0Var17 != null && (titleTv = f0Var17.f8303w.getTitleTv()) != null) {
                String str = p070ee.c.f36289a;
                String string2 = getString(p070ee.c.e(this.f34258C));
                BillerListItemBean billerListItemBean4 = this.f34265Z;
                if (!TextUtils.isEmpty(billerListItemBean4 != null ? billerListItemBean4.getInputTitle() : null)) {
                    BillerListItemBean billerListItemBean5 = this.f34265Z;
                    string2 = billerListItemBean5 != null ? billerListItemBean5.getInputTitle() : null;
                }
                titleTv.setText(string2);
            }
            BillerListItemBean billerListItemBean6 = this.f34265Z;
            if (TextUtils.isEmpty(billerListItemBean6 != null ? billerListItemBean6.getInputTips() : null)) {
                string = getString(Vd.a.qt_enter_account_number);
                Intrinsics.e(string);
            } else {
                BillerListItemBean billerListItemBean7 = this.f34265Z;
                if (billerListItemBean7 != null && (inputTips = billerListItemBean7.getInputTips()) != null) {
                    string = inputTips;
                }
            }
            f0 f0Var18 = (f0) this.f27335j;
            if (f0Var18 != null) {
                f0Var18.f8303w.setHint(string);
            }
            J();
            String billerId3 = billerListItemBean.getBillerId();
            if (billerId3 != null) {
                BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel = (BillPaymentElectricityHomeViewModel) this.f27333i;
                if (billPaymentElectricityHomeViewModel != null) {
                    billPaymentElectricityHomeViewModel.e(billerId3, false, z8);
                }
                BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel2 = (BillPaymentElectricityHomeViewModel) this.f27333i;
                if (billPaymentElectricityHomeViewModel2 != null) {
                    billPaymentElectricityHomeViewModel2.f(billerId3);
                }
            }
            Q();
        }
    }

    public final void G(PaymentItemBean paymentItemBean, boolean z3) {
        f0 f0Var;
        if (paymentItemBean == null) {
            return;
        }
        J();
        this.f34266k0 = paymentItemBean;
        String paymentItemName = paymentItemBean.paymentItemName;
        Intrinsics.checkNotNullExpressionValue(paymentItemName, "paymentItemName");
        N(paymentItemName);
        long j6 = paymentItemBean.amount;
        if (j6 > 0 && (f0Var = (f0) this.f27335j) != null) {
            f0Var.f8297g.setAmount(r0.A(j6));
        }
        if (paymentItemBean.isAmountFixed != 0 || paymentItemBean.amount <= 0) {
            long j10 = this.f34267p0;
            if (j10 > 0) {
                f0 f0Var2 = (f0) this.f27335j;
                if (f0Var2 != null) {
                    f0Var2.f8297g.setAmount(r0.A(j10));
                }
                A();
            }
            f0 f0Var3 = (f0) this.f27335j;
            if (f0Var3 != null) {
                f0Var3.f8297g.setEnabled(true);
            }
            f0 f0Var4 = (f0) this.f27335j;
            if (f0Var4 != null) {
                f0Var4.f8297g.d(false);
            }
            ArrayList<PaymentAmountItemBean> arrayList = paymentItemBean.itemPrices;
            if (arrayList == null || arrayList.isEmpty()) {
                f0 f0Var5 = (f0) this.f27335j;
                if (f0Var5 != null) {
                    f0Var5.f8286M.setText(getString(f.qt_amount));
                }
                D().setList(null);
                f0 f0Var6 = (f0) this.f27335j;
                if (f0Var6 != null) {
                    h.c(f0Var6.f8282B);
                }
            } else {
                f0 f0Var7 = (f0) this.f27335j;
                if (f0Var7 != null) {
                    f0Var7.f8286M.setText(getString(f.qt_select_amount));
                }
                ArrayList<PaymentAmountItemBean> itemPrices = paymentItemBean.itemPrices;
                Intrinsics.checkNotNullExpressionValue(itemPrices, "itemPrices");
                I(itemPrices);
                D().setList(paymentItemBean.itemPrices);
                f0 f0Var8 = (f0) this.f27335j;
                if (f0Var8 != null) {
                    h.C(f0Var8.f8282B);
                }
            }
        } else {
            f0 f0Var9 = (f0) this.f27335j;
            if (f0Var9 != null) {
                f0Var9.f8297g.setEnabled(false);
            }
            f0 f0Var10 = (f0) this.f27335j;
            if (f0Var10 != null) {
                f0Var10.f8297g.d(true);
            }
            f0 f0Var11 = (f0) this.f27335j;
            if (f0Var11 != null) {
                f0Var11.f8286M.setText(getString(Vd.a.qt_item_amount));
            }
        }
        this.f34272u0 = paymentItemBean.minAmount;
        if (paymentItemBean.maxAmount == 0) {
            paymentItemBean.maxAmount = Long.MAX_VALUE;
        }
        this.f34274v0 = paymentItemBean.maxAmount;
        if (z3) {
            return;
        }
        y();
    }

    public final boolean H(String str, String str2) {
        if (str != null) {
            ArrayList arrayList = this.f34264Y;
            if (arrayList.isEmpty() || !Intrinsics.c(((PaymentItemBean) arrayList.get(0)).billerId, str)) {
                BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel = (BillPaymentElectricityHomeViewModel) this.f27333i;
                if (billPaymentElectricityHomeViewModel != null) {
                    billPaymentElectricityHomeViewModel.e(str, false, false);
                }
                BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel2 = (BillPaymentElectricityHomeViewModel) this.f27333i;
                if (billPaymentElectricityHomeViewModel2 != null) {
                    billPaymentElectricityHomeViewModel2.f(str);
                }
            } else {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    if (!TextUtils.isEmpty(((PaymentItemBean) arrayList.get(i7)).paymentItemId) && Intrinsics.c(((PaymentItemBean) arrayList.get(i7)).paymentItemId, str2)) {
                        G((PaymentItemBean) arrayList.get(i7), false);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void I(List list) {
        String billerId;
        Object next;
        LinkedHashMap linkedHashMap = this.f34275w;
        BillerListItemBean billerListItemBean = this.f34265Z;
        if (billerListItemBean == null || (billerId = billerListItemBean.getBillerId()) == null) {
            billerId = "";
        }
        List list2 = (List) linkedHashMap.get(billerId);
        if (list2 != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PaymentAmountItemBean paymentAmountItemBean = (PaymentAmountItemBean) it.next();
                if (list2.isEmpty()) {
                    paymentAmountItemBean.discountText = "";
                } else {
                    Iterator it2 = list2.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!y.h(paymentAmountItemBean.priceId, ((ElectricitytemTipsBean) next).getPriceId(), true));
                    ElectricitytemTipsBean electricitytemTipsBean = (ElectricitytemTipsBean) next;
                    if (electricitytemTipsBean == null) {
                        paymentAmountItemBean.discountText = "";
                    } else {
                        paymentAmountItemBean.discountText = electricitytemTipsBean.getDiscountText();
                    }
                }
            }
        }
    }

    public final void J() {
        try {
            D().setList(null);
            C0784c c0784cD = D();
            c0784cD.f11143a = -1;
            c0784cD.notifyDataSetChanged();
            f0 f0Var = (f0) this.f27335j;
            if (f0Var != null) {
                f0Var.f8297g.setAmount("");
            }
            f0 f0Var2 = (f0) this.f27335j;
            if (f0Var2 != null) {
                f0Var2.f8297g.setError("");
            }
            A();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void K(String str, String str2, String str3, Long l5, boolean z3, boolean z8) {
        f0 f0Var;
        AppCompatAutoCompleteTextView numberEdit;
        this.f34269r0 = str;
        this.f34268q0 = str2;
        if (str3 != null && (f0Var = (f0) this.f27335j) != null && (numberEdit = f0Var.f8303w.getNumberEdit()) != null) {
            numberEdit.setText(str3);
        }
        long jLongValue = l5.longValue();
        this.f34267p0 = jLongValue;
        if (jLongValue > 0) {
            f0 f0Var2 = (f0) this.f27335j;
            if (f0Var2 != null) {
                f0Var2.f8297g.setAmount(r0.A(jLongValue));
            }
            A();
        }
        String str4 = this.f34269r0;
        if (str4 != null) {
            ArrayList arrayList = this.f34263X;
            if (arrayList.isEmpty()) {
                BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel = (BillPaymentElectricityHomeViewModel) this.f27333i;
                if (billPaymentElectricityHomeViewModel != null) {
                    billPaymentElectricityHomeViewModel.d(this.f34258C, false, z8);
                }
            } else {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    if (Intrinsics.c(((BillerListItemBean) arrayList.get(i7)).getBillerId(), str4)) {
                        F((BillerListItemBean) arrayList.get(i7), z3, z8);
                        break;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(this.f34268q0)) {
            String str5 = this.f34268q0;
            if (str5 != null) {
                H(this.f34269r0, str5);
                return;
            }
            return;
        }
        this.f34266k0 = null;
        this.f34267p0 = 0L;
        N("");
        f0 f0Var3 = (f0) this.f27335j;
        if (f0Var3 != null) {
            f0Var3.f8297g.setAmount("");
        }
    }

    public final void L(boolean z3) {
        if (this.f34260L == null) {
            this.f34260L = new ChannelDataItemBean();
        }
        ChannelDataItemBean channelDataItemBean = this.f34260L;
        if (channelDataItemBean != null) {
            K(channelDataItemBean.getBillerId(), channelDataItemBean.getPaymentItemId(), channelDataItemBean.getCustomerId(), Long.valueOf(channelDataItemBean.getBusinessAmount()), false, z3);
        }
    }

    public final void N(String str) {
        f0 f0Var = (f0) this.f27335j;
        if (f0Var != null) {
            f0Var.f8284H.h(str);
        }
        f0 f0Var2 = (f0) this.f27335j;
        if (f0Var2 != null) {
            f0Var2.f8289Y.setVisibility(8);
        }
        PaymentItemBean paymentItemBean = this.f34266k0;
        if (paymentItemBean != null) {
            if (TextUtils.isEmpty(paymentItemBean.remark)) {
                f0 f0Var3 = (f0) this.f27335j;
                if (f0Var3 != null) {
                    f0Var3.f8289Y.setVisibility(8);
                }
            } else {
                f0 f0Var4 = (f0) this.f27335j;
                if (f0Var4 != null) {
                    f0Var4.f8289Y.setVisibility(0);
                }
                f0 f0Var5 = (f0) this.f27335j;
                if (f0Var5 != null) {
                    TextView textView = f0Var5.f8289Y;
                    PaymentItemBean paymentItemBean2 = this.f34266k0;
                    textView.setText(paymentItemBean2 != null ? paymentItemBean2.remark : null);
                }
            }
        }
        Q();
    }

    public final void O() {
        PickBillerNewDialog pickBillerNewDialog = new PickBillerNewDialog(requireActivity(), "1", 0, false, 0, 28, null);
        String str = p070ee.c.f36289a;
        pickBillerNewDialog.setBusinessName(p070ee.c.c(getContext(), this.f34258C));
        pickBillerNewDialog.setCallBack(this);
        pickBillerNewDialog.show();
        pickBillerNewDialog.setBillers(this.f34263X);
    }

    public final void P() {
        PickPaymentItemDialog pickPaymentItemDialog = new PickPaymentItemDialog(requireActivity());
        boolean z3 = true;
        pickPaymentItemDialog.setHideScrollBar(true);
        pickPaymentItemDialog.setCallBack(this);
        boolean zIsNG = BaseApplication.isNG();
        String str = this.f34258C;
        if (!zIsNG || (!Intrinsics.c(str, "2") && !Intrinsics.c(str, TransType.TRANS_TYPE_AIRTIME_LOAN) && !Intrinsics.c(str, TransType.TRANS_TYPE_REPAY_CASH_LOAN) && !Intrinsics.c(str, "14") && !Intrinsics.c(str, TransType.TRANS_TYPE_COMMISSION) && !Intrinsics.c(str, "27") && !Intrinsics.c(str, TransType.TRANS_TYPE_BIND_BANK_CARD) && !Intrinsics.c(str, "29") && !Intrinsics.c(str, "30") && !Intrinsics.c(str, "31"))) {
            z3 = false;
        }
        pickPaymentItemDialog.setBFavorite(z3);
        if (Intrinsics.c(str, "2")) {
            String string = getString(Vd.a.qt_bouquet);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            pickPaymentItemDialog.setTitleItemlName(string);
        }
        pickPaymentItemDialog.show();
        pickPaymentItemDialog.setBiller(this.f34265Z);
        pickPaymentItemDialog.setPaymentItems(this.f34264Y);
    }

    public final void Q() {
        f0 f0Var = (f0) this.f27335j;
        if (f0Var != null) {
            PpAmountEditText ppAmountEditText = f0Var.f8297g;
            boolean z3 = z();
            TextView textView = ppAmountEditText.f24371i;
            if (textView != null) {
                textView.setEnabled(z3);
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        ((B0) this.f34257B.getValue()).f36482d.e(this, new C0803h(this, 0));
        BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel = (BillPaymentElectricityHomeViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar = billPaymentElectricityHomeViewModel != null ? billPaymentElectricityHomeViewModel.f34389f : null;
        if (lVar != null) {
            lVar.e(this, new I(new C0804i(this), 3));
        }
        BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel2 = (BillPaymentElectricityHomeViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar2 = billPaymentElectricityHomeViewModel2 != null ? billPaymentElectricityHomeViewModel2.f34390g : null;
        if (lVar2 != null) {
            lVar2.e(this, new I(new j(lVar2, this, 0), 3));
        }
        BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel3 = (BillPaymentElectricityHomeViewModel) this.f27333i;
        final int i7 = 2;
        n.B(this, billPaymentElectricityHomeViewModel3 != null ? billPaymentElectricityHomeViewModel3.f34391i : null, this, new Function2(this) { // from class: Zd.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillPaymentElectricityHomeFragment f11660b;

            {
                this.f11660b = this;
            }

            /* JADX WARN: Code duplicated, block: B:24:0x0065  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel4;
                CreateTellerOrderRsp.DataBean dataBean;
                BillOrderInfoConfirmData billOrderInfoConfirmData;
                BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel5;
                boolean zH;
                String paymentItemId;
                String str = "";
                BillPaymentElectricityHomeFragment billPaymentElectricityHomeFragment = this.f11660b;
                switch (i7) {
                    case 0:
                        CreateTellerOrderReq req = (CreateTellerOrderReq) obj;
                        CreateTellerOrderRsp rsp = (CreateTellerOrderRsp) obj2;
                        int i10 = BillPaymentElectricityHomeFragment.f34255z0;
                        Intrinsics.checkNotNullParameter(rsp, "rsp");
                        if (rsp.isSuccess()) {
                            if (req != null && (dataBean = rsp.data) != null) {
                                f0 f0Var = (f0) billPaymentElectricityHomeFragment.f27335j;
                                String str2 = billPaymentElectricityHomeFragment.f34258C;
                                if (f0Var != null && f0Var.f8295e.isChecked()) {
                                    AddFamilyAccontReq addFamilyAccontReq = new AddFamilyAccontReq();
                                    addFamilyAccontReq.customerId = billPaymentElectricityHomeFragment.C();
                                    PaymentItemBean paymentItemBean = billPaymentElectricityHomeFragment.f34266k0;
                                    addFamilyAccontReq.itemId = paymentItemBean != null ? paymentItemBean.paymentItemId : null;
                                    addFamilyAccontReq.billerName = paymentItemBean != null ? paymentItemBean.billerName : null;
                                    addFamilyAccontReq.institutionLogo = paymentItemBean != null ? paymentItemBean.institutionLogo : null;
                                    addFamilyAccontReq.categoryId = str2;
                                    addFamilyAccontReq.itemName = paymentItemBean != null ? paymentItemBean.paymentItemName : null;
                                    addFamilyAccontReq.billerId = paymentItemBean != null ? paymentItemBean.billerId : null;
                                    BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel6 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                                    if (billPaymentElectricityHomeViewModel6 != null) {
                                        p140j8.f.s(billPaymentElectricityHomeViewModel6, new C1668h(addFamilyAccontReq, null), billPaymentElectricityHomeViewModel6.f34395v, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                    }
                                    n0.g().l("PPay_Electricity_Btn_SaveToBeneficiaries");
                                }
                                if (!TextUtils.isEmpty(dataBean.orderNo)) {
                                    CreateTellerOrderRsp.DataBean dataBean2 = rsp.data;
                                    if (dataBean2 != null) {
                                        androidx.fragment.app.E mActivity = billPaymentElectricityHomeFragment.f27319c;
                                        Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
                                        C0751z c0751z = new C0751z(mActivity, 0);
                                        c0751z.f4978i = dataBean2.calculationExtInfo;
                                        c0751z.f4971b = rsp.data.orderNo;
                                        c0751z.c(Long.valueOf(req.businessAmount));
                                        c0751z.f4972c = p070ee.b.b(str2);
                                        c0751z.f4974e = "5";
                                        ArrayList arrayList = new ArrayList();
                                        String string = billPaymentElectricityHomeFragment.getString(Pd.f.qt_biller_name);
                                        String str3 = req.billerName;
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        arrayList.add(new CoreCashierPaymentExtra(string, str3));
                                        if (!TextUtils.isEmpty(dataBean2.fullName)) {
                                            String string2 = billPaymentElectricityHomeFragment.getString(Vd.a.qt_account_name);
                                            String str4 = dataBean2.fullName;
                                            if (str4 == null) {
                                                str4 = "";
                                            }
                                            arrayList.add(new CoreCashierPaymentExtra(string2, str4));
                                        }
                                        String str5 = req.customerDisplayName;
                                        if (str5 == null) {
                                            str5 = "";
                                        }
                                        arrayList.add(new CoreCashierPaymentExtra(str5, billPaymentElectricityHomeFragment.C()));
                                        if (!TextUtils.isEmpty(dataBean2.address)) {
                                            String string3 = billPaymentElectricityHomeFragment.getString(p025ba.k.core_address);
                                            String str6 = dataBean2.address;
                                            arrayList.add(new CoreCashierPaymentExtra(string3, str6 != null ? str6 : ""));
                                        }
                                        c0751z.b(arrayList);
                                        c0751z.d();
                                    }
                                } else if (!TextUtils.isEmpty(dataBean.outstandingTips)) {
                                    billPaymentElectricityHomeFragment.p(dataBean.outstandingTips);
                                }
                            }
                        } else if ("QK000011".equalsIgnoreCase(rsp.getRespCode())) {
                            if (req != null && (billPaymentElectricityHomeViewModel4 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i) != null) {
                                Intrinsics.checkNotNullParameter(req, "req");
                                C1702z c1702z = new C1702z(req, null);
                                com.transsnet.palmpay.core.base.l lVar3 = billPaymentElectricityHomeViewModel4.t;
                                lVar3.f27356m = req;
                                Unit unit = Unit.f38893a;
                                p140j8.f.v(billPaymentElectricityHomeViewModel4, c1702z, lVar3, 0L);
                            }
                        } else if ("B00015".equals(rsp.getRespCode())) {
                            if (!TextUtils.isEmpty(rsp.getRespMsg())) {
                                f0 f0Var2 = (f0) billPaymentElectricityHomeFragment.f27335j;
                                if (f0Var2 != null) {
                                    p220oa.h.s(f0Var2.f8300o, false);
                                }
                                f0 f0Var3 = (f0) billPaymentElectricityHomeFragment.f27335j;
                                if (f0Var3 != null) {
                                    ModelNumberInputLayout modelNumberInputLayout = f0Var3.f8303w;
                                    String respMsg = rsp.getRespMsg();
                                    modelNumberInputLayout.setErrorMessage(respMsg != null ? respMsg : "");
                                }
                            }
                        } else if ("QK000010".equals(rsp.getRespCode())) {
                            String string4 = billPaymentElectricityHomeFragment.getString(p025ba.k.core_important_notice);
                            String respMsg2 = rsp.getRespMsg();
                            billPaymentElectricityHomeFragment.r(string4, respMsg2 != null ? respMsg2 : "", billPaymentElectricityHomeFragment.getString(p025ba.k.core_confirm), null);
                        } else {
                            ToastUtils.showLong(rsp.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 1:
                        CreateTellerOrderReq createTellerOrderReq = (CreateTellerOrderReq) obj;
                        CommonBeanResult rsp2 = (CommonBeanResult) obj2;
                        int i11 = BillPaymentElectricityHomeFragment.f34255z0;
                        Intrinsics.checkNotNullParameter(rsp2, "rsp");
                        if (rsp2.isSuccess()) {
                            if (createTellerOrderReq != null && (billOrderInfoConfirmData = (BillOrderInfoConfirmData) rsp2.data) != null) {
                                new BillOrderInfoConfirmDialog(billPaymentElectricityHomeFragment.requireActivity(), 0, 0, 6, null).setOrderInfo(billOrderInfoConfirmData).setOnConfirmClickListener(new L(7, createTellerOrderReq, billPaymentElectricityHomeFragment)).show();
                            }
                        } else if ("B00015".equals(rsp2.getRespCode())) {
                            if (!TextUtils.isEmpty(rsp2.getRespMsg())) {
                                f0 f0Var4 = (f0) billPaymentElectricityHomeFragment.f27335j;
                                if (f0Var4 != null) {
                                    p220oa.h.s(f0Var4.f8300o, false);
                                }
                                f0 f0Var5 = (f0) billPaymentElectricityHomeFragment.f27335j;
                                if (f0Var5 != null) {
                                    ModelNumberInputLayout modelNumberInputLayout2 = f0Var5.f8303w;
                                    String respMsg3 = rsp2.getRespMsg();
                                    modelNumberInputLayout2.setErrorMessage(respMsg3 != null ? respMsg3 : "");
                                }
                            }
                        } else if ("QK000010".equals(rsp2.getRespCode())) {
                            String string5 = billPaymentElectricityHomeFragment.getString(p025ba.k.core_important_notice);
                            String respMsg4 = rsp2.getRespMsg();
                            billPaymentElectricityHomeFragment.r(string5, respMsg4 != null ? respMsg4 : "", billPaymentElectricityHomeFragment.getString(p025ba.k.core_confirm), null);
                        } else {
                            ToastUtils.showLong(rsp2.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 2:
                        BillPaymentHomeParams billPaymentHomeParams = (BillPaymentHomeParams) obj;
                        BillerListRsp rsp3 = (BillerListRsp) obj2;
                        int i12 = BillPaymentElectricityHomeFragment.f34255z0;
                        Intrinsics.checkNotNullParameter(rsp3, "rsp");
                        if (rsp3.isSuccess()) {
                            List<BillerListItemBean> list = rsp3.data;
                            if (list != null) {
                                billPaymentElectricityHomeFragment.f34263X.clear();
                                billPaymentElectricityHomeFragment.f34263X.addAll(list);
                                ChannelDataItemBean channelDataItemBean = billPaymentElectricityHomeFragment.f34260L;
                                if (channelDataItemBean != null) {
                                    billPaymentElectricityHomeFragment.K(channelDataItemBean.getBillerId(), channelDataItemBean.getPaymentItemId(), channelDataItemBean.getCustomerId(), Long.valueOf(channelDataItemBean.getBusinessAmount()), true, false);
                                }
                                String str7 = billPaymentElectricityHomeFragment.f34259H;
                                if (str7 != null) {
                                    if (TextUtils.isEmpty(str7)) {
                                        str7 = null;
                                    }
                                    if (str7 != null) {
                                        billPaymentElectricityHomeFragment.K(str7, "", "", 0L, true, false);
                                    }
                                }
                                ChannelDataItemBean channelDataItemBean2 = billPaymentElectricityHomeFragment.f34260L;
                                if ((channelDataItemBean2 == null || (TextUtils.isEmpty(channelDataItemBean2.getBillerName()) && TextUtils.isEmpty(billPaymentElectricityHomeFragment.f34259H))) && (billPaymentElectricityHomeViewModel5 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i) != null) {
                                    StringBuilder sb2 = new StringBuilder("queryLastBillerByCategoryId");
                                    String str8 = billPaymentElectricityHomeFragment.f34258C;
                                    sb2.append(str8);
                                    String strB = Pa.H.b(sb2.toString());
                                    Intrinsics.checkNotNullExpressionValue(strB, "createCacheKey(...)");
                                    AbstractC0780y.m(V.h(billPaymentElectricityHomeViewModel5), null, null, new C1701y(billPaymentElectricityHomeViewModel5.f34393o, q0.y(strB, "_", BaseApplication.getCountryLocale()), null, str8), 3);
                                }
                                if (billPaymentHomeParams != null && billPaymentHomeParams.getShowDialog()) {
                                    billPaymentElectricityHomeFragment.O();
                                }
                            }
                        } else {
                            ToastUtils.showLong(rsp3.getRespMsg(), new Object[0]);
                        }
                        break;
                    default:
                        BillPaymentHomeParams billPaymentHomeParams2 = (BillPaymentHomeParams) obj;
                        PaymentItemListRsp rsp4 = (PaymentItemListRsp) obj2;
                        int i13 = BillPaymentElectricityHomeFragment.f34255z0;
                        Intrinsics.checkNotNullParameter(rsp4, "rsp");
                        if (rsp4.isSuccess()) {
                            List<PaymentItemBean> list2 = rsp4.data;
                            if (list2 != null) {
                                billPaymentElectricityHomeFragment.f34264Y.clear();
                                ArrayList arrayList2 = billPaymentElectricityHomeFragment.f34264Y;
                                arrayList2.addAll(list2);
                                if (!TextUtils.isEmpty(billPaymentElectricityHomeFragment.f34268q0)) {
                                    String str9 = billPaymentElectricityHomeFragment.f34268q0;
                                    if (str9 == null || arrayList2.isEmpty()) {
                                        zH = false;
                                    } else {
                                        zH = billPaymentElectricityHomeFragment.H(billPaymentElectricityHomeFragment.f34269r0, str9);
                                    }
                                } else if (arrayList2.isEmpty()) {
                                    zH = false;
                                } else {
                                    String str10 = billPaymentElectricityHomeFragment.f34269r0;
                                    ChannelDataItemBean channelDataItemBean3 = billPaymentElectricityHomeFragment.f34260L;
                                    if (channelDataItemBean3 != null && (paymentItemId = channelDataItemBean3.getPaymentItemId()) != null) {
                                        str = paymentItemId;
                                    }
                                    zH = billPaymentElectricityHomeFragment.H(str10, str);
                                }
                                if (billPaymentHomeParams2 != null && !billPaymentHomeParams2.getIsSelectPaymentItemForOtherPager() && !zH && arrayList2.size() > 0) {
                                    BillerListItemBean billerListItemBean = billPaymentElectricityHomeFragment.f34265Z;
                                    if ((billerListItemBean != null ? billerListItemBean.getBillerId() : null) != null) {
                                        BillerListItemBean billerListItemBean2 = billPaymentElectricityHomeFragment.f34265Z;
                                        if (Intrinsics.c(billerListItemBean2 != null ? billerListItemBean2.getBillerId() : null, ((PaymentItemBean) arrayList2.get(0)).billerId)) {
                                            billPaymentElectricityHomeFragment.onPaymentItemClick((PaymentItemBean) arrayList2.get(0));
                                        }
                                    }
                                }
                                if (billPaymentHomeParams2 != null && billPaymentHomeParams2.getShowDialog()) {
                                    billPaymentElectricityHomeFragment.P();
                                }
                            }
                        } else {
                            ToastUtils.showLong(rsp4.getRespMsg(), new Object[0]);
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new Wd.G(16), false, null, 224);
        BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel4 = (BillPaymentElectricityHomeViewModel) this.f27333i;
        final int i10 = 3;
        n.B(this, billPaymentElectricityHomeViewModel4 != null ? billPaymentElectricityHomeViewModel4.f34387A : null, this, new Function2(this) { // from class: Zd.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillPaymentElectricityHomeFragment f11660b;

            {
                this.f11660b = this;
            }

            /* JADX WARN: Code duplicated, block: B:24:0x0065  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel5;
                CreateTellerOrderRsp.DataBean dataBean;
                BillOrderInfoConfirmData billOrderInfoConfirmData;
                BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel6;
                boolean zH;
                String paymentItemId;
                String str = "";
                BillPaymentElectricityHomeFragment billPaymentElectricityHomeFragment = this.f11660b;
                switch (i10) {
                    case 0:
                        CreateTellerOrderReq req = (CreateTellerOrderReq) obj;
                        CreateTellerOrderRsp rsp = (CreateTellerOrderRsp) obj2;
                        int i11 = BillPaymentElectricityHomeFragment.f34255z0;
                        Intrinsics.checkNotNullParameter(rsp, "rsp");
                        if (rsp.isSuccess()) {
                            if (req != null && (dataBean = rsp.data) != null) {
                                f0 f0Var = (f0) billPaymentElectricityHomeFragment.f27335j;
                                String str2 = billPaymentElectricityHomeFragment.f34258C;
                                if (f0Var != null && f0Var.f8295e.isChecked()) {
                                    AddFamilyAccontReq addFamilyAccontReq = new AddFamilyAccontReq();
                                    addFamilyAccontReq.customerId = billPaymentElectricityHomeFragment.C();
                                    PaymentItemBean paymentItemBean = billPaymentElectricityHomeFragment.f34266k0;
                                    addFamilyAccontReq.itemId = paymentItemBean != null ? paymentItemBean.paymentItemId : null;
                                    addFamilyAccontReq.billerName = paymentItemBean != null ? paymentItemBean.billerName : null;
                                    addFamilyAccontReq.institutionLogo = paymentItemBean != null ? paymentItemBean.institutionLogo : null;
                                    addFamilyAccontReq.categoryId = str2;
                                    addFamilyAccontReq.itemName = paymentItemBean != null ? paymentItemBean.paymentItemName : null;
                                    addFamilyAccontReq.billerId = paymentItemBean != null ? paymentItemBean.billerId : null;
                                    BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel7 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                                    if (billPaymentElectricityHomeViewModel7 != null) {
                                        p140j8.f.s(billPaymentElectricityHomeViewModel7, new C1668h(addFamilyAccontReq, null), billPaymentElectricityHomeViewModel7.f34395v, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                    }
                                    n0.g().l("PPay_Electricity_Btn_SaveToBeneficiaries");
                                }
                                if (!TextUtils.isEmpty(dataBean.orderNo)) {
                                    CreateTellerOrderRsp.DataBean dataBean2 = rsp.data;
                                    if (dataBean2 != null) {
                                        androidx.fragment.app.E mActivity = billPaymentElectricityHomeFragment.f27319c;
                                        Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
                                        C0751z c0751z = new C0751z(mActivity, 0);
                                        c0751z.f4978i = dataBean2.calculationExtInfo;
                                        c0751z.f4971b = rsp.data.orderNo;
                                        c0751z.c(Long.valueOf(req.businessAmount));
                                        c0751z.f4972c = p070ee.b.b(str2);
                                        c0751z.f4974e = "5";
                                        ArrayList arrayList = new ArrayList();
                                        String string = billPaymentElectricityHomeFragment.getString(Pd.f.qt_biller_name);
                                        String str3 = req.billerName;
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        arrayList.add(new CoreCashierPaymentExtra(string, str3));
                                        if (!TextUtils.isEmpty(dataBean2.fullName)) {
                                            String string2 = billPaymentElectricityHomeFragment.getString(Vd.a.qt_account_name);
                                            String str4 = dataBean2.fullName;
                                            if (str4 == null) {
                                                str4 = "";
                                            }
                                            arrayList.add(new CoreCashierPaymentExtra(string2, str4));
                                        }
                                        String str5 = req.customerDisplayName;
                                        if (str5 == null) {
                                            str5 = "";
                                        }
                                        arrayList.add(new CoreCashierPaymentExtra(str5, billPaymentElectricityHomeFragment.C()));
                                        if (!TextUtils.isEmpty(dataBean2.address)) {
                                            String string3 = billPaymentElectricityHomeFragment.getString(p025ba.k.core_address);
                                            String str6 = dataBean2.address;
                                            arrayList.add(new CoreCashierPaymentExtra(string3, str6 != null ? str6 : ""));
                                        }
                                        c0751z.b(arrayList);
                                        c0751z.d();
                                    }
                                } else if (!TextUtils.isEmpty(dataBean.outstandingTips)) {
                                    billPaymentElectricityHomeFragment.p(dataBean.outstandingTips);
                                }
                            }
                        } else if ("QK000011".equalsIgnoreCase(rsp.getRespCode())) {
                            if (req != null && (billPaymentElectricityHomeViewModel5 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i) != null) {
                                Intrinsics.checkNotNullParameter(req, "req");
                                C1702z c1702z = new C1702z(req, null);
                                com.transsnet.palmpay.core.base.l lVar3 = billPaymentElectricityHomeViewModel5.t;
                                lVar3.f27356m = req;
                                Unit unit = Unit.f38893a;
                                p140j8.f.v(billPaymentElectricityHomeViewModel5, c1702z, lVar3, 0L);
                            }
                        } else if ("B00015".equals(rsp.getRespCode())) {
                            if (!TextUtils.isEmpty(rsp.getRespMsg())) {
                                f0 f0Var2 = (f0) billPaymentElectricityHomeFragment.f27335j;
                                if (f0Var2 != null) {
                                    p220oa.h.s(f0Var2.f8300o, false);
                                }
                                f0 f0Var3 = (f0) billPaymentElectricityHomeFragment.f27335j;
                                if (f0Var3 != null) {
                                    ModelNumberInputLayout modelNumberInputLayout = f0Var3.f8303w;
                                    String respMsg = rsp.getRespMsg();
                                    modelNumberInputLayout.setErrorMessage(respMsg != null ? respMsg : "");
                                }
                            }
                        } else if ("QK000010".equals(rsp.getRespCode())) {
                            String string4 = billPaymentElectricityHomeFragment.getString(p025ba.k.core_important_notice);
                            String respMsg2 = rsp.getRespMsg();
                            billPaymentElectricityHomeFragment.r(string4, respMsg2 != null ? respMsg2 : "", billPaymentElectricityHomeFragment.getString(p025ba.k.core_confirm), null);
                        } else {
                            ToastUtils.showLong(rsp.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 1:
                        CreateTellerOrderReq createTellerOrderReq = (CreateTellerOrderReq) obj;
                        CommonBeanResult rsp2 = (CommonBeanResult) obj2;
                        int i12 = BillPaymentElectricityHomeFragment.f34255z0;
                        Intrinsics.checkNotNullParameter(rsp2, "rsp");
                        if (rsp2.isSuccess()) {
                            if (createTellerOrderReq != null && (billOrderInfoConfirmData = (BillOrderInfoConfirmData) rsp2.data) != null) {
                                new BillOrderInfoConfirmDialog(billPaymentElectricityHomeFragment.requireActivity(), 0, 0, 6, null).setOrderInfo(billOrderInfoConfirmData).setOnConfirmClickListener(new L(7, createTellerOrderReq, billPaymentElectricityHomeFragment)).show();
                            }
                        } else if ("B00015".equals(rsp2.getRespCode())) {
                            if (!TextUtils.isEmpty(rsp2.getRespMsg())) {
                                f0 f0Var4 = (f0) billPaymentElectricityHomeFragment.f27335j;
                                if (f0Var4 != null) {
                                    p220oa.h.s(f0Var4.f8300o, false);
                                }
                                f0 f0Var5 = (f0) billPaymentElectricityHomeFragment.f27335j;
                                if (f0Var5 != null) {
                                    ModelNumberInputLayout modelNumberInputLayout2 = f0Var5.f8303w;
                                    String respMsg3 = rsp2.getRespMsg();
                                    modelNumberInputLayout2.setErrorMessage(respMsg3 != null ? respMsg3 : "");
                                }
                            }
                        } else if ("QK000010".equals(rsp2.getRespCode())) {
                            String string5 = billPaymentElectricityHomeFragment.getString(p025ba.k.core_important_notice);
                            String respMsg4 = rsp2.getRespMsg();
                            billPaymentElectricityHomeFragment.r(string5, respMsg4 != null ? respMsg4 : "", billPaymentElectricityHomeFragment.getString(p025ba.k.core_confirm), null);
                        } else {
                            ToastUtils.showLong(rsp2.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 2:
                        BillPaymentHomeParams billPaymentHomeParams = (BillPaymentHomeParams) obj;
                        BillerListRsp rsp3 = (BillerListRsp) obj2;
                        int i13 = BillPaymentElectricityHomeFragment.f34255z0;
                        Intrinsics.checkNotNullParameter(rsp3, "rsp");
                        if (rsp3.isSuccess()) {
                            List<BillerListItemBean> list = rsp3.data;
                            if (list != null) {
                                billPaymentElectricityHomeFragment.f34263X.clear();
                                billPaymentElectricityHomeFragment.f34263X.addAll(list);
                                ChannelDataItemBean channelDataItemBean = billPaymentElectricityHomeFragment.f34260L;
                                if (channelDataItemBean != null) {
                                    billPaymentElectricityHomeFragment.K(channelDataItemBean.getBillerId(), channelDataItemBean.getPaymentItemId(), channelDataItemBean.getCustomerId(), Long.valueOf(channelDataItemBean.getBusinessAmount()), true, false);
                                }
                                String str7 = billPaymentElectricityHomeFragment.f34259H;
                                if (str7 != null) {
                                    if (TextUtils.isEmpty(str7)) {
                                        str7 = null;
                                    }
                                    if (str7 != null) {
                                        billPaymentElectricityHomeFragment.K(str7, "", "", 0L, true, false);
                                    }
                                }
                                ChannelDataItemBean channelDataItemBean2 = billPaymentElectricityHomeFragment.f34260L;
                                if ((channelDataItemBean2 == null || (TextUtils.isEmpty(channelDataItemBean2.getBillerName()) && TextUtils.isEmpty(billPaymentElectricityHomeFragment.f34259H))) && (billPaymentElectricityHomeViewModel6 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i) != null) {
                                    StringBuilder sb2 = new StringBuilder("queryLastBillerByCategoryId");
                                    String str8 = billPaymentElectricityHomeFragment.f34258C;
                                    sb2.append(str8);
                                    String strB = Pa.H.b(sb2.toString());
                                    Intrinsics.checkNotNullExpressionValue(strB, "createCacheKey(...)");
                                    AbstractC0780y.m(V.h(billPaymentElectricityHomeViewModel6), null, null, new C1701y(billPaymentElectricityHomeViewModel6.f34393o, q0.y(strB, "_", BaseApplication.getCountryLocale()), null, str8), 3);
                                }
                                if (billPaymentHomeParams != null && billPaymentHomeParams.getShowDialog()) {
                                    billPaymentElectricityHomeFragment.O();
                                }
                            }
                        } else {
                            ToastUtils.showLong(rsp3.getRespMsg(), new Object[0]);
                        }
                        break;
                    default:
                        BillPaymentHomeParams billPaymentHomeParams2 = (BillPaymentHomeParams) obj;
                        PaymentItemListRsp rsp4 = (PaymentItemListRsp) obj2;
                        int i14 = BillPaymentElectricityHomeFragment.f34255z0;
                        Intrinsics.checkNotNullParameter(rsp4, "rsp");
                        if (rsp4.isSuccess()) {
                            List<PaymentItemBean> list2 = rsp4.data;
                            if (list2 != null) {
                                billPaymentElectricityHomeFragment.f34264Y.clear();
                                ArrayList arrayList2 = billPaymentElectricityHomeFragment.f34264Y;
                                arrayList2.addAll(list2);
                                if (!TextUtils.isEmpty(billPaymentElectricityHomeFragment.f34268q0)) {
                                    String str9 = billPaymentElectricityHomeFragment.f34268q0;
                                    if (str9 == null || arrayList2.isEmpty()) {
                                        zH = false;
                                    } else {
                                        zH = billPaymentElectricityHomeFragment.H(billPaymentElectricityHomeFragment.f34269r0, str9);
                                    }
                                } else if (arrayList2.isEmpty()) {
                                    zH = false;
                                } else {
                                    String str10 = billPaymentElectricityHomeFragment.f34269r0;
                                    ChannelDataItemBean channelDataItemBean3 = billPaymentElectricityHomeFragment.f34260L;
                                    if (channelDataItemBean3 != null && (paymentItemId = channelDataItemBean3.getPaymentItemId()) != null) {
                                        str = paymentItemId;
                                    }
                                    zH = billPaymentElectricityHomeFragment.H(str10, str);
                                }
                                if (billPaymentHomeParams2 != null && !billPaymentHomeParams2.getIsSelectPaymentItemForOtherPager() && !zH && arrayList2.size() > 0) {
                                    BillerListItemBean billerListItemBean = billPaymentElectricityHomeFragment.f34265Z;
                                    if ((billerListItemBean != null ? billerListItemBean.getBillerId() : null) != null) {
                                        BillerListItemBean billerListItemBean2 = billPaymentElectricityHomeFragment.f34265Z;
                                        if (Intrinsics.c(billerListItemBean2 != null ? billerListItemBean2.getBillerId() : null, ((PaymentItemBean) arrayList2.get(0)).billerId)) {
                                            billPaymentElectricityHomeFragment.onPaymentItemClick((PaymentItemBean) arrayList2.get(0));
                                        }
                                    }
                                }
                                if (billPaymentHomeParams2 != null && billPaymentHomeParams2.getShowDialog()) {
                                    billPaymentElectricityHomeFragment.P();
                                }
                            }
                        } else {
                            ToastUtils.showLong(rsp4.getRespMsg(), new Object[0]);
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new Wd.G(17), false, null, 224);
        BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel5 = (BillPaymentElectricityHomeViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar3 = billPaymentElectricityHomeViewModel5 != null ? billPaymentElectricityHomeViewModel5.f34396w : null;
        if (lVar3 != null) {
            lVar3.e(this, new I(new j(lVar3, this, 1), 3));
        }
        BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel6 = (BillPaymentElectricityHomeViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar4 = billPaymentElectricityHomeViewModel6 != null ? billPaymentElectricityHomeViewModel6.f34392j : null;
        if (lVar4 != null) {
            lVar4.e(this, new I(new C0804i(this, this, 1), 3));
        }
        BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel7 = (BillPaymentElectricityHomeViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar5 = billPaymentElectricityHomeViewModel7 != null ? billPaymentElectricityHomeViewModel7.f34393o : null;
        if (lVar5 != null) {
            lVar5.e(this, new I(new C0804i(this, this, 2), 3));
        }
        BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel8 = (BillPaymentElectricityHomeViewModel) this.f27333i;
        final int i11 = 0;
        n.B(this, billPaymentElectricityHomeViewModel8 != null ? billPaymentElectricityHomeViewModel8.f34394p : null, this, new Function2(this) { // from class: Zd.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillPaymentElectricityHomeFragment f11660b;

            {
                this.f11660b = this;
            }

            /* JADX WARN: Code duplicated, block: B:24:0x0065  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel9;
                CreateTellerOrderRsp.DataBean dataBean;
                BillOrderInfoConfirmData billOrderInfoConfirmData;
                BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel10;
                boolean zH;
                String paymentItemId;
                String str = "";
                BillPaymentElectricityHomeFragment billPaymentElectricityHomeFragment = this.f11660b;
                switch (i11) {
                    case 0:
                        CreateTellerOrderReq req = (CreateTellerOrderReq) obj;
                        CreateTellerOrderRsp rsp = (CreateTellerOrderRsp) obj2;
                        int i12 = BillPaymentElectricityHomeFragment.f34255z0;
                        Intrinsics.checkNotNullParameter(rsp, "rsp");
                        if (rsp.isSuccess()) {
                            if (req != null && (dataBean = rsp.data) != null) {
                                f0 f0Var = (f0) billPaymentElectricityHomeFragment.f27335j;
                                String str2 = billPaymentElectricityHomeFragment.f34258C;
                                if (f0Var != null && f0Var.f8295e.isChecked()) {
                                    AddFamilyAccontReq addFamilyAccontReq = new AddFamilyAccontReq();
                                    addFamilyAccontReq.customerId = billPaymentElectricityHomeFragment.C();
                                    PaymentItemBean paymentItemBean = billPaymentElectricityHomeFragment.f34266k0;
                                    addFamilyAccontReq.itemId = paymentItemBean != null ? paymentItemBean.paymentItemId : null;
                                    addFamilyAccontReq.billerName = paymentItemBean != null ? paymentItemBean.billerName : null;
                                    addFamilyAccontReq.institutionLogo = paymentItemBean != null ? paymentItemBean.institutionLogo : null;
                                    addFamilyAccontReq.categoryId = str2;
                                    addFamilyAccontReq.itemName = paymentItemBean != null ? paymentItemBean.paymentItemName : null;
                                    addFamilyAccontReq.billerId = paymentItemBean != null ? paymentItemBean.billerId : null;
                                    BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel11 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                                    if (billPaymentElectricityHomeViewModel11 != null) {
                                        p140j8.f.s(billPaymentElectricityHomeViewModel11, new C1668h(addFamilyAccontReq, null), billPaymentElectricityHomeViewModel11.f34395v, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                    }
                                    n0.g().l("PPay_Electricity_Btn_SaveToBeneficiaries");
                                }
                                if (!TextUtils.isEmpty(dataBean.orderNo)) {
                                    CreateTellerOrderRsp.DataBean dataBean2 = rsp.data;
                                    if (dataBean2 != null) {
                                        androidx.fragment.app.E mActivity = billPaymentElectricityHomeFragment.f27319c;
                                        Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
                                        C0751z c0751z = new C0751z(mActivity, 0);
                                        c0751z.f4978i = dataBean2.calculationExtInfo;
                                        c0751z.f4971b = rsp.data.orderNo;
                                        c0751z.c(Long.valueOf(req.businessAmount));
                                        c0751z.f4972c = p070ee.b.b(str2);
                                        c0751z.f4974e = "5";
                                        ArrayList arrayList = new ArrayList();
                                        String string = billPaymentElectricityHomeFragment.getString(Pd.f.qt_biller_name);
                                        String str3 = req.billerName;
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        arrayList.add(new CoreCashierPaymentExtra(string, str3));
                                        if (!TextUtils.isEmpty(dataBean2.fullName)) {
                                            String string2 = billPaymentElectricityHomeFragment.getString(Vd.a.qt_account_name);
                                            String str4 = dataBean2.fullName;
                                            if (str4 == null) {
                                                str4 = "";
                                            }
                                            arrayList.add(new CoreCashierPaymentExtra(string2, str4));
                                        }
                                        String str5 = req.customerDisplayName;
                                        if (str5 == null) {
                                            str5 = "";
                                        }
                                        arrayList.add(new CoreCashierPaymentExtra(str5, billPaymentElectricityHomeFragment.C()));
                                        if (!TextUtils.isEmpty(dataBean2.address)) {
                                            String string3 = billPaymentElectricityHomeFragment.getString(p025ba.k.core_address);
                                            String str6 = dataBean2.address;
                                            arrayList.add(new CoreCashierPaymentExtra(string3, str6 != null ? str6 : ""));
                                        }
                                        c0751z.b(arrayList);
                                        c0751z.d();
                                    }
                                } else if (!TextUtils.isEmpty(dataBean.outstandingTips)) {
                                    billPaymentElectricityHomeFragment.p(dataBean.outstandingTips);
                                }
                            }
                        } else if ("QK000011".equalsIgnoreCase(rsp.getRespCode())) {
                            if (req != null && (billPaymentElectricityHomeViewModel9 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i) != null) {
                                Intrinsics.checkNotNullParameter(req, "req");
                                C1702z c1702z = new C1702z(req, null);
                                com.transsnet.palmpay.core.base.l lVar6 = billPaymentElectricityHomeViewModel9.t;
                                lVar6.f27356m = req;
                                Unit unit = Unit.f38893a;
                                p140j8.f.v(billPaymentElectricityHomeViewModel9, c1702z, lVar6, 0L);
                            }
                        } else if ("B00015".equals(rsp.getRespCode())) {
                            if (!TextUtils.isEmpty(rsp.getRespMsg())) {
                                f0 f0Var2 = (f0) billPaymentElectricityHomeFragment.f27335j;
                                if (f0Var2 != null) {
                                    p220oa.h.s(f0Var2.f8300o, false);
                                }
                                f0 f0Var3 = (f0) billPaymentElectricityHomeFragment.f27335j;
                                if (f0Var3 != null) {
                                    ModelNumberInputLayout modelNumberInputLayout = f0Var3.f8303w;
                                    String respMsg = rsp.getRespMsg();
                                    modelNumberInputLayout.setErrorMessage(respMsg != null ? respMsg : "");
                                }
                            }
                        } else if ("QK000010".equals(rsp.getRespCode())) {
                            String string4 = billPaymentElectricityHomeFragment.getString(p025ba.k.core_important_notice);
                            String respMsg2 = rsp.getRespMsg();
                            billPaymentElectricityHomeFragment.r(string4, respMsg2 != null ? respMsg2 : "", billPaymentElectricityHomeFragment.getString(p025ba.k.core_confirm), null);
                        } else {
                            ToastUtils.showLong(rsp.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 1:
                        CreateTellerOrderReq createTellerOrderReq = (CreateTellerOrderReq) obj;
                        CommonBeanResult rsp2 = (CommonBeanResult) obj2;
                        int i13 = BillPaymentElectricityHomeFragment.f34255z0;
                        Intrinsics.checkNotNullParameter(rsp2, "rsp");
                        if (rsp2.isSuccess()) {
                            if (createTellerOrderReq != null && (billOrderInfoConfirmData = (BillOrderInfoConfirmData) rsp2.data) != null) {
                                new BillOrderInfoConfirmDialog(billPaymentElectricityHomeFragment.requireActivity(), 0, 0, 6, null).setOrderInfo(billOrderInfoConfirmData).setOnConfirmClickListener(new L(7, createTellerOrderReq, billPaymentElectricityHomeFragment)).show();
                            }
                        } else if ("B00015".equals(rsp2.getRespCode())) {
                            if (!TextUtils.isEmpty(rsp2.getRespMsg())) {
                                f0 f0Var4 = (f0) billPaymentElectricityHomeFragment.f27335j;
                                if (f0Var4 != null) {
                                    p220oa.h.s(f0Var4.f8300o, false);
                                }
                                f0 f0Var5 = (f0) billPaymentElectricityHomeFragment.f27335j;
                                if (f0Var5 != null) {
                                    ModelNumberInputLayout modelNumberInputLayout2 = f0Var5.f8303w;
                                    String respMsg3 = rsp2.getRespMsg();
                                    modelNumberInputLayout2.setErrorMessage(respMsg3 != null ? respMsg3 : "");
                                }
                            }
                        } else if ("QK000010".equals(rsp2.getRespCode())) {
                            String string5 = billPaymentElectricityHomeFragment.getString(p025ba.k.core_important_notice);
                            String respMsg4 = rsp2.getRespMsg();
                            billPaymentElectricityHomeFragment.r(string5, respMsg4 != null ? respMsg4 : "", billPaymentElectricityHomeFragment.getString(p025ba.k.core_confirm), null);
                        } else {
                            ToastUtils.showLong(rsp2.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 2:
                        BillPaymentHomeParams billPaymentHomeParams = (BillPaymentHomeParams) obj;
                        BillerListRsp rsp3 = (BillerListRsp) obj2;
                        int i14 = BillPaymentElectricityHomeFragment.f34255z0;
                        Intrinsics.checkNotNullParameter(rsp3, "rsp");
                        if (rsp3.isSuccess()) {
                            List<BillerListItemBean> list = rsp3.data;
                            if (list != null) {
                                billPaymentElectricityHomeFragment.f34263X.clear();
                                billPaymentElectricityHomeFragment.f34263X.addAll(list);
                                ChannelDataItemBean channelDataItemBean = billPaymentElectricityHomeFragment.f34260L;
                                if (channelDataItemBean != null) {
                                    billPaymentElectricityHomeFragment.K(channelDataItemBean.getBillerId(), channelDataItemBean.getPaymentItemId(), channelDataItemBean.getCustomerId(), Long.valueOf(channelDataItemBean.getBusinessAmount()), true, false);
                                }
                                String str7 = billPaymentElectricityHomeFragment.f34259H;
                                if (str7 != null) {
                                    if (TextUtils.isEmpty(str7)) {
                                        str7 = null;
                                    }
                                    if (str7 != null) {
                                        billPaymentElectricityHomeFragment.K(str7, "", "", 0L, true, false);
                                    }
                                }
                                ChannelDataItemBean channelDataItemBean2 = billPaymentElectricityHomeFragment.f34260L;
                                if ((channelDataItemBean2 == null || (TextUtils.isEmpty(channelDataItemBean2.getBillerName()) && TextUtils.isEmpty(billPaymentElectricityHomeFragment.f34259H))) && (billPaymentElectricityHomeViewModel10 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i) != null) {
                                    StringBuilder sb2 = new StringBuilder("queryLastBillerByCategoryId");
                                    String str8 = billPaymentElectricityHomeFragment.f34258C;
                                    sb2.append(str8);
                                    String strB = Pa.H.b(sb2.toString());
                                    Intrinsics.checkNotNullExpressionValue(strB, "createCacheKey(...)");
                                    AbstractC0780y.m(V.h(billPaymentElectricityHomeViewModel10), null, null, new C1701y(billPaymentElectricityHomeViewModel10.f34393o, q0.y(strB, "_", BaseApplication.getCountryLocale()), null, str8), 3);
                                }
                                if (billPaymentHomeParams != null && billPaymentHomeParams.getShowDialog()) {
                                    billPaymentElectricityHomeFragment.O();
                                }
                            }
                        } else {
                            ToastUtils.showLong(rsp3.getRespMsg(), new Object[0]);
                        }
                        break;
                    default:
                        BillPaymentHomeParams billPaymentHomeParams2 = (BillPaymentHomeParams) obj;
                        PaymentItemListRsp rsp4 = (PaymentItemListRsp) obj2;
                        int i15 = BillPaymentElectricityHomeFragment.f34255z0;
                        Intrinsics.checkNotNullParameter(rsp4, "rsp");
                        if (rsp4.isSuccess()) {
                            List<PaymentItemBean> list2 = rsp4.data;
                            if (list2 != null) {
                                billPaymentElectricityHomeFragment.f34264Y.clear();
                                ArrayList arrayList2 = billPaymentElectricityHomeFragment.f34264Y;
                                arrayList2.addAll(list2);
                                if (!TextUtils.isEmpty(billPaymentElectricityHomeFragment.f34268q0)) {
                                    String str9 = billPaymentElectricityHomeFragment.f34268q0;
                                    if (str9 == null || arrayList2.isEmpty()) {
                                        zH = false;
                                    } else {
                                        zH = billPaymentElectricityHomeFragment.H(billPaymentElectricityHomeFragment.f34269r0, str9);
                                    }
                                } else if (arrayList2.isEmpty()) {
                                    zH = false;
                                } else {
                                    String str10 = billPaymentElectricityHomeFragment.f34269r0;
                                    ChannelDataItemBean channelDataItemBean3 = billPaymentElectricityHomeFragment.f34260L;
                                    if (channelDataItemBean3 != null && (paymentItemId = channelDataItemBean3.getPaymentItemId()) != null) {
                                        str = paymentItemId;
                                    }
                                    zH = billPaymentElectricityHomeFragment.H(str10, str);
                                }
                                if (billPaymentHomeParams2 != null && !billPaymentHomeParams2.getIsSelectPaymentItemForOtherPager() && !zH && arrayList2.size() > 0) {
                                    BillerListItemBean billerListItemBean = billPaymentElectricityHomeFragment.f34265Z;
                                    if ((billerListItemBean != null ? billerListItemBean.getBillerId() : null) != null) {
                                        BillerListItemBean billerListItemBean2 = billPaymentElectricityHomeFragment.f34265Z;
                                        if (Intrinsics.c(billerListItemBean2 != null ? billerListItemBean2.getBillerId() : null, ((PaymentItemBean) arrayList2.get(0)).billerId)) {
                                            billPaymentElectricityHomeFragment.onPaymentItemClick((PaymentItemBean) arrayList2.get(0));
                                        }
                                    }
                                }
                                if (billPaymentHomeParams2 != null && billPaymentHomeParams2.getShowDialog()) {
                                    billPaymentElectricityHomeFragment.P();
                                }
                            }
                        } else {
                            ToastUtils.showLong(rsp4.getRespMsg(), new Object[0]);
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new Wd.G(13), true, null, 224);
        BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel9 = (BillPaymentElectricityHomeViewModel) this.f27333i;
        final int i12 = 1;
        n.B(this, billPaymentElectricityHomeViewModel9 != null ? billPaymentElectricityHomeViewModel9.t : null, this, new Function2(this) { // from class: Zd.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BillPaymentElectricityHomeFragment f11660b;

            {
                this.f11660b = this;
            }

            /* JADX WARN: Code duplicated, block: B:24:0x0065  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel10;
                CreateTellerOrderRsp.DataBean dataBean;
                BillOrderInfoConfirmData billOrderInfoConfirmData;
                BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel11;
                boolean zH;
                String paymentItemId;
                String str = "";
                BillPaymentElectricityHomeFragment billPaymentElectricityHomeFragment = this.f11660b;
                switch (i12) {
                    case 0:
                        CreateTellerOrderReq req = (CreateTellerOrderReq) obj;
                        CreateTellerOrderRsp rsp = (CreateTellerOrderRsp) obj2;
                        int i13 = BillPaymentElectricityHomeFragment.f34255z0;
                        Intrinsics.checkNotNullParameter(rsp, "rsp");
                        if (rsp.isSuccess()) {
                            if (req != null && (dataBean = rsp.data) != null) {
                                f0 f0Var = (f0) billPaymentElectricityHomeFragment.f27335j;
                                String str2 = billPaymentElectricityHomeFragment.f34258C;
                                if (f0Var != null && f0Var.f8295e.isChecked()) {
                                    AddFamilyAccontReq addFamilyAccontReq = new AddFamilyAccontReq();
                                    addFamilyAccontReq.customerId = billPaymentElectricityHomeFragment.C();
                                    PaymentItemBean paymentItemBean = billPaymentElectricityHomeFragment.f34266k0;
                                    addFamilyAccontReq.itemId = paymentItemBean != null ? paymentItemBean.paymentItemId : null;
                                    addFamilyAccontReq.billerName = paymentItemBean != null ? paymentItemBean.billerName : null;
                                    addFamilyAccontReq.institutionLogo = paymentItemBean != null ? paymentItemBean.institutionLogo : null;
                                    addFamilyAccontReq.categoryId = str2;
                                    addFamilyAccontReq.itemName = paymentItemBean != null ? paymentItemBean.paymentItemName : null;
                                    addFamilyAccontReq.billerId = paymentItemBean != null ? paymentItemBean.billerId : null;
                                    BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel12 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                                    if (billPaymentElectricityHomeViewModel12 != null) {
                                        p140j8.f.s(billPaymentElectricityHomeViewModel12, new C1668h(addFamilyAccontReq, null), billPaymentElectricityHomeViewModel12.f34395v, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                                    }
                                    n0.g().l("PPay_Electricity_Btn_SaveToBeneficiaries");
                                }
                                if (!TextUtils.isEmpty(dataBean.orderNo)) {
                                    CreateTellerOrderRsp.DataBean dataBean2 = rsp.data;
                                    if (dataBean2 != null) {
                                        androidx.fragment.app.E mActivity = billPaymentElectricityHomeFragment.f27319c;
                                        Intrinsics.checkNotNullExpressionValue(mActivity, "mActivity");
                                        C0751z c0751z = new C0751z(mActivity, 0);
                                        c0751z.f4978i = dataBean2.calculationExtInfo;
                                        c0751z.f4971b = rsp.data.orderNo;
                                        c0751z.c(Long.valueOf(req.businessAmount));
                                        c0751z.f4972c = p070ee.b.b(str2);
                                        c0751z.f4974e = "5";
                                        ArrayList arrayList = new ArrayList();
                                        String string = billPaymentElectricityHomeFragment.getString(Pd.f.qt_biller_name);
                                        String str3 = req.billerName;
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        arrayList.add(new CoreCashierPaymentExtra(string, str3));
                                        if (!TextUtils.isEmpty(dataBean2.fullName)) {
                                            String string2 = billPaymentElectricityHomeFragment.getString(Vd.a.qt_account_name);
                                            String str4 = dataBean2.fullName;
                                            if (str4 == null) {
                                                str4 = "";
                                            }
                                            arrayList.add(new CoreCashierPaymentExtra(string2, str4));
                                        }
                                        String str5 = req.customerDisplayName;
                                        if (str5 == null) {
                                            str5 = "";
                                        }
                                        arrayList.add(new CoreCashierPaymentExtra(str5, billPaymentElectricityHomeFragment.C()));
                                        if (!TextUtils.isEmpty(dataBean2.address)) {
                                            String string3 = billPaymentElectricityHomeFragment.getString(p025ba.k.core_address);
                                            String str6 = dataBean2.address;
                                            arrayList.add(new CoreCashierPaymentExtra(string3, str6 != null ? str6 : ""));
                                        }
                                        c0751z.b(arrayList);
                                        c0751z.d();
                                    }
                                } else if (!TextUtils.isEmpty(dataBean.outstandingTips)) {
                                    billPaymentElectricityHomeFragment.p(dataBean.outstandingTips);
                                }
                            }
                        } else if ("QK000011".equalsIgnoreCase(rsp.getRespCode())) {
                            if (req != null && (billPaymentElectricityHomeViewModel10 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i) != null) {
                                Intrinsics.checkNotNullParameter(req, "req");
                                C1702z c1702z = new C1702z(req, null);
                                com.transsnet.palmpay.core.base.l lVar6 = billPaymentElectricityHomeViewModel10.t;
                                lVar6.f27356m = req;
                                Unit unit = Unit.f38893a;
                                p140j8.f.v(billPaymentElectricityHomeViewModel10, c1702z, lVar6, 0L);
                            }
                        } else if ("B00015".equals(rsp.getRespCode())) {
                            if (!TextUtils.isEmpty(rsp.getRespMsg())) {
                                f0 f0Var2 = (f0) billPaymentElectricityHomeFragment.f27335j;
                                if (f0Var2 != null) {
                                    p220oa.h.s(f0Var2.f8300o, false);
                                }
                                f0 f0Var3 = (f0) billPaymentElectricityHomeFragment.f27335j;
                                if (f0Var3 != null) {
                                    ModelNumberInputLayout modelNumberInputLayout = f0Var3.f8303w;
                                    String respMsg = rsp.getRespMsg();
                                    modelNumberInputLayout.setErrorMessage(respMsg != null ? respMsg : "");
                                }
                            }
                        } else if ("QK000010".equals(rsp.getRespCode())) {
                            String string4 = billPaymentElectricityHomeFragment.getString(p025ba.k.core_important_notice);
                            String respMsg2 = rsp.getRespMsg();
                            billPaymentElectricityHomeFragment.r(string4, respMsg2 != null ? respMsg2 : "", billPaymentElectricityHomeFragment.getString(p025ba.k.core_confirm), null);
                        } else {
                            ToastUtils.showLong(rsp.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 1:
                        CreateTellerOrderReq createTellerOrderReq = (CreateTellerOrderReq) obj;
                        CommonBeanResult rsp2 = (CommonBeanResult) obj2;
                        int i14 = BillPaymentElectricityHomeFragment.f34255z0;
                        Intrinsics.checkNotNullParameter(rsp2, "rsp");
                        if (rsp2.isSuccess()) {
                            if (createTellerOrderReq != null && (billOrderInfoConfirmData = (BillOrderInfoConfirmData) rsp2.data) != null) {
                                new BillOrderInfoConfirmDialog(billPaymentElectricityHomeFragment.requireActivity(), 0, 0, 6, null).setOrderInfo(billOrderInfoConfirmData).setOnConfirmClickListener(new L(7, createTellerOrderReq, billPaymentElectricityHomeFragment)).show();
                            }
                        } else if ("B00015".equals(rsp2.getRespCode())) {
                            if (!TextUtils.isEmpty(rsp2.getRespMsg())) {
                                f0 f0Var4 = (f0) billPaymentElectricityHomeFragment.f27335j;
                                if (f0Var4 != null) {
                                    p220oa.h.s(f0Var4.f8300o, false);
                                }
                                f0 f0Var5 = (f0) billPaymentElectricityHomeFragment.f27335j;
                                if (f0Var5 != null) {
                                    ModelNumberInputLayout modelNumberInputLayout2 = f0Var5.f8303w;
                                    String respMsg3 = rsp2.getRespMsg();
                                    modelNumberInputLayout2.setErrorMessage(respMsg3 != null ? respMsg3 : "");
                                }
                            }
                        } else if ("QK000010".equals(rsp2.getRespCode())) {
                            String string5 = billPaymentElectricityHomeFragment.getString(p025ba.k.core_important_notice);
                            String respMsg4 = rsp2.getRespMsg();
                            billPaymentElectricityHomeFragment.r(string5, respMsg4 != null ? respMsg4 : "", billPaymentElectricityHomeFragment.getString(p025ba.k.core_confirm), null);
                        } else {
                            ToastUtils.showLong(rsp2.getRespMsg(), new Object[0]);
                        }
                        break;
                    case 2:
                        BillPaymentHomeParams billPaymentHomeParams = (BillPaymentHomeParams) obj;
                        BillerListRsp rsp3 = (BillerListRsp) obj2;
                        int i15 = BillPaymentElectricityHomeFragment.f34255z0;
                        Intrinsics.checkNotNullParameter(rsp3, "rsp");
                        if (rsp3.isSuccess()) {
                            List<BillerListItemBean> list = rsp3.data;
                            if (list != null) {
                                billPaymentElectricityHomeFragment.f34263X.clear();
                                billPaymentElectricityHomeFragment.f34263X.addAll(list);
                                ChannelDataItemBean channelDataItemBean = billPaymentElectricityHomeFragment.f34260L;
                                if (channelDataItemBean != null) {
                                    billPaymentElectricityHomeFragment.K(channelDataItemBean.getBillerId(), channelDataItemBean.getPaymentItemId(), channelDataItemBean.getCustomerId(), Long.valueOf(channelDataItemBean.getBusinessAmount()), true, false);
                                }
                                String str7 = billPaymentElectricityHomeFragment.f34259H;
                                if (str7 != null) {
                                    if (TextUtils.isEmpty(str7)) {
                                        str7 = null;
                                    }
                                    if (str7 != null) {
                                        billPaymentElectricityHomeFragment.K(str7, "", "", 0L, true, false);
                                    }
                                }
                                ChannelDataItemBean channelDataItemBean2 = billPaymentElectricityHomeFragment.f34260L;
                                if ((channelDataItemBean2 == null || (TextUtils.isEmpty(channelDataItemBean2.getBillerName()) && TextUtils.isEmpty(billPaymentElectricityHomeFragment.f34259H))) && (billPaymentElectricityHomeViewModel11 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i) != null) {
                                    StringBuilder sb2 = new StringBuilder("queryLastBillerByCategoryId");
                                    String str8 = billPaymentElectricityHomeFragment.f34258C;
                                    sb2.append(str8);
                                    String strB = Pa.H.b(sb2.toString());
                                    Intrinsics.checkNotNullExpressionValue(strB, "createCacheKey(...)");
                                    AbstractC0780y.m(V.h(billPaymentElectricityHomeViewModel11), null, null, new C1701y(billPaymentElectricityHomeViewModel11.f34393o, q0.y(strB, "_", BaseApplication.getCountryLocale()), null, str8), 3);
                                }
                                if (billPaymentHomeParams != null && billPaymentHomeParams.getShowDialog()) {
                                    billPaymentElectricityHomeFragment.O();
                                }
                            }
                        } else {
                            ToastUtils.showLong(rsp3.getRespMsg(), new Object[0]);
                        }
                        break;
                    default:
                        BillPaymentHomeParams billPaymentHomeParams2 = (BillPaymentHomeParams) obj;
                        PaymentItemListRsp rsp4 = (PaymentItemListRsp) obj2;
                        int i16 = BillPaymentElectricityHomeFragment.f34255z0;
                        Intrinsics.checkNotNullParameter(rsp4, "rsp");
                        if (rsp4.isSuccess()) {
                            List<PaymentItemBean> list2 = rsp4.data;
                            if (list2 != null) {
                                billPaymentElectricityHomeFragment.f34264Y.clear();
                                ArrayList arrayList2 = billPaymentElectricityHomeFragment.f34264Y;
                                arrayList2.addAll(list2);
                                if (!TextUtils.isEmpty(billPaymentElectricityHomeFragment.f34268q0)) {
                                    String str9 = billPaymentElectricityHomeFragment.f34268q0;
                                    if (str9 == null || arrayList2.isEmpty()) {
                                        zH = false;
                                    } else {
                                        zH = billPaymentElectricityHomeFragment.H(billPaymentElectricityHomeFragment.f34269r0, str9);
                                    }
                                } else if (arrayList2.isEmpty()) {
                                    zH = false;
                                } else {
                                    String str10 = billPaymentElectricityHomeFragment.f34269r0;
                                    ChannelDataItemBean channelDataItemBean3 = billPaymentElectricityHomeFragment.f34260L;
                                    if (channelDataItemBean3 != null && (paymentItemId = channelDataItemBean3.getPaymentItemId()) != null) {
                                        str = paymentItemId;
                                    }
                                    zH = billPaymentElectricityHomeFragment.H(str10, str);
                                }
                                if (billPaymentHomeParams2 != null && !billPaymentHomeParams2.getIsSelectPaymentItemForOtherPager() && !zH && arrayList2.size() > 0) {
                                    BillerListItemBean billerListItemBean = billPaymentElectricityHomeFragment.f34265Z;
                                    if ((billerListItemBean != null ? billerListItemBean.getBillerId() : null) != null) {
                                        BillerListItemBean billerListItemBean2 = billPaymentElectricityHomeFragment.f34265Z;
                                        if (Intrinsics.c(billerListItemBean2 != null ? billerListItemBean2.getBillerId() : null, ((PaymentItemBean) arrayList2.get(0)).billerId)) {
                                            billPaymentElectricityHomeFragment.onPaymentItemClick((PaymentItemBean) arrayList2.get(0));
                                        }
                                    }
                                }
                                if (billPaymentHomeParams2 != null && billPaymentHomeParams2.getShowDialog()) {
                                    billPaymentElectricityHomeFragment.P();
                                }
                            }
                        } else {
                            ToastUtils.showLong(rsp4.getRespMsg(), new Object[0]);
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new Wd.G(14), true, null, 224);
        BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel10 = (BillPaymentElectricityHomeViewModel) this.f27333i;
        com.transsnet.palmpay.core.base.l lVar6 = billPaymentElectricityHomeViewModel10 != null ? billPaymentElectricityHomeViewModel10.f34395v : null;
        if (lVar6 != null) {
            lVar6.e(this, new I(new U(3), 3));
        }
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        InterstitialAdView interstitialAdViewJ;
        Window window;
        f0 f0Var = (f0) this.f27335j;
        if (f0Var != null) {
            f0Var.f8294d.setSlotId(getString(k.billpayment_ele_mid_ad));
        }
        f0 f0Var2 = (f0) this.f27335j;
        if (f0Var2 != null) {
            f0Var2.f8292b.setSlotId(getString(k.billpayment_ele_bottom1_ad));
        }
        f0 f0Var3 = (f0) this.f27335j;
        if (f0Var3 != null) {
            f0Var3.f8293c.setSlotId(getString(k.billpayment_ele_bottom2_ad));
        }
        f0 f0Var4 = (f0) this.f27335j;
        View decorView = null;
        SingleAdView singleAdView = f0Var4 != null ? f0Var4.f8294d : null;
        Boolean bool = Boolean.TRUE;
        org.chromium.support_lib_boundary.util.b.d(singleAdView, bool);
        f0 f0Var5 = (f0) this.f27335j;
        org.chromium.support_lib_boundary.util.b.d(f0Var5 != null ? f0Var5.f8292b : null, bool);
        f0 f0Var6 = (f0) this.f27335j;
        org.chromium.support_lib_boundary.util.b.d(f0Var6 != null ? f0Var6.f8293c : null, bool);
        BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel = (BillPaymentElectricityHomeViewModel) this.f27333i;
        String str = this.f34258C;
        if (billPaymentElectricityHomeViewModel != null) {
            billPaymentElectricityHomeViewModel.g(str);
        }
        L(false);
        BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel2 = (BillPaymentElectricityHomeViewModel) this.f27333i;
        if (billPaymentElectricityHomeViewModel2 != null) {
            billPaymentElectricityHomeViewModel2.d(this.f34258C, false, false);
        }
        String strB = b.b(str);
        if (TransType.TRANS_TYPE_BILLER_BETTING.equals(strB)) {
            InterstitialAdView interstitialAdViewJ2 = org.chromium.support_lib_boundary.util.b.j(getString(k.betting_home_page_pop_slot_id));
            if (interstitialAdViewJ2 != null) {
                InterstitialAdView.show$default(interstitialAdViewJ2, requireActivity(), null, 2, null);
            }
        } else if ("17".equals(strB) && (interstitialAdViewJ = org.chromium.support_lib_boundary.util.b.j(getString(k.tv_home_page_pop_slot_id))) != null) {
            InterstitialAdView.show$default(interstitialAdViewJ, requireActivity(), null, 2, null);
        }
        Handler handlerJ = j();
        Intrinsics.checkNotNullExpressionValue(handlerJ, "getUIHandler(...)");
        E activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            decorView = window.getDecorView();
        }
        if (decorView != null) {
            decorView.post(new H(handlerJ, 13, this, this));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        IconicsImageView contactIv;
        AppCompatAutoCompleteTextView numberEdit;
        AppCompatAutoCompleteTextView numberEdit2;
        AppCompatAutoCompleteTextView numberEdit3;
        ModelNumberInputLayout filter;
        TextView titleTv;
        ImageView rightImageView1;
        ImageView rightImageView2;
        ImageView backImageView;
        final int i7 = 6;
        final int i10 = 2;
        final int i11 = 3;
        final int i12 = 1;
        final int i13 = 0;
        super.o();
        ARouter.getInstance().inject(this);
        org.greenrobot.eventbus.c.b().j(this);
        f0 f0Var = (f0) this.f27335j;
        if (f0Var != null) {
            f0Var.f8301p.setOnClickListener(new View.OnClickListener(this) { // from class: Zd.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BillPaymentElectricityHomeFragment f11658b;

                {
                    this.f11658b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String billerId;
                    BillPaymentElectricityHomeFragment billPaymentElectricityHomeFragment = this.f11658b;
                    switch (i13) {
                        case 0:
                            int i14 = BillPaymentElectricityHomeFragment.f34255z0;
                            KeyboardUtils.hideSoftInput(billPaymentElectricityHomeFragment.requireActivity());
                            break;
                        case 1:
                            if (!billPaymentElectricityHomeFragment.f34263X.isEmpty()) {
                                billPaymentElectricityHomeFragment.O();
                            } else {
                                BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                                if (billPaymentElectricityHomeViewModel != null) {
                                    billPaymentElectricityHomeViewModel.d(billPaymentElectricityHomeFragment.f34258C, true, false);
                                }
                            }
                            break;
                        case 2:
                            int i15 = BillPaymentElectricityHomeFragment.f34255z0;
                            Postcard postcardWithString = ARouter.getInstance().build("/quick_teller/betting_beneficiaries").withString("KEY_CATEGORY_ID", billPaymentElectricityHomeFragment.f34258C);
                            ARouter aRouter = ARouter.getInstance();
                            Intrinsics.checkNotNullExpressionValue(aRouter, "getInstance(...)");
                            Intrinsics.e(postcardWithString);
                            r0.x(aRouter, billPaymentElectricityHomeFragment, postcardWithString, 101);
                            n0.g().l("PPay_Electricity_Btn_Contacts");
                            break;
                        case 3:
                            int i16 = BillPaymentElectricityHomeFragment.f34255z0;
                            androidx.fragment.app.E eRequireActivity = billPaymentElectricityHomeFragment.requireActivity();
                            Intrinsics.f(eRequireActivity, "null cannot be cast to non-null type com.transsnet.palmpay.teller.ui.activity.BillPaymentHomeActivity");
                            ((BillPaymentHomeActivity) eRequireActivity).goBackToHome();
                            break;
                        case 4:
                            int i17 = BillPaymentElectricityHomeFragment.f34255z0;
                            if (!BaseApplication.hasLogin()) {
                                i0.K(null, null);
                            } else {
                                BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel2 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                                if (billPaymentElectricityHomeViewModel2 != null) {
                                    ArrayList transType = C1850q.e("16");
                                    Intrinsics.checkNotNullParameter(transType, "transType");
                                    AbstractC0780y.m(V.h(billPaymentElectricityHomeViewModel2), null, null, new p086fe.F(billPaymentElectricityHomeViewModel2.f34389f, C0.G.p("Pref_", "queryTransactionLinkVM_" + transType, "_", BaseApplication.getCountryLocale()), null, transType), 3);
                                }
                                n0.g().l("PPay_Electricity_Btn_TransHistory");
                            }
                            break;
                        case 5:
                            BillerListItemBean billerListItemBean = billPaymentElectricityHomeFragment.f34265Z;
                            if (billerListItemBean != null) {
                                Integer status = billerListItemBean.getStatus();
                                if (status != null && status.intValue() == 1) {
                                    if (!billPaymentElectricityHomeFragment.f34264Y.isEmpty()) {
                                        billPaymentElectricityHomeFragment.P();
                                    } else {
                                        BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel3 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                                        if (billPaymentElectricityHomeViewModel3 != null) {
                                            BillerListItemBean billerListItemBean2 = billPaymentElectricityHomeFragment.f34265Z;
                                            billPaymentElectricityHomeViewModel3.e(billerListItemBean2 != null ? billerListItemBean2.getBillerId() : null, true, false);
                                        }
                                        BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel4 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                                        if (billPaymentElectricityHomeViewModel4 != null) {
                                            BillerListItemBean billerListItemBean3 = billPaymentElectricityHomeFragment.f34265Z;
                                            if (billerListItemBean3 == null || (billerId = billerListItemBean3.getBillerId()) == null) {
                                                billerId = "";
                                            }
                                            billPaymentElectricityHomeViewModel4.f(billerId);
                                        }
                                    }
                                }
                            } else {
                                f0 f0Var2 = (f0) billPaymentElectricityHomeFragment.f27335j;
                                if (f0Var2 != null) {
                                    f0Var2.f8283C.e(billPaymentElectricityHomeFragment.getString(Pd.f.qt_msg_select_biller_first));
                                }
                            }
                            break;
                        default:
                            int i18 = BillPaymentElectricityHomeFragment.f34255z0;
                            if (!r0.U0()) {
                                billPaymentElectricityHomeFragment.E();
                                KeyboardUtils.hideSoftInput(billPaymentElectricityHomeFragment.requireActivity());
                                break;
                            }
                            break;
                    }
                }
            });
        }
        f0 f0Var2 = (f0) this.f27335j;
        if (f0Var2 != null) {
            f0Var2.f8285L.setTitle(getString(Vd.a.qt_electricity));
        }
        f0 f0Var3 = (f0) this.f27335j;
        if (f0Var3 != null && (backImageView = f0Var3.f8285L.getBackImageView()) != null) {
            backImageView.setOnClickListener(new View.OnClickListener(this) { // from class: Zd.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BillPaymentElectricityHomeFragment f11658b;

                {
                    this.f11658b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String billerId;
                    BillPaymentElectricityHomeFragment billPaymentElectricityHomeFragment = this.f11658b;
                    switch (i11) {
                        case 0:
                            int i14 = BillPaymentElectricityHomeFragment.f34255z0;
                            KeyboardUtils.hideSoftInput(billPaymentElectricityHomeFragment.requireActivity());
                            break;
                        case 1:
                            if (!billPaymentElectricityHomeFragment.f34263X.isEmpty()) {
                                billPaymentElectricityHomeFragment.O();
                            } else {
                                BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                                if (billPaymentElectricityHomeViewModel != null) {
                                    billPaymentElectricityHomeViewModel.d(billPaymentElectricityHomeFragment.f34258C, true, false);
                                }
                            }
                            break;
                        case 2:
                            int i15 = BillPaymentElectricityHomeFragment.f34255z0;
                            Postcard postcardWithString = ARouter.getInstance().build("/quick_teller/betting_beneficiaries").withString("KEY_CATEGORY_ID", billPaymentElectricityHomeFragment.f34258C);
                            ARouter aRouter = ARouter.getInstance();
                            Intrinsics.checkNotNullExpressionValue(aRouter, "getInstance(...)");
                            Intrinsics.e(postcardWithString);
                            r0.x(aRouter, billPaymentElectricityHomeFragment, postcardWithString, 101);
                            n0.g().l("PPay_Electricity_Btn_Contacts");
                            break;
                        case 3:
                            int i16 = BillPaymentElectricityHomeFragment.f34255z0;
                            androidx.fragment.app.E eRequireActivity = billPaymentElectricityHomeFragment.requireActivity();
                            Intrinsics.f(eRequireActivity, "null cannot be cast to non-null type com.transsnet.palmpay.teller.ui.activity.BillPaymentHomeActivity");
                            ((BillPaymentHomeActivity) eRequireActivity).goBackToHome();
                            break;
                        case 4:
                            int i17 = BillPaymentElectricityHomeFragment.f34255z0;
                            if (!BaseApplication.hasLogin()) {
                                i0.K(null, null);
                            } else {
                                BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel2 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                                if (billPaymentElectricityHomeViewModel2 != null) {
                                    ArrayList transType = C1850q.e("16");
                                    Intrinsics.checkNotNullParameter(transType, "transType");
                                    AbstractC0780y.m(V.h(billPaymentElectricityHomeViewModel2), null, null, new p086fe.F(billPaymentElectricityHomeViewModel2.f34389f, C0.G.p("Pref_", "queryTransactionLinkVM_" + transType, "_", BaseApplication.getCountryLocale()), null, transType), 3);
                                }
                                n0.g().l("PPay_Electricity_Btn_TransHistory");
                            }
                            break;
                        case 5:
                            BillerListItemBean billerListItemBean = billPaymentElectricityHomeFragment.f34265Z;
                            if (billerListItemBean != null) {
                                Integer status = billerListItemBean.getStatus();
                                if (status != null && status.intValue() == 1) {
                                    if (!billPaymentElectricityHomeFragment.f34264Y.isEmpty()) {
                                        billPaymentElectricityHomeFragment.P();
                                    } else {
                                        BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel3 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                                        if (billPaymentElectricityHomeViewModel3 != null) {
                                            BillerListItemBean billerListItemBean2 = billPaymentElectricityHomeFragment.f34265Z;
                                            billPaymentElectricityHomeViewModel3.e(billerListItemBean2 != null ? billerListItemBean2.getBillerId() : null, true, false);
                                        }
                                        BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel4 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                                        if (billPaymentElectricityHomeViewModel4 != null) {
                                            BillerListItemBean billerListItemBean3 = billPaymentElectricityHomeFragment.f34265Z;
                                            if (billerListItemBean3 == null || (billerId = billerListItemBean3.getBillerId()) == null) {
                                                billerId = "";
                                            }
                                            billPaymentElectricityHomeViewModel4.f(billerId);
                                        }
                                    }
                                }
                            } else {
                                f0 f0Var4 = (f0) billPaymentElectricityHomeFragment.f27335j;
                                if (f0Var4 != null) {
                                    f0Var4.f8283C.e(billPaymentElectricityHomeFragment.getString(Pd.f.qt_msg_select_biller_first));
                                }
                            }
                            break;
                        default:
                            int i18 = BillPaymentElectricityHomeFragment.f34255z0;
                            if (!r0.U0()) {
                                billPaymentElectricityHomeFragment.E();
                                KeyboardUtils.hideSoftInput(billPaymentElectricityHomeFragment.requireActivity());
                                break;
                            }
                            break;
                    }
                }
            });
        }
        f0 f0Var4 = (f0) this.f27335j;
        if (f0Var4 != null && (rightImageView2 = f0Var4.f8285L.getRightImageView1()) != null) {
            rightImageView2.setImageResource(p025ba.d.core_bill_history_default);
        }
        f0 f0Var5 = (f0) this.f27335j;
        if (f0Var5 != null && (rightImageView1 = f0Var5.f8285L.getRightImageView1()) != null) {
            final int i14 = 4;
            rightImageView1.setOnClickListener(new View.OnClickListener(this) { // from class: Zd.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BillPaymentElectricityHomeFragment f11658b;

                {
                    this.f11658b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String billerId;
                    BillPaymentElectricityHomeFragment billPaymentElectricityHomeFragment = this.f11658b;
                    switch (i14) {
                        case 0:
                            int i15 = BillPaymentElectricityHomeFragment.f34255z0;
                            KeyboardUtils.hideSoftInput(billPaymentElectricityHomeFragment.requireActivity());
                            break;
                        case 1:
                            if (!billPaymentElectricityHomeFragment.f34263X.isEmpty()) {
                                billPaymentElectricityHomeFragment.O();
                            } else {
                                BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                                if (billPaymentElectricityHomeViewModel != null) {
                                    billPaymentElectricityHomeViewModel.d(billPaymentElectricityHomeFragment.f34258C, true, false);
                                }
                            }
                            break;
                        case 2:
                            int i16 = BillPaymentElectricityHomeFragment.f34255z0;
                            Postcard postcardWithString = ARouter.getInstance().build("/quick_teller/betting_beneficiaries").withString("KEY_CATEGORY_ID", billPaymentElectricityHomeFragment.f34258C);
                            ARouter aRouter = ARouter.getInstance();
                            Intrinsics.checkNotNullExpressionValue(aRouter, "getInstance(...)");
                            Intrinsics.e(postcardWithString);
                            r0.x(aRouter, billPaymentElectricityHomeFragment, postcardWithString, 101);
                            n0.g().l("PPay_Electricity_Btn_Contacts");
                            break;
                        case 3:
                            int i17 = BillPaymentElectricityHomeFragment.f34255z0;
                            androidx.fragment.app.E eRequireActivity = billPaymentElectricityHomeFragment.requireActivity();
                            Intrinsics.f(eRequireActivity, "null cannot be cast to non-null type com.transsnet.palmpay.teller.ui.activity.BillPaymentHomeActivity");
                            ((BillPaymentHomeActivity) eRequireActivity).goBackToHome();
                            break;
                        case 4:
                            int i18 = BillPaymentElectricityHomeFragment.f34255z0;
                            if (!BaseApplication.hasLogin()) {
                                i0.K(null, null);
                            } else {
                                BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel2 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                                if (billPaymentElectricityHomeViewModel2 != null) {
                                    ArrayList transType = C1850q.e("16");
                                    Intrinsics.checkNotNullParameter(transType, "transType");
                                    AbstractC0780y.m(V.h(billPaymentElectricityHomeViewModel2), null, null, new p086fe.F(billPaymentElectricityHomeViewModel2.f34389f, C0.G.p("Pref_", "queryTransactionLinkVM_" + transType, "_", BaseApplication.getCountryLocale()), null, transType), 3);
                                }
                                n0.g().l("PPay_Electricity_Btn_TransHistory");
                            }
                            break;
                        case 5:
                            BillerListItemBean billerListItemBean = billPaymentElectricityHomeFragment.f34265Z;
                            if (billerListItemBean != null) {
                                Integer status = billerListItemBean.getStatus();
                                if (status != null && status.intValue() == 1) {
                                    if (!billPaymentElectricityHomeFragment.f34264Y.isEmpty()) {
                                        billPaymentElectricityHomeFragment.P();
                                    } else {
                                        BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel3 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                                        if (billPaymentElectricityHomeViewModel3 != null) {
                                            BillerListItemBean billerListItemBean2 = billPaymentElectricityHomeFragment.f34265Z;
                                            billPaymentElectricityHomeViewModel3.e(billerListItemBean2 != null ? billerListItemBean2.getBillerId() : null, true, false);
                                        }
                                        BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel4 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                                        if (billPaymentElectricityHomeViewModel4 != null) {
                                            BillerListItemBean billerListItemBean3 = billPaymentElectricityHomeFragment.f34265Z;
                                            if (billerListItemBean3 == null || (billerId = billerListItemBean3.getBillerId()) == null) {
                                                billerId = "";
                                            }
                                            billPaymentElectricityHomeViewModel4.f(billerId);
                                        }
                                    }
                                }
                            } else {
                                f0 f0Var6 = (f0) billPaymentElectricityHomeFragment.f27335j;
                                if (f0Var6 != null) {
                                    f0Var6.f8283C.e(billPaymentElectricityHomeFragment.getString(Pd.f.qt_msg_select_biller_first));
                                }
                            }
                            break;
                        default:
                            int i19 = BillPaymentElectricityHomeFragment.f34255z0;
                            if (!r0.U0()) {
                                billPaymentElectricityHomeFragment.E();
                                KeyboardUtils.hideSoftInput(billPaymentElectricityHomeFragment.requireActivity());
                                break;
                            }
                            break;
                    }
                }
            });
        }
        f0 f0Var6 = (f0) this.f27335j;
        if (f0Var6 != null) {
            f0Var6.f8282B.setLayoutManager(new GridLayoutManager(getContext(), 3));
        }
        f0 f0Var7 = (f0) this.f27335j;
        if (f0Var7 != null) {
            f0Var7.f8282B.addItemDecoration(new i());
        }
        f0 f0Var8 = (f0) this.f27335j;
        if (f0Var8 != null) {
            f0Var8.f8282B.setAdapter(D());
        }
        D().setOnItemClickListener(new C0802g(this));
        f0 f0Var9 = (f0) this.f27335j;
        if (f0Var9 != null) {
            h.s(f0Var9.t, true);
        }
        f0 f0Var10 = (f0) this.f27335j;
        if (f0Var10 != null) {
            f0Var10.f8283C.f(new View.OnClickListener(this) { // from class: Zd.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BillPaymentElectricityHomeFragment f11658b;

                {
                    this.f11658b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String billerId;
                    BillPaymentElectricityHomeFragment billPaymentElectricityHomeFragment = this.f11658b;
                    switch (i12) {
                        case 0:
                            int i15 = BillPaymentElectricityHomeFragment.f34255z0;
                            KeyboardUtils.hideSoftInput(billPaymentElectricityHomeFragment.requireActivity());
                            break;
                        case 1:
                            if (!billPaymentElectricityHomeFragment.f34263X.isEmpty()) {
                                billPaymentElectricityHomeFragment.O();
                            } else {
                                BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                                if (billPaymentElectricityHomeViewModel != null) {
                                    billPaymentElectricityHomeViewModel.d(billPaymentElectricityHomeFragment.f34258C, true, false);
                                }
                            }
                            break;
                        case 2:
                            int i16 = BillPaymentElectricityHomeFragment.f34255z0;
                            Postcard postcardWithString = ARouter.getInstance().build("/quick_teller/betting_beneficiaries").withString("KEY_CATEGORY_ID", billPaymentElectricityHomeFragment.f34258C);
                            ARouter aRouter = ARouter.getInstance();
                            Intrinsics.checkNotNullExpressionValue(aRouter, "getInstance(...)");
                            Intrinsics.e(postcardWithString);
                            r0.x(aRouter, billPaymentElectricityHomeFragment, postcardWithString, 101);
                            n0.g().l("PPay_Electricity_Btn_Contacts");
                            break;
                        case 3:
                            int i17 = BillPaymentElectricityHomeFragment.f34255z0;
                            androidx.fragment.app.E eRequireActivity = billPaymentElectricityHomeFragment.requireActivity();
                            Intrinsics.f(eRequireActivity, "null cannot be cast to non-null type com.transsnet.palmpay.teller.ui.activity.BillPaymentHomeActivity");
                            ((BillPaymentHomeActivity) eRequireActivity).goBackToHome();
                            break;
                        case 4:
                            int i18 = BillPaymentElectricityHomeFragment.f34255z0;
                            if (!BaseApplication.hasLogin()) {
                                i0.K(null, null);
                            } else {
                                BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel2 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                                if (billPaymentElectricityHomeViewModel2 != null) {
                                    ArrayList transType = C1850q.e("16");
                                    Intrinsics.checkNotNullParameter(transType, "transType");
                                    AbstractC0780y.m(V.h(billPaymentElectricityHomeViewModel2), null, null, new p086fe.F(billPaymentElectricityHomeViewModel2.f34389f, C0.G.p("Pref_", "queryTransactionLinkVM_" + transType, "_", BaseApplication.getCountryLocale()), null, transType), 3);
                                }
                                n0.g().l("PPay_Electricity_Btn_TransHistory");
                            }
                            break;
                        case 5:
                            BillerListItemBean billerListItemBean = billPaymentElectricityHomeFragment.f34265Z;
                            if (billerListItemBean != null) {
                                Integer status = billerListItemBean.getStatus();
                                if (status != null && status.intValue() == 1) {
                                    if (!billPaymentElectricityHomeFragment.f34264Y.isEmpty()) {
                                        billPaymentElectricityHomeFragment.P();
                                    } else {
                                        BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel3 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                                        if (billPaymentElectricityHomeViewModel3 != null) {
                                            BillerListItemBean billerListItemBean2 = billPaymentElectricityHomeFragment.f34265Z;
                                            billPaymentElectricityHomeViewModel3.e(billerListItemBean2 != null ? billerListItemBean2.getBillerId() : null, true, false);
                                        }
                                        BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel4 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                                        if (billPaymentElectricityHomeViewModel4 != null) {
                                            BillerListItemBean billerListItemBean3 = billPaymentElectricityHomeFragment.f34265Z;
                                            if (billerListItemBean3 == null || (billerId = billerListItemBean3.getBillerId()) == null) {
                                                billerId = "";
                                            }
                                            billPaymentElectricityHomeViewModel4.f(billerId);
                                        }
                                    }
                                }
                            } else {
                                f0 f0Var11 = (f0) billPaymentElectricityHomeFragment.f27335j;
                                if (f0Var11 != null) {
                                    f0Var11.f8283C.e(billPaymentElectricityHomeFragment.getString(Pd.f.qt_msg_select_biller_first));
                                }
                            }
                            break;
                        default:
                            int i19 = BillPaymentElectricityHomeFragment.f34255z0;
                            if (!r0.U0()) {
                                billPaymentElectricityHomeFragment.E();
                                KeyboardUtils.hideSoftInput(billPaymentElectricityHomeFragment.requireActivity());
                                break;
                            }
                            break;
                    }
                }
            });
        }
        f0 f0Var11 = (f0) this.f27335j;
        if (f0Var11 != null) {
            final int i15 = 5;
            f0Var11.f8284H.f(new View.OnClickListener(this) { // from class: Zd.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BillPaymentElectricityHomeFragment f11658b;

                {
                    this.f11658b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String billerId;
                    BillPaymentElectricityHomeFragment billPaymentElectricityHomeFragment = this.f11658b;
                    switch (i15) {
                        case 0:
                            int i16 = BillPaymentElectricityHomeFragment.f34255z0;
                            KeyboardUtils.hideSoftInput(billPaymentElectricityHomeFragment.requireActivity());
                            break;
                        case 1:
                            if (!billPaymentElectricityHomeFragment.f34263X.isEmpty()) {
                                billPaymentElectricityHomeFragment.O();
                            } else {
                                BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                                if (billPaymentElectricityHomeViewModel != null) {
                                    billPaymentElectricityHomeViewModel.d(billPaymentElectricityHomeFragment.f34258C, true, false);
                                }
                            }
                            break;
                        case 2:
                            int i17 = BillPaymentElectricityHomeFragment.f34255z0;
                            Postcard postcardWithString = ARouter.getInstance().build("/quick_teller/betting_beneficiaries").withString("KEY_CATEGORY_ID", billPaymentElectricityHomeFragment.f34258C);
                            ARouter aRouter = ARouter.getInstance();
                            Intrinsics.checkNotNullExpressionValue(aRouter, "getInstance(...)");
                            Intrinsics.e(postcardWithString);
                            r0.x(aRouter, billPaymentElectricityHomeFragment, postcardWithString, 101);
                            n0.g().l("PPay_Electricity_Btn_Contacts");
                            break;
                        case 3:
                            int i18 = BillPaymentElectricityHomeFragment.f34255z0;
                            androidx.fragment.app.E eRequireActivity = billPaymentElectricityHomeFragment.requireActivity();
                            Intrinsics.f(eRequireActivity, "null cannot be cast to non-null type com.transsnet.palmpay.teller.ui.activity.BillPaymentHomeActivity");
                            ((BillPaymentHomeActivity) eRequireActivity).goBackToHome();
                            break;
                        case 4:
                            int i19 = BillPaymentElectricityHomeFragment.f34255z0;
                            if (!BaseApplication.hasLogin()) {
                                i0.K(null, null);
                            } else {
                                BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel2 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                                if (billPaymentElectricityHomeViewModel2 != null) {
                                    ArrayList transType = C1850q.e("16");
                                    Intrinsics.checkNotNullParameter(transType, "transType");
                                    AbstractC0780y.m(V.h(billPaymentElectricityHomeViewModel2), null, null, new p086fe.F(billPaymentElectricityHomeViewModel2.f34389f, C0.G.p("Pref_", "queryTransactionLinkVM_" + transType, "_", BaseApplication.getCountryLocale()), null, transType), 3);
                                }
                                n0.g().l("PPay_Electricity_Btn_TransHistory");
                            }
                            break;
                        case 5:
                            BillerListItemBean billerListItemBean = billPaymentElectricityHomeFragment.f34265Z;
                            if (billerListItemBean != null) {
                                Integer status = billerListItemBean.getStatus();
                                if (status != null && status.intValue() == 1) {
                                    if (!billPaymentElectricityHomeFragment.f34264Y.isEmpty()) {
                                        billPaymentElectricityHomeFragment.P();
                                    } else {
                                        BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel3 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                                        if (billPaymentElectricityHomeViewModel3 != null) {
                                            BillerListItemBean billerListItemBean2 = billPaymentElectricityHomeFragment.f34265Z;
                                            billPaymentElectricityHomeViewModel3.e(billerListItemBean2 != null ? billerListItemBean2.getBillerId() : null, true, false);
                                        }
                                        BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel4 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                                        if (billPaymentElectricityHomeViewModel4 != null) {
                                            BillerListItemBean billerListItemBean3 = billPaymentElectricityHomeFragment.f34265Z;
                                            if (billerListItemBean3 == null || (billerId = billerListItemBean3.getBillerId()) == null) {
                                                billerId = "";
                                            }
                                            billPaymentElectricityHomeViewModel4.f(billerId);
                                        }
                                    }
                                }
                            } else {
                                f0 f0Var12 = (f0) billPaymentElectricityHomeFragment.f27335j;
                                if (f0Var12 != null) {
                                    f0Var12.f8283C.e(billPaymentElectricityHomeFragment.getString(Pd.f.qt_msg_select_biller_first));
                                }
                            }
                            break;
                        default:
                            int i110 = BillPaymentElectricityHomeFragment.f34255z0;
                            if (!r0.U0()) {
                                billPaymentElectricityHomeFragment.E();
                                KeyboardUtils.hideSoftInput(billPaymentElectricityHomeFragment.requireActivity());
                                break;
                            }
                            break;
                    }
                }
            });
        }
        f0 f0Var12 = (f0) this.f27335j;
        if (f0Var12 != null) {
            f0Var12.f8297g.setCurrencySymbol(BaseApplication.getCurrencySymbol());
        }
        f0 f0Var13 = (f0) this.f27335j;
        String str = this.f34258C;
        if (f0Var13 != null && (titleTv = f0Var13.f8303w.getTitleTv()) != null) {
            titleTv.setText(getString(p070ee.c.e(str)));
        }
        f0 f0Var14 = (f0) this.f27335j;
        if (f0Var14 != null && (filter = f0Var14.f8303w.setFilter(new InputFilter[]{new Tb.a(0), new Tb.c(32, 0)})) != null) {
            filter.build();
        }
        f0 f0Var15 = (f0) this.f27335j;
        if (f0Var15 != null && (numberEdit3 = f0Var15.f8303w.getNumberEdit()) != null) {
            numberEdit3.setSingleLine();
        }
        f0 f0Var16 = (f0) this.f27335j;
        if (f0Var16 != null && (numberEdit2 = f0Var16.f8303w.getNumberEdit()) != null) {
            numberEdit2.setImeOptions(6);
        }
        f0 f0Var17 = (f0) this.f27335j;
        if (f0Var17 != null && (numberEdit = f0Var17.f8303w.getNumberEdit()) != null) {
            numberEdit.setOnEditorActionListener(new A(this, 1));
        }
        f0 f0Var18 = (f0) this.f27335j;
        if (f0Var18 != null) {
            f0Var18.f8303w.setErrorListener(new Zd.k(this));
        }
        f0 f0Var19 = (f0) this.f27335j;
        if (f0Var19 != null && (contactIv = f0Var19.f8303w.getContactIv()) != null) {
            contactIv.setOnClickListener(new View.OnClickListener(this) { // from class: Zd.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BillPaymentElectricityHomeFragment f11658b;

                {
                    this.f11658b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String billerId;
                    BillPaymentElectricityHomeFragment billPaymentElectricityHomeFragment = this.f11658b;
                    switch (i10) {
                        case 0:
                            int i16 = BillPaymentElectricityHomeFragment.f34255z0;
                            KeyboardUtils.hideSoftInput(billPaymentElectricityHomeFragment.requireActivity());
                            break;
                        case 1:
                            if (!billPaymentElectricityHomeFragment.f34263X.isEmpty()) {
                                billPaymentElectricityHomeFragment.O();
                            } else {
                                BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                                if (billPaymentElectricityHomeViewModel != null) {
                                    billPaymentElectricityHomeViewModel.d(billPaymentElectricityHomeFragment.f34258C, true, false);
                                }
                            }
                            break;
                        case 2:
                            int i17 = BillPaymentElectricityHomeFragment.f34255z0;
                            Postcard postcardWithString = ARouter.getInstance().build("/quick_teller/betting_beneficiaries").withString("KEY_CATEGORY_ID", billPaymentElectricityHomeFragment.f34258C);
                            ARouter aRouter = ARouter.getInstance();
                            Intrinsics.checkNotNullExpressionValue(aRouter, "getInstance(...)");
                            Intrinsics.e(postcardWithString);
                            r0.x(aRouter, billPaymentElectricityHomeFragment, postcardWithString, 101);
                            n0.g().l("PPay_Electricity_Btn_Contacts");
                            break;
                        case 3:
                            int i18 = BillPaymentElectricityHomeFragment.f34255z0;
                            androidx.fragment.app.E eRequireActivity = billPaymentElectricityHomeFragment.requireActivity();
                            Intrinsics.f(eRequireActivity, "null cannot be cast to non-null type com.transsnet.palmpay.teller.ui.activity.BillPaymentHomeActivity");
                            ((BillPaymentHomeActivity) eRequireActivity).goBackToHome();
                            break;
                        case 4:
                            int i19 = BillPaymentElectricityHomeFragment.f34255z0;
                            if (!BaseApplication.hasLogin()) {
                                i0.K(null, null);
                            } else {
                                BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel2 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                                if (billPaymentElectricityHomeViewModel2 != null) {
                                    ArrayList transType = C1850q.e("16");
                                    Intrinsics.checkNotNullParameter(transType, "transType");
                                    AbstractC0780y.m(V.h(billPaymentElectricityHomeViewModel2), null, null, new p086fe.F(billPaymentElectricityHomeViewModel2.f34389f, C0.G.p("Pref_", "queryTransactionLinkVM_" + transType, "_", BaseApplication.getCountryLocale()), null, transType), 3);
                                }
                                n0.g().l("PPay_Electricity_Btn_TransHistory");
                            }
                            break;
                        case 5:
                            BillerListItemBean billerListItemBean = billPaymentElectricityHomeFragment.f34265Z;
                            if (billerListItemBean != null) {
                                Integer status = billerListItemBean.getStatus();
                                if (status != null && status.intValue() == 1) {
                                    if (!billPaymentElectricityHomeFragment.f34264Y.isEmpty()) {
                                        billPaymentElectricityHomeFragment.P();
                                    } else {
                                        BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel3 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                                        if (billPaymentElectricityHomeViewModel3 != null) {
                                            BillerListItemBean billerListItemBean2 = billPaymentElectricityHomeFragment.f34265Z;
                                            billPaymentElectricityHomeViewModel3.e(billerListItemBean2 != null ? billerListItemBean2.getBillerId() : null, true, false);
                                        }
                                        BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel4 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                                        if (billPaymentElectricityHomeViewModel4 != null) {
                                            BillerListItemBean billerListItemBean3 = billPaymentElectricityHomeFragment.f34265Z;
                                            if (billerListItemBean3 == null || (billerId = billerListItemBean3.getBillerId()) == null) {
                                                billerId = "";
                                            }
                                            billPaymentElectricityHomeViewModel4.f(billerId);
                                        }
                                    }
                                }
                            } else {
                                f0 f0Var110 = (f0) billPaymentElectricityHomeFragment.f27335j;
                                if (f0Var110 != null) {
                                    f0Var110.f8283C.e(billPaymentElectricityHomeFragment.getString(Pd.f.qt_msg_select_biller_first));
                                }
                            }
                            break;
                        default:
                            int i110 = BillPaymentElectricityHomeFragment.f34255z0;
                            if (!r0.U0()) {
                                billPaymentElectricityHomeFragment.E();
                                KeyboardUtils.hideSoftInput(billPaymentElectricityHomeFragment.requireActivity());
                                break;
                            }
                            break;
                    }
                }
            });
        }
        f0 f0Var20 = (f0) this.f27335j;
        if (f0Var20 != null) {
            f0Var20.f8303w.setFocusListener(new ViewOnFocusChangeListenerC0235o(this, 9));
        }
        E activity = getActivity();
        if (activity != null) {
            CommonExtKt.softKeyBoardChangeListener(activity, new Wd.G(15), new C0463g(this, 29));
        }
        Q();
        f0 f0Var21 = (f0) this.f27335j;
        if (f0Var21 != null) {
            f0Var21.f8297g.setTextInputListener(new C0802g(this));
        }
        f0 f0Var22 = (f0) this.f27335j;
        if (f0Var22 != null) {
            f0Var22.f8297g.setActionButtonListener(new View.OnClickListener(this) { // from class: Zd.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BillPaymentElectricityHomeFragment f11658b;

                {
                    this.f11658b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String billerId;
                    BillPaymentElectricityHomeFragment billPaymentElectricityHomeFragment = this.f11658b;
                    switch (i7) {
                        case 0:
                            int i16 = BillPaymentElectricityHomeFragment.f34255z0;
                            KeyboardUtils.hideSoftInput(billPaymentElectricityHomeFragment.requireActivity());
                            break;
                        case 1:
                            if (!billPaymentElectricityHomeFragment.f34263X.isEmpty()) {
                                billPaymentElectricityHomeFragment.O();
                            } else {
                                BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                                if (billPaymentElectricityHomeViewModel != null) {
                                    billPaymentElectricityHomeViewModel.d(billPaymentElectricityHomeFragment.f34258C, true, false);
                                }
                            }
                            break;
                        case 2:
                            int i17 = BillPaymentElectricityHomeFragment.f34255z0;
                            Postcard postcardWithString = ARouter.getInstance().build("/quick_teller/betting_beneficiaries").withString("KEY_CATEGORY_ID", billPaymentElectricityHomeFragment.f34258C);
                            ARouter aRouter = ARouter.getInstance();
                            Intrinsics.checkNotNullExpressionValue(aRouter, "getInstance(...)");
                            Intrinsics.e(postcardWithString);
                            r0.x(aRouter, billPaymentElectricityHomeFragment, postcardWithString, 101);
                            n0.g().l("PPay_Electricity_Btn_Contacts");
                            break;
                        case 3:
                            int i18 = BillPaymentElectricityHomeFragment.f34255z0;
                            androidx.fragment.app.E eRequireActivity = billPaymentElectricityHomeFragment.requireActivity();
                            Intrinsics.f(eRequireActivity, "null cannot be cast to non-null type com.transsnet.palmpay.teller.ui.activity.BillPaymentHomeActivity");
                            ((BillPaymentHomeActivity) eRequireActivity).goBackToHome();
                            break;
                        case 4:
                            int i19 = BillPaymentElectricityHomeFragment.f34255z0;
                            if (!BaseApplication.hasLogin()) {
                                i0.K(null, null);
                            } else {
                                BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel2 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                                if (billPaymentElectricityHomeViewModel2 != null) {
                                    ArrayList transType = C1850q.e("16");
                                    Intrinsics.checkNotNullParameter(transType, "transType");
                                    AbstractC0780y.m(V.h(billPaymentElectricityHomeViewModel2), null, null, new p086fe.F(billPaymentElectricityHomeViewModel2.f34389f, C0.G.p("Pref_", "queryTransactionLinkVM_" + transType, "_", BaseApplication.getCountryLocale()), null, transType), 3);
                                }
                                n0.g().l("PPay_Electricity_Btn_TransHistory");
                            }
                            break;
                        case 5:
                            BillerListItemBean billerListItemBean = billPaymentElectricityHomeFragment.f34265Z;
                            if (billerListItemBean != null) {
                                Integer status = billerListItemBean.getStatus();
                                if (status != null && status.intValue() == 1) {
                                    if (!billPaymentElectricityHomeFragment.f34264Y.isEmpty()) {
                                        billPaymentElectricityHomeFragment.P();
                                    } else {
                                        BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel3 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                                        if (billPaymentElectricityHomeViewModel3 != null) {
                                            BillerListItemBean billerListItemBean2 = billPaymentElectricityHomeFragment.f34265Z;
                                            billPaymentElectricityHomeViewModel3.e(billerListItemBean2 != null ? billerListItemBean2.getBillerId() : null, true, false);
                                        }
                                        BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel4 = (BillPaymentElectricityHomeViewModel) billPaymentElectricityHomeFragment.f27333i;
                                        if (billPaymentElectricityHomeViewModel4 != null) {
                                            BillerListItemBean billerListItemBean3 = billPaymentElectricityHomeFragment.f34265Z;
                                            if (billerListItemBean3 == null || (billerId = billerListItemBean3.getBillerId()) == null) {
                                                billerId = "";
                                            }
                                            billPaymentElectricityHomeViewModel4.f(billerId);
                                        }
                                    }
                                }
                            } else {
                                f0 f0Var110 = (f0) billPaymentElectricityHomeFragment.f27335j;
                                if (f0Var110 != null) {
                                    f0Var110.f8283C.e(billPaymentElectricityHomeFragment.getString(Pd.f.qt_msg_select_biller_first));
                                }
                            }
                            break;
                        default:
                            int i110 = BillPaymentElectricityHomeFragment.f34255z0;
                            if (!r0.U0()) {
                                billPaymentElectricityHomeFragment.E();
                                KeyboardUtils.hideSoftInput(billPaymentElectricityHomeFragment.requireActivity());
                                break;
                            }
                            break;
                    }
                }
            });
        }
        HashMap map = new HashMap();
        map.put(LogConstants.Autotrack.ELEMENT_TRANS_TYPE, b.b(str));
        AutoTrackUtil.trackActivityProperties(requireActivity(), map);
        return 0;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i10 == -1 && i7 == 101 && intent != null) {
            K(intent.getStringExtra("extra_data_1"), intent.getStringExtra("extra_data_2"), intent.getStringExtra("customerId"), Long.valueOf(intent.getLongExtra("amount", 0L)), false, true);
        }
    }

    @Override // com.transsnet.palmpay.teller.ui.dialog.PickBillerNewDialog.CallBack
    public final void onBillerClick(int i7, BillerListItemBean billerListItemBean) {
        String billerName;
        n0 n0VarG = n0.g();
        if (billerListItemBean == null || (billerName = billerListItemBean.getBillerName()) == null) {
            billerName = "";
        }
        n0VarG.m("ElectriCityClick", "SeLectBillerClick", billerName);
        this.f34268q0 = null;
        this.f34269r0 = null;
        this.f34267p0 = 0L;
        F(billerListItemBean, true, false);
        this.f34266k0 = null;
        N("");
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        org.greenrobot.eventbus.c.b().l(this);
        B().stop();
    }

    @Override // com.transsnet.palmpay.teller.ui.dialog.PickPaymentItemDialog.CallBack
    public final void onPaymentItemClick(PaymentItemBean paymentItemBean) {
        if (paymentItemBean != null) {
            n0 n0VarG = n0.g();
            String str = paymentItemBean.paymentItemId;
            if (str == null) {
                str = "";
            }
            n0VarG.m("ElectriCityClick", "PaymentItemrClick", str);
            this.f34268q0 = null;
            this.f34269r0 = null;
            this.f34267p0 = 0L;
            G(paymentItemBean, false);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable MessageEvent messageEvent) {
    }

    @Override // com.transsnet.palmpay.teller.ui.fragment.BaseBillerFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ModelAvailableCouponItem modelAvailableCouponItem = this.f34276w0;
        if (modelAvailableCouponItem != null) {
            modelAvailableCouponItem.e();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBFragment
    public final ViewBinding t(LayoutInflater inflater, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(Pd.d.qt_fragment_bill_payment_home_electricity, viewGroup, false);
        int i7 = Pd.c.ad_bottom_bill_1;
        SingleAdView singleAdView = (SingleAdView) p059e1.a.m(i7, viewInflate);
        if (singleAdView != null) {
            i7 = Pd.c.ad_bottom_bill_2;
            SingleAdView singleAdView2 = (SingleAdView) p059e1.a.m(i7, viewInflate);
            if (singleAdView2 != null) {
                i7 = Pd.c.ad_mid_bill;
                SingleAdView singleAdView3 = (SingleAdView) p059e1.a.m(i7, viewInflate);
                if (singleAdView3 != null) {
                    i7 = Pd.c.cb_save_to_beneficiaries;
                    AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) p059e1.a.m(i7, viewInflate);
                    if (appCompatCheckBox != null) {
                        i7 = Pd.c.cl_select_payment_item;
                        if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
                            i7 = Pd.c.flBody;
                            FrameLayout frameLayout = (FrameLayout) p059e1.a.m(i7, viewInflate);
                            if (frameLayout != null) {
                                i7 = Pd.c.inputAmount;
                                PpAmountEditText ppAmountEditText = (PpAmountEditText) p059e1.a.m(i7, viewInflate);
                                if (ppAmountEditText != null) {
                                    i7 = Pd.c.iv_check_customer;
                                    ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
                                    if (imageView != null) {
                                        i7 = Pd.c.ll_amount_label;
                                        LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                        if (linearLayout != null) {
                                            i7 = Pd.c.ll_check_customer;
                                            LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                            if (linearLayout2 != null) {
                                                i7 = Pd.c.ll_content;
                                                LinearLayout linearLayout3 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                                if (linearLayout3 != null) {
                                                    i7 = Pd.c.ll_save_to_beneficiary;
                                                    LinearLayout linearLayout4 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                                    if (linearLayout4 != null) {
                                                        i7 = Pd.c.model_available_point_item;
                                                        ModelAvailablePointItem modelAvailablePointItem = (ModelAvailablePointItem) p059e1.a.m(i7, viewInflate);
                                                        if (modelAvailablePointItem != null) {
                                                            i7 = Pd.c.model_input_customer;
                                                            ModelNumberInputLayout modelNumberInputLayout = (ModelNumberInputLayout) p059e1.a.m(i7, viewInflate);
                                                            if (modelNumberInputLayout != null) {
                                                                i7 = Pd.c.model_quick_access_item_native;
                                                                if (((ModelBillQuickAccessItem) p059e1.a.m(i7, viewInflate)) != null) {
                                                                    i7 = Pd.c.operatorMsgLayout;
                                                                    ModelBillerTipsInfo modelBillerTipsInfo = (ModelBillerTipsInfo) p059e1.a.m(i7, viewInflate);
                                                                    if (modelBillerTipsInfo != null) {
                                                                        i7 = Pd.c.rv_payment_item_amount;
                                                                        RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewInflate);
                                                                        if (recyclerView != null) {
                                                                            i7 = Pd.c.space_ad_mid_bill;
                                                                            if (((Space) p059e1.a.m(i7, viewInflate)) != null) {
                                                                                i7 = Pd.c.space_outstanding_layout;
                                                                                if (((Space) p059e1.a.m(i7, viewInflate)) != null) {
                                                                                    i7 = Pd.c.tev_select_biller;
                                                                                    ModelItemSelection modelItemSelection = (ModelItemSelection) p059e1.a.m(i7, viewInflate);
                                                                                    if (modelItemSelection != null) {
                                                                                        i7 = Pd.c.tev_select_payment_item;
                                                                                        ModelItemSelection modelItemSelection2 = (ModelItemSelection) p059e1.a.m(i7, viewInflate);
                                                                                        if (modelItemSelection2 != null) {
                                                                                            i7 = Pd.c.title_bar;
                                                                                            PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                                                                                            if (ppTitleBar != null) {
                                                                                                i7 = Pd.c.tv_amount_label_title;
                                                                                                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                if (textView != null) {
                                                                                                    i7 = Pd.c.tv_check_customer;
                                                                                                    TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                    if (textView2 != null) {
                                                                                                        i7 = Pd.c.tvOutstanding;
                                                                                                        TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                        if (textView3 != null) {
                                                                                                            i7 = Pd.c.tv_payment_item_cashback;
                                                                                                            TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                            if (textView4 != null) {
                                                                                                                i7 = Pd.c.vsb_bill_home_coupon;
                                                                                                                ViewStub viewStub = (ViewStub) p059e1.a.m(i7, viewInflate);
                                                                                                                if (viewStub != null) {
                                                                                                                    f0 f0Var = new f0((LinearLayout) viewInflate, singleAdView, singleAdView2, singleAdView3, appCompatCheckBox, frameLayout, ppAmountEditText, imageView, linearLayout, linearLayout2, linearLayout3, linearLayout4, modelAvailablePointItem, modelNumberInputLayout, modelBillerTipsInfo, recyclerView, modelItemSelection, modelItemSelection2, ppTitleBar, textView, textView2, textView3, textView4, viewStub);
                                                                                                                    Intrinsics.checkNotNullExpressionValue(f0Var, "inflate(...)");
                                                                                                                    return f0Var;
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
    }

    @Override // com.transsnet.palmpay.teller.ui.fragment.BaseBillerFragment
    public final P0 u() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        P0 p3 = new P0(contextRequireContext);
        f0 f0Var = (f0) this.f27335j;
        p3.f13251f = f0Var != null ? f0Var.f8296f : null;
        p3.f13249d = q0.y(getString(k.core_no_network), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, getString(k.core_no_network_common_tips));
        C0801f listener = new C0801f(this, 0);
        Intrinsics.checkNotNullParameter(listener, "listener");
        p3.f13247b = listener;
        return p3;
    }

    public final void w(String str, QueryElectricCustomerIdIsExitBean queryElectricCustomerIdIsExitBean) {
        String billerId;
        f0 f0Var;
        Long debtAmount;
        Long debtAmount2;
        Long debtAmount3;
        String str2;
        String strC = C();
        BillerListItemBean billerListItemBean = this.f34265Z;
        String str3 = "";
        if (billerListItemBean == null || (billerId = billerListItemBean.getBillerId()) == null) {
            billerId = "";
        }
        PaymentItemBean paymentItemBean = this.f34266k0;
        if (paymentItemBean != null && (str2 = paymentItemBean.paymentItemId) != null) {
            str3 = str2;
        }
        StringBuilder sbT = C0.G.t(strC, "_");
        u.x(sbT, this.f34258C, "_", billerId, "_");
        sbT.append(str3);
        String string = sbT.toString();
        if (y.h(string, str, true)) {
            this.f34273v = queryElectricCustomerIdIsExitBean;
            f0 f0Var2 = (f0) this.f27335j;
            if (f0Var2 != null) {
                h.s(f0Var2.t, queryElectricCustomerIdIsExitBean != null ? Intrinsics.c(queryElectricCustomerIdIsExitBean.getFamilyAccountExist(), Boolean.FALSE) : false);
            }
            f0 f0Var3 = (f0) this.f27335j;
            long jLongValue = 0;
            if (f0Var3 != null) {
                h.s(f0Var3.f8288X, ((queryElectricCustomerIdIsExitBean == null || (debtAmount3 = queryElectricCustomerIdIsExitBean.getDebtAmount()) == null) ? 0L : debtAmount3.longValue()) > 0);
            }
            if (((queryElectricCustomerIdIsExitBean == null || (debtAmount2 = queryElectricCustomerIdIsExitBean.getDebtAmount()) == null) ? 0L : debtAmount2.longValue()) > 0 && (f0Var = (f0) this.f27335j) != null) {
                TextView textView = f0Var.f8288X;
                SpanUtils spanUtilsAppend = new SpanUtils().append(getString(f.qt_current_arrears)).append(" ");
                if (queryElectricCustomerIdIsExitBean != null && (debtAmount = queryElectricCustomerIdIsExitBean.getDebtAmount()) != null) {
                    jLongValue = debtAmount.longValue();
                }
                textView.setText(spanUtilsAppend.append(r0.B(jLongValue, false)).setBold().create());
            }
        } else {
            this.f34273v = null;
            f0 f0Var4 = (f0) this.f27335j;
            if (f0Var4 != null) {
                h.s(f0Var4.t, true);
            }
            f0 f0Var5 = (f0) this.f27335j;
            if (f0Var5 != null) {
                h.s(f0Var5.f8288X, false);
            }
            A();
        }
        if (y.h(string, str, true)) {
            x(queryElectricCustomerIdIsExitBean, false, true);
        }
        z();
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:61:0x00df  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f4  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void x(QueryElectricCustomerIdIsExitBean queryElectricCustomerIdIsExitBean, boolean z3, boolean z8) {
        f0 f0Var;
        String actualPaymentItemType;
        ArrayList arrayList;
        String actualPaymentItemType2;
        String customerName;
        f0 f0Var2;
        Unit unit;
        f0 f0Var3 = (f0) this.f27335j;
        if (f0Var3 != null) {
            f0Var3.f8303w.setErrorMessage("");
        }
        if (z3) {
            f0 f0Var4 = (f0) this.f27335j;
            if (f0Var4 != null) {
                h.s(f0Var4.f8300o, true);
            }
            f0 f0Var5 = (f0) this.f27335j;
            if (f0Var5 != null) {
                f0Var5.f8298i.setImageDrawable(B());
            }
            f0 f0Var6 = (f0) this.f27335j;
            if (f0Var6 != null) {
                f0Var6.f8287Q.setText(getString(f.qt_verifying_account_loading));
            }
            if (B().f17896d.isRunning()) {
                return;
            }
            B().start();
            return;
        }
        B().stop();
        Object obj = null;
        if (!TextUtils.isEmpty(queryElectricCustomerIdIsExitBean != null ? queryElectricCustomerIdIsExitBean.getErrorInfo() : null)) {
            f0 f0Var7 = (f0) this.f27335j;
            if (f0Var7 != null) {
                h.s(f0Var7.f8300o, false);
            }
            f0 f0Var8 = (f0) this.f27335j;
            if (f0Var8 != null) {
                f0Var8.f8303w.setErrorMessage(queryElectricCustomerIdIsExitBean != null ? queryElectricCustomerIdIsExitBean.getErrorInfo() : null);
                return;
            }
            return;
        }
        if (queryElectricCustomerIdIsExitBean == null || (customerName = queryElectricCustomerIdIsExitBean.getCustomerName()) == null) {
            f0Var = (f0) this.f27335j;
            if (f0Var != null) {
                h.s(f0Var.f8300o, false);
                Unit unit2 = Unit.f38893a;
            }
        } else {
            String customerId = queryElectricCustomerIdIsExitBean.getCustomerId();
            if (customerId == null) {
                f0Var2 = (f0) this.f27335j;
                if (f0Var2 != null) {
                    h.s(f0Var2.f8300o, false);
                    unit = Unit.f38893a;
                } else {
                    unit = null;
                }
            } else {
                f0 f0Var9 = (f0) this.f27335j;
                if (customerId.equalsIgnoreCase(f0Var9 != null ? f0Var9.f8303w.getNumber() : null)) {
                    f0 f0Var10 = (f0) this.f27335j;
                    if (f0Var10 != null) {
                        h.s(f0Var10.f8300o, true);
                    }
                    f0 f0Var11 = (f0) this.f27335j;
                    if (f0Var11 != null) {
                        TextView textView = f0Var11.f8287Q;
                        if (TextUtils.isEmpty(customerName)) {
                            customerName = getString(f.qt_verifying_success);
                            Intrinsics.checkNotNullExpressionValue(customerName, "getString(...)");
                        }
                        textView.setText(customerName);
                    }
                    f0 f0Var12 = (f0) this.f27335j;
                    if (f0Var12 != null) {
                        f0Var12.f8298i.setImageResource(r.cv_select_circle_purple);
                        unit = Unit.f38893a;
                    } else {
                        unit = null;
                    }
                } else {
                    f0Var2 = (f0) this.f27335j;
                    if (f0Var2 != null) {
                        h.s(f0Var2.f8300o, false);
                        unit = Unit.f38893a;
                    } else {
                        unit = null;
                    }
                }
            }
            if (unit == null) {
                f0Var = (f0) this.f27335j;
                if (f0Var != null) {
                    h.s(f0Var.f8300o, false);
                    Unit unit3 = Unit.f38893a;
                }
            }
        }
        if ((queryElectricCustomerIdIsExitBean != null && (actualPaymentItemType2 = queryElectricCustomerIdIsExitBean.getActualPaymentItemType()) != null && actualPaymentItemType2.equals(queryElectricCustomerIdIsExitBean.getPaymentItemType())) || queryElectricCustomerIdIsExitBean == null || (actualPaymentItemType = queryElectricCustomerIdIsExitBean.getActualPaymentItemType()) == null || (arrayList = this.f34264Y) == null) {
            return;
        }
        for (Object obj2 : arrayList) {
            if (actualPaymentItemType.equals(((PaymentItemBean) obj2).paymentItemType)) {
                obj = obj2;
                break;
            }
        }
        PaymentItemBean paymentItemBean = (PaymentItemBean) obj;
        if (paymentItemBean != null) {
            if (Intrinsics.c(queryElectricCustomerIdIsExitBean.getValid(), Boolean.TRUE)) {
                G(paymentItemBean, z8);
            }
            String tips = queryElectricCustomerIdIsExitBean.getTips();
            if (tips != null) {
                androidx.camera.core.impl.utils.n.u(tips);
            }
        }
    }

    public final void y() {
        String billerId;
        String str;
        if (TextUtils.isEmpty(C()) || C().length() < this.f34256A || this.f34265Z == null || this.f34266k0 == null) {
            x(null, false, false);
            f0 f0Var = (f0) this.f27335j;
            if (f0Var != null) {
                h.s(f0Var.t, !TextUtils.isEmpty(C()));
            }
            f0 f0Var2 = (f0) this.f27335j;
            if (f0Var2 != null) {
                h.s(f0Var2.f8288X, false);
                return;
            }
            return;
        }
        String strC = C();
        BillerListItemBean billerListItemBean = this.f34265Z;
        String str2 = "";
        if (billerListItemBean == null || (billerId = billerListItemBean.getBillerId()) == null) {
            billerId = "";
        }
        PaymentItemBean paymentItemBean = this.f34266k0;
        if (paymentItemBean != null && (str = paymentItemBean.paymentItemId) != null) {
            str2 = str;
        }
        StringBuilder sbT = C0.G.t(strC, "_");
        String categoryId = this.f34258C;
        u.x(sbT, categoryId, "_", billerId, "_");
        sbT.append(str2);
        String string = sbT.toString();
        HashMap map = this.f34262Q;
        if (map.containsKey(string)) {
            w(string, (QueryElectricCustomerIdIsExitBean) map.get(string));
            return;
        }
        x(null, true, false);
        BillPaymentElectricityHomeViewModel billPaymentElectricityHomeViewModel = (BillPaymentElectricityHomeViewModel) this.f27333i;
        if (billPaymentElectricityHomeViewModel != null) {
            String customerID = C();
            BillerListItemBean billerListItemBean2 = this.f34265Z;
            String billerId2 = billerListItemBean2 != null ? billerListItemBean2.getBillerId() : null;
            BillerListItemBean billerListItemBean3 = this.f34265Z;
            String billerName = billerListItemBean3 != null ? billerListItemBean3.getBillerName() : null;
            PaymentItemBean paymentItemBean2 = this.f34266k0;
            String str3 = paymentItemBean2 != null ? paymentItemBean2.paymentItemId : null;
            String str4 = paymentItemBean2 != null ? paymentItemBean2.paymentItemType : null;
            Intrinsics.checkNotNullParameter(customerID, "customerID");
            Intrinsics.checkNotNullParameter(categoryId, "categoryId");
            if (BaseApplication.hasLogin()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(customerID);
                sb2.append("_");
                sb2.append(categoryId);
                sb2.append("_");
                sb2.append(billerId2);
                String strR = C0.G.r(sb2, "_", str3);
                t0 t0Var = billPaymentElectricityHomeViewModel.f34388e;
                if (t0Var != null && t0Var.isActive()) {
                    F6.d.h("QueryFamilyAccountIsExit cancel", 3, new Object[0]);
                    t0 t0Var2 = billPaymentElectricityHomeViewModel.f34388e;
                    if (t0Var2 != null) {
                        t0Var2.cancel((CancellationException) null);
                    }
                }
                String strO = C0.G.o("queryElectricAccountIsExitByCategoryId", strR);
                com.transsnet.palmpay.core.base.l lVar = billPaymentElectricityHomeViewModel.f34390g;
                lVar.f27356m = strR;
                billPaymentElectricityHomeViewModel.f34388e = AbstractC0780y.m(V.h(billPaymentElectricityHomeViewModel), null, null, new C1689s(lVar, q0.y(strO, "_", BaseApplication.getCountryLocale()), null, billerId2, billerName, customerID, str3, str4), 3);
            }
        }
    }

    public final boolean z() {
        PpAmountEditText ppAmountEditText;
        PpAmountEditText ppAmountEditText2;
        ModelNumberInputLayout modelNumberInputLayout;
        ModelItemSelection modelItemSelection;
        ModelItemSelection modelItemSelection2;
        f0 f0Var = (f0) this.f27335j;
        String amountString = null;
        if (TextUtils.isEmpty((f0Var == null || (modelItemSelection2 = f0Var.f8283C) == null) ? null : modelItemSelection2.getItemValue())) {
            return false;
        }
        f0 f0Var2 = (f0) this.f27335j;
        if (TextUtils.isEmpty((f0Var2 == null || (modelItemSelection = f0Var2.f8284H) == null) ? null : modelItemSelection.getItemValue())) {
            return false;
        }
        f0 f0Var3 = (f0) this.f27335j;
        if (TextUtils.isEmpty((f0Var3 == null || (modelNumberInputLayout = f0Var3.f8303w) == null) ? null : modelNumberInputLayout.getNumber())) {
            return false;
        }
        f0 f0Var4 = (f0) this.f27335j;
        if (f0Var4 != null && (ppAmountEditText2 = f0Var4.f8297g) != null) {
            amountString = ppAmountEditText2.getAmountString();
        }
        if (TextUtils.isEmpty(amountString)) {
            return false;
        }
        f0 f0Var5 = (f0) this.f27335j;
        return ((f0Var5 == null || (ppAmountEditText = f0Var5.f8297g) == null) ? 0L : ppAmountEditText.getLongAmount()) > 0;
    }
}
