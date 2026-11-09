package com.transsnet.palmpay.teller.ui.activity;

import Fd.G;
import L6.g;
import N8.C0463g;
import Pa.C0525w;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Pd.c;
import Pd.d;
import Rd.C0598n;
import T8.o;
import Wd.C0744s;
import Wd.C0745t;
import Wd.ViewOnClickListenerC0743q;
import Wf.AbstractC0780y;
import Z4.e;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.u;
import androidx.lifecycle.V;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.mikepenz.iconics.view.IconicsImageView;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.AdManager;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.betting.ui.activity.BettingHomeActivity;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.core.bean.payment.PayByOrderResp;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.util.statistic.core.AutoTrackUtil;
import com.transsnet.palmpay.core.viewmodel.FailResultPageAdView;
import com.transsnet.palmpay.core.viewmodel.OrderResultRewardModel;
import com.transsnet.palmpay.custom_view.dialog.b;
import com.transsnet.palmpay.custom_view.model.OrderResultItemModel;
import com.transsnet.palmpay.custom_view.model.TransactionResultHeaderModel;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.databundle.ui.activity.BuyBundleHomePageActivity;
import com.transsnet.palmpay.teller.bean.BillPaymentOrderDetailRsp;
import com.transsnet.palmpay.teller.viewmodel.BillerTransctionResultViewModel;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.ToastUtils;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p086fe.J0;
import p140j8.f;
import p220oa.h;
import p377z5.j;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "缴费/交易结果", path = "/quick_teller/handle_result_page", remark = "ignore")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/teller/ui/activity/BillerTransactionResultActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/teller/viewmodel/BillerTransctionResultViewModel;", "LRd/n;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/PushMessage;", "pushMessage", "", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/PushMessage;)V", "a", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBillerTransactionResultActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BillerTransactionResultActivity.kt\ncom/transsnet/palmpay/teller/ui/activity/BillerTransactionResultActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1175:1\n1#2:1176\n260#3,10:1177\n296#3:1187\n260#3,10:1188\n296#3:1198\n260#3,10:1199\n296#3:1209\n260#3,10:1210\n296#3:1220\n13472#4,2:1221\n*S KotlinDebug\n*F\n+ 1 BillerTransactionResultActivity.kt\ncom/transsnet/palmpay/teller/ui/activity/BillerTransactionResultActivity\n*L\n307#1:1177,10\n307#1:1187\n319#1:1188,10\n319#1:1198\n334#1:1199,10\n334#1:1209\n345#1:1210,10\n345#1:1220\n850#1:1221,2\n*E\n"})
public final class BillerTransactionResultActivity extends BaseMvvmVBActivity<BillerTransctionResultViewModel, C0598n> {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final /* synthetic */ int f34181Y = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f34182A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public InterstitialAdView f34183B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f34184C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public p131id.a f34185H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public b f34186L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public OrderResultRewardModel f34187M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f34188Q;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PayByOrderResp.DataBean f34190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f34191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f34192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f34193g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f34194i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f34195j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f34196o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f34197p;
    public BillPaymentOrderDetailRsp t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View f34198v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f34199w = "";

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final ViewOnClickListenerC0743q f34189X = new ViewOnClickListenerC0743q(this, 3);

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

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((BillerTransctionResultViewModel) l()).f34419e;
        if (lVar != null) {
            lVar.e(this, new G(new o(9, this, this), 29));
        }
        l lVar2 = ((BillerTransctionResultViewModel) l()).f34420f;
        if (lVar2 != null) {
            lVar2.e(this, new G(new C0745t(this, this, 0), 29));
        }
        C0598n c0598n = (C0598n) this.f27334c;
        if (c0598n != null) {
            c0598n.f8408f.c(r0.B(this.f34196o, true));
        }
        l lVar3 = ((BillerTransctionResultViewModel) l()).f34422i;
        if (lVar3 != null) {
            lVar3.e(this, new G(new C0745t(this, this, 1), 29));
        }
        l lVar4 = ((BillerTransctionResultViewModel) l()).f34423j;
        if (lVar4 != null) {
            lVar4.e(this, new G(new C0745t(this, this, 2), 29));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewInflate = getLayoutInflater().inflate(d.qt_activity_bill_transaction_result, (ViewGroup) null, false);
        int i7 = c.ad_act;
        SingleAdView singleAdView = (SingleAdView) p059e1.a.m(i7, viewInflate);
        if (singleAdView != null) {
            i7 = c.ad_fail_okcard;
            FailResultPageAdView failResultPageAdView = (FailResultPageAdView) p059e1.a.m(i7, viewInflate);
            if (failResultPageAdView != null) {
                i7 = c.iv_view_detail;
                IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                if (iconicsImageView != null) {
                    i7 = c.llBottom;
                    if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                        i7 = c.ll_order_info;
                        LinearLayout linearLayout = (LinearLayout) p059e1.a.m(i7, viewInflate);
                        if (linearLayout != null) {
                            i7 = c.model_trhv_result_header_view;
                            TransactionResultHeaderModel transactionResultHeaderModel = (TransactionResultHeaderModel) p059e1.a.m(i7, viewInflate);
                            if (transactionResultHeaderModel != null) {
                                i7 = c.result_info_card;
                                if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                    RelativeLayout relativeLayout = (RelativeLayout) viewInflate;
                                    i7 = c.spaceView;
                                    View viewM = p059e1.a.m(i7, viewInflate);
                                    if (viewM != null) {
                                        i7 = c.stub_result_special_info;
                                        ViewStub viewStub = (ViewStub) p059e1.a.m(i7, viewInflate);
                                        if (viewStub != null) {
                                            i7 = c.title_bar;
                                            PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                                            if (ppTitleBar != null) {
                                                i7 = c.tv_btn_again;
                                                TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                                if (textView != null) {
                                                    i7 = c.tv_btn_view_receipt;
                                                    TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                                    if (textView2 != null) {
                                                        i7 = c.tv_complete_btn;
                                                        TextView textView3 = (TextView) p059e1.a.m(i7, viewInflate);
                                                        if (textView3 != null) {
                                                            i7 = c.tv_view_detail;
                                                            TextView textView4 = (TextView) p059e1.a.m(i7, viewInflate);
                                                            if (textView4 != null) {
                                                                i7 = c.view_detail_row;
                                                                LinearLayout linearLayout2 = (LinearLayout) p059e1.a.m(i7, viewInflate);
                                                                if (linearLayout2 != null) {
                                                                    i7 = c.vs_payment_rewards;
                                                                    if (((ViewStub) p059e1.a.m(i7, viewInflate)) != null) {
                                                                        C0598n c0598n = new C0598n(relativeLayout, singleAdView, failResultPageAdView, iconicsImageView, linearLayout, transactionResultHeaderModel, viewM, viewStub, ppTitleBar, textView, textView2, textView3, textView4, linearLayout2);
                                                                        Intrinsics.checkNotNullExpressionValue(c0598n, "inflate(...)");
                                                                        return c0598n;
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

    /* JADX WARN: Code duplicated, block: B:56:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:76:0x0114  */
    /* JADX WARN: Code duplicated, block: B:83:0x0132  */
    /* JADX WARN: Code duplicated, block: B:84:0x0136  */
    /* JADX WARN: Code duplicated, block: B:85:0x014e  */
    /* JADX WARN: Code duplicated, block: B:91:0x011f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x010e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final void n() {
        ListIterator<Activity> listIterator;
        Activity activity;
        Activity activity2;
        HashMap<String, String> payResultExtParam;
        BillPaymentOrderDetailRsp billPaymentOrderDetailRsp = this.t;
        if (billPaymentOrderDetailRsp != null) {
            String transType = billPaymentOrderDetailRsp.getTransType();
            String str = null;
            if (transType != null) {
                int iHashCode = transType.hashCode();
                if (iHashCode != 1574) {
                    if (iHashCode != 1633) {
                        if (iHashCode != 1821) {
                            if (iHashCode != 3367) {
                                if (iHashCode != 3466) {
                                    if (iHashCode != 3522) {
                                        if (iHashCode != 3590) {
                                            if (iHashCode != 3711) {
                                                if (iHashCode == 3713 && transType.equals(TransType.TRANS_TYPE_TRIP)) {
                                                    try {
                                                        Activity activityS = i0.S("/common/webview");
                                                        if (activityS != null) {
                                                            ActivityUtils.finishToActivity(activityS, false);
                                                        } else {
                                                            i0.H(null);
                                                        }
                                                    } catch (Exception e10) {
                                                        F6.d.c("SomeUtil", "goBackToPage: ", e10);
                                                    }
                                                }
                                            } else if (transType.equals(TransType.TRANS_TYPE_GIFT_CARD)) {
                                                i0.I("/coreImpl/rn_host");
                                            }
                                        } else if (transType.equals(TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW_SECURITY_ORDER_CODE)) {
                                            payResultExtParam = billPaymentOrderDetailRsp.getPayResultExtParam();
                                            if (Intrinsics.c(payResultExtParam != null ? payResultExtParam.get("returnType") : null, "1")) {
                                                ActivityUtils.finishToActivity((Class<?>) BillerTransactionResultActivity.class, false);
                                                finish();
                                            } else {
                                                i0.G(BettingHomeActivity.class);
                                            }
                                        }
                                        if (TextUtils.isEmpty(billPaymentOrderDetailRsp.getCategoryId())) {
                                            i0.H(null);
                                        } else {
                                            List<Activity> activityList = ActivityUtils.getActivityList();
                                            Intrinsics.checkNotNullExpressionValue(activityList, "getActivityList(...)");
                                            listIterator = activityList.listIterator(activityList.size());
                                            while (listIterator.hasPrevious()) {
                                                Activity activityPrevious = listIterator.previous();
                                                activity2 = activityPrevious;
                                                if (!(activity2 instanceof BillPaymentHomeActivity)) {
                                                }
                                            }
                                            activity = (Activity) str;
                                            if (activity != null) {
                                                ActivityUtils.finishToActivity(activity, false);
                                            } else {
                                                ARouter.getInstance().build("/quick_teller/bill_payment_home").withString("extra_type", billPaymentOrderDetailRsp.getCategoryId()).navigation(this);
                                            }
                                        }
                                    } else if (transType.equals(TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW)) {
                                        payResultExtParam = billPaymentOrderDetailRsp.getPayResultExtParam();
                                        if (Intrinsics.c(payResultExtParam != null ? payResultExtParam.get("returnType") : null, "1")) {
                                            ActivityUtils.finishToActivity((Class<?>) BillerTransactionResultActivity.class, false);
                                            finish();
                                        } else {
                                            i0.G(BettingHomeActivity.class);
                                        }
                                    } else if (TextUtils.isEmpty(billPaymentOrderDetailRsp.getCategoryId())) {
                                        List<Activity> activityList2 = ActivityUtils.getActivityList();
                                        Intrinsics.checkNotNullExpressionValue(activityList2, "getActivityList(...)");
                                        listIterator = activityList2.listIterator(activityList2.size());
                                        while (listIterator.hasPrevious()) {
                                            Activity activityPrevious2 = listIterator.previous();
                                            activity2 = activityPrevious2;
                                            if (!(activity2 instanceof BillPaymentHomeActivity)) {
                                            }
                                        }
                                        activity = (Activity) str;
                                        if (activity != null) {
                                            ActivityUtils.finishToActivity(activity, false);
                                        } else {
                                            ARouter.getInstance().build("/quick_teller/bill_payment_home").withString("extra_type", billPaymentOrderDetailRsp.getCategoryId()).navigation(this);
                                        }
                                    } else {
                                        i0.H(null);
                                    }
                                } else if (transType.equals(TransType.TRANS_TYPE_BILLER_JAMB_PAYMENTS)) {
                                    i0.G(JambHomeActivity.class);
                                } else if (TextUtils.isEmpty(billPaymentOrderDetailRsp.getCategoryId())) {
                                    List<Activity> activityList3 = ActivityUtils.getActivityList();
                                    Intrinsics.checkNotNullExpressionValue(activityList3, "getActivityList(...)");
                                    listIterator = activityList3.listIterator(activityList3.size());
                                    while (listIterator.hasPrevious()) {
                                        Activity activityPrevious3 = listIterator.previous();
                                        activity2 = activityPrevious3;
                                        if (!(activity2 instanceof BillPaymentHomeActivity)) {
                                        }
                                    }
                                    activity = (Activity) str;
                                    if (activity != null) {
                                        ActivityUtils.finishToActivity(activity, false);
                                    } else {
                                        ARouter.getInstance().build("/quick_teller/bill_payment_home").withString("extra_type", billPaymentOrderDetailRsp.getCategoryId()).navigation(this);
                                    }
                                } else {
                                    i0.H(null);
                                }
                            } else if (transType.equals(TransType.TRANS_TYPE_BILLER_WAEC_PAYMENTS)) {
                                i0.G(WaecHomeActivity.class);
                            } else if (TextUtils.isEmpty(billPaymentOrderDetailRsp.getCategoryId())) {
                                List<Activity> activityList4 = ActivityUtils.getActivityList();
                                Intrinsics.checkNotNullExpressionValue(activityList4, "getActivityList(...)");
                                listIterator = activityList4.listIterator(activityList4.size());
                                while (listIterator.hasPrevious()) {
                                    Activity activityPrevious4 = listIterator.previous();
                                    activity2 = activityPrevious4;
                                    if (!(activity2 instanceof BillPaymentHomeActivity)) {
                                    }
                                }
                                activity = (Activity) str;
                                if (activity != null) {
                                    ActivityUtils.finishToActivity(activity, false);
                                } else {
                                    ARouter.getInstance().build("/quick_teller/bill_payment_home").withString("extra_type", billPaymentOrderDetailRsp.getCategoryId()).navigation(this);
                                }
                            } else {
                                i0.H(null);
                            }
                        } else if (transType.equals(TransType.TRANS_TYPE_BILLER_BETTING)) {
                            payResultExtParam = billPaymentOrderDetailRsp.getPayResultExtParam();
                            if (Intrinsics.c(payResultExtParam != null ? payResultExtParam.get("returnType") : null, "1")) {
                                ActivityUtils.finishToActivity((Class<?>) BillerTransactionResultActivity.class, false);
                                finish();
                            } else {
                                i0.G(BettingHomeActivity.class);
                            }
                        } else if (TextUtils.isEmpty(billPaymentOrderDetailRsp.getCategoryId())) {
                            List<Activity> activityList5 = ActivityUtils.getActivityList();
                            Intrinsics.checkNotNullExpressionValue(activityList5, "getActivityList(...)");
                            listIterator = activityList5.listIterator(activityList5.size());
                            while (listIterator.hasPrevious()) {
                                Activity activityPrevious5 = listIterator.previous();
                                activity2 = activityPrevious5;
                                if (!(activity2 instanceof BillPaymentHomeActivity)) {
                                }
                            }
                            activity = (Activity) str;
                            if (activity != null) {
                                ActivityUtils.finishToActivity(activity, false);
                            } else {
                                ARouter.getInstance().build("/quick_teller/bill_payment_home").withString("extra_type", billPaymentOrderDetailRsp.getCategoryId()).navigation(this);
                            }
                        } else {
                            i0.H(null);
                        }
                    } else if (transType.equals(TransType.TRANS_TYPE_BUNDLE)) {
                        i0.G(BuyBundleHomePageActivity.class);
                    } else if (TextUtils.isEmpty(billPaymentOrderDetailRsp.getCategoryId())) {
                        List<Activity> activityList6 = ActivityUtils.getActivityList();
                        Intrinsics.checkNotNullExpressionValue(activityList6, "getActivityList(...)");
                        listIterator = activityList6.listIterator(activityList6.size());
                        while (listIterator.hasPrevious()) {
                            Activity activityPrevious6 = listIterator.previous();
                            activity2 = activityPrevious6;
                            if (!(activity2 instanceof BillPaymentHomeActivity)) {
                            }
                        }
                        activity = (Activity) str;
                        if (activity != null) {
                            ActivityUtils.finishToActivity(activity, false);
                        } else {
                            ARouter.getInstance().build("/quick_teller/bill_payment_home").withString("extra_type", billPaymentOrderDetailRsp.getCategoryId()).navigation(this);
                        }
                    } else {
                        i0.H(null);
                    }
                } else if (transType.equals("17")) {
                    i0.G(TvHomeActivity.class);
                } else if (TextUtils.isEmpty(billPaymentOrderDetailRsp.getCategoryId())) {
                    List<Activity> activityList7 = ActivityUtils.getActivityList();
                    Intrinsics.checkNotNullExpressionValue(activityList7, "getActivityList(...)");
                    listIterator = activityList7.listIterator(activityList7.size());
                    while (listIterator.hasPrevious()) {
                        Activity activityPrevious7 = listIterator.previous();
                        activity2 = activityPrevious7;
                        if (!(activity2 instanceof BillPaymentHomeActivity)) {
                        }
                    }
                    activity = (Activity) str;
                    if (activity != null) {
                        ActivityUtils.finishToActivity(activity, false);
                    } else {
                        ARouter.getInstance().build("/quick_teller/bill_payment_home").withString("extra_type", billPaymentOrderDetailRsp.getCategoryId()).navigation(this);
                    }
                } else {
                    i0.H(null);
                }
            } else if (TextUtils.isEmpty(billPaymentOrderDetailRsp.getCategoryId())) {
                List<Activity> activityList8 = ActivityUtils.getActivityList();
                Intrinsics.checkNotNullExpressionValue(activityList8, "getActivityList(...)");
                listIterator = activityList8.listIterator(activityList8.size());
                while (listIterator.hasPrevious()) {
                    Activity activityPrevious8 = listIterator.previous();
                    activity2 = activityPrevious8;
                    if (!(activity2 instanceof BillPaymentHomeActivity) && Intrinsics.c(((BillPaymentHomeActivity) activity2).f34158i, billPaymentOrderDetailRsp.getCategoryId())) {
                        str = activityPrevious8;
                        break;
                    }
                }
                activity = (Activity) str;
                if (activity != null) {
                    ActivityUtils.finishToActivity(activity, false);
                } else {
                    ARouter.getInstance().build("/quick_teller/bill_payment_home").withString("extra_type", billPaymentOrderDetailRsp.getCategoryId()).navigation(this);
                }
            } else {
                i0.H(null);
            }
            finish();
        }
    }

    public final void o(String str) {
        n0.g().k(new ClickEvent("BillerTransactionResultsClick").add("element_name", this.f34191e).add("element_details", str));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity, com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        AdManager.clearPreloadSingleAd();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable PushMessage pushMessage) {
        if ((pushMessage != null ? pushMessage.content : null) == null) {
            return;
        }
        if (PushMessage.MESSAGE_TYPE_ORDER_STATUS_CHANGE.equals(pushMessage.content.messageType) || "1000".equals(pushMessage.content.messageType) || "1036".equals(pushMessage.content.messageType)) {
            ((BillerTransctionResultViewModel) l()).d(this.f34197p, this.f34191e);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.f34188Q) {
            this.f34188Q = false;
            BillerTransctionResultViewModel billerTransctionResultViewModel = (BillerTransctionResultViewModel) l();
            billerTransctionResultViewModel.getClass();
            f.s(billerTransctionResultViewModel, new J0(1, null), billerTransctionResultViewModel.f34420f, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        }
    }

    public final OrderResultItemModel p(String str, CharSequence charSequence) {
        LinearLayout linearLayout;
        OrderResultItemModel orderResultItemModel = new OrderResultItemModel(this, 1002, str, charSequence, 0.0f, 0.0f, CommonViewExtKt.getDp(20));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        C0598n c0598n = (C0598n) this.f27334c;
        if (c0598n == null || (linearLayout = c0598n.f8407e) == null || linearLayout.getChildCount() != 0) {
            layoutParams.topMargin = CommonViewExtKt.getDp(12);
        }
        orderResultItemModel.setLayoutParams(layoutParams);
        return orderResultItemModel;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        this.f34184C = true;
        AbstractC0780y.m(V.f(this), null, null, new C0744s(this, null, true), 3);
    }

    /* JADX WARN: Failed to calculate best type for var: r11v34 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v34 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v34 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v34 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v35 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v35 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v49 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v49 ??, new type: java.lang.Long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v50 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v50 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v51 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v51 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v58 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v58 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r11v59 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v59 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v1 ??, new type: com.transsnet.palmpay.teller.bean.BillPaymentOrderDetailRsp
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v1 ??, new type: com.transsnet.palmpay.teller.bean.BillPaymentOrderDetailRsp
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v137 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v137 ??, new type: java.lang.Long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v137 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v137 ??, new type: java.lang.Long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v40 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v40 ??, new type: com.transsnet.palmpay.teller.ui.view.ModelGiftCardItem
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v40 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v40 ??, new type: com.transsnet.palmpay.teller.ui.view.ModelGiftCardItem
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v41 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v41 ??, new type: com.transsnet.palmpay.teller.ui.view.ModelGiftCardItem
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v41 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v41 ??, new type: com.transsnet.palmpay.teller.ui.view.ModelGiftCardItem
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v43 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v43 ??, new type: com.transsnet.palmpay.teller.ui.view.ModelGiftCardItem
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v43 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v43 ??, new type: com.transsnet.palmpay.teller.ui.view.ModelGiftCardItem
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r11v34 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public final void q() {
        /*
            Method dump skipped, instruction units count: 2276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.transsnet.palmpay.teller.ui.activity.BillerTransactionResultActivity.q():void");
    }

    public final void r() {
        C0598n c0598n = (C0598n) this.f27334c;
        View childAt = c0598n != null ? c0598n.f8407e.getChildAt(0) : null;
        OrderResultItemModel orderResultItemModel = childAt instanceof OrderResultItemModel ? (OrderResultItemModel) childAt : null;
        if (orderResultItemModel != null) {
            orderResultItemModel.n(null, null, null);
        }
    }

    public final void s() {
        if (i0.W(this)) {
            int i7 = Pd.f.qt_low_balance_setup_failed;
            BillPaymentOrderDetailRsp billPaymentOrderDetailRsp = this.t;
            String billerName = billPaymentOrderDetailRsp != null ? billPaymentOrderDetailRsp.getBillerName() : null;
            if (billerName == null) {
                billerName = "";
            }
            ToastUtils.showLong(getString(i7, billerName), new Object[0]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:163:0x027a  */
    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        InterstitialAdView interstitialAdView;
        Integer orderStatus;
        Integer orderStatus2;
        ImageView rightImageView1;
        C0598n c0598n;
        String transType;
        String statusReplenishInfo;
        Integer orderStatus3;
        Long payAmount;
        int i7 = 0;
        int i10 = 1;
        super.setupView();
        u.a(getOnBackPressedDispatcher(), this, new C0463g(this, 20));
        org.greenrobot.eventbus.c.b().j(this);
        initStatusBar(getColor(L6.b.ppColorBackgroundLight));
        ARouter.getInstance().inject(this);
        PayByOrderResp.DataBean dataBean = this.f34190d;
        if (dataBean != null) {
            String str = dataBean.orderData;
            if (str != null) {
                if (TextUtils.isEmpty(str)) {
                    str = null;
                }
                if (str != null) {
                    try {
                        C0525w.f().getClass();
                        BillPaymentOrderDetailRsp billPaymentOrderDetailRsp = (BillPaymentOrderDetailRsp) C0525w.d(str, BillPaymentOrderDetailRsp.class);
                        this.t = billPaymentOrderDetailRsp;
                        this.f34197p = billPaymentOrderDetailRsp != null ? billPaymentOrderDetailRsp.getOrderNo() : null;
                        BillPaymentOrderDetailRsp billPaymentOrderDetailRsp2 = this.t;
                        if (billPaymentOrderDetailRsp2 != null) {
                            billPaymentOrderDetailRsp2.getBusinessAmount();
                        }
                        BillPaymentOrderDetailRsp billPaymentOrderDetailRsp3 = this.t;
                        this.f34199w = billPaymentOrderDetailRsp3 != null ? billPaymentOrderDetailRsp3.getPayId() : null;
                        BillPaymentOrderDetailRsp billPaymentOrderDetailRsp4 = this.t;
                        this.f34196o = (billPaymentOrderDetailRsp4 == null || (payAmount = billPaymentOrderDetailRsp4.getPayAmount()) == null) ? 0L : payAmount.longValue();
                        BillPaymentOrderDetailRsp billPaymentOrderDetailRsp5 = this.t;
                        this.f34191e = billPaymentOrderDetailRsp5 != null ? billPaymentOrderDetailRsp5.getTransType() : null;
                        BillPaymentOrderDetailRsp billPaymentOrderDetailRsp6 = this.t;
                        if (billPaymentOrderDetailRsp6 != null) {
                            billPaymentOrderDetailRsp6.getPayerAccountType();
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            BillPaymentOrderDetailRsp billPaymentOrderDetailRsp7 = this.t;
            if (billPaymentOrderDetailRsp7 != null && (orderStatus3 = billPaymentOrderDetailRsp7.getOrderStatus()) != null) {
                int iIntValue = orderStatus3.intValue();
                if (iIntValue == 1) {
                    AutoTrackUtil.trackTransactionResult(this, 1);
                } else if (iIntValue == 1 || iIntValue == 2 || iIntValue == 7 || iIntValue == 8 || iIntValue == 9 || iIntValue == 6) {
                    AutoTrackUtil.trackTransactionResult(this, 3);
                } else {
                    AutoTrackUtil.trackTransactionResult(this, 2);
                }
            }
            q();
            if (this.t == null) {
                String string = getString(k.core_data_error);
                j jVar = new j();
                jVar.f44470a = string;
                jVar.f44472c = new N2.b(g.lib_ui_toast_fail);
                p377z5.l.I(jVar);
            }
            BillPaymentOrderDetailRsp billPaymentOrderDetailRsp8 = this.t;
            if (billPaymentOrderDetailRsp8 == null || (transType = billPaymentOrderDetailRsp8.getTransType()) == null) {
                transType = "";
            }
            this.f34191e = transType;
            if (TransType.TRANS_TYPE_BILLER_BETTING_WITHDRAW.equals(transType)) {
                BillPaymentOrderDetailRsp billPaymentOrderDetailRsp9 = this.t;
                if (billPaymentOrderDetailRsp9 == null || (statusReplenishInfo = billPaymentOrderDetailRsp9.getStatusReplenishInfo()) == null) {
                    statusReplenishInfo = "";
                }
            } else {
                statusReplenishInfo = dataBean.pendingAcTips;
            }
            this.f34192f = statusReplenishInfo;
            this.f34193g = dataBean.pendingCountdownAcTips;
            this.f34194i = dataBean.pendingAcTime;
            this.f34195j = dataBean.errorMsg;
        }
        BillPaymentOrderDetailRsp billPaymentOrderDetailRsp10 = this.t;
        if (billPaymentOrderDetailRsp10 != null && (c0598n = (C0598n) this.f27334c) != null) {
            PpTitleBar ppTitleBar = c0598n.f8411j;
            String str2 = p070ee.c.f36289a;
            ppTitleBar.setTitle(p070ee.c.c(this, billPaymentOrderDetailRsp10.getCategoryId()));
        }
        C0598n c0598n2 = (C0598n) this.f27334c;
        if (c0598n2 != null) {
            c0598n2.f8411j.setBackButtonClickListener(new ViewOnClickListenerC0743q(this, i7));
        }
        C0598n c0598n3 = (C0598n) this.f27334c;
        if (c0598n3 != null) {
            c0598n3.f8411j.setRightImageView1Icon(S6.a.pay_CustomerService);
        }
        C0598n c0598n4 = (C0598n) this.f27334c;
        if (c0598n4 != null && (rightImageView1 = c0598n4.f8411j.getRightImageView1()) != null) {
            rightImageView1.setOnClickListener(new ViewOnClickListenerC0743q(this, i10));
        }
        boolean zEquals = TransType.TRANS_TYPE_BUNDLE.equals(this.f34191e);
        ViewOnClickListenerC0743q viewOnClickListenerC0743q = this.f34189X;
        if (zEquals) {
            C0598n c0598n5 = (C0598n) this.f27334c;
            if (c0598n5 != null) {
                c0598n5.f8412o.setText(getString(k.core_complete));
            }
            C0598n c0598n6 = (C0598n) this.f27334c;
            if (c0598n6 != null) {
                c0598n6.f8412o.setOnClickListener(viewOnClickListenerC0743q);
            }
            C0598n c0598n7 = (C0598n) this.f27334c;
            if (c0598n7 != null) {
                h.s(c0598n7.t, false);
            }
            C0598n c0598n8 = (C0598n) this.f27334c;
            if (c0598n8 != null) {
                h.s(c0598n8.f8409g, false);
            }
        } else {
            C0598n c0598n9 = (C0598n) this.f27334c;
            if (c0598n9 != null) {
                h.s(c0598n9.f8409g, true);
            }
            C0598n c0598n10 = (C0598n) this.f27334c;
            if (c0598n10 != null) {
                h.s(c0598n10.t, true);
            }
            C0598n c0598n11 = (C0598n) this.f27334c;
            if (c0598n11 != null) {
                c0598n11.t.setOnClickListener(viewOnClickListenerC0743q);
            }
            C0598n c0598n12 = (C0598n) this.f27334c;
            if (c0598n12 != null) {
                c0598n12.f8412o.setOnClickListener(viewOnClickListenerC0743q);
            }
        }
        C0598n c0598n13 = (C0598n) this.f27334c;
        if (c0598n13 != null) {
            c0598n13.f8413p.setOnClickListener(viewOnClickListenerC0743q);
        }
        C0598n c0598n14 = (C0598n) this.f27334c;
        if (c0598n14 != null) {
            c0598n14.f8414v.setOnClickListener(viewOnClickListenerC0743q);
        }
        C0598n c0598n15 = (C0598n) this.f27334c;
        if (c0598n15 != null) {
            c0598n15.f8406d.setOnClickListener(viewOnClickListenerC0743q);
        }
        C0598n c0598n16 = (C0598n) this.f27334c;
        if (c0598n16 != null) {
            c0598n16.f8415w.setOnClickListener(new Oc.j(25, this, c0598n16));
        }
        C0598n c0598n17 = (C0598n) this.f27334c;
        if (c0598n17 != null) {
            FailResultPageAdView failResultPageAdView = c0598n17.f8405c;
            C0598n c0598n18 = (C0598n) this.f27334c;
            failResultPageAdView.setAdListener(new com.chuanyi.ad.a(c0598n18 != null ? c0598n18.f8405c : null, ""));
        }
        if (TransType.TRANS_TYPE_BILLER_BETTING.equals(this.f34191e)) {
            BillPaymentOrderDetailRsp billPaymentOrderDetailRsp11 = this.t;
            int iIntValue2 = -1;
            if (((billPaymentOrderDetailRsp11 == null || (orderStatus2 = billPaymentOrderDetailRsp11.getOrderStatus()) == null) ? -1 : orderStatus2.intValue()) != 1) {
                BillPaymentOrderDetailRsp billPaymentOrderDetailRsp12 = this.t;
                if (billPaymentOrderDetailRsp12 != null && (orderStatus = billPaymentOrderDetailRsp12.getOrderStatus()) != null) {
                    iIntValue2 = orderStatus.intValue();
                }
                if (iIntValue2 != 1) {
                    if (!(iIntValue2 == 2 || iIntValue2 == 7)) {
                        if (!(iIntValue2 == 8 || iIntValue2 == 9)) {
                            if (!(iIntValue2 == 6)) {
                                i7 = 1;
                            }
                        }
                    }
                }
                if (i7 == 0) {
                    interstitialAdView = new InterstitialAdView(e.p(this.f34191e), new Ab.k(13));
                }
            }
            interstitialAdView = new InterstitialAdView(e.p(this.f34191e), 1, new Ab.k(12), new org.sufficientlysecure.htmltextview.h(9));
        } else {
            interstitialAdView = new InterstitialAdView(e.p(this.f34191e), new Ab.k(13));
        }
        this.f34183B = interstitialAdView;
        String str3 = this.f34191e;
        AutoTrackUtil.trackTransType(this, str3 != null ? str3 : "");
    }
}
