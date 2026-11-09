package com.transsnet.palmpay.databundle.ui.activity;

import Ed.ViewOnTouchListenerC0223c;
import Ed.X;
import L6.b;
import N8.q0;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Pd.d;
import Rd.C0599o;
import S3.c;
import T8.f;
import Wf.AbstractC0780y;
import Xd.o;
import Zd.E;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.activity.u;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.camera.camera2.internal.P0;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.Observer;
import androidx.lifecycle.V;
import androidx.lifecycle.b0;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.appsflyer.AppsFlyerProperties;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.mikepenz.iconics.IconicsDrawable;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.Interstitial.InterstitialAdView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.base.p;
import com.transsnet.palmpay.core.bean.MobileWalletResp;
import com.transsnet.palmpay.core.bean.TopUpHistoryDataResp;
import com.transsnet.palmpay.core.bean.bill.TransType;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.core.util.statistic.ClickEvent;
import com.transsnet.palmpay.core.viewmodel.DataBundleRecordHistoryViewModel;
import com.transsnet.palmpay.core.viewmodel.ModelBillNoticeItem;
import com.transsnet.palmpay.core.viewmodel.ModelDataPlanFlashSaleItem;
import com.transsnet.palmpay.custom_view.dialog.y;
import com.transsnet.palmpay.custom_view.input.ModelMobileWithIconInputLayout;
import com.transsnet.palmpay.custom_view.input.OnOperatorItemClickListener;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.databundle.ui.activity.BuyBundleHomePageActivity;
import com.transsnet.palmpay.databundle.ui.view.ModelDataBundleHighlyRecommendItem;
import com.transsnet.palmpay.databundle.viewmodel.DataBundleHomeViewModel;
import com.transsnet.palmpay.teller.bean.DataBundleWalletItemBean;
import com.transsnet.palmpay.teller.bean.resp.BillerCouponRetentionBean;
import com.transsnet.palmpay.teller.ui.activity.BaseBillerActivity;
import com.transsnet.palmpay.teller.ui.view.ModelActivityBannerWithCoupon;
import com.transsnet.palmpay.teller.ui.view.ModelBillerBottomMenu;
import com.transsnet.palmpay.teller.ui.view.WrapContentViewPager2;
import com.transsnet.palmpay.teller.viewmodel.USSDInfoDataViewModel;
import com.transsnet.palmpay.util.SPUtils;
import io.fastkv.n;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C1850q;
import kotlin.collections.F;
import kotlin.collections.z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.r;
import kotlin.reflect.KProperty;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.Nullable;
import p025ba.k;
import p051d9.C1624v;
import p054dd.q;
import p068ec.g;
import p068ec.h;
import p068ec.i;
import p068ec.j;
import p068ec.m;
import p130ic.B;
import p130ic.C;
import p130ic.C1746a;
import p130ic.C1747b;
import p189me.jessyan.autosize.internal.CancelAdapt;

/* JADX INFO: loaded from: classes4.dex */
@Route(name = "流量/Buy Home", path = "/quick_teller/buy_bundle_ng", remark = "流量的购买首页")
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u00042\u00020\u0006:\u0001\u000eB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/transsnet/palmpay/databundle/ui/activity/BuyBundleHomePageActivity;", "Lcom/transsnet/palmpay/teller/ui/activity/BaseBillerActivity;", "Lcom/transsnet/palmpay/databundle/viewmodel/DataBundleHomeViewModel;", "LRd/o;", "Lcom/transsnet/palmpay/custom_view/input/OnOperatorItemClickListener;", "Lcom/transsnet/palmpay/core/bean/MobileWalletResp$MobileWallet;", "Lme/jessyan/autosize/internal/CancelAdapt;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "messageEvent", "", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_biller_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"MissingPermission"})
@SourceDebugExtension({"SMAP\nBuyBundleHomePageActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyBundleHomePageActivity.kt\ncom/transsnet/palmpay/databundle/ui/activity/BuyBundleHomePageActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 Delegates.kt\nkotlin/properties/Delegates\n+ 4 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 5 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1459:1\n75#2,13:1460\n75#2,13:1473\n75#2,13:1486\n75#2,13:1499\n75#2,13:1512\n33#3,3:1525\n115#4,8:1528\n145#4:1536\n152#4:1537\n169#4:1538\n171#4,12:1539\n215#4:1551\n115#4,8:1552\n145#4:1560\n152#4:1561\n169#4:1562\n383#4:1563\n401#4:1564\n383#4:1565\n401#4:1566\n152#4:1567\n169#4:1568\n260#4,10:1569\n296#4:1579\n152#4:1580\n169#4:1581\n562#5,10:1582\n562#5,10:1592\n1#6:1602\n1761#7,3:1603\n1761#7,3:1606\n1563#7:1609\n1634#7,3:1610\n*S KotlinDebug\n*F\n+ 1 BuyBundleHomePageActivity.kt\ncom/transsnet/palmpay/databundle/ui/activity/BuyBundleHomePageActivity\n*L\n101#1:1460,13\n102#1:1473,13\n103#1:1486,13\n104#1:1499,13\n105#1:1512,13\n142#1:1525,3\n444#1:1528,8\n444#1:1536\n455#1:1537\n455#1:1538\n477#1:1539,12\n477#1:1551\n493#1:1552,8\n493#1:1560\n669#1:1561\n669#1:1562\n680#1:1563\n680#1:1564\n756#1:1565\n756#1:1566\n766#1:1567\n766#1:1568\n780#1:1569,10\n780#1:1579\n797#1:1580\n797#1:1581\n900#1:1582,10\n988#1:1592,10\n1005#1:1603,3\n1348#1:1606,3\n542#1:1609\n542#1:1610,3\n*E\n"})
public final class BuyBundleHomePageActivity extends BaseBillerActivity<DataBundleHomeViewModel, C0599o> implements OnOperatorItemClickListener<MobileWalletResp.MobileWallet>, CancelAdapt {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f31740t0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public o f31745L;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public User f31748X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public ModelDataPlanFlashSaleItem f31750Z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PpTitleBar f31751i;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public ModelActivityBannerWithCoupon f31753k0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public BillerCouponRetentionBean f31756p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f31757q0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b0 f31752j = new b0(G.a(C1746a.class), new p068ec.o(this, 7), new p068ec.o(this, 6), new p068ec.o(this, 8));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b0 f31754o = new b0(G.a(C1747b.class), new p068ec.o(this, 10), new p068ec.o(this, 9), new p068ec.o(this, 11));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b0 f31755p = new b0(G.a(C.class), new p068ec.o(this, 13), new p068ec.o(this, 12), new p068ec.o(this, 14));
    public final b0 t = new b0(G.a(USSDInfoDataViewModel.class), new p068ec.o(this, 1), new p068ec.o(this, 0), new p068ec.o(this, 2));

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b0 f31760v = new b0(G.a(DataBundleRecordHistoryViewModel.class), new p068ec.o(this, 4), new p068ec.o(this, 3), new p068ec.o(this, 5));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f31761w = "";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f31741A = "";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f31742B = "";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f31743C = -1;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f31744H = 1811;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final j f31746M = new j(this);

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final c f31747Q = new c(this, 7);

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final HashMap f31749Y = new HashMap();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ArrayList f31758r0 = new ArrayList();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ArrayList f31759s0 = new ArrayList();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        r rVar = new r("mSelectMobileWallet", "getMSelectMobileWallet()Lcom/transsnet/palmpay/core/bean/MobileWalletResp$MobileWallet;", BuyBundleHomePageActivity.class);
        G.f38952a.getClass();
        f31740t0 = new KProperty[]{rVar};
        new a(null);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        l lVar = ((DataBundleHomeViewModel) l()).f31807w;
        if (lVar != null) {
            lVar.e(this, new q(new i(this, 0), 1));
        }
        l lVar2 = ((DataBundleHomeViewModel) l()).f31794A;
        if (lVar2 != null) {
            lVar2.e(this, new q(new i(this, 3), 1));
        }
        l lVar3 = ((DataBundleHomeViewModel) l()).f31806v;
        if (lVar3 != null) {
            lVar3.e(this, new q(new i(this, 5), 1));
        }
        l lVar4 = ((DataBundleHomeViewModel) l()).f31805p;
        if (lVar4 != null) {
            lVar4.e(this, new q(new m(lVar4, this, 0), 1));
        }
        n.B(this, ((DataBundleHomeViewModel) l()).t, this, new h(this, 0), new C1624v(17), true, null, 224);
        int i7 = 1;
        n.B(this, ((DataBundleHomeViewModel) l()).f31799e, this, new h(this, i7), new p068ec.a(this, i7), false, null, 224);
        l lVar5 = ((DataBundleHomeViewModel) l()).f31800f;
        if (lVar5 != null) {
            lVar5.e(this, new q(new m(lVar5, this, 1), 1));
        }
        l lVar6 = ((DataBundleHomeViewModel) l()).f31801g;
        if (lVar6 != null) {
            lVar6.e(this, new q(new i(this, 6), 1));
        }
        l lVar7 = ((DataBundleHomeViewModel) l()).f31802i;
        if (lVar7 != null) {
            lVar7.e(this, new q(new i(this, this), 1));
        }
        l lVar8 = ((DataBundleHomeViewModel) l()).f31803j;
        if (lVar8 != null) {
            lVar8.e(this, new q(new i(this, 7), 1));
        }
        int i10 = 2;
        n.B(this, ((DataBundleHomeViewModel) l()).f31804o, this, new h(this, i10), new p068ec.a(this, i10), true, null, 224);
        Handler uIHandler = getUIHandler();
        Intrinsics.checkNotNullExpressionValue(uIHandler, "getUIHandler(...)");
        getWindow().getDecorView().post(new p068ec.l(uIHandler, this, 0));
        ((C1747b) this.f31754o.getValue()).f37496d.e(this, new f(new p068ec.a(this, 5)));
        l lVar9 = ((DataBundleHomeViewModel) l()).f31796C;
        if (lVar9 != null) {
            lVar9.e(this, new q(new i(this, 2), 1));
        }
        l lVar10 = ((DataBundleHomeViewModel) l()).f31795B;
        if (lVar10 != null) {
            lVar10.e(this, new q(new i(this, 1), 1));
        }
        this.f31748X = BaseApplication.getInstance().getUser();
        if (!TextUtils.isEmpty(this.f31741A)) {
            User user = this.f31748X;
            if (user == null) {
                Intrinsics.n("mUser");
                throw null;
            }
            String phoneNumber = user.getPhoneNumber();
            if (phoneNumber != null) {
                ((DataBundleHomeViewModel) l()).f(phoneNumber, this.f31741A);
                this.f31741A = "";
            }
        }
        final int i11 = 1;
        ((C1746a) this.f31752j.getValue()).f37495d.e(this, new Observer(this) { // from class: ec.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BuyBundleHomePageActivity f36248b;

            {
                this.f36248b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                C0599o c0599o;
                BuyBundleHomePageActivity buyBundleHomePageActivity = this.f36248b;
                switch (i11) {
                    case 0:
                        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                        KProperty[] kPropertyArr = BuyBundleHomePageActivity.f31740t0;
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof p) {
                            p pVar = (p) it;
                            if (((TopUpHistoryDataResp) pVar.f27360a).isSuccess() && (c0599o = (C0599o) buyBundleHomePageActivity.f27334c) != null) {
                                c0599o.f8429d.initModelInputRegexData(((TopUpHistoryDataResp) pVar.f27360a).getData(), new h(buyBundleHomePageActivity, 3), new h(buyBundleHomePageActivity, 4));
                                break;
                            }
                        }
                        break;
                    default:
                        String str = (String) obj;
                        if (str == null) {
                            KProperty[] kPropertyArr2 = BuyBundleHomePageActivity.f31740t0;
                        } else {
                            buyBundleHomePageActivity.f31761w = str;
                            buyBundleHomePageActivity.w();
                        }
                        break;
                }
            }
        });
        boolean zHasLogin = BaseApplication.hasLogin();
        b0 b0Var = this.f31760v;
        if (zHasLogin) {
            ((DataBundleRecordHistoryViewModel) b0Var.getValue()).e();
        }
        final int i12 = 0;
        ((DataBundleRecordHistoryViewModel) b0Var.getValue()).f28220e.e(this, new Observer(this) { // from class: ec.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ BuyBundleHomePageActivity f36248b;

            {
                this.f36248b = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                C0599o c0599o;
                BuyBundleHomePageActivity buyBundleHomePageActivity = this.f36248b;
                switch (i12) {
                    case 0:
                        com.transsnet.palmpay.core.base.q it = (com.transsnet.palmpay.core.base.q) obj;
                        KProperty[] kPropertyArr = BuyBundleHomePageActivity.f31740t0;
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof p) {
                            p pVar = (p) it;
                            if (((TopUpHistoryDataResp) pVar.f27360a).isSuccess() && (c0599o = (C0599o) buyBundleHomePageActivity.f27334c) != null) {
                                c0599o.f8429d.initModelInputRegexData(((TopUpHistoryDataResp) pVar.f27360a).getData(), new h(buyBundleHomePageActivity, 3), new h(buyBundleHomePageActivity, 4));
                                break;
                            }
                        }
                        break;
                    default:
                        String str = (String) obj;
                        if (str == null) {
                            KProperty[] kPropertyArr2 = BuyBundleHomePageActivity.f31740t0;
                        } else {
                            buyBundleHomePageActivity.f31761w = str;
                            buyBundleHomePageActivity.w();
                        }
                        break;
                }
            }
        });
        w();
        ((DataBundleHomeViewModel) l()).j();
        ((DataBundleHomeViewModel) l()).i(s());
        DataBundleHomeViewModel dataBundleHomeViewModel = (DataBundleHomeViewModel) l();
        dataBundleHomeViewModel.getClass();
        p140j8.f.s(dataBundleHomeViewModel, new p130ic.h(1, null), dataBundleHomeViewModel.f31794A, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
        getSupportFragmentManager().setFragmentResultListener("REQUEST_CODE_EXPAND_APPBAR_LAYOUT", this, new p068ec.c(this, 0));
        getSupportFragmentManager().setFragmentResultListener("REQUEST_CODE_CLICK_DATA_BUNDLE_ITEM", this, new p068ec.c(this, 1));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(CommonViewExtKt.colorInt(b.ppColorBackgroundDark, this));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isForceNoNightMode() {
        return false;
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final boolean isMainBusiness() {
        return true;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewM;
        View viewInflate = getLayoutInflater().inflate(d.qt_activity_buy_bundle_home, (ViewGroup) null, false);
        int i7 = Pd.c.bannerWithCouponStub;
        ViewStub viewStub = (ViewStub) p059e1.a.m(i7, viewInflate);
        if (viewStub != null) {
            i7 = Pd.c.billNoticeItem;
            if (((ModelBillNoticeItem) p059e1.a.m(i7, viewInflate)) != null) {
                i7 = Pd.c.bottomMenuView;
                ModelBillerBottomMenu modelBillerBottomMenu = (ModelBillerBottomMenu) p059e1.a.m(i7, viewInflate);
                if (modelBillerBottomMenu != null) {
                    i7 = Pd.c.bundle_phone_num_input;
                    ModelMobileWithIconInputLayout modelMobileWithIconInputLayout = (ModelMobileWithIconInputLayout) p059e1.a.m(i7, viewInflate);
                    if (modelMobileWithIconInputLayout != null) {
                        i7 = Pd.c.bundle_tabs;
                        TabLayout tabLayout = (TabLayout) p059e1.a.m(i7, viewInflate);
                        if (tabLayout != null) {
                            i7 = Pd.c.bundleTabsTopBarrier;
                            if (((Barrier) p059e1.a.m(i7, viewInflate)) != null) {
                                i7 = Pd.c.bundle_vp;
                                WrapContentViewPager2 wrapContentViewPager2 = (WrapContentViewPager2) p059e1.a.m(i7, viewInflate);
                                if (wrapContentViewPager2 != null) {
                                    i7 = Pd.c.bundleVpContainer;
                                    if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                        i7 = Pd.c.cpi_bundle_loading;
                                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) p059e1.a.m(i7, viewInflate);
                                        if (circularProgressIndicator != null && (viewM = p059e1.a.m((i7 = Pd.c.cpi_bundle_loading_bg), viewInflate)) != null) {
                                            i7 = Pd.c.dataBundleDetailsModeIv;
                                            ImageView imageView = (ImageView) p059e1.a.m(i7, viewInflate);
                                            if (imageView != null) {
                                                i7 = Pd.c.dataBundleGridModeIv;
                                                ImageView imageView2 = (ImageView) p059e1.a.m(i7, viewInflate);
                                                if (imageView2 != null) {
                                                    i7 = Pd.c.data_bundle_highly_recommend_item;
                                                    ModelDataBundleHighlyRecommendItem modelDataBundleHighlyRecommendItem = (ModelDataBundleHighlyRecommendItem) p059e1.a.m(i7, viewInflate);
                                                    if (modelDataBundleHighlyRecommendItem != null) {
                                                        i7 = Pd.c.flBody;
                                                        NestedScrollView nestedScrollView = (NestedScrollView) p059e1.a.m(i7, viewInflate);
                                                        if (nestedScrollView != null) {
                                                            i7 = Pd.c.llAppBarHeader;
                                                            if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                                                i7 = Pd.c.llNetworkError;
                                                                if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                                                    i7 = Pd.c.llTabs;
                                                                    if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                                                        i7 = Pd.c.midSpace;
                                                                        if (((Space) p059e1.a.m(i7, viewInflate)) != null) {
                                                                            i7 = Pd.c.qt_data_bundle_flash_sale;
                                                                            ViewStub viewStub2 = (ViewStub) p059e1.a.m(i7, viewInflate);
                                                                            if (viewStub2 != null) {
                                                                                i7 = Pd.c.sav_data_bundle_pocker_banner;
                                                                                SingleAdView singleAdView = (SingleAdView) p059e1.a.m(i7, viewInflate);
                                                                                if (singleAdView != null) {
                                                                                    i7 = Pd.c.space_ad_mid_bill;
                                                                                    if (((Space) p059e1.a.m(i7, viewInflate)) != null) {
                                                                                        i7 = Pd.c.title_bar;
                                                                                        PpTitleBar ppTitleBar = (PpTitleBar) p059e1.a.m(i7, viewInflate);
                                                                                        if (ppTitleBar != null) {
                                                                                            i7 = Pd.c.tvServiceProviderDisclaimer;
                                                                                            TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                            if (textView != null) {
                                                                                                i7 = Pd.c.tvTabTitle;
                                                                                                TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                                                                                if (textView2 != null) {
                                                                                                    C0599o c0599o = new C0599o((ConstraintLayout) viewInflate, viewStub, modelBillerBottomMenu, modelMobileWithIconInputLayout, tabLayout, wrapContentViewPager2, circularProgressIndicator, viewM, imageView, imageView2, modelDataBundleHighlyRecommendItem, nestedScrollView, viewStub2, singleAdView, ppTitleBar, textView, textView2);
                                                                                                    Intrinsics.checkNotNullExpressionValue(c0599o, "inflate(...)");
                                                                                                    return c0599o;
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

    @Override // com.transsnet.palmpay.teller.ui.activity.BaseBillerActivity
    public final P0 n() {
        E e10 = new E(this);
        C0599o c0599o = (C0599o) this.f27334c;
        e10.f13251f = c0599o != null ? c0599o.t : null;
        e10.f13249d = q0.y(getString(k.core_no_network), ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, getString(k.core_no_network_tips, getString(k.core_buy_bundle)));
        p068ec.d listener = new p068ec.d(this, 0);
        Intrinsics.checkNotNullParameter(listener, "listener");
        e10.f13247b = listener;
        String string = getString(Pd.f.qt_dial861);
        p054dd.d dVar = new p054dd.d(3);
        e10.f13248c = string;
        e10.f13250e = dVar;
        return e10;
    }

    @Override // androidx.fragment.app.E, androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onActivityResult(int i7, int i10, Intent intent) {
        ModelMobileWithIconInputLayout modelMobileWithIconInputLayout;
        ImageView contactIv;
        ModelMobileWithIconInputLayout modelMobileWithIconInputLayout2;
        ImageView clearIv;
        ModelMobileWithIconInputLayout modelMobileWithIconInputLayout3;
        AppCompatAutoCompleteTextView phoneNumberEdit;
        super.onActivityResult(i7, i10, intent);
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("PHONE_NUMBER");
        intent.getStringExtra("contact_name");
        C0599o c0599o = (C0599o) this.f27334c;
        if (c0599o != null && (modelMobileWithIconInputLayout3 = c0599o.f8429d) != null && (phoneNumberEdit = modelMobileWithIconInputLayout3.getPhoneNumberEdit()) != null) {
            phoneNumberEdit.setText(i0.j(stringExtra));
        }
        C0599o c0599o2 = (C0599o) this.f27334c;
        if (c0599o2 != null && (modelMobileWithIconInputLayout2 = c0599o2.f8429d) != null && (clearIv = modelMobileWithIconInputLayout2.getClearIv()) != null) {
            clearIv.setVisibility(8);
        }
        C0599o c0599o3 = (C0599o) this.f27334c;
        if (c0599o3 == null || (modelMobileWithIconInputLayout = c0599o3.f8429d) == null || (contactIv = modelMobileWithIconInputLayout.getContactIv()) == null) {
            return;
        }
        contactIv.setVisibility(0);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity, com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        WrapContentViewPager2 wrapContentViewPager2;
        C0599o c0599o = (C0599o) this.f27334c;
        if (c0599o != null && (wrapContentViewPager2 = c0599o.f8431f) != null) {
            j callback = this.f31746M;
            Intrinsics.checkNotNullParameter(callback, "callback");
            wrapContentViewPager2.viewPager2.unregisterOnPageChangeCallback(callback);
        }
        org.greenrobot.eventbus.c.b().l(this);
        super.onDestroy();
    }

    @Override // androidx.activity.AbstractActivityC0822m, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        String item = intent.getStringExtra("phone_number");
        if (item != null) {
            this.f31761w = item;
            C1746a c1746a = (C1746a) this.f31752j.getValue();
            c1746a.getClass();
            Intrinsics.checkNotNullParameter(item, "item");
            c1746a.f37495d.k(item);
        }
    }

    @Override // com.transsnet.palmpay.custom_view.input.OnOperatorItemClickListener
    public final void onOperatorItemClick(MobileWalletResp.MobileWallet mobileWallet) {
        MobileWalletResp.MobileWallet t = mobileWallet;
        Intrinsics.checkNotNullParameter(t, "t");
        if (t.status != 1) {
            x(t);
        }
        this.f31747Q.setValue(this, f31740t0[0], t);
        this.f31759s0.clear();
        o oVar = this.f31745L;
        if (oVar != null) {
            oVar.f11162o = "";
            z zVar = z.f38935a;
            oVar.f11164v = zVar;
            oVar.f11163p = zVar;
            oVar.notifyDataSetChanged();
        }
        int iT = t(t.operatorName);
        this.f31743C = iT;
        z(t, iT);
        SPUtils.getInstance().put("TOP_UP_AIRTIME_SELECTED_MOBILE_OPERATOR_CODE", t.operatorCode);
        n0.g().k(new ClickEvent("DataBundle_Homepage_Operator_Click").add("billerName", t.operatorName));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onPause() {
        ModelMobileWithIconInputLayout modelMobileWithIconInputLayout;
        super.onPause();
        C0599o c0599o = (C0599o) this.f27334c;
        if (c0599o == null || (modelMobileWithIconInputLayout = c0599o.f8429d) == null) {
            return;
        }
        modelMobileWithIconInputLayout.showContactIv(true, true);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable MessageEvent messageEvent) {
        String str;
        if (messageEvent != null && messageEvent.getEventType() == 375) {
            if (BaseApplication.hasLogin()) {
                DataBundleHomeViewModel dataBundleHomeViewModel = (DataBundleHomeViewModel) l();
                dataBundleHomeViewModel.getClass();
                if (BaseApplication.hasLogin()) {
                    p140j8.f.s(dataBundleHomeViewModel, new p130ic.m(1, null), dataBundleHomeViewModel.f31807w, (28 & 4) != 0 ? 0L : 300L, (28 & 8) != 0, (28 & 16) == 0);
                }
            }
            F6.d.h("testsend oooeventbus", 3, new Object[0]);
            MobileWalletResp.MobileWallet mobileWalletR = r();
            if (mobileWalletR != null && (str = mobileWalletR.operatorCode) != null && this.f31743C != -1) {
                ((DataBundleHomeViewModel) l()).g(this.f31743C, str, true);
                ((DataBundleHomeViewModel) l()).h(str);
            }
            if (BaseApplication.hasLogin()) {
                ((DataBundleRecordHistoryViewModel) this.f31760v.getValue()).e();
            }
        }
    }

    @Override // com.transsnet.palmpay.teller.ui.activity.BaseBillerActivity, com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        ModelDataBundleHighlyRecommendItem modelDataBundleHighlyRecommendItem;
        super.onResume();
        if (BaseApplication.hasLogin()) {
            ModelActivityBannerWithCoupon modelActivityBannerWithCoupon = this.f31753k0;
            if (modelActivityBannerWithCoupon != null) {
                modelActivityBannerWithCoupon.f();
            }
            MobileWalletResp.MobileWallet mobileWalletR = r();
            if (mobileWalletR != null) {
                ModelDataPlanFlashSaleItem modelDataPlanFlashSaleItem = this.f31750Z;
                if (modelDataPlanFlashSaleItem != null) {
                    modelDataPlanFlashSaleItem.h(mobileWalletR.operatorCode);
                }
                C0599o c0599o = (C0599o) this.f27334c;
                if (c0599o == null || (modelDataBundleHighlyRecommendItem = c0599o.f8436p) == null) {
                    return;
                }
                modelDataBundleHighlyRecommendItem.d(mobileWalletR.operatorCode, mobileWalletR.operatorName);
            }
        }
    }

    public final void p(DataBundleWalletItemBean dataBundleWalletItemBean, String str, Long l5, boolean z3, String str2) {
        if (dataBundleWalletItemBean == null || str == null || l5 == null) {
            return;
        }
        ((DataBundleHomeViewModel) l()).d(dataBundleWalletItemBean, str, l5.longValue(), z3, this.f31742B, str2);
        n0 n0VarG = n0.g();
        ClickEvent clickEventAdd = new ClickEvent("DataBundleOrderCreate").add(AppsFlyerProperties.CHANNEL, this.f31742B).add("billerName", dataBundleWalletItemBean.getBillerName()).add("itemId", dataBundleWalletItemBean.getItemId());
        String string = l5.toString();
        if (string == null) {
            string = "";
        }
        n0VarG.k(clickEventAdd.add("amount", string));
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        if (bundle == null) {
            Handler uIHandler = getUIHandler();
            Intrinsics.checkNotNullExpressionValue(uIHandler, "getUIHandler(...)");
            getWindow().getDecorView().post(new p068ec.l(uIHandler, this, 1));
        }
    }

    public final MobileWalletResp.MobileWallet r() {
        return (MobileWalletResp.MobileWallet) this.f31747Q.getValue(this, f31740t0[0]);
    }

    public final String s() {
        String phoneNumber;
        ModelMobileWithIconInputLayout modelMobileWithIconInputLayout;
        try {
            C0599o c0599o = (C0599o) this.f27334c;
            if (c0599o == null || (modelMobileWithIconInputLayout = c0599o.f8429d) == null || (phoneNumber = modelMobileWithIconInputLayout.getPhoneNumber()) == null) {
                phoneNumber = BaseApplication.get().getUser().getPhoneNumber();
            }
            Intrinsics.e(phoneNumber);
            return phoneNumber;
        } catch (Exception unused) {
            String phoneNumber2 = BaseApplication.get().getUser().getPhoneNumber();
            Intrinsics.e(phoneNumber2);
            return phoneNumber2;
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        ImageView contactIv;
        ImageView rightImageView1;
        ImageView rightImageView2;
        super.setupView();
        u.a(getOnBackPressedDispatcher(), this, new p068ec.a(this, 0));
        ARouter.getInstance().inject(this);
        org.greenrobot.eventbus.c.b().j(this);
        setTitle(getString(k.core_data));
        C0599o c0599o = (C0599o) this.f27334c;
        PpTitleBar ppTitleBar = c0599o != null ? c0599o.f8423A : null;
        this.f31751i = ppTitleBar;
        if (ppTitleBar != null) {
            final int i7 = 1;
            ppTitleBar.setBackButtonClickListener(new View.OnClickListener(this) { // from class: ec.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BuyBundleHomePageActivity f36254b;

                {
                    this.f36254b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuyBundleHomePageActivity buyBundleHomePageActivity = this.f36254b;
                    switch (i7) {
                        case 0:
                            KProperty[] kPropertyArr = BuyBundleHomePageActivity.f31740t0;
                            ARouter.getInstance().build("/contact/all").withString("orderType", "0").withString("transType", TransType.TRANS_TYPE_BUNDLE).navigation(buyBundleHomePageActivity, buyBundleHomePageActivity.f31744H);
                            n0.g().q(new ClickEvent("DataBundle_Homepage_Contact_Click"));
                            break;
                        case 1:
                            KProperty[] kPropertyArr2 = BuyBundleHomePageActivity.f31740t0;
                            buyBundleHomePageActivity.getOnBackPressedDispatcher().d();
                            break;
                        case 2:
                            KProperty[] kPropertyArr3 = BuyBundleHomePageActivity.f31740t0;
                            if (!BaseApplication.hasLogin()) {
                                i0.K(null, null);
                            } else {
                                DataBundleHomeViewModel dataBundleHomeViewModel = (DataBundleHomeViewModel) buyBundleHomePageActivity.l();
                                ArrayList transType = C1850q.e(TransType.TRANS_TYPE_BUNDLE);
                                dataBundleHomeViewModel.getClass();
                                Intrinsics.checkNotNullParameter(transType, "transType");
                                AbstractC0780y.m(V.h(dataBundleHomeViewModel), null, null, new B(dataBundleHomeViewModel.f31796C, C0.G.p("Pref_", "queryTransactionLinkVM_" + transType, "_", BaseApplication.getCountryLocale()), null, transType), 3);
                            }
                            break;
                        case 3:
                            KProperty[] kPropertyArr4 = BuyBundleHomePageActivity.f31740t0;
                            ((C1747b) buyBundleHomePageActivity.f31754o.getValue()).d(1);
                            break;
                        default:
                            KProperty[] kPropertyArr5 = BuyBundleHomePageActivity.f31740t0;
                            ((C1747b) buyBundleHomePageActivity.f31754o.getValue()).d(0);
                            break;
                    }
                }
            });
        }
        PpTitleBar ppTitleBar2 = this.f31751i;
        if (ppTitleBar2 != null && (rightImageView2 = ppTitleBar2.getRightImageView1()) != null) {
            IconicsDrawable iconicsDrawable = new IconicsDrawable(this, S6.a.pay_TransactionHistory);
            iconicsDrawable.a(new p068ec.a(this, 3));
            rightImageView2.setImageDrawable(iconicsDrawable);
        }
        PpTitleBar ppTitleBar3 = this.f31751i;
        if (ppTitleBar3 != null && (rightImageView1 = ppTitleBar3.getRightImageView1()) != null) {
            final int i10 = 2;
            rightImageView1.setOnClickListener(new View.OnClickListener(this) { // from class: ec.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BuyBundleHomePageActivity f36254b;

                {
                    this.f36254b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuyBundleHomePageActivity buyBundleHomePageActivity = this.f36254b;
                    switch (i10) {
                        case 0:
                            KProperty[] kPropertyArr = BuyBundleHomePageActivity.f31740t0;
                            ARouter.getInstance().build("/contact/all").withString("orderType", "0").withString("transType", TransType.TRANS_TYPE_BUNDLE).navigation(buyBundleHomePageActivity, buyBundleHomePageActivity.f31744H);
                            n0.g().q(new ClickEvent("DataBundle_Homepage_Contact_Click"));
                            break;
                        case 1:
                            KProperty[] kPropertyArr2 = BuyBundleHomePageActivity.f31740t0;
                            buyBundleHomePageActivity.getOnBackPressedDispatcher().d();
                            break;
                        case 2:
                            KProperty[] kPropertyArr3 = BuyBundleHomePageActivity.f31740t0;
                            if (!BaseApplication.hasLogin()) {
                                i0.K(null, null);
                            } else {
                                DataBundleHomeViewModel dataBundleHomeViewModel = (DataBundleHomeViewModel) buyBundleHomePageActivity.l();
                                ArrayList transType = C1850q.e(TransType.TRANS_TYPE_BUNDLE);
                                dataBundleHomeViewModel.getClass();
                                Intrinsics.checkNotNullParameter(transType, "transType");
                                AbstractC0780y.m(V.h(dataBundleHomeViewModel), null, null, new B(dataBundleHomeViewModel.f31796C, C0.G.p("Pref_", "queryTransactionLinkVM_" + transType, "_", BaseApplication.getCountryLocale()), null, transType), 3);
                            }
                            break;
                        case 3:
                            KProperty[] kPropertyArr4 = BuyBundleHomePageActivity.f31740t0;
                            ((C1747b) buyBundleHomePageActivity.f31754o.getValue()).d(1);
                            break;
                        default:
                            KProperty[] kPropertyArr5 = BuyBundleHomePageActivity.f31740t0;
                            ((C1747b) buyBundleHomePageActivity.f31754o.getValue()).d(0);
                            break;
                    }
                }
            });
        }
        Intrinsics.checkNotNullParameter(this, "activity");
        o oVar = new o(this);
        oVar.f11162o = "";
        z zVar = z.f38935a;
        oVar.f11163p = zVar;
        oVar.f11164v = zVar;
        this.f31745L = oVar;
        C0599o c0599o2 = (C0599o) this.f27334c;
        if (c0599o2 != null) {
            c0599o2.f8431f.setAdapter(oVar);
        }
        C0599o c0599o3 = (C0599o) this.f27334c;
        if (c0599o3 != null) {
            final int i11 = 3;
            c0599o3.f8435o.setOnClickListener(new View.OnClickListener(this) { // from class: ec.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BuyBundleHomePageActivity f36254b;

                {
                    this.f36254b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuyBundleHomePageActivity buyBundleHomePageActivity = this.f36254b;
                    switch (i11) {
                        case 0:
                            KProperty[] kPropertyArr = BuyBundleHomePageActivity.f31740t0;
                            ARouter.getInstance().build("/contact/all").withString("orderType", "0").withString("transType", TransType.TRANS_TYPE_BUNDLE).navigation(buyBundleHomePageActivity, buyBundleHomePageActivity.f31744H);
                            n0.g().q(new ClickEvent("DataBundle_Homepage_Contact_Click"));
                            break;
                        case 1:
                            KProperty[] kPropertyArr2 = BuyBundleHomePageActivity.f31740t0;
                            buyBundleHomePageActivity.getOnBackPressedDispatcher().d();
                            break;
                        case 2:
                            KProperty[] kPropertyArr3 = BuyBundleHomePageActivity.f31740t0;
                            if (!BaseApplication.hasLogin()) {
                                i0.K(null, null);
                            } else {
                                DataBundleHomeViewModel dataBundleHomeViewModel = (DataBundleHomeViewModel) buyBundleHomePageActivity.l();
                                ArrayList transType = C1850q.e(TransType.TRANS_TYPE_BUNDLE);
                                dataBundleHomeViewModel.getClass();
                                Intrinsics.checkNotNullParameter(transType, "transType");
                                AbstractC0780y.m(V.h(dataBundleHomeViewModel), null, null, new B(dataBundleHomeViewModel.f31796C, C0.G.p("Pref_", "queryTransactionLinkVM_" + transType, "_", BaseApplication.getCountryLocale()), null, transType), 3);
                            }
                            break;
                        case 3:
                            KProperty[] kPropertyArr4 = BuyBundleHomePageActivity.f31740t0;
                            ((C1747b) buyBundleHomePageActivity.f31754o.getValue()).d(1);
                            break;
                        default:
                            KProperty[] kPropertyArr5 = BuyBundleHomePageActivity.f31740t0;
                            ((C1747b) buyBundleHomePageActivity.f31754o.getValue()).d(0);
                            break;
                    }
                }
            });
        }
        C0599o c0599o4 = (C0599o) this.f27334c;
        if (c0599o4 != null) {
            final int i12 = 4;
            c0599o4.f8434j.setOnClickListener(new View.OnClickListener(this) { // from class: ec.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BuyBundleHomePageActivity f36254b;

                {
                    this.f36254b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuyBundleHomePageActivity buyBundleHomePageActivity = this.f36254b;
                    switch (i12) {
                        case 0:
                            KProperty[] kPropertyArr = BuyBundleHomePageActivity.f31740t0;
                            ARouter.getInstance().build("/contact/all").withString("orderType", "0").withString("transType", TransType.TRANS_TYPE_BUNDLE).navigation(buyBundleHomePageActivity, buyBundleHomePageActivity.f31744H);
                            n0.g().q(new ClickEvent("DataBundle_Homepage_Contact_Click"));
                            break;
                        case 1:
                            KProperty[] kPropertyArr2 = BuyBundleHomePageActivity.f31740t0;
                            buyBundleHomePageActivity.getOnBackPressedDispatcher().d();
                            break;
                        case 2:
                            KProperty[] kPropertyArr3 = BuyBundleHomePageActivity.f31740t0;
                            if (!BaseApplication.hasLogin()) {
                                i0.K(null, null);
                            } else {
                                DataBundleHomeViewModel dataBundleHomeViewModel = (DataBundleHomeViewModel) buyBundleHomePageActivity.l();
                                ArrayList transType = C1850q.e(TransType.TRANS_TYPE_BUNDLE);
                                dataBundleHomeViewModel.getClass();
                                Intrinsics.checkNotNullParameter(transType, "transType");
                                AbstractC0780y.m(V.h(dataBundleHomeViewModel), null, null, new B(dataBundleHomeViewModel.f31796C, C0.G.p("Pref_", "queryTransactionLinkVM_" + transType, "_", BaseApplication.getCountryLocale()), null, transType), 3);
                            }
                            break;
                        case 3:
                            KProperty[] kPropertyArr4 = BuyBundleHomePageActivity.f31740t0;
                            ((C1747b) buyBundleHomePageActivity.f31754o.getValue()).d(1);
                            break;
                        default:
                            KProperty[] kPropertyArr5 = BuyBundleHomePageActivity.f31740t0;
                            ((C1747b) buyBundleHomePageActivity.f31754o.getValue()).d(0);
                            break;
                    }
                }
            });
        }
        C0599o c0599o5 = (C0599o) this.f27334c;
        TabLayout tabLayout = c0599o5 != null ? c0599o5.f8430e : null;
        Intrinsics.e(tabLayout);
        C0599o c0599o6 = (C0599o) this.f27334c;
        WrapContentViewPager2 wrapContentViewPager2 = c0599o6 != null ? c0599o6.f8431f : null;
        Intrinsics.e(wrapContentViewPager2);
        new TabLayoutMediator(tabLayout, wrapContentViewPager2.getViewPager2(), true, new p068ec.c(this, 2)).attach();
        C0599o c0599o7 = (C0599o) this.f27334c;
        if (c0599o7 != null) {
            WrapContentViewPager2 wrapContentViewPager3 = c0599o7.f8431f;
            j callback = this.f31746M;
            Intrinsics.checkNotNullParameter(callback, "callback");
            wrapContentViewPager3.viewPager2.registerOnPageChangeCallback(callback);
        }
        C0599o c0599o8 = (C0599o) this.f27334c;
        if (c0599o8 != null && (contactIv = c0599o8.f8429d.getContactIv()) != null) {
            final int i13 = 0;
            contactIv.setOnClickListener(new View.OnClickListener(this) { // from class: ec.e

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BuyBundleHomePageActivity f36254b;

                {
                    this.f36254b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BuyBundleHomePageActivity buyBundleHomePageActivity = this.f36254b;
                    switch (i13) {
                        case 0:
                            KProperty[] kPropertyArr = BuyBundleHomePageActivity.f31740t0;
                            ARouter.getInstance().build("/contact/all").withString("orderType", "0").withString("transType", TransType.TRANS_TYPE_BUNDLE).navigation(buyBundleHomePageActivity, buyBundleHomePageActivity.f31744H);
                            n0.g().q(new ClickEvent("DataBundle_Homepage_Contact_Click"));
                            break;
                        case 1:
                            KProperty[] kPropertyArr2 = BuyBundleHomePageActivity.f31740t0;
                            buyBundleHomePageActivity.getOnBackPressedDispatcher().d();
                            break;
                        case 2:
                            KProperty[] kPropertyArr3 = BuyBundleHomePageActivity.f31740t0;
                            if (!BaseApplication.hasLogin()) {
                                i0.K(null, null);
                            } else {
                                DataBundleHomeViewModel dataBundleHomeViewModel = (DataBundleHomeViewModel) buyBundleHomePageActivity.l();
                                ArrayList transType = C1850q.e(TransType.TRANS_TYPE_BUNDLE);
                                dataBundleHomeViewModel.getClass();
                                Intrinsics.checkNotNullParameter(transType, "transType");
                                AbstractC0780y.m(V.h(dataBundleHomeViewModel), null, null, new B(dataBundleHomeViewModel.f31796C, C0.G.p("Pref_", "queryTransactionLinkVM_" + transType, "_", BaseApplication.getCountryLocale()), null, transType), 3);
                            }
                            break;
                        case 3:
                            KProperty[] kPropertyArr4 = BuyBundleHomePageActivity.f31740t0;
                            ((C1747b) buyBundleHomePageActivity.f31754o.getValue()).d(1);
                            break;
                        default:
                            KProperty[] kPropertyArr5 = BuyBundleHomePageActivity.f31740t0;
                            ((C1747b) buyBundleHomePageActivity.f31754o.getValue()).d(0);
                            break;
                    }
                }
            });
        }
        C0599o c0599o9 = (C0599o) this.f27334c;
        if (c0599o9 != null) {
            c0599o9.t.setOnTouchListener(new ViewOnTouchListenerC0223c(this, 7));
        }
        C0599o c0599o10 = (C0599o) this.f27334c;
        if (c0599o10 != null) {
            c0599o10.f8429d.setOnNumberInputListener(new Oe.a(this, 19));
        }
        try {
            String string = getString(k.ad_data_bundle_homepage_pop_slot_id);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            InterstitialAdView.show$default(new InterstitialAdView(string, 0, new Ab.k(20), new org.sufficientlysecure.htmltextview.h(9)), this, null, 2, null);
            ViewBinding viewBinding = this.f27334c;
            C0599o c0599o11 = (C0599o) viewBinding;
            if (c0599o11 != null) {
                C0599o c0599o12 = (C0599o) viewBinding;
                c0599o11.f8438w.setAdListener(new X(this, c0599o12 != null ? c0599o12.f8438w : null));
            }
        } catch (Exception unused) {
        }
        C0599o c0599o13 = (C0599o) this.f27334c;
        if (c0599o13 != null) {
            c0599o13.f8436p.setOnItemClickListener(new p068ec.a(this, 4));
        }
        if (TextUtils.isEmpty(this.f31742B)) {
            return;
        }
        n0.g().w("PPay_DataBundle_Channel", F.b(new Pair("biller_channel", this.f31742B)));
    }

    public final int t(String str) {
        MobileWalletResp.MobileWallet mobileWallet;
        ArrayList arrayList = this.f31758r0;
        if (arrayList.isEmpty()) {
            return -1;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                mobileWallet = null;
                break;
            }
            mobileWallet = (MobileWalletResp.MobileWallet) arrayList.get(i7);
            if ((str != null && str.equalsIgnoreCase(mobileWallet.operatorName)) || (str != null && str.equalsIgnoreCase(mobileWallet.operatorCode))) {
                mobileWallet.indexInList = i7;
                break;
            }
            i7++;
        }
        if (mobileWallet == null) {
            mobileWallet = (MobileWalletResp.MobileWallet) arrayList.get(0);
            mobileWallet.indexInList = 0;
        }
        this.f31747Q.setValue(this, f31740t0[0], mobileWallet);
        MobileWalletResp.MobileWallet mobileWalletR = r();
        if (mobileWalletR != null && mobileWalletR.status != 1) {
            x(mobileWalletR);
        }
        MobileWalletResp.MobileWallet mobileWalletR2 = r();
        if (mobileWalletR2 != null) {
            return mobileWalletR2.indexInList;
        }
        return 0;
    }

    public final void u() {
        C0599o c0599o = (C0599o) this.f27334c;
        if (c0599o != null) {
            c0599o.t.post(new g(this, 0));
        }
    }

    public final void v(String str) {
        MobileWalletResp.MobileWallet mobileWalletR;
        ModelMobileWithIconInputLayout modelMobileWithIconInputLayout;
        if (i0.W(this)) {
            if (TextUtils.isEmpty(str)) {
                str = SPUtils.getInstance().getString("TOP_UP_AIRTIME_SELECTED_MOBILE_OPERATOR_CODE", "");
            }
            int iT = t(str);
            this.f31743C = iT;
            if (iT == -1 || (mobileWalletR = r()) == null) {
                return;
            }
            C0599o c0599o = (C0599o) this.f27334c;
            if (c0599o != null && (modelMobileWithIconInputLayout = c0599o.f8429d) != null) {
                modelMobileWithIconInputLayout.updateSelectItem(mobileWalletR);
            }
            z(mobileWalletR, this.f31743C);
        }
    }

    public final void w() {
        ModelMobileWithIconInputLayout modelMobileWithIconInputLayout;
        ModelMobileWithIconInputLayout modelMobileWithIconInputLayout2;
        ModelMobileWithIconInputLayout modelMobileWithIconInputLayout3;
        AppCompatAutoCompleteTextView phoneNumberEdit;
        String strSubstring = null;
        if (TextUtils.isEmpty(this.f31761w)) {
            User user = this.f31748X;
            if (user == null) {
                Intrinsics.n("mUser");
                throw null;
            }
            String phoneNumber = user.getPhoneNumber();
            if (!TextUtils.isEmpty(phoneNumber)) {
                C0599o c0599o = (C0599o) this.f27334c;
                if (c0599o != null && (modelMobileWithIconInputLayout3 = c0599o.f8429d) != null && (phoneNumberEdit = modelMobileWithIconInputLayout3.getPhoneNumberEdit()) != null) {
                    phoneNumberEdit.clearFocus();
                }
                if (i0.d0(phoneNumber)) {
                    Intrinsics.e(phoneNumber);
                    phoneNumber = phoneNumber.substring(r0.K().length());
                    Intrinsics.checkNotNullExpressionValue(phoneNumber, "substring(...)");
                }
                strSubstring = phoneNumber;
                this.f31761w = strSubstring != null ? strSubstring : "";
            }
        } else {
            if (i0.d0(this.f31761w)) {
                strSubstring = this.f31761w.substring(r0.K().length());
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            }
            this.f31761w = strSubstring != null ? strSubstring : "";
        }
        if (TextUtils.isEmpty(strSubstring)) {
            return;
        }
        C0599o c0599o2 = (C0599o) this.f27334c;
        if (c0599o2 != null && (modelMobileWithIconInputLayout2 = c0599o2.f8429d) != null) {
            modelMobileWithIconInputLayout2.setPhoneNumber(strSubstring);
        }
        C0599o c0599o3 = (C0599o) this.f27334c;
        if (c0599o3 == null || (modelMobileWithIconInputLayout = c0599o3.f8429d) == null) {
            return;
        }
        modelMobileWithIconInputLayout.showContactIv(true, true);
    }

    public final void x(MobileWalletResp.MobileWallet mobileWallet) {
        y yVar = new y(this);
        yVar.f31323a = getString(Pd.f.qt_service_temporarily_unavailable_2, mobileWallet.operatorName);
        yVar.h();
    }

    public final void y(boolean z3) {
        C0599o c0599o = (C0599o) this.f27334c;
        if (c0599o != null) {
            c0599o.f8433i.setVisibility(z3 ? 0 : 8);
        }
        C0599o c0599o2 = (C0599o) this.f27334c;
        if (c0599o2 != null) {
            c0599o2.f8432g.setVisibility(z3 ? 0 : 8);
        }
    }

    public final void z(MobileWalletResp.MobileWallet mobileWallet, int i7) {
        C1747b c1747b = (C1747b) this.f31754o.getValue();
        String str = mobileWallet.operatorCode;
        c1747b.getClass();
        if (str != null && str.length() != 0 && !Intrinsics.c(c1747b.f37497e, str)) {
            c1747b.f37497e = str;
            c1747b.d(1);
        }
        if (mobileWallet.operatorCode != null) {
            DataBundleHomeViewModel dataBundleHomeViewModel = (DataBundleHomeViewModel) l();
            String operatorCode = mobileWallet.operatorCode;
            Intrinsics.checkNotNullExpressionValue(operatorCode, "operatorCode");
            dataBundleHomeViewModel.h(operatorCode);
            DataBundleHomeViewModel dataBundleHomeViewModel2 = (DataBundleHomeViewModel) l();
            String operatorCode2 = mobileWallet.operatorCode;
            Intrinsics.checkNotNullExpressionValue(operatorCode2, "operatorCode");
            dataBundleHomeViewModel2.g(i7, operatorCode2, false);
            ModelDataPlanFlashSaleItem modelDataPlanFlashSaleItem = this.f31750Z;
            if (modelDataPlanFlashSaleItem != null) {
                modelDataPlanFlashSaleItem.h(mobileWallet.operatorCode);
            }
            C0599o c0599o = (C0599o) this.f27334c;
            if (c0599o != null) {
                c0599o.f8436p.d(mobileWallet.operatorCode, mobileWallet.operatorName);
            }
            y(true);
        }
    }
}
