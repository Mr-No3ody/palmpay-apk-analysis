package com.transsnet.palmpay.teller.ui.activity;

import M3.f;
import N8.C0463g;
import N8.q0;
import Pa.r0;
import Pd.c;
import Pd.d;
import Rd.C0602s;
import V3.b;
import V9.q;
import Wd.G;
import Wd.I;
import Wd.L;
import Wd.N;
import Wd.O;
import Wd.P;
import Wd.Q;
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
import androidx.camera.camera2.internal.P0;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.edit.PpAmountEditText;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeView;
import com.transsnet.adsdk.widgets.banner.BannerAdView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.cashier.CoreCashierPaymentExtra;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.core.util.statistic.core.LogConstants;
import com.transsnet.palmpay.custom_view.ModelItemSelection;
import com.transsnet.palmpay.custom_view.input.ModelNumberInputLayout;
import com.transsnet.palmpay.teller.bean.BillPaymentHomeParams;
import com.transsnet.palmpay.teller.bean.BillerListItemBean;
import com.transsnet.palmpay.teller.bean.ChannelDataItemBean;
import com.transsnet.palmpay.teller.bean.CreateTellerOrderReq;
import com.transsnet.palmpay.teller.bean.CreateTellerOrderRsp;
import com.transsnet.palmpay.teller.bean.PaymentItemBean;
import com.transsnet.palmpay.teller.bean.PaymentItemListRsp;
import com.transsnet.palmpay.teller.ui.activity.JambHomeActivity;
import com.transsnet.palmpay.teller.ui.dialog.PickBillerDialog;
import com.transsnet.palmpay.teller.ui.dialog.PickMobileNetWorkDialog;
import com.transsnet.palmpay.teller.ui.dialog.PickPaymentItemDialog;
import com.transsnet.palmpay.teller.viewmodel.BillPaymentHomeNGViewModel;
import com.transsnet.palmpay.util.PhoneBaseNumberUtils;
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

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "场景/JAMB", path = "/quick_teller/jamb_home")
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0002\t\nB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/activity/JambHomeActivity;", "Lcom/transsnet/palmpay/teller/ui/activity/BaseBillerActivity;", "Lcom/transsnet/palmpay/teller/viewmodel/BillPaymentHomeNGViewModel;", "LRd/s;", "Lcom/transsnet/palmpay/teller/ui/dialog/PickBillerDialog$CallBack;", "Landroid/text/TextWatcher;", "Lcom/transsnet/palmpay/teller/ui/dialog/PickPaymentItemDialog$CallBack;", "<init>", "()V", "a", "Wd/N", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nJambHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JambHomeActivity.kt\ncom/transsnet/palmpay/teller/ui/activity/JambHomeActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,659:1\n171#2,12:660\n215#2:672\n115#2,8:673\n145#2:681\n115#2,8:682\n145#2:690\n1#3:691\n*S KotlinDebug\n*F\n+ 1 JambHomeActivity.kt\ncom/transsnet/palmpay/teller/ui/activity/JambHomeActivity\n*L\n221#1:660,12\n221#1:672\n267#1:673,8\n267#1:681\n277#1:682,8\n277#1:690\n*E\n"})
public final class JambHomeActivity extends BaseBillerActivity<BillPaymentHomeNGViewModel, C0602s> implements PickBillerDialog.CallBack, TextWatcher, PickPaymentItemDialog.CallBack {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final /* synthetic */ int f34222B = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public PaymentItemBean f34226o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f34227p;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f34228v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public PickMobileNetWorkDialog f34229w;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f34224i = TransType.TRANS_TYPE_P2P_CASH_OUT;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f34225j = new ArrayList();
    public long t = Long.MAX_VALUE;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final androidx.activity.result.a f34223A = registerForActivityResult(new N(this, 0), new b(1));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@Nullable Context context, @NotNull String categoryId) {
            Intrinsics.checkNotNullParameter(categoryId, "categoryId");
            if (context != null) {
                Intent intent = new Intent(context, (Class<?>) JambHomeActivity.class);
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

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        u();
        C0602s c0602s = (C0602s) this.f27334c;
        if (c0602s != null) {
            c0602s.f8477f.setOnNumberInputListener(new O(this));
        }
        C0602s c0602s2 = (C0602s) this.f27334c;
        if (c0602s2 != null) {
            c0602s2.f8475d.setTextInputListener(new q(this, 16));
        }
        C0602s c0602s3 = (C0602s) this.f27334c;
        if (c0602s3 != null) {
            c0602s3.f8480j.setOnClickListener(new L(this, 2));
        }
        HashMap map = new HashMap();
        Object obj = p070ee.b.f36288a;
        map.put(LogConstants.Autotrack.ELEMENT_TRANS_TYPE, p070ee.b.b(this.f34224i));
        AutoTrackUtil.trackActivityProperties(this, map);
        C0602s c0602s4 = (C0602s) this.f27334c;
        AutoTrackUtil.trackViewProperties(c0602s4 != null ? c0602s4.f8480j : null, map);
        C0602s c0602s5 = (C0602s) this.f27334c;
        if (c0602s5 != null) {
            BannerAdView bannerAdView = c0602s5.f8473b;
            C0602s c0602s6 = (C0602s) this.f27334c;
            bannerAdView.setAdListener(new com.chuanyi.ad.a(c0602s6 != null ? c0602s6.f8473b : null, ""));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(d.qt_activity_jamb_home, (ViewGroup) null, false);
        int i7 = c.adBanner;
        BannerAdView bannerAdView = (BannerAdView) p059e1.a.m(i7, viewInflate);
        if (bannerAdView != null) {
            i7 = c.adNotice;
            if (((MarqueeView) p059e1.a.m(i7, viewInflate)) != null) {
                i7 = c.clBody;
                ConstraintLayout constraintLayout = (ConstraintLayout) p059e1.a.m(i7, viewInflate);
                if (constraintLayout != null) {
                    i7 = c.editTextPayAmount;
                    PpAmountEditText ppAmountEditText = (PpAmountEditText) p059e1.a.m(i7, viewInflate);
                    if (ppAmountEditText != null) {
                        i7 = c.inputPaymentItem;
                        ModelItemSelection modelItemSelection = (ModelItemSelection) p059e1.a.m(i7, viewInflate);
                        if (modelItemSelection != null) {
                            i7 = c.modelMobileNumber;
                            ModelNumberInputLayout modelNumberInputLayout = (ModelNumberInputLayout) p059e1.a.m(i7, viewInflate);
                            if (modelNumberInputLayout != null) {
                                i7 = c.modelProfileCode;
                                ModelNumberInputLayout modelNumberInputLayout2 = (ModelNumberInputLayout) p059e1.a.m(i7, viewInflate);
                                if (modelNumberInputLayout2 != null) {
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
                                                    i7 = c.tvDiscount;
                                                    TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                                    if (textView3 != null) {
                                                        C0602s c0602s = new C0602s((LinearLayout) viewInflate, bannerAdView, constraintLayout, ppAmountEditText, modelItemSelection, modelNumberInputLayout, modelNumberInputLayout2, textView, textView2, ppTitleBar, textView3);
                                                        Intrinsics.checkNotNullExpressionValue(c0602s, "inflate(...)");
                                                        return c0602s;
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

    @Override // com.transsnet.palmpay.teller.ui.activity.BaseBillerActivity
    public final P0 n() {
        P0 p3 = new P0(this);
        C0602s c0602s = (C0602s) this.f27334c;
        p3.f13251f = c0602s != null ? c0602s.f8474c : null;
        p3.f13249d = q0.y(getString(k.core_no_network), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, getString(k.core_no_network_common_tips));
        f listener = new f(this, 28);
        Intrinsics.checkNotNullParameter(listener, "listener");
        p3.f13247b = listener;
        return p3;
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        super.onActivityResult(i7, i10, intent);
        if (i10 == -1 && i7 == 101 && intent != null) {
            intent.getStringExtra("extra_data_1");
            r(Long.valueOf(intent.getLongExtra("amount", 0L)), intent.getStringExtra("extra_data_2"), intent.getStringExtra("customerId"));
        }
    }

    @Override // com.transsnet.palmpay.teller.ui.dialog.PickBillerDialog.CallBack
    public final void onBillerClick(BillerListItemBean billerListItemBean) {
        ((BillPaymentHomeNGViewModel) l()).f(false, false, this.f34224i, billerListItemBean != null ? billerListItemBean.getBillerId() : null);
        this.f34226o = null;
        s("");
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        ChannelDataItemBean channelDataItemBean = (ChannelDataItemBean) intent.getParcelableExtra("billpayment_data");
        if (channelDataItemBean == null) {
            ((BillPaymentHomeNGViewModel) l()).g(this.f34224i);
            return;
        }
        channelDataItemBean.getBillerId();
        r(Long.valueOf(channelDataItemBean.getBusinessAmount()), channelDataItemBean.getPaymentItemId(), channelDataItemBean.getCustomerId());
    }

    @Override // com.transsnet.palmpay.teller.ui.dialog.PickPaymentItemDialog.CallBack
    public final void onPaymentItemClick(PaymentItemBean paymentItemBean) {
        if (paymentItemBean != null) {
            p(paymentItemBean);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
        u();
    }

    public final void p(PaymentItemBean paymentItemBean) {
        C0602s c0602s;
        TextView titleTv;
        if (paymentItemBean == null) {
            return;
        }
        this.f34226o = paymentItemBean;
        String paymentItemName = paymentItemBean.paymentItemName;
        Intrinsics.checkNotNullExpressionValue(paymentItemName, "paymentItemName");
        s(paymentItemName);
        C0602s c0602s2 = (C0602s) this.f27334c;
        if (c0602s2 != null && (titleTv = c0602s2.f8478g.getTitleTv()) != null) {
            String str = p070ee.c.f36289a;
            String string = getString(p070ee.c.e(this.f34224i));
            if (!TextUtils.isEmpty(paymentItemBean.customerField1)) {
                string = paymentItemBean.customerField1;
            }
            titleTv.setText(string);
        }
        if (paymentItemBean.isAmountFixed != 0 || paymentItemBean.amount <= 0) {
            C0602s c0602s3 = (C0602s) this.f27334c;
            if (c0602s3 != null) {
                c0602s3.f8475d.setEnabled(true);
            }
            C0602s c0602s4 = (C0602s) this.f27334c;
            if (c0602s4 != null) {
                c0602s4.f8475d.d(false);
            }
        } else {
            C0602s c0602s5 = (C0602s) this.f27334c;
            if (c0602s5 != null) {
                c0602s5.f8475d.setEnabled(false);
            }
            C0602s c0602s6 = (C0602s) this.f27334c;
            if (c0602s6 != null) {
                c0602s6.f8475d.d(true);
            }
        }
        long j6 = paymentItemBean.amount;
        if (j6 > 0 && (c0602s = (C0602s) this.f27334c) != null) {
            c0602s.f8475d.setAmount(r0.A(j6));
        }
        this.f34228v = Math.max(this.f34228v, paymentItemBean.minAmount);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        BillPaymentHomeNGViewModel billPaymentHomeNGViewModel = (BillPaymentHomeNGViewModel) l();
        String str = this.f34224i;
        billPaymentHomeNGViewModel.g(str);
        ((BillPaymentHomeNGViewModel) l()).h(str);
        ((BillPaymentHomeNGViewModel) l()).f(false, false, this.f34224i, null);
        BillPaymentHomeNGViewModel billPaymentHomeNGViewModel2 = (BillPaymentHomeNGViewModel) l();
        l lVar = billPaymentHomeNGViewModel2 != null ? billPaymentHomeNGViewModel2.t : null;
        if (lVar != null) {
            lVar.e(this, new I(new P(this, 2), 1));
        }
        BillPaymentHomeNGViewModel billPaymentHomeNGViewModel3 = (BillPaymentHomeNGViewModel) l();
        final int i7 = 0;
        n.B(this, billPaymentHomeNGViewModel3 != null ? billPaymentHomeNGViewModel3.f34398f : null, this, new Function2(this) { // from class: Wd.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JambHomeActivity f10726b;

            {
                this.f10726b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                boolean zQ;
                CreateTellerOrderRsp.DataBean dataBean;
                switch (i7) {
                    case 0:
                        BillPaymentHomeParams billPaymentHomeParams = (BillPaymentHomeParams) obj;
                        PaymentItemListRsp rsp = (PaymentItemListRsp) obj2;
                        int i10 = JambHomeActivity.f34222B;
                        Intrinsics.checkNotNullParameter(rsp, "rsp");
                        if (rsp.isSuccess()) {
                            List<PaymentItemBean> list = rsp.data;
                            if (list != null) {
                                JambHomeActivity jambHomeActivity = this.f10726b;
                                jambHomeActivity.f34225j.clear();
                                ArrayList arrayList = jambHomeActivity.f34225j;
                                arrayList.addAll(list);
                                String str2 = jambHomeActivity.f34227p;
                                if (str2 != null) {
                                    zQ = jambHomeActivity.q(str2);
                                } else if (arrayList.isEmpty()) {
                                    zQ = false;
                                } else {
                                    String str3 = ((PaymentItemBean) arrayList.get(0)).paymentItemId;
                                    Intrinsics.e(str3);
                                    zQ = jambHomeActivity.q(str3);
                                }
                                if (!zQ && arrayList.size() == 1) {
                                    jambHomeActivity.onPaymentItemClick((PaymentItemBean) arrayList.get(0));
                                }
                                if (billPaymentHomeParams != null && billPaymentHomeParams.getShowDialog()) {
                                    jambHomeActivity.t();
                                }
                            }
                        } else {
                            ToastUtils.showLong(rsp.getRespMsg(), new Object[0]);
                        }
                        break;
                    default:
                        CreateTellerOrderReq createTellerOrderReq = (CreateTellerOrderReq) obj;
                        CreateTellerOrderRsp rsp2 = (CreateTellerOrderRsp) obj2;
                        int i11 = JambHomeActivity.f34222B;
                        Intrinsics.checkNotNullParameter(rsp2, "rsp");
                        boolean zIsSuccess = rsp2.isSuccess();
                        JambHomeActivity jambHomeActivity2 = this.f10726b;
                        if (zIsSuccess) {
                            if (createTellerOrderReq != null && (dataBean = rsp2.data) != null) {
                                C0751z c0751z = new C0751z(jambHomeActivity2, 0);
                                c0751z.f4978i = dataBean.calculationExtInfo;
                                c0751z.f4971b = dataBean.orderNo;
                                c0751z.c(Long.valueOf(createTellerOrderReq.businessAmount));
                                c0751z.f4972c = TransType.TRANS_TYPE_BILLER_JAMB_PAYMENTS;
                                c0751z.f4974e = "5";
                                ArrayList arrayList2 = new ArrayList();
                                String string = jambHomeActivity2.getString(Pd.f.qt_biller_name);
                                String str4 = createTellerOrderReq.billerName;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                arrayList2.add(new CoreCashierPaymentExtra(string, str4));
                                if (!TextUtils.isEmpty(dataBean.fullName)) {
                                    String string2 = jambHomeActivity2.getString(Vd.a.qt_account_name);
                                    String str5 = dataBean.fullName;
                                    if (str5 == null) {
                                        str5 = "";
                                    }
                                    arrayList2.add(new CoreCashierPaymentExtra(string2, str5));
                                }
                                String string3 = jambHomeActivity2.getString(Vd.a.qt_user_id);
                                String str6 = createTellerOrderReq.customerId;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                arrayList2.add(new CoreCashierPaymentExtra(string3, str6));
                                if (!TextUtils.isEmpty(dataBean.address)) {
                                    String string4 = jambHomeActivity2.getString(p025ba.k.core_address);
                                    String str7 = dataBean.address;
                                    arrayList2.add(new CoreCashierPaymentExtra(string4, str7 != null ? str7 : ""));
                                }
                                c0751z.b(arrayList2);
                                c0751z.d();
                            }
                        } else if ("CFRONT_800101".equalsIgnoreCase(rsp2.getRespCode())) {
                            int i12 = Pd.f.qt_confirm_mobile_information;
                            String respMsg = rsp2.getRespMsg();
                            io.fastkv.n.O(jambHomeActivity2, 0, Integer.valueOf(i12), null, null, null, null, respMsg == null ? "" : respMsg, Integer.valueOf(p025ba.k.core_continue), null, new Oc.j(26, createTellerOrderReq, jambHomeActivity2), Integer.valueOf(p025ba.k.core_change), null, null, null, false, 0, 8385149);
                        } else {
                            ToastUtils.showLong(rsp2.getRespMsg(), new Object[0]);
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new G(3), false, null, 224);
        BillPaymentHomeNGViewModel billPaymentHomeNGViewModel4 = (BillPaymentHomeNGViewModel) l();
        l lVar2 = billPaymentHomeNGViewModel4 != null ? billPaymentHomeNGViewModel4.f34399g : null;
        if (lVar2 != null) {
            lVar2.e(this, new I(new P(this, 0), 1));
        }
        BillPaymentHomeNGViewModel billPaymentHomeNGViewModel5 = (BillPaymentHomeNGViewModel) l();
        l lVar3 = billPaymentHomeNGViewModel5 != null ? billPaymentHomeNGViewModel5.f34400i : null;
        if (lVar3 != null) {
            lVar3.e(this, new I(new P(this, 1), 1));
        }
        BillPaymentHomeNGViewModel billPaymentHomeNGViewModel6 = (BillPaymentHomeNGViewModel) l();
        final int i10 = 1;
        n.B(this, billPaymentHomeNGViewModel6 != null ? billPaymentHomeNGViewModel6.f34401j : null, this, new Function2(this) { // from class: Wd.M

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ JambHomeActivity f10726b;

            {
                this.f10726b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                boolean zQ;
                CreateTellerOrderRsp.DataBean dataBean;
                switch (i10) {
                    case 0:
                        BillPaymentHomeParams billPaymentHomeParams = (BillPaymentHomeParams) obj;
                        PaymentItemListRsp rsp = (PaymentItemListRsp) obj2;
                        int i11 = JambHomeActivity.f34222B;
                        Intrinsics.checkNotNullParameter(rsp, "rsp");
                        if (rsp.isSuccess()) {
                            List<PaymentItemBean> list = rsp.data;
                            if (list != null) {
                                JambHomeActivity jambHomeActivity = this.f10726b;
                                jambHomeActivity.f34225j.clear();
                                ArrayList arrayList = jambHomeActivity.f34225j;
                                arrayList.addAll(list);
                                String str2 = jambHomeActivity.f34227p;
                                if (str2 != null) {
                                    zQ = jambHomeActivity.q(str2);
                                } else if (arrayList.isEmpty()) {
                                    zQ = false;
                                } else {
                                    String str3 = ((PaymentItemBean) arrayList.get(0)).paymentItemId;
                                    Intrinsics.e(str3);
                                    zQ = jambHomeActivity.q(str3);
                                }
                                if (!zQ && arrayList.size() == 1) {
                                    jambHomeActivity.onPaymentItemClick((PaymentItemBean) arrayList.get(0));
                                }
                                if (billPaymentHomeParams != null && billPaymentHomeParams.getShowDialog()) {
                                    jambHomeActivity.t();
                                }
                            }
                        } else {
                            ToastUtils.showLong(rsp.getRespMsg(), new Object[0]);
                        }
                        break;
                    default:
                        CreateTellerOrderReq createTellerOrderReq = (CreateTellerOrderReq) obj;
                        CreateTellerOrderRsp rsp2 = (CreateTellerOrderRsp) obj2;
                        int i12 = JambHomeActivity.f34222B;
                        Intrinsics.checkNotNullParameter(rsp2, "rsp");
                        boolean zIsSuccess = rsp2.isSuccess();
                        JambHomeActivity jambHomeActivity2 = this.f10726b;
                        if (zIsSuccess) {
                            if (createTellerOrderReq != null && (dataBean = rsp2.data) != null) {
                                C0751z c0751z = new C0751z(jambHomeActivity2, 0);
                                c0751z.f4978i = dataBean.calculationExtInfo;
                                c0751z.f4971b = dataBean.orderNo;
                                c0751z.c(Long.valueOf(createTellerOrderReq.businessAmount));
                                c0751z.f4972c = TransType.TRANS_TYPE_BILLER_JAMB_PAYMENTS;
                                c0751z.f4974e = "5";
                                ArrayList arrayList2 = new ArrayList();
                                String string = jambHomeActivity2.getString(Pd.f.qt_biller_name);
                                String str4 = createTellerOrderReq.billerName;
                                if (str4 == null) {
                                    str4 = "";
                                }
                                arrayList2.add(new CoreCashierPaymentExtra(string, str4));
                                if (!TextUtils.isEmpty(dataBean.fullName)) {
                                    String string2 = jambHomeActivity2.getString(Vd.a.qt_account_name);
                                    String str5 = dataBean.fullName;
                                    if (str5 == null) {
                                        str5 = "";
                                    }
                                    arrayList2.add(new CoreCashierPaymentExtra(string2, str5));
                                }
                                String string3 = jambHomeActivity2.getString(Vd.a.qt_user_id);
                                String str6 = createTellerOrderReq.customerId;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                arrayList2.add(new CoreCashierPaymentExtra(string3, str6));
                                if (!TextUtils.isEmpty(dataBean.address)) {
                                    String string4 = jambHomeActivity2.getString(p025ba.k.core_address);
                                    String str7 = dataBean.address;
                                    arrayList2.add(new CoreCashierPaymentExtra(string4, str7 != null ? str7 : ""));
                                }
                                c0751z.b(arrayList2);
                                c0751z.d();
                            }
                        } else if ("CFRONT_800101".equalsIgnoreCase(rsp2.getRespCode())) {
                            int i13 = Pd.f.qt_confirm_mobile_information;
                            String respMsg = rsp2.getRespMsg();
                            io.fastkv.n.O(jambHomeActivity2, 0, Integer.valueOf(i13), null, null, null, null, respMsg == null ? "" : respMsg, Integer.valueOf(p025ba.k.core_continue), null, new Oc.j(26, createTellerOrderReq, jambHomeActivity2), Integer.valueOf(p025ba.k.core_change), null, null, null, false, 0, 8385149);
                        } else {
                            ToastUtils.showLong(rsp2.getRespMsg(), new Object[0]);
                        }
                        break;
                }
                return Unit.f38893a;
            }
        }, new G(4), true, null, 224);
    }

    public final boolean q(String str) {
        ArrayList arrayList = this.f34225j;
        if (arrayList.isEmpty()) {
            ((BillPaymentHomeNGViewModel) l()).f(false, false, this.f34224i, null);
            return false;
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (Intrinsics.c(((PaymentItemBean) arrayList.get(i7)).paymentItemId, str)) {
                p((PaymentItemBean) arrayList.get(i7));
                return true;
            }
        }
        return false;
    }

    public final void r(Long l5, String str, String str2) {
        C0602s c0602s;
        C0602s c0602s2;
        this.f34227p = str;
        if (str2 != null && (c0602s2 = (C0602s) this.f27334c) != null) {
            c0602s2.f8478g.setNumber(str2);
        }
        long jLongValue = l5.longValue();
        if (jLongValue > 0 && (c0602s = (C0602s) this.f27334c) != null) {
            c0602s.f8475d.setAmount(r0.A(jLongValue));
        }
        String str3 = this.f34227p;
        if (str3 != null) {
            q(str3);
        }
    }

    public final void s(String str) {
        C0602s c0602s = (C0602s) this.f27334c;
        if (c0602s != null) {
            c0602s.f8476e.h(str);
        }
        C0602s c0602s2 = (C0602s) this.f27334c;
        if (c0602s2 != null) {
            c0602s2.f8479i.setVisibility(8);
        }
        PaymentItemBean paymentItemBean = this.f34226o;
        if (paymentItemBean != null) {
            if (TextUtils.isEmpty(paymentItemBean.remark)) {
                C0602s c0602s3 = (C0602s) this.f27334c;
                if (c0602s3 != null) {
                    c0602s3.f8479i.setVisibility(8);
                }
            } else {
                C0602s c0602s4 = (C0602s) this.f27334c;
                if (c0602s4 != null) {
                    c0602s4.f8479i.setVisibility(0);
                }
                C0602s c0602s5 = (C0602s) this.f27334c;
                if (c0602s5 != null) {
                    TextView textView = c0602s5.f8479i;
                    PaymentItemBean paymentItemBean2 = this.f34226o;
                    Intrinsics.e(paymentItemBean2);
                    textView.setText(paymentItemBean2.remark);
                }
            }
        }
        u();
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        JambHomeActivity jambHomeActivity;
        IconicsImageView contactIv;
        IconicsImageView contactIv2;
        ModelNumberInputLayout filter;
        IconicsImageView contactIv3;
        ModelNumberInputLayout filter2;
        int i7 = 1;
        int i10 = 0;
        u.a(getOnBackPressedDispatcher(), this, new C0463g(this, 21));
        ARouter.getInstance().inject(this);
        PickMobileNetWorkDialog pickMobileNetWorkDialog = new PickMobileNetWorkDialog(this);
        Intrinsics.checkNotNullParameter(pickMobileNetWorkDialog, "<set-?>");
        this.f34229w = pickMobileNetWorkDialog;
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        C0602s c0602s = (C0602s) this.f27334c;
        if (c0602s != null) {
            c0602s.f8481o.setBackButtonClickListener(new L(this, 3));
        }
        C0602s c0602s2 = (C0602s) this.f27334c;
        if (c0602s2 != null) {
            c0602s2.f8481o.setRightTextViewClickListener(new L(this, 4));
        }
        C0602s c0602s3 = (C0602s) this.f27334c;
        if (c0602s3 != null && (filter2 = c0602s3.f8478g.setFilter(new InputFilter[]{new Tb.b(2), new Tb.c(11, 0)})) != null) {
            filter2.build();
        }
        C0602s c0602s4 = (C0602s) this.f27334c;
        if (c0602s4 == null || (contactIv3 = c0602s4.f8477f.getContactIv()) == null) {
            jambHomeActivity = this;
        } else {
            jambHomeActivity = this;
            contactIv3.setImageDrawable(G8.a.x(jambHomeActivity, S6.a.pay_Contactperson, null, Integer.valueOf(L6.b.ppColorPrimary), 24.0f, 114));
        }
        C0602s c0602s5 = (C0602s) jambHomeActivity.f27334c;
        if (c0602s5 != null && (filter = c0602s5.f8477f.setFilter(new InputFilter[]{new Tb.b(2), new Tb.c(11, 0)})) != null) {
            filter.build();
        }
        C0602s c0602s6 = (C0602s) jambHomeActivity.f27334c;
        if (c0602s6 != null) {
            c0602s6.f8476e.setOnClickListener(new L(this, 5));
        }
        C0602s c0602s7 = (C0602s) jambHomeActivity.f27334c;
        if (c0602s7 != null) {
            c0602s7.f8475d.setCurrencySymbol(BaseApplication.getCurrencySymbol());
        }
        C0602s c0602s8 = (C0602s) jambHomeActivity.f27334c;
        if (c0602s8 != null && (contactIv2 = c0602s8.f8478g.getContactIv()) != null) {
            contactIv2.setOnClickListener(new L(this, i10));
        }
        C0602s c0602s9 = (C0602s) jambHomeActivity.f27334c;
        if (c0602s9 != null && (contactIv = c0602s9.f8477f.getContactIv()) != null) {
            contactIv.setOnClickListener(new L(this, i7));
        }
        PickMobileNetWorkDialog pickMobileNetWorkDialog2 = jambHomeActivity.f34229w;
        if (pickMobileNetWorkDialog2 == null) {
            Intrinsics.n("selectNetWorkDialog");
            throw null;
        }
        pickMobileNetWorkDialog2.setMCallBack(new Q(this));
        C0602s c0602s10 = (C0602s) jambHomeActivity.f27334c;
        if (c0602s10 != null) {
            ModelNumberInputLayout.showClearIv$default(c0602s10.f8478g, false, false, 2, null);
        }
    }

    public final void t() {
        PickPaymentItemDialog pickPaymentItemDialog = new PickPaymentItemDialog(this);
        pickPaymentItemDialog.setCallBack(this);
        boolean z3 = false;
        if (BaseApplication.isNG()) {
            String str = this.f34224i;
            if (Intrinsics.c(str, "2") || Intrinsics.c(str, TransType.TRANS_TYPE_AIRTIME_LOAN) || Intrinsics.c(str, TransType.TRANS_TYPE_REPAY_CASH_LOAN) || Intrinsics.c(str, "14")) {
                z3 = true;
            }
        }
        pickPaymentItemDialog.setBFavorite(z3);
        pickPaymentItemDialog.show();
        pickPaymentItemDialog.setPaymentItems(this.f34225j);
    }

    public final void u() {
        C0602s c0602s;
        C0602s c0602s2 = (C0602s) this.f27334c;
        if (c0602s2 != null) {
            c0602s2.f8480j.setEnabled(false);
        }
        C0602s c0602s3 = (C0602s) this.f27334c;
        if (TextUtils.isEmpty(c0602s3 != null ? c0602s3.f8476e.getItemValue() : null)) {
            return;
        }
        C0602s c0602s4 = (C0602s) this.f27334c;
        if (TextUtils.isEmpty(c0602s4 != null ? c0602s4.f8477f.getNumber() : null)) {
            return;
        }
        C0602s c0602s5 = (C0602s) this.f27334c;
        if (TextUtils.isEmpty(c0602s5 != null ? c0602s5.f8475d.getAmountString() : null)) {
            return;
        }
        C0602s c0602s6 = (C0602s) this.f27334c;
        if (PhoneBaseNumberUtils.INSTANCE.isValidMobileNumber(c0602s6 != null ? c0602s6.f8477f.getNumber() : null, BaseApplication.getCountryLocale(), false)) {
            C0602s c0602s7 = (C0602s) this.f27334c;
            if (r0.f(c0602s7 != null ? c0602s7.f8475d.getDoubleAmount() : 0.0d) > 0 && (c0602s = (C0602s) this.f27334c) != null) {
                c0602s.f8480j.setEnabled(true);
            }
        }
    }
}
