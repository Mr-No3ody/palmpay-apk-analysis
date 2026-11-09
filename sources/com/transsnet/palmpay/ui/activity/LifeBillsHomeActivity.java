package com.transsnet.palmpay.ui.activity;

import Ac.e;
import Ac.f;
import Bc.h;
import C9.C0142i;
import Da.g;
import L6.b;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.android.material.appbar.AppBarLayout;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.apm.network.NQEManager;
import com.palmpay.lib.apm.network.bean.NQEQualityBean;
import com.palmpay.lib.ui.titlebar.PpTitleBar;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeView;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.adsdk.widgets.banner.BannerAdView;
import com.transsnet.palmpay.common.export.view.NetworkNotConnectView;
import com.transsnet.palmpay.core.base.BaseMvvmVBActivity;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.rsp.GetMenuBillPaymentGroup;
import com.transsnet.palmpay.core.bean.rsp.LifeBillHomeGroupBean;
import com.transsnet.palmpay.core.ui.widget.CustomFloatingView;
import com.transsnet.palmpay.managemoney.ui.view.c;
import com.transsnet.palmpay.viewmodule.LifeBillsHomeViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.Nullable;
import p052da.ViewOnClickListenerC1649v;
import p054dd.q;
import p068ec.d;
import p102ge.A;
import p102ge.B;
import p102ge.C;
import p102ge.D;
import p102ge.y;
import p328ve.k;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/app/life_bill_payment_page")
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/transsnet/palmpay/ui/activity/LifeBillsHomeActivity;", "Lcom/transsnet/palmpay/core/base/BaseMvvmVBActivity;", "Lcom/transsnet/palmpay/viewmodule/LifeBillsHomeViewModel;", "LBc/h;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "messageEvent", "", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLifeBillsHomeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifeBillsHomeActivity.kt\ncom/transsnet/palmpay/ui/activity/LifeBillsHomeActivity\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,486:1\n115#2,8:487\n145#2:495\n115#2,8:496\n145#2:504\n115#2,8:505\n145#2:513\n1869#3,2:514\n*S KotlinDebug\n*F\n+ 1 LifeBillsHomeActivity.kt\ncom/transsnet/palmpay/ui/activity/LifeBillsHomeActivity\n*L\n262#1:487,8\n262#1:495\n268#1:496,8\n268#1:504\n278#1:505,8\n278#1:513\n363#1:514,2\n*E\n"})
public final class LifeBillsHomeActivity extends BaseMvvmVBActivity<LifeBillsHomeViewModel, h> {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f34485A = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public NetworkNotConnectView f34491j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f34486d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f34487e = C2131j.b(new c(13));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f34488f = C2131j.b(new c(14));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f34489g = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f34490i = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f34492o = C2131j.b(new d(this, 2));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f34493p = "";
    public String t = "0";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f34494v = C2131j.b(new c(15));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ViewOnClickListenerC1649v f34495w = new ViewOnClickListenerC1649v(this, 4);

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

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final int getNetworkCheckAvailable() {
        return NQEManager.INSTANCE.getNetworkState() == 1 ? 0 : 1;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0006  */
    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void initData() {
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("transparentJson");
            String stringExtra2 = intent.getStringExtra("visitSeconds");
            String stringExtra3 = intent.getStringExtra("originPath");
            if (stringExtra != null && stringExtra2 != null && stringExtra3 != null) {
                new Handler(Looper.getMainLooper()).postDelayed(new g(this, stringExtra, stringExtra2, stringExtra3, 18), 1000L);
            }
        }
        l lVar = ((LifeBillsHomeViewModel) l()).f35375e;
        if (lVar != null) {
            lVar.e(this, new q(new A(this, 0), 3));
        }
        l lVar2 = ((LifeBillsHomeViewModel) l()).f35376f;
        if (lVar2 != null) {
            lVar2.e(this, new q(new A(this, 1), 3));
        }
        l lVar3 = ((LifeBillsHomeViewModel) l()).f35377g;
        if (lVar3 != null) {
            lVar3.e(this, new q(new A(this, 2), 3));
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void initStatusBar() {
        initStatusBar(getColor(b.ppColorBackgroundLight));
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity
    public final ViewBinding m() {
        View viewM;
        View viewInflate = getLayoutInflater().inflate(f.main_activity_life_bills, (ViewGroup) null, false);
        int i7 = e.adBannerLifeHome;
        BannerAdView bannerAdView = (BannerAdView) p059e1.a.m(i7, viewInflate);
        if (bannerAdView != null) {
            i7 = e.adHome1;
            SingleAdView singleAdView = (SingleAdView) p059e1.a.m(i7, viewInflate);
            if (singleAdView != null) {
                i7 = e.adHome2;
                SingleAdView singleAdView2 = (SingleAdView) p059e1.a.m(i7, viewInflate);
                if (singleAdView2 != null) {
                    i7 = e.adHome3;
                    SingleAdView singleAdView3 = (SingleAdView) p059e1.a.m(i7, viewInflate);
                    if (singleAdView3 != null) {
                        i7 = e.barrier_right;
                        if (((Barrier) p059e1.a.m(i7, viewInflate)) != null) {
                            i7 = e.bundle_app_bar;
                            if (((AppBarLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                i7 = e.flBody;
                                FrameLayout frameLayout = (FrameLayout) p059e1.a.m(i7, viewInflate);
                                if (frameLayout != null) {
                                    i7 = e.layout_favorites;
                                    if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                        i7 = e.lifeMenu;
                                        RecyclerView recyclerView = (RecyclerView) p059e1.a.m(i7, viewInflate);
                                        if (recyclerView != null && (viewM = p059e1.a.m((i7 = e.ma_biller_search_item), viewInflate)) != null) {
                                            i7 = e.mal_new_user_banner;
                                            if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                                i7 = e.malb_bill_save_banner;
                                                if (((ConstraintLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                                    i7 = e.malb_recommend_item_area;
                                                    if (((LinearLayout) p059e1.a.m(i7, viewInflate)) != null) {
                                                        i7 = e.menuList;
                                                        RecyclerView recyclerView2 = (RecyclerView) p059e1.a.m(i7, viewInflate);
                                                        if (recyclerView2 != null) {
                                                            i7 = e.textAd;
                                                            MarqueeView marqueeView = (MarqueeView) p059e1.a.m(i7, viewInflate);
                                                            if (marqueeView != null) {
                                                                i7 = e.titleBar;
                                                                if (((PpTitleBar) p059e1.a.m(i7, viewInflate)) != null) {
                                                                    i7 = e.tv_edit_favourites;
                                                                    if (((IconicsTextView) p059e1.a.m(i7, viewInflate)) != null) {
                                                                        h hVar = new h((LinearLayout) viewInflate, bannerAdView, singleAdView, singleAdView2, singleAdView3, frameLayout, recyclerView, viewM, recyclerView2, marqueeView);
                                                                        Intrinsics.checkNotNullExpressionValue(hVar, "inflate(...)");
                                                                        return hVar;
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

    public final CustomFloatingView n() {
        return (CustomFloatingView) this.f34492o.getValue();
    }

    public final void o(ArrayList arrayList) {
        ArrayList arrayList2 = this.f34489g;
        arrayList2.clear();
        ArrayList arrayList3 = this.f34490i;
        arrayList3.clear();
        this.f34486d = arrayList;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            GetMenuBillPaymentGroup getMenuBillPaymentGroup = (GetMenuBillPaymentGroup) it.next();
            if ("Liked".equals(getMenuBillPaymentGroup.categoryName)) {
                arrayList3.addAll(getMenuBillPaymentGroup.funMenus);
            } else {
                arrayList2.add(new LifeBillHomeGroupBean(getMenuBillPaymentGroup.categoryName, false, 2, null));
                arrayList2.addAll(getMenuBillPaymentGroup.funMenus);
            }
        }
        ((p328ve.e) this.f34487e.getValue()).setList(arrayList3);
        ((k) this.f34488f.getValue()).setList(arrayList2);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmVBActivity, com.transsnet.palmpay.core.base.BaseActivity, androidx.appcompat.app.AbstractActivityC0837o, androidx.fragment.app.E, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void onNetworkStateChanged(int i7, int i10, NQEQualityBean nQEQualityBean) {
        super.onNetworkStateChanged(i7, i10, nQEQualityBean);
        p();
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onPause() {
        super.onPause();
        Object value = this.f34494v.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((ValueAnimator) value).end();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable MessageEvent messageEvent) {
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity, androidx.fragment.app.E, android.app.Activity
    public final void onResume() {
        super.onResume();
        p();
    }

    public final void p() {
        try {
            if (!NQEManager.INSTANCE.isNetworkOffline()) {
                NetworkNotConnectView networkNotConnectView = this.f34491j;
                if (networkNotConnectView != null) {
                    p220oa.h.s(networkNotConnectView, false);
                    ((LifeBillsHomeViewModel) l()).f();
                    ((LifeBillsHomeViewModel) l()).e();
                    ((LifeBillsHomeViewModel) l()).d();
                    return;
                }
                return;
            }
            NetworkNotConnectView networkNotConnectView2 = this.f34491j;
            if (networkNotConnectView2 != null) {
                p220oa.h.s(networkNotConnectView2, true);
                return;
            }
            NetworkNotConnectView networkNotConnectView3 = new NetworkNotConnectView(this, null, 6, 0);
            networkNotConnectView3.setMessage(getString(p025ba.k.core_no_network) + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + getString(p025ba.k.core_no_network_common_tips));
            networkNotConnectView3.setRefreshListener(new C0142i(this, 18));
            networkNotConnectView3.f27122b = true;
            this.f34491j = networkNotConnectView3;
            h hVar = (h) this.f27334c;
            if (hVar != null) {
                hVar.f718f.addView(networkNotConnectView3, new ViewGroup.LayoutParams(-1, -1));
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseActivity
    public final void processLogic(Bundle bundle) {
        ((LifeBillsHomeViewModel) l()).f();
        ((LifeBillsHomeViewModel) l()).e();
        ((LifeBillsHomeViewModel) l()).d();
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmActivity, com.transsnet.palmpay.core.base.BaseActivity
    public final void setupView() {
        super.setupView();
        org.greenrobot.eventbus.c.b().j(this);
        h hVar = (h) this.f27334c;
        if (hVar != null) {
            hVar.f719g.setLayoutManager(new GridLayoutManager(this, 4));
        }
        h hVar2 = (h) this.f27334c;
        t tVar = this.f34487e;
        if (hVar2 != null) {
            hVar2.f719g.setAdapter((p328ve.e) tVar.getValue());
        }
        h hVar3 = (h) this.f27334c;
        if (hVar3 != null) {
            hVar3.f719g.addItemDecoration(new B());
        }
        ((p328ve.e) tVar.getValue()).setOnItemClickListener(new y(this, 0));
        h hVar4 = (h) this.f27334c;
        if (hVar4 != null) {
            RecyclerView recyclerView = hVar4.f721j;
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
            gridLayoutManager.setSpanSizeLookup(new C(this));
            recyclerView.setLayoutManager(gridLayoutManager);
        }
        h hVar5 = (h) this.f27334c;
        t tVar2 = this.f34488f;
        if (hVar5 != null) {
            hVar5.f721j.setAdapter((k) tVar2.getValue());
        }
        h hVar6 = (h) this.f27334c;
        if (hVar6 != null) {
            hVar6.f721j.addItemDecoration(new D());
        }
        ((k) tVar2.getValue()).setOnItemClickListener(new y(this, 2));
        h hVar7 = (h) this.f27334c;
        if (hVar7 != null) {
            hVar7.f717e.setAdListener(new Ab.k(21));
        }
        View viewFindViewById = findViewById(e.malb_bill_save_banner);
        ViewOnClickListenerC1649v viewOnClickListenerC1649v = this.f34495w;
        viewFindViewById.setOnClickListener(viewOnClickListenerC1649v);
        findViewById(e.tv_edit_favourites).setOnClickListener(viewOnClickListenerC1649v);
        findViewById(e.ma_biller_search_item).setOnClickListener(viewOnClickListenerC1649v);
        h hVar8 = (h) this.f27334c;
        if (hVar8 != null) {
            hVar8.f715c.setAdListener(new Ab.k(22));
        }
        h hVar9 = (h) this.f27334c;
        if (hVar9 != null) {
            hVar9.f716d.setAdListener(new Ab.k(23));
        }
        h hVar10 = (h) this.f27334c;
        org.chromium.support_lib_boundary.util.b.d(hVar10 != null ? hVar10.f714b : null, Boolean.TRUE);
    }
}
