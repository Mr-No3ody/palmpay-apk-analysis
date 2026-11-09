package com.transsnet.palmpay.teller.ui.activity;

import Ab.y;
import N8.C0463g;
import N8.q0;
import Pa.r0;
import Pd.c;
import Pd.d;
import Rd.D;
import V9.q;
import Wd.G;
import Wd.I;
import Wd.V;
import Wd.W;
import Wd.X;
import Wd.Y;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.u;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.camera.camera2.internal.P0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.banner.BannerAdView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.cashier.CoreCashierPaymentExtra;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import com.transsnet.palmpay.core.viewmodel.ModelAvailableCouponItem;
import com.transsnet.palmpay.custom_view.ModelItemSelection;
import com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.teller.bean.BillPaymentHomeParams;
import com.transsnet.palmpay.teller.bean.BillerListItemBean;
import com.transsnet.palmpay.teller.bean.ChannelDataItemBean;
import com.transsnet.palmpay.teller.bean.CreateTellerOrderReq;
import com.transsnet.palmpay.teller.bean.CreateTellerOrderRsp;
import com.transsnet.palmpay.teller.bean.PaymentItemBean;
import com.transsnet.palmpay.teller.bean.PaymentItemListRsp;
import com.transsnet.palmpay.teller.bean.WAECOperatorBean;
import com.transsnet.palmpay.teller.ui.activity.WaecHomeActivity;
import com.transsnet.palmpay.teller.ui.dialog.PickBillerDialog;
import com.transsnet.palmpay.teller.ui.dialog.PickMobileNetWorkDialog;
import com.transsnet.palmpay.teller.ui.dialog.PickPaymentItemDialog;
import com.transsnet.palmpay.teller.viewmodel.BillPaymentHomeNGViewModel;
import com.transsnet.palmpay.util.ToastUtils;
import io.fastkv.n;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p070ee.b;
import p086fe.Z;
import p140j8.f;
import p355xf.C2131j;
import p355xf.EnumC2132k;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "场景/WAEC", path = "/quick_teller/waec_home")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/activity/WaecHomeActivity;", "Lcom/transsnet/palmpay/teller/ui/activity/BaseBillerActivity;", "Lcom/transsnet/palmpay/teller/viewmodel/BillPaymentHomeNGViewModel;", "LRd/D;", "Lcom/transsnet/palmpay/teller/ui/dialog/PickBillerDialog$CallBack;", "Landroid/text/TextWatcher;", "Lcom/transsnet/palmpay/teller/ui/dialog/PickPaymentItemDialog$CallBack;", "<init>", "()V", "a", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWaecHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WaecHomeActivity.kt\ncom/transsnet/palmpay/teller/ui/activity/WaecHomeActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,650:1\n171#2,12:651\n215#2:663\n115#2,8:664\n145#2:672\n115#2,8:673\n145#2:681\n1#3:682\n*S KotlinDebug\n*F\n+ 1 WaecHomeActivity.kt\ncom/transsnet/palmpay/teller/ui/activity/WaecHomeActivity\n*L\n209#1:651,12\n209#1:663\n215#1:664,8\n215#1:672\n227#1:673,8\n227#1:681\n*E\n"})
public final class WaecHomeActivity extends BaseBillerActivity<BillPaymentHomeNGViewModel, D> implements PickBillerDialog.CallBack, TextWatcher, PickPaymentItemDialog.CallBack {

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public static final /* synthetic */ int f34237Q = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f34238A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f34239B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f34240C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public long f34241H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public PickMobileNetWorkDialog f34242L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public WAECOperatorBean f34243M;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f34244i = TransType.TRANS_TYPE_P2P_CASH_IN;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f34245j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f34246o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f34247p;
    public final ArrayList t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f34248v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public PaymentItemBean f34249w;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@Nullable Context context, @NotNull String categoryId) {
            Intrinsics.checkNotNullParameter(categoryId, "categoryId");
            if (context != null) {
                Intent intent = new Intent(context, (Class<?>) WaecHomeActivity.class);
                intent.putExtra("extra_type", categoryId);
                context.startActivity(intent);
            }
        }

        private a() {
        }
    }

    static {
        new a(null);
    }

    public WaecHomeActivity() {
        EnumC2132k enumC2132k = EnumC2132k.f43971c;
        this.f34245j = C2131j.a(enumC2132k, new W(this, 0));
        this.f34246o = C2131j.a(enumC2132k, new W(this, 1));
        this.f34247p = C2131j.a(enumC2132k, new W(this, 2));
        this.t = new ArrayList();
        this.f34248v = new ArrayList();
        this.f34240C = Long.MAX_VALUE;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        x();
        q().setOnNumberInputListener(new X(this));
        p().setTextInputListener(new q(this, 17));
        D d2 = (D) this.f27334c;
        if (d2 != null) {
            d2.f8019g.setOnClickListener(new V(this, 4));
        }
        HashMap map = new HashMap();
        Object obj = b.f36288a;
        map.put(LogConstants.Autotrack.ELEMENT_TRANS_TYPE, b.b(this.f34244i));
        AutoTrackUtil.trackActivityProperties(this, map);
        D d10 = (D) this.f27334c;
        AutoTrackUtil.trackViewProperties(d10 != null ? d10.f8019g : null, map);
        D d11 = (D) this.f27334c;
        if (d11 != null) {
            BannerAdView bannerAdView = d11.f8014b;
            D d12 = (D) this.f27334c;
            bannerAdView.setAdListener(new com.chuanyi.ad.a(d12 != null ? d12.f8014b : null, ""));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(d.qt_activity_waec_home, (ViewGroup) null, false);
        int i7 = c.adBanner;
        BannerAdView bannerAdView = (BannerAdView) p059e1.a.m(i7, viewInflate);
        if (bannerAdView != null) {
            i7 = c.availCoupons;
            ModelAvailableCouponItem modelAvailableCouponItem = (ModelAvailableCouponItem) p059e1.a.m(i7, viewInflate);
            if (modelAvailableCouponItem != null) {
                i7 = c.clBody;
                ConstraintLayout constraintLayout = (ConstraintLayout) p059e1.a.m(i7, viewInflate);
                if (constraintLayout != null) {
                    i7 = c.editTextPayAmount;
                    if (((PpAmountEditText) p059e1.a.m(i7, viewInflate)) != null) {
                        i7 = c.inputPaymentItem;
                        if (((ModelItemSelection) p059e1.a.m(i7, viewInflate)) != null) {
                            i7 = c.qa_mobile_net_work;
                            ModelItemSelection modelItemSelection = (ModelItemSelection) p059e1.a.m(i7, viewInflate);
                            if (modelItemSelection != null) {
                                i7 = c.qab_cashback_iv;
                                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                if (textView != null) {
                                    i7 = c.qab_coupon_iv;
                                    if (((ImageView) p059e1.a.m(i7, viewInflate)) != null) {
                                        i7 = c.textViewNext;
                                        TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                        if (textView2 != null) {
                                            i7 = c.titleBar;
                                            PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                                            if (ppTitleBar != null) {
                                                i7 = c.viewCustomerId;
                                                if (((ModelNumberInputLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                                    D d2 = new D((LinearLayout) viewInflate, bannerAdView, modelAvailableCouponItem, constraintLayout, modelItemSelection, textView, textView2, ppTitleBar);
                                                    Intrinsics.checkNotNullExpressionValue(d2, "inflate(...)");
                                                    return d2;
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

    @Override // com.transsnet.palmpay.teller.ui.activity.BaseBillerActivity
    public final P0 n() {
        P0 p3 = new P0(this);
        D d2 = (D) this.f27334c;
        p3.f13251f = d2 != null ? d2.f8016d : null;
        p3.f13249d = q0.y(getString(k.core_no_network), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, getString(k.core_no_network_common_tips));
        W listener = new W(this, 3);
        Intrinsics.checkNotNullParameter(listener, "listener");
        p3.f13247b = listener;
        return p3;
    }

    @Override // com.transsnet.palmpay.teller.ui.dialog.PickBillerDialog.CallBack
    public final void onBillerClick(BillerListItemBean billerListItemBean) {
        ((BillPaymentHomeNGViewModel) l()).f(false, false, this.f34244i, billerListItemBean != null ? billerListItemBean.getBillerId() : null);
        this.f34249w = null;
        w("");
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        ChannelDataItemBean channelDataItemBean = (ChannelDataItemBean) intent.getParcelableExtra("billpayment_data");
        if (channelDataItemBean == null) {
            ((BillPaymentHomeNGViewModel) l()).g(this.f34244i);
            return;
        }
        v(channelDataItemBean.getBillerId(), Long.valueOf(channelDataItemBean.getBusinessAmount()), channelDataItemBean.getPaymentItemId(), channelDataItemBean.getCustomerId());
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onPause() {
        super.onPause();
        ModelNumberInputLayout modelNumberInputLayoutQ = q();
        if (modelNumberInputLayoutQ != null) {
            modelNumberInputLayoutQ.showClearIv(false, true);
        }
    }

    @Override // com.transsnet.palmpay.teller.ui.dialog.PickPaymentItemDialog.CallBack
    public final void onPaymentItemClick(PaymentItemBean paymentItemBean) {
        if (paymentItemBean != null) {
            r(paymentItemBean);
            x();
        }
    }

    @Override // com.transsnet.palmpay.teller.ui.activity.BaseBillerActivity, com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        ModelAvailableCouponItem modelAvailableCouponItem;
        super.onResume();
        D d2 = (D) this.f27334c;
        if (d2 == null || (modelAvailableCouponItem = d2.f8015c) == null) {
            return;
        }
        modelAvailableCouponItem.e();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        x();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final PpAmountEditText p() {
        return (PpAmountEditText) this.f34246o.getValue();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        ((BillPaymentHomeNGViewModel) l()).h(this.f34244i);
        ((BillPaymentHomeNGViewModel) l()).f(false, false, this.f34244i, null);
        BillPaymentHomeNGViewModel billPaymentHomeNGViewModel = (BillPaymentHomeNGViewModel) l();
        l lVar = billPaymentHomeNGViewModel != null ? billPaymentHomeNGViewModel.t : null;
        if (lVar != null) {
            lVar.e(this, new I(new Y(this, 2), 2));
        }
        BillPaymentHomeNGViewModel billPaymentHomeNGViewModel2 = (BillPaymentHomeNGViewModel) l();
        l lVar2 = billPaymentHomeNGViewModel2 != null ? billPaymentHomeNGViewModel2.f34399g : null;
        if (lVar2 != null) {
            lVar2.e(this, new I(new Y(this, 0), 2));
        }
        BillPaymentHomeNGViewModel billPaymentHomeNGViewModel3 = (BillPaymentHomeNGViewModel) l();
        l lVar3 = billPaymentHomeNGViewModel3 != null ? billPaymentHomeNGViewModel3.f34400i : null;
        if (lVar3 != null) {
            lVar3.e(this, new I(new Y(this, 1), 2));
        }
        BillPaymentHomeNGViewModel billPaymentHomeNGViewModel4 = (BillPaymentHomeNGViewModel) l();
        final int i7 = 0;
        n.B(this, billPaymentHomeNGViewModel4 != null ? billPaymentHomeNGViewModel4.f34401j : null, this, new Function2(this) { // from class: Wd.U

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaecHomeActivity f10738b;

            {
                this.f10738b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CreateTellerOrderRsp.DataBean dataBean;
                boolean zU;
                switch (i7) {
                    case 0:
                        CreateTellerOrderReq createTellerOrderReq = (CreateTellerOrderReq) obj;
                        CreateTellerOrderRsp rsp = (CreateTellerOrderRsp) obj2;
                        int i10 = WaecHomeActivity.f34237Q;
                        Intrinsics.checkNotNullParameter(rsp, "rsp");
                        boolean zIsSuccess = rsp.isSuccess();
                        WaecHomeActivity waecHomeActivity = this.f10738b;
                        if (zIsSuccess) {
                            if (createTellerOrderReq != null && (dataBean = rsp.data) != null) {
                                C0751z c0751z = new C0751z(waecHomeActivity, 0);
                                c0751z.f4978i = dataBean.calculationExtInfo;
                                c0751z.f4971b = dataBean.orderNo;
                                c0751z.c(Long.valueOf(createTellerOrderReq.businessAmount));
                                c0751z.f4972c = p070ee.b.b(TransType.TRANS_TYPE_P2P_CASH_IN);
                                c0751z.f4974e = "5";
                                ArrayList arrayList = new ArrayList();
                                String string = waecHomeActivity.getString(Pd.f.qt_biller_name);
                                String str = createTellerOrderReq.billerName;
                                if (str == null) {
                                    str = "";
                                }
                                arrayList.add(new CoreCashierPaymentExtra(string, str));
                                if (!TextUtils.isEmpty(dataBean.fullName)) {
                                    String string2 = waecHomeActivity.getString(Vd.a.qt_account_name);
                                    String str2 = dataBean.fullName;
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    arrayList.add(new CoreCashierPaymentExtra(string2, str2));
                                }
                                String string3 = waecHomeActivity.getString(Vd.a.qt_user_id);
                                String str3 = createTellerOrderReq.customerId;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                arrayList.add(new CoreCashierPaymentExtra(string3, str3));
                                if (!TextUtils.isEmpty(dataBean.address)) {
                                    String string4 = waecHomeActivity.getString(p025ba.k.core_address);
                                    String str4 = dataBean.address;
                                    arrayList.add(new CoreCashierPaymentExtra(string4, str4 != null ? str4 : ""));
                                }
                                c0751z.b(arrayList);
                                c0751z.d();
                            }
                        } else if ("CFRONT_800101".equalsIgnoreCase(rsp.getRespCode())) {
                            int i11 = Pd.f.qt_confirm_mobile_information;
                            String respMsg = rsp.getRespMsg();
                            io.fastkv.n.O(waecHomeActivity, 0, Integer.valueOf(i11), null, null, null, null, respMsg == null ? "" : respMsg, Integer.valueOf(p025ba.k.core_continue), null, new Oc.j(27, createTellerOrderReq, waecHomeActivity), Integer.valueOf(p025ba.k.core_change), null, null, null, false, 0, 8385149);
                        } else {
                            ToastUtils.showLong(rsp.getRespMsg(), new Object[0]);
                        }
                        break;
                    default:
                        BillPaymentHomeParams billPaymentHomeParams = (BillPaymentHomeParams) obj;
                        PaymentItemListRsp rsp2 = (PaymentItemListRsp) obj2;
                        int i12 = WaecHomeActivity.f34237Q;
                        Intrinsics.checkNotNullParameter(rsp2, "rsp");
                        if (rsp2.isSuccess()) {
                            List<PaymentItemBean> list = rsp2.data;
                            if (list != null) {
                                WaecHomeActivity waecHomeActivity2 = this.f10738b;
                                waecHomeActivity2.t.clear();
                                ArrayList arrayList2 = waecHomeActivity2.t;
                                arrayList2.addAll(list);
                                String str5 = waecHomeActivity2.f34238A;
                                if (str5 != null) {
                                    zU = waecHomeActivity2.u(str5);
                                } else if (arrayList2.get(0) != null) {
                                    String str6 = ((PaymentItemBean) arrayList2.get(0)).paymentItemId;
                                    Intrinsics.e(str6);
                                    zU = waecHomeActivity2.u(str6);
                                } else {
                                    zU = false;
                                }
                                if (!zU && arrayList2.size() == 1) {
                                    waecHomeActivity2.onPaymentItemClick((PaymentItemBean) arrayList2.get(0));
                                }
                                if (billPaymentHomeParams != null && billPaymentHomeParams.getShowDialog()) {
                                    PickPaymentItemDialog pickPaymentItemDialog = new PickPaymentItemDialog(waecHomeActivity2);
                                    pickPaymentItemDialog.setCallBack(waecHomeActivity2);
                                    pickPaymentItemDialog.setBFavorite(false);
                                    pickPaymentItemDialog.show();
                                    pickPaymentItemDialog.setPaymentItems(waecHomeActivity2.t);
                                }
                            }
                        } else {
                            ToastUtils.showLong(rsp2.getRespMsg(), new Object[0]);
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new G(6), true, null, 224);
        BillPaymentHomeNGViewModel billPaymentHomeNGViewModel5 = (BillPaymentHomeNGViewModel) l();
        final int i10 = 1;
        n.B(this, billPaymentHomeNGViewModel5 != null ? billPaymentHomeNGViewModel5.f34398f : null, this, new Function2(this) { // from class: Wd.U

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WaecHomeActivity f10738b;

            {
                this.f10738b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CreateTellerOrderRsp.DataBean dataBean;
                boolean zU;
                switch (i10) {
                    case 0:
                        CreateTellerOrderReq createTellerOrderReq = (CreateTellerOrderReq) obj;
                        CreateTellerOrderRsp rsp = (CreateTellerOrderRsp) obj2;
                        int i11 = WaecHomeActivity.f34237Q;
                        Intrinsics.checkNotNullParameter(rsp, "rsp");
                        boolean zIsSuccess = rsp.isSuccess();
                        WaecHomeActivity waecHomeActivity = this.f10738b;
                        if (zIsSuccess) {
                            if (createTellerOrderReq != null && (dataBean = rsp.data) != null) {
                                C0751z c0751z = new C0751z(waecHomeActivity, 0);
                                c0751z.f4978i = dataBean.calculationExtInfo;
                                c0751z.f4971b = dataBean.orderNo;
                                c0751z.c(Long.valueOf(createTellerOrderReq.businessAmount));
                                c0751z.f4972c = p070ee.b.b(TransType.TRANS_TYPE_P2P_CASH_IN);
                                c0751z.f4974e = "5";
                                ArrayList arrayList = new ArrayList();
                                String string = waecHomeActivity.getString(Pd.f.qt_biller_name);
                                String str = createTellerOrderReq.billerName;
                                if (str == null) {
                                    str = "";
                                }
                                arrayList.add(new CoreCashierPaymentExtra(string, str));
                                if (!TextUtils.isEmpty(dataBean.fullName)) {
                                    String string2 = waecHomeActivity.getString(Vd.a.qt_account_name);
                                    String str2 = dataBean.fullName;
                                    if (str2 == null) {
                                        str2 = "";
                                    }
                                    arrayList.add(new CoreCashierPaymentExtra(string2, str2));
                                }
                                String string3 = waecHomeActivity.getString(Vd.a.qt_user_id);
                                String str3 = createTellerOrderReq.customerId;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                arrayList.add(new CoreCashierPaymentExtra(string3, str3));
                                if (!TextUtils.isEmpty(dataBean.address)) {
                                    String string4 = waecHomeActivity.getString(p025ba.k.core_address);
                                    String str4 = dataBean.address;
                                    arrayList.add(new CoreCashierPaymentExtra(string4, str4 != null ? str4 : ""));
                                }
                                c0751z.b(arrayList);
                                c0751z.d();
                            }
                        } else if ("CFRONT_800101".equalsIgnoreCase(rsp.getRespCode())) {
                            int i12 = Pd.f.qt_confirm_mobile_information;
                            String respMsg = rsp.getRespMsg();
                            io.fastkv.n.O(waecHomeActivity, 0, Integer.valueOf(i12), null, null, null, null, respMsg == null ? "" : respMsg, Integer.valueOf(p025ba.k.core_continue), null, new Oc.j(27, createTellerOrderReq, waecHomeActivity), Integer.valueOf(p025ba.k.core_change), null, null, null, false, 0, 8385149);
                        } else {
                            ToastUtils.showLong(rsp.getRespMsg(), new Object[0]);
                        }
                        break;
                    default:
                        BillPaymentHomeParams billPaymentHomeParams = (BillPaymentHomeParams) obj;
                        PaymentItemListRsp rsp2 = (PaymentItemListRsp) obj2;
                        int i13 = WaecHomeActivity.f34237Q;
                        Intrinsics.checkNotNullParameter(rsp2, "rsp");
                        if (rsp2.isSuccess()) {
                            List<PaymentItemBean> list = rsp2.data;
                            if (list != null) {
                                WaecHomeActivity waecHomeActivity2 = this.f10738b;
                                waecHomeActivity2.t.clear();
                                ArrayList arrayList2 = waecHomeActivity2.t;
                                arrayList2.addAll(list);
                                String str5 = waecHomeActivity2.f34238A;
                                if (str5 != null) {
                                    zU = waecHomeActivity2.u(str5);
                                } else if (arrayList2.get(0) != null) {
                                    String str6 = ((PaymentItemBean) arrayList2.get(0)).paymentItemId;
                                    Intrinsics.e(str6);
                                    zU = waecHomeActivity2.u(str6);
                                } else {
                                    zU = false;
                                }
                                if (!zU && arrayList2.size() == 1) {
                                    waecHomeActivity2.onPaymentItemClick((PaymentItemBean) arrayList2.get(0));
                                }
                                if (billPaymentHomeParams != null && billPaymentHomeParams.getShowDialog()) {
                                    PickPaymentItemDialog pickPaymentItemDialog = new PickPaymentItemDialog(waecHomeActivity2);
                                    pickPaymentItemDialog.setCallBack(waecHomeActivity2);
                                    pickPaymentItemDialog.setBFavorite(false);
                                    pickPaymentItemDialog.show();
                                    pickPaymentItemDialog.setPaymentItems(waecHomeActivity2.t);
                                }
                            }
                        } else {
                            ToastUtils.showLong(rsp2.getRespMsg(), new Object[0]);
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new G(7), false, null, 224);
        BillPaymentHomeNGViewModel billPaymentHomeNGViewModel6 = (BillPaymentHomeNGViewModel) l();
        n.B(this, billPaymentHomeNGViewModel6 != null ? billPaymentHomeNGViewModel6.f34404v : null, this, new y(7), new G(8), false, null, 224);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ModelNumberInputLayout q() {
        return (ModelNumberInputLayout) this.f34247p.getValue();
    }

    public final void r(PaymentItemBean paymentItemBean) {
        if (paymentItemBean == null) {
            return;
        }
        this.f34249w = paymentItemBean;
        String paymentItemName = paymentItemBean.paymentItemName;
        Intrinsics.checkNotNullExpressionValue(paymentItemName, "paymentItemName");
        w(paymentItemName);
        TextView titleTv = q().getTitleTv();
        if (titleTv != null) {
            String str = p070ee.c.f36289a;
            String string = getString(p070ee.c.e(this.f34244i));
            if (!TextUtils.isEmpty(paymentItemBean.customerField1)) {
                string = paymentItemBean.customerField1;
            }
            titleTv.setText(string);
        }
        if (paymentItemBean.isAmountFixed != 0 || paymentItemBean.amount <= 0) {
            p().setEnabled(true);
            p().d(false);
        } else {
            p().setEnabled(false);
            p().d(true);
        }
        if (paymentItemBean.amount > 0) {
            p().setAmount(r0.A(paymentItemBean.amount));
        }
        this.f34241H = Math.max(this.f34241H, paymentItemBean.minAmount);
    }

    public final void s(boolean z3) {
        BillPaymentHomeNGViewModel billPaymentHomeNGViewModel = (BillPaymentHomeNGViewModel) l();
        La.D function = new La.D(this, z3, 1);
        billPaymentHomeNGViewModel.getClass();
        Intrinsics.checkNotNullParameter(function, "function");
        Z z8 = new Z(1, null);
        l lVar = billPaymentHomeNGViewModel.f34404v;
        lVar.f27356m = function;
        Unit unit = Unit.f38893a;
        f.v(billPaymentHomeNGViewModel, z8, lVar, 0L);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        AppCompatAutoCompleteTextView numberEdit;
        int i7 = 1;
        int i10 = 0;
        int i11 = 2;
        u.a(getOnBackPressedDispatcher(), this, new C0463g(this, 22));
        ARouter.getInstance().inject(this);
        PickMobileNetWorkDialog pickMobileNetWorkDialog = new PickMobileNetWorkDialog(this);
        Intrinsics.checkNotNullParameter(pickMobileNetWorkDialog, "<set-?>");
        this.f34242L = pickMobileNetWorkDialog;
        initStatusBar(CommonViewExtKt.colorInt(L6.b.ppColorBackgroundLight, this));
        q().setFilter(new InputFilter[]{new Tb.b(2), new Tb.c(11, 0)}).build();
        ModelNumberInputLayout modelNumberInputLayoutQ = q();
        if (modelNumberInputLayoutQ != null && (numberEdit = modelNumberInputLayoutQ.getNumberEdit()) != null) {
            numberEdit.setInputType(2);
        }
        D d2 = (D) this.f27334c;
        if (d2 != null) {
            d2.f8020i.setBackButtonClickListener(new V(this, i10));
        }
        D d10 = (D) this.f27334c;
        if (d10 != null) {
            d10.f8020i.setRightTextViewClickListener(new V(this, i7));
        }
        ((ModelItemSelection) this.f34245j.getValue()).f(new V(this, i11));
        p().setCurrencySymbol(BaseApplication.getCurrencySymbol());
        PickMobileNetWorkDialog pickMobileNetWorkDialog2 = this.f34242L;
        if (pickMobileNetWorkDialog2 == null) {
            Intrinsics.n("selectNetWorkDialog");
            throw null;
        }
        pickMobileNetWorkDialog2.setMCallBack(new Wd.Z(this));
        D d11 = (D) this.f27334c;
        if (d11 != null) {
            d11.f8017e.f(new V(this, 3));
        }
    }

    public final void t(String str) {
        if (this.f34248v.isEmpty()) {
            s(false);
            return;
        }
        int size = this.f34248v.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (Intrinsics.c(((WAECOperatorBean) this.f34248v.get(i7)).getCode(), str)) {
                WAECOperatorBean wAECOperatorBean = (WAECOperatorBean) this.f34248v.get(i7);
                this.f34243M = wAECOperatorBean;
                D d2 = (D) this.f27334c;
                if (d2 != null) {
                    d2.f8017e.h(wAECOperatorBean != null ? wAECOperatorBean.getName() : null);
                }
                x();
                return;
            }
        }
    }

    public final boolean u(String str) {
        ArrayList arrayList = this.t;
        if (arrayList.isEmpty()) {
            ((BillPaymentHomeNGViewModel) l()).f(false, false, this.f34244i, null);
            return false;
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (Intrinsics.c(((PaymentItemBean) arrayList.get(i7)).paymentItemId, str)) {
                r((PaymentItemBean) arrayList.get(i7));
                return true;
            }
        }
        return false;
    }

    public final void v(String str, Long l5, String str2, String str3) {
        this.f34238A = str2;
        this.f34239B = str;
        if (str3 != null) {
            q().setNumber(str3);
        }
        long jLongValue = l5.longValue();
        if (jLongValue > 0) {
            p().setAmount(r0.A(jLongValue));
        }
        String str4 = this.f34238A;
        if (str4 != null) {
            u(str4);
        }
        String str5 = this.f34239B;
        if (str5 != null) {
            t(str5);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final void w(String str) {
        ((ModelItemSelection) this.f34245j.getValue()).h(str);
        D d2 = (D) this.f27334c;
        if (d2 != null) {
            d2.f8018f.setVisibility(8);
        }
        PaymentItemBean paymentItemBean = this.f34249w;
        if (paymentItemBean != null) {
            if (TextUtils.isEmpty(paymentItemBean.remark)) {
                D d10 = (D) this.f27334c;
                if (d10 != null) {
                    d10.f8018f.setVisibility(8);
                    return;
                }
                return;
            }
            D d11 = (D) this.f27334c;
            if (d11 != null) {
                d11.f8018f.setVisibility(0);
            }
            D d12 = (D) this.f27334c;
            if (d12 != null) {
                TextView textView = d12.f8018f;
                PaymentItemBean paymentItemBean2 = this.f34249w;
                Intrinsics.e(paymentItemBean2);
                textView.setText(paymentItemBean2.remark);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void x() {
        D d2;
        D d10 = (D) this.f27334c;
        if (d10 != null) {
            d10.f8019g.setEnabled(false);
        }
        if (this.f34243M == null || TextUtils.isEmpty(((ModelItemSelection) this.f34245j.getValue()).getItemValue()) || TextUtils.isEmpty(q().getNumber()) || TextUtils.isEmpty(p().getAmountString()) || r0.f(p().getDoubleAmount()) <= 0 || (d2 = (D) this.f27334c) == null) {
            return;
        }
        d2.f8019g.setEnabled(true);
    }
}
