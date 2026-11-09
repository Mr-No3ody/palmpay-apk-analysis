package com.transsnet.palmpay.ui.fragment;

import Ac.f;
import Ad.C0058e;
import B6.RunnableC0085g;
import Bc.C0107d;
import Bc.p;
import C0.G;
import Ce.C0177t;
import Ce.D;
import Ce.H;
import Ce.RunnableC0178u;
import Ce.ViewOnAttachStateChangeListenerC0160b;
import Fe.I;
import Ie.c;
import Ie.m;
import Ie.n;
import Ie.q;
import Je.d;
import Je.j;
import Je.k;
import Ke.h;
import Me.e;
import Me.i;
import Pa.AbstractC0508e;
import Pa.C0525w;
import Pa.T;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Wf.AbstractC0780y;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.speech.tts.TextToSpeech;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.camera.core.impl.utils.executor.g;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.P;
import androidx.fragment.app.E;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.C1212w;
import androidx.lifecycle.EnumC1204n;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.V;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.horcrux.svg.d0;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.adsdk.BatchAdManager;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeViewV2;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.adsdk.widgets.banner.BannerAdView;
import com.transsnet.adsdk.widgets.banner.bannerview.BannerViewPager;
import com.transsnet.adsdk.widgets.banner.bannerview.BaseBannerAdapter;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.CommonBeanResult;
import com.transsnet.palmpay.core.bean.CommonResult;
import com.transsnet.palmpay.core.bean.HomePageMenuData;
import com.transsnet.palmpay.core.bean.message.GetMsgRsp;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.message.MsgContentBean;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.core.bean.rsp.ClipboardMatchInfoResp;
import com.transsnet.palmpay.core.bean.rsp.UnReadMsgCntRsp;
import com.transsnet.palmpay.core.init.PpPerfTrace;
import com.transsnet.palmpay.core.ui.widget.DragView;
import com.transsnet.palmpay.core.util.statistic.ViewEvent;
import com.transsnet.palmpay.custom_view.async.AsyncViewStub;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout;
import com.transsnet.palmpay.custom_view.utils.CommonExtKt;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.PalmZoneTaskBean;
import com.transsnet.palmpay.main.export.bean.rsp.AssetBannerBean;
import com.transsnet.palmpay.main.export.bean.rsp.GetHomeCommonRsp;
import com.transsnet.palmpay.main.export.bean.rsp.HomeCouponAreaRsp;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardTasksRsp;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsCenterInfo;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsCenterRsp;
import com.transsnet.palmpay.main.export.bean.rsp.HomeRewardsStatisticsExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.HomeTaskCenterRsp;
import com.transsnet.palmpay.main.export.bean.rsp.HomeWealthItem;
import com.transsnet.palmpay.main.export.bean.rsp.HomeWealthProductRsp;
import com.transsnet.palmpay.main.export.bean.rsp.NewExclusiveDataBean;
import com.transsnet.palmpay.main.export.bean.rsp.QueryHomeAccountInfoRsp;
import com.transsnet.palmpay.main.export.bean.rsp.TaskCenterRewardResultBean;
import com.transsnet.palmpay.main.export.bean.rsp.WelcomeCouponBean;
import com.transsnet.palmpay.main.export.bean.rsp.WelcomeCouponData;
import com.transsnet.palmpay.ui.activity.HomeActivity;
import com.transsnet.palmpay.ui.fragment.HomeFragmentHomeTab;
import com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView;
import com.transsnet.palmpay.ui.view.HomeScrollView;
import com.transsnet.palmpay.util.MainAdUtils;
import com.transsnet.palmpay.util.TimeUtils;
import com.transsnet.palmpay.util.ToastUtils;
import com.zhpan.indicator.IndicatorView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.chromium.support_lib_boundary.util.b;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p189me.jessyan.autosize.internal.CancelAdapt;
import p355xf.C2131j;
import p355xf.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\u0011B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/ui/fragment/HomeFragmentHomeTab;", "Lcom/transsnet/palmpay/core/base/BaseMVPFragment;", "LFe/I;", "Lcom/transsnet/palmpay/ui/mvp/contract/HomeFragmentContract$IView;", "Lme/jessyan/autosize/internal/CancelAdapt;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/PushMessage;", "pushMessage", "", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/PushMessage;)V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "a", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHomeFragmentHomeTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeFragmentHomeTab.kt\ncom/transsnet/palmpay/ui/fragment/HomeFragmentHomeTab\n+ 2 PpPerfTrace.kt\ncom/transsnet/palmpay/core/init/PpPerfTrace\n+ 3 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1256:1\n50#2,5:1257\n50#2,5:1273\n629#3,11:1262\n1#4:1278\n*S KotlinDebug\n*F\n+ 1 HomeFragmentHomeTab.kt\ncom/transsnet/palmpay/ui/fragment/HomeFragmentHomeTab\n*L\n397#1:1257,5\n741#1:1273,5\n475#1:1262,11\n*E\n"})
public final class HomeFragmentHomeTab extends BaseMVPFragment<I> implements HomeFragmentContract$IView, CancelAdapt, ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public static final /* synthetic */ int f35093A0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f35094A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public SingleAdView f35095B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public SingleAdView f35096C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public DragView f35097H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public BannerAdView f35098L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public SingleAdView f35099M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public MarqueeViewV2 f35100Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public h f35101X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public e f35102Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public top.zibin.luban.io.a f35103Z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f35104j;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public i f35105k0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f35106o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f35107p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public j f35108p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Ee.a f35109q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public d f35110r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final t f35111s0 = C2131j.b(new Aa.a(15));
    public final t t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public top.zibin.luban.io.a f35112t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public k f35113u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final t f35114v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public Ie.h f35115v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t f35116w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public m f35117w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public c f35118x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public n f35119y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final t f35120z0;

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

    public HomeFragmentHomeTab() {
        final int i7 = 4;
        this.f35106o = C2131j.b(new Function0(this) { // from class: Ce.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeFragmentHomeTab f1528b;

            {
                this.f1528b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HomeFragmentHomeTab homeFragmentHomeTab = this.f1528b;
                switch (i7) {
                    case 0:
                        int i10 = HomeFragmentHomeTab.f35093A0;
                        View view = homeFragmentHomeTab.f27318b;
                        if (view != null) {
                            return (VerticalSwipeRefreshLayout) view.findViewById(Ac.e.refreshLayout);
                        }
                        return null;
                    case 1:
                        int i11 = HomeFragmentHomeTab.f35093A0;
                        View view2 = homeFragmentHomeTab.f27318b;
                        if (view2 != null) {
                            return (ImageView) view2.findViewById(Ac.e.ivMessageHolder);
                        }
                        return null;
                    case 2:
                        int i12 = HomeFragmentHomeTab.f35093A0;
                        View view3 = homeFragmentHomeTab.f27318b;
                        if (view3 != null) {
                            return view3.findViewById(Ac.e.viewMessageHolder);
                        }
                        return null;
                    case 3:
                        int i13 = HomeFragmentHomeTab.f35093A0;
                        return new RunnableC0178u(homeFragmentHomeTab, 0);
                    case 4:
                        int i14 = HomeFragmentHomeTab.f35093A0;
                        View view4 = homeFragmentHomeTab.f27318b;
                        if (view4 != null) {
                            return (AsyncViewStub) view4.findViewById(Ac.e.asyncTopAdView);
                        }
                        return null;
                    default:
                        int i15 = HomeFragmentHomeTab.f35093A0;
                        View view5 = homeFragmentHomeTab.f27318b;
                        if (view5 != null) {
                            return (HomeScrollView) view5.findViewById(Ac.e.ch_scrollview);
                        }
                        return null;
                }
            }
        });
        final int i10 = 5;
        this.f35107p = C2131j.b(new Function0(this) { // from class: Ce.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeFragmentHomeTab f1528b;

            {
                this.f1528b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HomeFragmentHomeTab homeFragmentHomeTab = this.f1528b;
                switch (i10) {
                    case 0:
                        int i11 = HomeFragmentHomeTab.f35093A0;
                        View view = homeFragmentHomeTab.f27318b;
                        if (view != null) {
                            return (VerticalSwipeRefreshLayout) view.findViewById(Ac.e.refreshLayout);
                        }
                        return null;
                    case 1:
                        int i12 = HomeFragmentHomeTab.f35093A0;
                        View view2 = homeFragmentHomeTab.f27318b;
                        if (view2 != null) {
                            return (ImageView) view2.findViewById(Ac.e.ivMessageHolder);
                        }
                        return null;
                    case 2:
                        int i13 = HomeFragmentHomeTab.f35093A0;
                        View view3 = homeFragmentHomeTab.f27318b;
                        if (view3 != null) {
                            return view3.findViewById(Ac.e.viewMessageHolder);
                        }
                        return null;
                    case 3:
                        int i14 = HomeFragmentHomeTab.f35093A0;
                        return new RunnableC0178u(homeFragmentHomeTab, 0);
                    case 4:
                        int i15 = HomeFragmentHomeTab.f35093A0;
                        View view4 = homeFragmentHomeTab.f27318b;
                        if (view4 != null) {
                            return (AsyncViewStub) view4.findViewById(Ac.e.asyncTopAdView);
                        }
                        return null;
                    default:
                        int i16 = HomeFragmentHomeTab.f35093A0;
                        View view5 = homeFragmentHomeTab.f27318b;
                        if (view5 != null) {
                            return (HomeScrollView) view5.findViewById(Ac.e.ch_scrollview);
                        }
                        return null;
                }
            }
        });
        final int i11 = 0;
        this.t = C2131j.b(new Function0(this) { // from class: Ce.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeFragmentHomeTab f1528b;

            {
                this.f1528b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HomeFragmentHomeTab homeFragmentHomeTab = this.f1528b;
                switch (i11) {
                    case 0:
                        int i12 = HomeFragmentHomeTab.f35093A0;
                        View view = homeFragmentHomeTab.f27318b;
                        if (view != null) {
                            return (VerticalSwipeRefreshLayout) view.findViewById(Ac.e.refreshLayout);
                        }
                        return null;
                    case 1:
                        int i13 = HomeFragmentHomeTab.f35093A0;
                        View view2 = homeFragmentHomeTab.f27318b;
                        if (view2 != null) {
                            return (ImageView) view2.findViewById(Ac.e.ivMessageHolder);
                        }
                        return null;
                    case 2:
                        int i14 = HomeFragmentHomeTab.f35093A0;
                        View view3 = homeFragmentHomeTab.f27318b;
                        if (view3 != null) {
                            return view3.findViewById(Ac.e.viewMessageHolder);
                        }
                        return null;
                    case 3:
                        int i15 = HomeFragmentHomeTab.f35093A0;
                        return new RunnableC0178u(homeFragmentHomeTab, 0);
                    case 4:
                        int i16 = HomeFragmentHomeTab.f35093A0;
                        View view4 = homeFragmentHomeTab.f27318b;
                        if (view4 != null) {
                            return (AsyncViewStub) view4.findViewById(Ac.e.asyncTopAdView);
                        }
                        return null;
                    default:
                        int i17 = HomeFragmentHomeTab.f35093A0;
                        View view5 = homeFragmentHomeTab.f27318b;
                        if (view5 != null) {
                            return (HomeScrollView) view5.findViewById(Ac.e.ch_scrollview);
                        }
                        return null;
                }
            }
        });
        final int i12 = 1;
        this.f35114v = C2131j.b(new Function0(this) { // from class: Ce.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeFragmentHomeTab f1528b;

            {
                this.f1528b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HomeFragmentHomeTab homeFragmentHomeTab = this.f1528b;
                switch (i12) {
                    case 0:
                        int i13 = HomeFragmentHomeTab.f35093A0;
                        View view = homeFragmentHomeTab.f27318b;
                        if (view != null) {
                            return (VerticalSwipeRefreshLayout) view.findViewById(Ac.e.refreshLayout);
                        }
                        return null;
                    case 1:
                        int i14 = HomeFragmentHomeTab.f35093A0;
                        View view2 = homeFragmentHomeTab.f27318b;
                        if (view2 != null) {
                            return (ImageView) view2.findViewById(Ac.e.ivMessageHolder);
                        }
                        return null;
                    case 2:
                        int i15 = HomeFragmentHomeTab.f35093A0;
                        View view3 = homeFragmentHomeTab.f27318b;
                        if (view3 != null) {
                            return view3.findViewById(Ac.e.viewMessageHolder);
                        }
                        return null;
                    case 3:
                        int i16 = HomeFragmentHomeTab.f35093A0;
                        return new RunnableC0178u(homeFragmentHomeTab, 0);
                    case 4:
                        int i17 = HomeFragmentHomeTab.f35093A0;
                        View view4 = homeFragmentHomeTab.f27318b;
                        if (view4 != null) {
                            return (AsyncViewStub) view4.findViewById(Ac.e.asyncTopAdView);
                        }
                        return null;
                    default:
                        int i18 = HomeFragmentHomeTab.f35093A0;
                        View view5 = homeFragmentHomeTab.f27318b;
                        if (view5 != null) {
                            return (HomeScrollView) view5.findViewById(Ac.e.ch_scrollview);
                        }
                        return null;
                }
            }
        });
        final int i13 = 2;
        this.f35116w = C2131j.b(new Function0(this) { // from class: Ce.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeFragmentHomeTab f1528b;

            {
                this.f1528b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HomeFragmentHomeTab homeFragmentHomeTab = this.f1528b;
                switch (i13) {
                    case 0:
                        int i14 = HomeFragmentHomeTab.f35093A0;
                        View view = homeFragmentHomeTab.f27318b;
                        if (view != null) {
                            return (VerticalSwipeRefreshLayout) view.findViewById(Ac.e.refreshLayout);
                        }
                        return null;
                    case 1:
                        int i15 = HomeFragmentHomeTab.f35093A0;
                        View view2 = homeFragmentHomeTab.f27318b;
                        if (view2 != null) {
                            return (ImageView) view2.findViewById(Ac.e.ivMessageHolder);
                        }
                        return null;
                    case 2:
                        int i16 = HomeFragmentHomeTab.f35093A0;
                        View view3 = homeFragmentHomeTab.f27318b;
                        if (view3 != null) {
                            return view3.findViewById(Ac.e.viewMessageHolder);
                        }
                        return null;
                    case 3:
                        int i17 = HomeFragmentHomeTab.f35093A0;
                        return new RunnableC0178u(homeFragmentHomeTab, 0);
                    case 4:
                        int i18 = HomeFragmentHomeTab.f35093A0;
                        View view4 = homeFragmentHomeTab.f27318b;
                        if (view4 != null) {
                            return (AsyncViewStub) view4.findViewById(Ac.e.asyncTopAdView);
                        }
                        return null;
                    default:
                        int i19 = HomeFragmentHomeTab.f35093A0;
                        View view5 = homeFragmentHomeTab.f27318b;
                        if (view5 != null) {
                            return (HomeScrollView) view5.findViewById(Ac.e.ch_scrollview);
                        }
                        return null;
                }
            }
        });
        final int i14 = 3;
        this.f35120z0 = C2131j.b(new Function0(this) { // from class: Ce.s

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ HomeFragmentHomeTab f1528b;

            {
                this.f1528b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HomeFragmentHomeTab homeFragmentHomeTab = this.f1528b;
                switch (i14) {
                    case 0:
                        int i15 = HomeFragmentHomeTab.f35093A0;
                        View view = homeFragmentHomeTab.f27318b;
                        if (view != null) {
                            return (VerticalSwipeRefreshLayout) view.findViewById(Ac.e.refreshLayout);
                        }
                        return null;
                    case 1:
                        int i16 = HomeFragmentHomeTab.f35093A0;
                        View view2 = homeFragmentHomeTab.f27318b;
                        if (view2 != null) {
                            return (ImageView) view2.findViewById(Ac.e.ivMessageHolder);
                        }
                        return null;
                    case 2:
                        int i17 = HomeFragmentHomeTab.f35093A0;
                        View view3 = homeFragmentHomeTab.f27318b;
                        if (view3 != null) {
                            return view3.findViewById(Ac.e.viewMessageHolder);
                        }
                        return null;
                    case 3:
                        int i18 = HomeFragmentHomeTab.f35093A0;
                        return new RunnableC0178u(homeFragmentHomeTab, 0);
                    case 4:
                        int i19 = HomeFragmentHomeTab.f35093A0;
                        View view4 = homeFragmentHomeTab.f27318b;
                        if (view4 != null) {
                            return (AsyncViewStub) view4.findViewById(Ac.e.asyncTopAdView);
                        }
                        return null;
                    default:
                        int i110 = HomeFragmentHomeTab.f35093A0;
                        View view5 = homeFragmentHomeTab.f27318b;
                        if (view5 != null) {
                            return (HomeScrollView) view5.findViewById(Ac.e.ch_scrollview);
                        }
                        return null;
                }
            }
        });
    }

    public static final void u(HomeFragmentHomeTab homeFragmentHomeTab) {
        boolean zBooleanValue;
        int i7 = 1;
        PpPerfTrace.begin("Home.delayInit");
        try {
            F6.d.h(homeFragmentHomeTab.f27317a, 3, "delayInit: ");
            HomeActivity homeActivity = (HomeActivity) homeFragmentHomeTab.getActivity();
            if (homeActivity != null) {
                homeActivity.r();
            }
            boolean zHasLogin = BaseApplication.hasLogin();
            t tVar = homeFragmentHomeTab.f35116w;
            if (zHasLogin) {
                View view = (View) tVar.getValue();
                if (view != null) {
                    p220oa.h.s(view, true);
                }
                ImageView imageView = (ImageView) homeFragmentHomeTab.f35114v.getValue();
                if (imageView != null) {
                    imageView.setImageResource(Ac.d.main_home_message_center_holder);
                }
            } else {
                View view2 = (View) tVar.getValue();
                if (view2 != null) {
                    p220oa.h.c(view2);
                }
            }
            AsyncViewStub asyncViewStub = (AsyncViewStub) homeFragmentHomeTab.f27318b.findViewById(Ac.e.asyncBanner);
            boolean zBooleanValue2 = false;
            if (asyncViewStub != null) {
                HomeFragment homeFragment = (HomeFragment) homeFragmentHomeTab.getParentFragment();
                if (homeFragment != null) {
                    if (homeFragment.f35085M == null) {
                        homeFragment.f35085M = Boolean.valueOf(com.transsnet.palmpay.core.config.d.r());
                    }
                    Boolean bool = homeFragment.f35085M;
                    Intrinsics.e(bool);
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                asyncViewStub.b(zBooleanValue, new C0177t(homeFragmentHomeTab, i7));
            }
            AsyncViewStub asyncViewStub2 = (AsyncViewStub) homeFragmentHomeTab.f35106o.getValue();
            if (asyncViewStub2 != null) {
                HomeFragment homeFragment2 = (HomeFragment) homeFragmentHomeTab.getParentFragment();
                if (homeFragment2 != null) {
                    if (homeFragment2.f35085M == null) {
                        homeFragment2.f35085M = Boolean.valueOf(com.transsnet.palmpay.core.config.d.r());
                    }
                    Boolean bool2 = homeFragment2.f35085M;
                    Intrinsics.e(bool2);
                    zBooleanValue2 = bool2.booleanValue();
                }
                asyncViewStub2.b(zBooleanValue2, new C0177t(homeFragmentHomeTab, 2));
            }
            homeFragmentHomeTab.x().postDelayed(new RunnableC0178u(homeFragmentHomeTab, 5), BaseApplication.get().isOldAndroidDevice() ? 2000L : 100L);
            homeFragmentHomeTab.B();
            I i10 = (I) homeFragmentHomeTab.f27328i;
            if (i10 != null) {
                i10.b();
                Unit unit = Unit.f38893a;
            }
        } finally {
            PpPerfTrace.end();
        }
    }

    public final boolean A(HomeActivity homeActivity) {
        boolean zB;
        Regex regex = AbstractC0508e.f7078a;
        try {
            zB = p183m6.n.f39523a.instance().b("featureHomepageClipboardPopUp", false);
        } catch (Exception unused) {
            zB = false;
        }
        return zB && BaseApplication.hasLogin() && isResumed() && ((C1212w) homeActivity.getLifecycle()).f17478d.a(EnumC1204n.f17464e);
    }

    public final void B() {
        ViewStub viewStub;
        if (this.f35095B != null || (viewStub = (ViewStub) this.f27318b.findViewById(Ac.e.dragViewStub)) == null) {
            return;
        }
        viewStub.inflate();
        SingleAdView singleAdView = (SingleAdView) this.f27318b.findViewById(Ac.e.floatAdView);
        this.f35095B = singleAdView;
        if (singleAdView != null) {
            singleAdView.setSlotId(CommonViewExtKt.string(Ac.h.main_ad_home_float_ad_slot_id, viewStub.getContext()));
        }
        b.c(this.f35095B);
        if (this.f35097H == null) {
            this.f35097H = (DragView) this.f27318b.findViewById(Ac.e.ch_act_img_dragview);
            HomeScrollView homeScrollViewW = w();
            if (homeScrollViewW != null) {
                homeScrollViewW.setDragView(this.f35097H);
            }
            DragView dragView = this.f35097H;
            if (dragView != null) {
                dragView.setCallback(new Ce.I(this));
            }
        }
    }

    public final void C() {
        View view;
        if (BaseApplication.hasLogin()) {
            boolean zT = d0.t();
            Ie.h hVar = this.f35115v0;
            if (hVar != null) {
                boolean z3 = !zT;
                View view2 = hVar.f4342a;
                if (view2 != null) {
                    p220oa.h.s(view2, z3);
                }
            }
            k kVar = this.f35113u0;
            if (kVar != null) {
                kVar.a(zT);
            }
        } else {
            Ie.h hVar2 = this.f35115v0;
            if (hVar2 != null && (view = hVar2.f4342a) != null) {
                p220oa.h.s(view, true);
            }
            k kVar2 = this.f35113u0;
            if (kVar2 != null) {
                kVar2.a(false);
            }
        }
        Ie.h hVar3 = this.f35115v0;
        if (hVar3 != null) {
            if (com.palmpay.lib.apm.launchcounter.util.d.f23793a == null) {
                com.palmpay.lib.apm.launchcounter.util.d.f23793a = -1L;
            }
            Long l5 = com.palmpay.lib.apm.launchcounter.util.d.f23793a;
            Intrinsics.e(l5);
            hVar3.d(l5.longValue());
        }
    }

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        return V.f(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.main_content_home;
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView
    public final void handleClaimRewardsCenterRewardResult(CommonResult commonResult) {
        p pVar;
        BannerViewPager bannerViewPager;
        BaseBannerAdapter adapter;
        if (commonResult == null || !commonResult.isSuccess()) {
            ToastUtils.showLong(commonResult != null ? commonResult.getRespMsg() : null, new Object[0]);
        } else {
            ToastUtils.showLong("Claim successful.", new Object[0]);
            I i7 = (I) this.f27328i;
            if (i7 != null) {
                i7.queryHomeRewardTasks();
            }
        }
        top.zibin.luban.io.a aVar = this.f35103Z;
        if (aVar == null || (pVar = (p) aVar.f42646c) == null || (bannerViewPager = (BannerViewPager) pVar.f813d) == null || (adapter = bannerViewPager.getAdapter()) == null) {
            return;
        }
        adapter.notifyDataSetChanged();
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView
    public final void handleClipboardMatchInfo(String str, ClipboardMatchInfoResp clipboardMatchInfoResp) {
        if (clipboardMatchInfoResp == null) {
            return;
        }
        Integer matchType = clipboardMatchInfoResp.getMatchType();
        Context context = getContext();
        E activity = getActivity();
        HomeActivity homeActivity = activity instanceof HomeActivity ? (HomeActivity) activity : null;
        if (str == null || matchType == null || !new IntRange(1, 5, 1).contains(matchType.intValue()) || context == null || homeActivity == null || !A(homeActivity)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC0780y.m(V.f(viewLifecycleOwner), null, null, new D(this, homeActivity, context, clipboardMatchInfoResp, str, applicationContext, null), 3);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView
    public final void handleHomeAccountInfo(QueryHomeAccountInfoRsp queryHomeAccountInfoRsp) {
        Ie.h hVar = this.f35115v0;
        if (hVar != null) {
            hVar.c(false);
        }
        VerticalSwipeRefreshLayout verticalSwipeRefreshLayoutY = y();
        if (verticalSwipeRefreshLayoutY != null) {
            verticalSwipeRefreshLayoutY.setRefreshing(false);
        }
        if (queryHomeAccountInfoRsp != null) {
            long j6 = queryHomeAccountInfoRsp.totalAvailableBalance;
            String str = queryHomeAccountInfoRsp.fallbackText;
            if (j6 >= 0) {
                com.palmpay.lib.apm.launchcounter.util.d.f23793a = Long.valueOf(j6);
                com.palmpay.lib.apm.launchcounter.util.d.f23794b = str;
            }
            Ee.a aVar = this.f35109q0;
            if (aVar != null) {
                boolean z3 = queryHomeAccountInfoRsp.securityCenterRedDot;
                Bc.k kVar = (Bc.k) aVar.f2422e;
                if (kVar != null) {
                    p220oa.h.s((ImageView) kVar.f752f, z3);
                }
            }
            C();
            Ie.h hVar2 = this.f35115v0;
            if (hVar2 != null) {
                AssetBannerBean assetBannerBean = queryHomeAccountInfoRsp.assetBannerDTO;
                boolean zHasLogin = BaseApplication.hasLogin();
                View view = hVar2.f4347f;
                if (zHasLogin && assetBannerBean != null) {
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    AssetBannerBean assetBannerBean2 = hVar2.f4348g;
                    if (assetBannerBean2 == null || !assetBannerBean2.equals(assetBannerBean)) {
                        hVar2.f4348g = assetBannerBean;
                        try {
                            String str2 = i0.T() ? assetBannerBean.contentDark : assetBannerBean.content;
                            n0 n0VarG = n0.g();
                            ViewEvent viewEventAfEvt = new ViewEvent("Home_FundBanner_View").afEvt(false);
                            String str3 = assetBannerBean.businessSign;
                            String str4 = "";
                            if (str3 == null) {
                                str3 = "";
                            }
                            n0VarG.u(viewEventAfEvt.add("businessSign", str3).add(FirebaseAnalytics.Param.CONTENT, str2 == null ? "" : str2));
                            Bc.k kVar2 = hVar2.f4345d;
                            if (kVar2 != null) {
                                ((TextView) kVar2.f749c).setText(str2 != null ? CommonExtKt.formatHtmlText(str2) : null);
                            }
                            if (str2 != null) {
                                if (!StringsKt.A(str2, "font-size", false)) {
                                    str2 = null;
                                }
                                if (str2 != null) {
                                    float fA = Ie.h.a(hVar2, str2);
                                    if (kVar2 != null) {
                                        ((TextView) kVar2.f749c).setTextSize(fA);
                                    }
                                }
                            }
                            String str5 = i0.T() ? assetBannerBean.jumpContentDark : assetBannerBean.jumpContent;
                            if (kVar2 != null) {
                                ((TextView) kVar2.f750d).setText(str5 != null ? CommonExtKt.formatHtmlText(str5) : null);
                            }
                            if (str5 != null) {
                                if (!StringsKt.A(str5, "font-size", false)) {
                                    str5 = null;
                                }
                                if (str5 != null) {
                                    float fA2 = Ie.h.a(hVar2, str5);
                                    if (kVar2 != null) {
                                        ((TextView) kVar2.f750d).setTextSize(fA2);
                                    }
                                }
                            }
                            String str6 = i0.T() ? assetBannerBean.businessIconDark : assetBannerBean.businessIcon;
                            AppCompatImageView appCompatImageView = kVar2 != null ? (AppCompatImageView) kVar2.f748b : null;
                            if (str6 == null) {
                                str6 = "";
                            }
                            r0.h1(appCompatImageView, str6, r.cv_palmpay_icon_gray);
                            String str7 = i0.T() ? assetBannerBean.jumpIconDark : assetBannerBean.jumpIcon;
                            AppCompatImageView appCompatImageView2 = kVar2 != null ? (AppCompatImageView) kVar2.f752f : null;
                            if (str7 != null) {
                                str4 = str7;
                            }
                            r0.h1(appCompatImageView2, str4, r.cv_arrow_right_purple_with_circle);
                        } catch (Exception unused) {
                            if (view != null) {
                                view.setVisibility(8);
                            }
                        }
                    }
                } else if (view != null) {
                    view.setVisibility(8);
                }
            }
            x().post(new RunnableC0085g(4, this, queryHomeAccountInfoRsp));
        }
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView
    public final void handleHomeRewards(HomeRewardTasksRsp homeRewardTasksRsp) {
        List<? extends PalmZoneTaskBean> list;
        float fIntValue;
        IndicatorView indicatorView;
        BannerViewPager indicatorView2;
        List<? extends PalmZoneTaskBean> list2;
        if (homeRewardTasksRsp != null && (list2 = homeRewardTasksRsp.taskList) != null && (!list2.isEmpty()) && this.f35101X == null) {
            ViewStub viewStub = (ViewStub) this.f27318b.findViewById(Ac.e.rewardTasksViewStub);
            h hVar = new h(2);
            hVar.f5446d = new WeakReference(this);
            View viewInflate = viewStub != null ? viewStub.inflate() : null;
            hVar.f5444b = viewInflate;
            if (viewInflate != null) {
                int i7 = Ac.e.bannerIndicatorView;
                IndicatorView indicatorView3 = (IndicatorView) p059e1.a.m(i7, viewInflate);
                if (indicatorView3 != null) {
                    i7 = Ac.e.bannerView;
                    BannerViewPager bannerViewPager = (BannerViewPager) p059e1.a.m(i7, viewInflate);
                    if (bannerViewPager != null) {
                        i7 = Ac.e.ivDivider;
                        if (((ImageView) p059e1.a.m(i7, viewInflate)) != null) {
                            i7 = Ac.e.ivRight;
                            IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, viewInflate);
                            if (iconicsImageView != null) {
                                i7 = Ac.e.progressIndicator;
                                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) p059e1.a.m(i7, viewInflate);
                                if (linearProgressIndicator != null) {
                                    i7 = Ac.e.tvTaskProgress;
                                    TextView textView = (TextView) p059e1.a.m(i7, viewInflate);
                                    if (textView != null) {
                                        i7 = Ac.e.tvTitle;
                                        TextView textView2 = (TextView) p059e1.a.m(i7, viewInflate);
                                        if (textView2 != null) {
                                            hVar.f5445c = new Bc.i((ConstraintLayout) viewInflate, (View) indicatorView3, (Object) bannerViewPager, (Object) iconicsImageView, (Object) linearProgressIndicator, textView, textView2, 2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
            }
            this.f35101X = hVar;
        }
        h hVar2 = this.f35101X;
        if (hVar2 != null) {
            View view = (View) hVar2.f5444b;
            if (homeRewardTasksRsp == null || (list = homeRewardTasksRsp.taskList) == null || list.isEmpty()) {
                if (view != null) {
                    p220oa.h.s(view, false);
                    return;
                }
                return;
            }
            if (view != null) {
                p220oa.h.s(view, true);
            }
            Bc.i iVar = (Bc.i) hVar2.f5445c;
            if (iVar != null) {
                String str = homeRewardTasksRsp.title;
                TextView textView3 = (TextView) iVar.f729g;
                textView3.setText(str);
                Integer num = homeRewardTasksRsp.finishedTotal;
                int iIntValue = num != null ? num.intValue() : 0;
                Integer num2 = homeRewardTasksRsp.total;
                String str2 = iIntValue + "/" + (num2 != null ? num2.intValue() : 0);
                TextView textView4 = (TextView) iVar.f728f;
                textView4.setText(str2);
                Integer num3 = homeRewardTasksRsp.total;
                if ((num3 != null ? num3.intValue() : 0) > 0) {
                    Integer num4 = homeRewardTasksRsp.finishedTotal;
                    float fIntValue2 = num4 != null ? num4.intValue() : 0;
                    Integer num5 = homeRewardTasksRsp.total;
                    fIntValue = fIntValue2 / (num5 != null ? num5.intValue() : 1);
                } else {
                    fIntValue = 0.0f;
                }
                LinearProgressIndicator linearProgressIndicator2 = (LinearProgressIndicator) iVar.f730i;
                linearProgressIndicator2.setProgressCompat((int) (fIntValue * 100), false);
                textView3.setOnClickListener(hVar2);
                ((IconicsImageView) iVar.f725c).setOnClickListener(hVar2);
                textView4.setOnClickListener(hVar2);
                linearProgressIndicator2.setOnClickListener(hVar2);
                ((ConstraintLayout) iVar.f724b).setOnClickListener(hVar2);
                ArrayList arrayList = new ArrayList();
                List<? extends PalmZoneTaskBean> list3 = homeRewardTasksRsp.taskList;
                if (list3 != null) {
                    arrayList.addAll(list3);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        HomeRewardsStatisticsExtKt.sendStatisticsEvent((PalmZoneTaskBean) it.next(), false);
                    }
                }
                BannerViewPager indicatorVisibility = ((BannerViewPager) iVar.f727e).setIndicatorVisibility(8);
                if (indicatorVisibility == null || (indicatorView2 = indicatorVisibility.setIndicatorView((indicatorView = (IndicatorView) iVar.f726d))) == null) {
                    return;
                }
                if (arrayList.size() < 2) {
                    p220oa.h.s(indicatorView, false);
                }
                if (indicatorView2.getAdapter() != null) {
                    indicatorView2.refreshData(arrayList);
                    return;
                }
                indicatorView2.setAdapter(new p370ye.a((WeakReference) hVar2.f5446d));
                indicatorView2.setIndicatorSlideMode(2);
                indicatorView2.setIndicatorSliderRadius(CommonViewExtKt.getDp(3.0f));
                indicatorView2.setIndicatorHeight(CommonViewExtKt.getDp(3.0f));
                indicatorView2.setIndicatorSliderWidth(CommonViewExtKt.getDp(10.0f));
                indicatorView2.setIndicatorStyle(4);
                indicatorView2.setIndicatorSliderGap(CommonViewExtKt.getDp(2.0f));
                indicatorView2.setIndicatorSliderColor(CommonViewExtKt.colorInt(L6.b.ppColorSecondary, indicatorView2.getContext()), CommonViewExtKt.colorInt(L6.b.ppColorPrimary, indicatorView2.getContext()));
                indicatorView2.setAutoPlay(true);
                indicatorView2.setCanLoop(true);
                indicatorView2.setPageStyle(0);
                indicatorView2.setScrollDuration(1500);
                indicatorView2.setInterval(4000);
                indicatorView2.setPageMargin(0);
                indicatorView2.setRevealWidth(0);
                indicatorView2.create(arrayList);
            }
        }
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView
    public final void handleHomeRewardsCenter(HomeRewardsCenterRsp homeRewardsCenterRsp) {
        List<HomeRewardsCenterInfo> list;
        BannerViewPager indicatorVisibility;
        IndicatorView indicatorView;
        BannerViewPager indicatorView2;
        if (this.f35103Z == null) {
            ViewStub viewStub = (ViewStub) this.f27318b.findViewById(Ac.e.rewardsViewStub);
            top.zibin.luban.io.a aVar = new top.zibin.luban.io.a(13, false);
            aVar.f42647d = new WeakReference(this);
            View viewInflate = viewStub != null ? viewStub.inflate() : null;
            aVar.f42645b = viewInflate;
            if (viewInflate != null) {
                int i7 = Ac.e.bannerIndicatorView;
                IndicatorView indicatorView3 = (IndicatorView) p059e1.a.m(i7, viewInflate);
                if (indicatorView3 != null) {
                    i7 = Ac.e.bannerView;
                    BannerViewPager bannerViewPager = (BannerViewPager) p059e1.a.m(i7, viewInflate);
                    if (bannerViewPager != null) {
                        aVar.f42646c = new p((CardView) viewInflate, indicatorView3, bannerViewPager, 5);
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
            }
            this.f35103Z = aVar;
        }
        top.zibin.luban.io.a aVar2 = this.f35103Z;
        if (aVar2 != null) {
            View view = (View) aVar2.f42645b;
            if (homeRewardsCenterRsp == null || (list = homeRewardsCenterRsp.marketingCenterList) == null || list.isEmpty() || TimeUtils.isToday(p059e1.a.F("main_sp_close_rewards_center_time"))) {
                if (view != null) {
                    p220oa.h.s(view, false);
                    return;
                }
                return;
            }
            if (view != null) {
                p220oa.h.s(view, true);
            }
            ArrayList arrayList = new ArrayList();
            List<HomeRewardsCenterInfo> list2 = homeRewardsCenterRsp.marketingCenterList;
            if (list2 != null) {
                arrayList.addAll(list2);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    HomeRewardsStatisticsExtKt.sendStatisticsEvent((HomeRewardsCenterInfo) it.next(), false);
                }
            }
            p pVar = (p) aVar2.f42646c;
            if (pVar == null || (indicatorVisibility = ((BannerViewPager) pVar.f813d).setIndicatorVisibility(8)) == null || (indicatorView2 = indicatorVisibility.setIndicatorView((indicatorView = (IndicatorView) pVar.f812c))) == null) {
                return;
            }
            if (arrayList.size() < 2) {
                p220oa.h.s(indicatorView, false);
            }
            if (indicatorView2.getAdapter() != null) {
                indicatorView2.refreshData(arrayList);
                return;
            }
            indicatorView2.setAdapter(new p370ye.j((WeakReference) aVar2.f42647d));
            indicatorView2.setIndicatorSlideMode(2);
            indicatorView2.setIndicatorSliderRadius(CommonViewExtKt.getDp(3.0f));
            indicatorView2.setIndicatorHeight(CommonViewExtKt.getDp(3.0f));
            indicatorView2.setIndicatorSliderWidth(CommonViewExtKt.getDp(10.0f));
            indicatorView2.setIndicatorStyle(4);
            indicatorView2.setIndicatorSliderGap(CommonViewExtKt.getDp(2.0f));
            indicatorView2.setIndicatorSliderColor(CommonViewExtKt.colorInt(L6.b.ppColorSecondary, indicatorView2.getContext()), CommonViewExtKt.colorInt(L6.b.ppColorPrimary, indicatorView2.getContext()));
            indicatorView2.setAutoPlay(true);
            indicatorView2.setCanLoop(true);
            indicatorView2.setPageStyle(0);
            indicatorView2.setScrollDuration(1500);
            indicatorView2.setInterval(4000);
            indicatorView2.setPageMargin(0);
            indicatorView2.setRevealWidth(0);
            indicatorView2.create(arrayList);
        }
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView
    public final void handleHomeTaskCenter(HomeTaskCenterRsp homeTaskCenterRsp) {
        String str;
        View viewM;
        if (homeTaskCenterRsp != null && this.f35102Y == null) {
            ViewStub viewStub = (ViewStub) this.f27318b.findViewById(Ac.e.taskCenterViewStub);
            e eVar = new e();
            eVar.f5964c = new WeakReference(this);
            View viewInflate = viewStub != null ? viewStub.inflate() : null;
            eVar.f5962a = viewInflate;
            if (viewInflate != null) {
                int i7 = Ac.e.headlineCardViewStub;
                ViewStub viewStub2 = (ViewStub) p059e1.a.m(i7, viewInflate);
                if (viewStub2 != null) {
                    i7 = Ac.e.ivBanner;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) p059e1.a.m(i7, viewInflate);
                    if (appCompatImageView != null && (viewM = p059e1.a.m((i7 = Ac.e.subClickView), viewInflate)) != null) {
                        eVar.f5963b = new C0107d((ConstraintLayout) viewInflate, viewStub2, appCompatImageView, viewM, 5);
                        appCompatImageView.setOnClickListener(eVar);
                        viewM.setOnClickListener(eVar);
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i7)));
            }
            this.f35102Y = eVar;
        }
        e eVar2 = this.f35102Y;
        if (eVar2 != null) {
            boolean zM = m();
            if (Intrinsics.c(homeTaskCenterRsp, eVar2.f5965d) && Boolean.valueOf(zM).equals(eVar2.f5966e)) {
                return;
            }
            eVar2.f5965d = homeTaskCenterRsp;
            eVar2.f5966e = Boolean.valueOf(zM);
            View view = eVar2.f5962a;
            if (homeTaskCenterRsp == null) {
                Me.c cVar = eVar2.f5967f;
                if (cVar != null) {
                    cVar.e(null, zM);
                }
                if (view != null) {
                    p220oa.h.s(view, false);
                    return;
                }
                return;
            }
            boolean zA = e.a(homeTaskCenterRsp);
            C0107d c0107d = eVar2.f5963b;
            if (zA) {
                String str2 = zM ? homeTaskCenterRsp.darkModeBackgroundUrl : homeTaskCenterRsp.backgroundUrl;
                if (TextUtils.isEmpty(str2)) {
                    Me.c cVar2 = eVar2.f5967f;
                    if (cVar2 != null) {
                        cVar2.e(null, zM);
                    }
                    if (view != null) {
                        p220oa.h.s(view, false);
                        return;
                    }
                    return;
                }
                if (eVar2.f5967f == null) {
                    ViewStub viewStub3 = c0107d != null ? (ViewStub) c0107d.f681c : null;
                    WeakReference weakReference = eVar2.f5964c;
                    eVar2.f5967f = new Me.c(viewStub3, weakReference != null ? (HomeFragmentHomeTab) weakReference.get() : null);
                }
                if (c0107d != null) {
                    p220oa.h.s(c0107d.f683e, false);
                }
                if (c0107d != null) {
                    p220oa.h.s((AppCompatImageView) c0107d.f682d, true);
                }
                if (c0107d != null) {
                    ((AppCompatImageView) c0107d.f682d).setClickable(false);
                }
                r0.l1(str2, c0107d != null ? (AppCompatImageView) c0107d.f682d : null);
                Me.c cVar3 = eVar2.f5967f;
                boolean z3 = cVar3 != null && cVar3.e(homeTaskCenterRsp, zM);
                if (z3 && c0107d != null) {
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) c0107d.f682d;
                    ViewGroup.LayoutParams layoutParams = appCompatImageView2.getLayoutParams();
                    ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
                    if (layoutParams2 != null) {
                        ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                        layoutParams2.f15616G = null;
                        layoutParams2.f15633X = false;
                        layoutParams2.f15650i = 0;
                        layoutParams2.f15655l = Ac.e.headlineCardContainer;
                        appCompatImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
                        appCompatImageView2.setLayoutParams(layoutParams2);
                    }
                }
                if (view != null) {
                    p220oa.h.s(view, z3);
                    return;
                }
                return;
            }
            Me.c cVar4 = eVar2.f5967f;
            if (cVar4 != null) {
                cVar4.e(null, zM);
            }
            String str3 = zM ? homeTaskCenterRsp.darkModeBackgroundUrl : homeTaskCenterRsp.backgroundUrl;
            if (!TextUtils.isEmpty(str3)) {
                if (view != null) {
                    p220oa.h.s(view, true);
                }
                if (c0107d != null) {
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) c0107d.f682d;
                    ViewGroup.LayoutParams layoutParams3 = appCompatImageView3.getLayoutParams();
                    ConstraintLayout.LayoutParams layoutParams4 = layoutParams3 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams3 : null;
                    if (layoutParams4 != null) {
                        ((ViewGroup.MarginLayoutParams) layoutParams4).height = -2;
                        layoutParams4.f15633X = true;
                        layoutParams4.f15650i = 0;
                        layoutParams4.f15655l = 0;
                        appCompatImageView3.setAdjustViewBounds(true);
                        appCompatImageView3.setScaleType(ImageView.ScaleType.FIT_XY);
                        appCompatImageView3.setLayoutParams(layoutParams4);
                    }
                }
                if (c0107d != null) {
                    p220oa.h.s((AppCompatImageView) c0107d.f682d, true);
                }
                if (c0107d != null) {
                    ((AppCompatImageView) c0107d.f682d).setClickable(true);
                }
                r0.l1(str3, c0107d != null ? (AppCompatImageView) c0107d.f682d : null);
                if (c0107d != null) {
                    p220oa.h.s(c0107d.f683e, !TextUtils.isEmpty(homeTaskCenterRsp.subButtonAndroidUrl));
                }
            } else if (view != null) {
                p220oa.h.s(view, false);
            }
            n0 n0VarG = n0.g();
            ViewEvent viewEvent = new ViewEvent("Home_TaskCenter_View");
            Integer num = homeTaskCenterRsp.taskFlag;
            ViewEvent viewEventAdd = viewEvent.add("Type", (num != null && num.intValue() == 1) ? "Jump" : "Claim");
            Integer num2 = homeTaskCenterRsp.taskFlag;
            String str4 = "";
            if (num2 != null && num2.intValue() == 1 ? (str = homeTaskCenterRsp.androidUrl) != null : (str = homeTaskCenterRsp.taskSceneType) != null) {
                str4 = str;
            }
            n0VarG.u(viewEventAdd.add(FirebaseAnalytics.Param.CONTENT, str4));
        }
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView
    public final void handleHomeWealthResult(final HomeWealthProductRsp homeWealthProductRsp) {
        if (this.f35105k0 == null) {
            ViewEvent viewEvent = (ViewEvent) G.g("Home_ProductRecommed_View", false);
            if (!BaseApplication.hasLogin()) {
                viewEvent.add("memberid", "Tourist");
            }
            n0.g().u(viewEvent);
            this.f35105k0 = new i((ViewStub) this.f27318b.findViewById(Ac.e.wealthViewStub), this);
        }
        final i iVar = this.f35105k0;
        if (iVar != null) {
            List<HomeWealthItem> list = homeWealthProductRsp != null ? homeWealthProductRsp.productRecommendList : null;
            View view = iVar.f5972a;
            if (list == null || list.size() != 2) {
                if (view != null) {
                    p220oa.h.s(view, false);
                    return;
                }
                return;
            }
            HomeWealthProductRsp homeWealthProductRsp2 = iVar.f5975d;
            if (homeWealthProductRsp2 == null || !homeWealthProductRsp2.equals(homeWealthProductRsp)) {
                iVar.f5975d = homeWealthProductRsp;
                if (view != null) {
                    p220oa.h.s(view, true);
                }
                Me.h hVar = (Me.h) iVar.f5974c.getValue();
                if (hVar != null) {
                    hVar.setList(list);
                }
                p pVar = iVar.f5973b;
                if (pVar != null) {
                    TextView textView = (TextView) pVar.f813d;
                    boolean zIsEmpty = TextUtils.isEmpty(homeWealthProductRsp.jumpContent);
                    textView.setText(!zIsEmpty ? homeWealthProductRsp.jumpContent : "More Wealth Product");
                    textView.setVisibility(!zIsEmpty ? 0 : 8);
                }
                if (pVar != null) {
                    ((IconicsImageView) pVar.f812c).setVisibility(TextUtils.isEmpty(homeWealthProductRsp.jumpAndroidUrl) ? 8 : 0);
                }
                if (pVar != null) {
                    final int i7 = 0;
                    ((TextView) pVar.f813d).setOnClickListener(new View.OnClickListener() { // from class: Me.f
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i7) {
                                case 0:
                                    iVar.a(homeWealthProductRsp);
                                    break;
                                default:
                                    iVar.a(homeWealthProductRsp);
                                    break;
                            }
                        }
                    });
                }
                if (pVar != null) {
                    final int i10 = 1;
                    ((IconicsImageView) pVar.f812c).setOnClickListener(new View.OnClickListener() { // from class: Me.f
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i10) {
                                case 0:
                                    iVar.a(homeWealthProductRsp);
                                    break;
                                default:
                                    iVar.a(homeWealthProductRsp);
                                    break;
                            }
                        }
                    });
                }
                List<HomeWealthItem> list2 = list;
                ArrayList arrayList = new ArrayList(kotlin.collections.r.l(list2, 10));
                for (HomeWealthItem homeWealthItem : list2) {
                    n0.g().u(((ViewEvent) G.g("Home_ProductRecommed_Content_View", false)).add("memberid", !BaseApplication.hasLogin() ? "Tourist" : BaseApplication.getInstance().getUser().getMemberId()).add("producttitle", homeWealthItem.productTitle).add("productcode", homeWealthItem.productCode));
                    arrayList.add(Unit.f38893a);
                }
            }
        }
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView
    public final void handleImportantNotice(List list) {
        Animation inAnimation;
        GetMsgRsp.DataBean.ListBean listBean;
        MsgContentBean content;
        List list2 = list;
        t tVar = this.f35114v;
        t tVar2 = this.f35116w;
        if (list2 == null || list2.isEmpty()) {
            View view = (View) tVar2.getValue();
            if (view != null) {
                p220oa.h.s(view, false);
            }
            ImageView imageView = (ImageView) tVar.getValue();
            if (imageView != null) {
                imageView.setImageDrawable(null);
                return;
            }
            return;
        }
        View view2 = (View) tVar2.getValue();
        if (view2 != null) {
            p220oa.h.s(view2, true);
        }
        ImageView imageView2 = (ImageView) tVar.getValue();
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
        }
        if (this.f35108p0 == null) {
            View viewFindViewById = this.f27318b.findViewById(Ac.e.messageStub);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f35108p0 = new j((ViewStub) viewFindViewById);
        }
        j jVar = this.f35108p0;
        if (jVar != null) {
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    GetMsgRsp.DataBean.ListBean listBean2 = (GetMsgRsp.DataBean.ListBean) it.next();
                    if (!TextUtils.isEmpty((listBean2 == null || (content = listBean2.getContent()) == null) ? null : content.outsideInsideNotificationInfo)) {
                        Intrinsics.e(listBean2);
                        arrayList.add(listBean2);
                    }
                }
            }
            if (arrayList.size() > 0) {
                ArrayList arrayList2 = jVar.f4819v;
                if ((arrayList2 != null ? arrayList2.size() : 0) == arrayList.size()) {
                    ArrayList arrayList3 = jVar.f4819v;
                    int size = arrayList3 != null ? arrayList3.size() : 0;
                    for (int i7 = 0; i7 < size; i7++) {
                        long j6 = ((GetMsgRsp.DataBean.ListBean) arrayList.get(i7)).f27367id;
                        ArrayList arrayList4 = jVar.f4819v;
                        Number numberValueOf = (arrayList4 == null || (listBean = (GetMsgRsp.DataBean.ListBean) arrayList4.get(i7)) == null) ? -1 : Long.valueOf(listBean.f27367id);
                        if ((numberValueOf instanceof Long) && j6 == numberValueOf.longValue()) {
                        }
                    }
                    return;
                }
            }
            jVar.f4819v = arrayList;
            ViewFlipper viewFlipper = jVar.f4811d;
            t tVar3 = jVar.f4820w;
            if (viewFlipper != null) {
                viewFlipper.stopFlipping();
                viewFlipper.clearAnimation();
                ViewFlipper viewFlipper2 = jVar.f4811d;
                if (viewFlipper2 != null) {
                    viewFlipper2.removeCallbacks((Runnable) tVar3.getValue());
                }
                t tVar4 = jVar.f4817o;
                ((CopyOnWriteArrayList) tVar4.getValue()).clear();
                if (viewFlipper.getChildCount() > 0) {
                    v.o((CopyOnWriteArrayList) tVar4.getValue(), new P(viewFlipper));
                }
                viewFlipper.removeAllViews();
            }
            if (viewFlipper != null) {
                viewFlipper.removeCallbacks((Runnable) tVar3.getValue());
            }
            ArrayList arrayList5 = jVar.f4819v;
            View view3 = jVar.f4810c;
            if (arrayList5 == null || arrayList5.isEmpty()) {
                if (view3 != null) {
                    p220oa.h.s(view3, false);
                    return;
                }
                return;
            }
            jVar.f4809b = 0;
            if (viewFlipper != null) {
                ArrayList arrayList6 = jVar.f4819v;
                Intrinsics.e(arrayList6);
                viewFlipper.addView(jVar.b(0, (GetMsgRsp.DataBean.ListBean) arrayList6.get(jVar.f4809b)));
            }
            ArrayList arrayList7 = jVar.f4819v;
            Intrinsics.e(arrayList7);
            if (arrayList7.size() > 1) {
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(view3 != null ? view3.getContext() : null, jVar.f4818p);
                animationLoadAnimation.setDuration(1000L);
                if (viewFlipper != null) {
                    viewFlipper.setInAnimation(animationLoadAnimation);
                }
                Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(view3 != null ? view3.getContext() : null, jVar.t);
                animationLoadAnimation2.setDuration(1000L);
                if (viewFlipper != null) {
                    viewFlipper.setOutAnimation(animationLoadAnimation2);
                }
                if (viewFlipper != null) {
                    viewFlipper.postDelayed((Runnable) tVar3.getValue(), BaseApplication.get().isOldAndroidDevice() ? 1500L : 1000L);
                }
            }
            if (viewFlipper == null || (inAnimation = viewFlipper.getInAnimation()) == null) {
                return;
            }
            inAnimation.setAnimationListener(new Je.i(jVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView
    public final void handleTaskCenterRewardResult(CommonBeanResult commonBeanResult) {
        String str;
        TaskCenterRewardResultBean taskCenterRewardResultBean;
        TaskCenterRewardResultBean taskCenterRewardResultBean2;
        I i7;
        if (commonBeanResult != null && commonBeanResult.isSuccess() && (i7 = (I) this.f27328i) != null) {
            i7.queryHomeRewardTasks();
        }
        if (TextUtils.isEmpty((commonBeanResult == null || (taskCenterRewardResultBean2 = (TaskCenterRewardResultBean) commonBeanResult.data) == null) ? null : taskCenterRewardResultBean2.responseMsg)) {
            if (commonBeanResult == null || !commonBeanResult.isSuccess()) {
                ToastUtils.showLong(Ac.h.main_task_center_error_result);
                return;
            }
            return;
        }
        E activity = getActivity();
        if (activity != null) {
            if (commonBeanResult == null || (taskCenterRewardResultBean = (TaskCenterRewardResultBean) commonBeanResult.data) == null || (str = taskCenterRewardResultBean.responseMsg) == null) {
                str = "";
            }
            p220oa.h.z(activity, str, (commonBeanResult == null || !commonBeanResult.isSuccess()) ? S6.a.pay_CloseOutline : S6.a.pay_SelectedOutline, null, 53);
        }
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView
    public final void handleUnreadMsgCntRsp(UnReadMsgCntRsp unReadMsgCntRsp) {
        if (unReadMsgCntRsp != null) {
            Context context = requireContext();
            Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
            int total = unReadMsgCntRsp.getTotal();
            Intrinsics.checkNotNullParameter(context, "context");
            T.b(-4).execute(new B3.a(total, context, 3));
            Ee.a aVar = this.f35109q0;
            if (aVar != null) {
                int total2 = unReadMsgCntRsp.getTotal();
                p045d3.k kVar = (p045d3.k) aVar.f2421d;
                if (kVar != null) {
                    TextView textView = (TextView) kVar.f35518b;
                    if (total2 <= 0) {
                        textView.setVisibility(8);
                    } else if (total2 <= 99) {
                        textView.setVisibility(0);
                        textView.setText(String.valueOf(total2));
                    } else {
                        textView.setVisibility(0);
                        textView.setText("99+");
                    }
                }
            }
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        Window window;
        F6.d.h(this.f27317a, 3, "initData start..");
        org.greenrobot.eventbus.c.b().j(this);
        Handler handlerX = x();
        E activity = getActivity();
        View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
        if (decorView == null) {
            return 0;
        }
        decorView.post(new H(handlerX, 0, this, this));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        ViewTreeObserver viewTreeObserver;
        VerticalSwipeRefreshLayout verticalSwipeRefreshLayoutY = y();
        if (verticalSwipeRefreshLayoutY != null) {
            verticalSwipeRefreshLayoutY.setOnRefreshListener(new A8.a(this, 22));
        }
        HomeScrollView homeScrollViewW = w();
        if (homeScrollViewW != null && (viewTreeObserver = homeScrollViewW.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnScrollChangedListener(this);
        }
        HomeScrollView homeScrollViewW2 = w();
        if (homeScrollViewW2 != null) {
            homeScrollViewW2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0160b(this, 1));
        }
        String strO = g.o();
        HashMap map = Pa.H.f7018b;
        String string = null;
        if (!TextUtils.isEmpty(strO) && strO.startsWith("Pref_")) {
            string = Pa.H.e().getString(strO, null);
        }
        if (!TextUtils.isEmpty(string) || TextUtils.isEmpty("{\"bottomTabMenu\":[{\"iconUrl\":\"https://d1me2081qmgmx2.cloudfront.net/activity/171619419163513-%E9%80%89%E4%B8%AD.png\",\"iconUrlUnSelected\":\"https://d1me2081qmgmx2.cloudfront.net/activity/171619419604710-%E6%9C%AA%E9%80%89%E4%B8%AD.png\",\"darkIconUrl\":\"https://d1me2081qmgmx2.cloudfront.net/activity/17199734755263-loan-d.png\",\"darkIconUrlUnSelected\":\"https://d1me2081qmgmx2.cloudfront.net/activity/171997348380813-loan.png\",\"menuId\":63,\"menuName\":\"Loan\"},{\"iconUrl\":\"https://d1me2081qmgmx2.cloudfront.net/activity/171619421399620-%E9%80%89%E4%B8%AD.png\",\"iconUrlUnSelected\":\"https://d1me2081qmgmx2.cloudfront.net/activity/171619421872010-%E6%9C%AA%E9%80%89%E4%B8%AD.png\",\"darkIconUrl\":\"https://d1me2081qmgmx2.cloudfront.net/activity/171997344066617-home-d.png\",\"darkIconUrlUnSelected\":\"https://d1me2081qmgmx2.cloudfront.net/activity/17199734551520-home.png\",\"menuId\":61,\"menuName\":\"Home\"},{\"iconUrl\":\"https://d1me2081qmgmx2.cloudfront.net/activity/17161942344002-%E9%80%89%E4%B8%AD.png\",\"iconUrlUnSelected\":\"https://d1me2081qmgmx2.cloudfront.net/activity/17161942385371-%E6%9C%AA%E9%80%89%E4%B8%AD.png\",\"darkIconUrl\":\"https://d1me2081qmgmx2.cloudfront.net/activity/171997406369319-17161942344002-%E9%80%89%E4%B8%AD.png\",\"darkIconUrlUnSelected\":\"https://d1me2081qmgmx2.cloudfront.net/activity/17199740728912-reward.png\",\"menuId\":64,\"menuName\":\"Reward\"},{\"iconUrl\":\"https://d1me2081qmgmx2.cloudfront.net/activity/171619430067420-%E9%80%89%E4%B8%AD.png\",\"iconUrlUnSelected\":\"https://d1me2081qmgmx2.cloudfront.net/activity/171619430580710-%E6%9C%AA%E9%80%89%E4%B8%AD.png\",\"darkIconUrl\":\"https://d1me2081qmgmx2.cloudfront.net/activity/171997352704613-invest-d.png\",\"darkIconUrlUnSelected\":\"https://d1me2081qmgmx2.cloudfront.net/activity/171997354383116-invest.png\",\"menuId\":65,\"menuName\":\"Wealth\"},{\"iconUrl\":\"https://d1me2081qmgmx2.cloudfront.net/activity/171619427934520-%E9%80%89%E4%B8%AD.png\",\"iconUrlUnSelected\":\"https://d1me2081qmgmx2.cloudfront.net/activity/171619428238610-%E6%9C%AA%E9%80%89%E4%B8%AD.png\",\"darkIconUrl\":\"https://d1me2081qmgmx2.cloudfront.net/activity/17199736070032-me-d.png\",\"darkIconUrlUnSelected\":\"https://d1me2081qmgmx2.cloudfront.net/activity/171997366770120-me.png\",\"menuId\":62,\"menuName\":\"Me\"}],\"funMenu\":[{\"iconUrlBig\":\"https://d1me2081qmgmx2.cloudfront.net/activity/168316859401217-3-Airtime.png\",\"jumpPath\":\"/airtime/top_up_airtime\",\"jumpType\":\"0\",\"menuId\":3,\"menuName\":\"Airtime\"},{\"iconUrlBig\":\"https://d1me2081qmgmx2.cloudfront.net/activity/168316935250320-10-Data%20Bundle.png\",\"jumpPath\":\"/quick_teller/buy_bundle_ng\",\"jumpType\":\"0\",\"menuId\":10,\"menuName\":\"Data\"},{\"iconUrlBig\":\"https://d1me2081qmgmx2.cloudfront.net/activity/168317053483710-81-Electricity.png\",\"jumpPath\":\"/quick_teller/electricity_home\",\"jumpType\":\"0\",\"menuId\":81,\"menuName\":\"Electricity\"},{\"iconUrlBig\":\"https://d1me2081qmgmx2.cloudfront.net/activity/16831690472724-5-TV.png\",\"jumpPath\":\"/quick_teller/tv_home\",\"jumpType\":\"0\",\"menuId\":5,\"menuName\":\"TV\"},{\"iconUrlBig\":\"https://d1me2081qmgmx2.cloudfront.net/activity/16831854940456-100-Refer%20%26%20Earn.png\",\"jumpParams\":\"extra_type=14\",\"jumpPath\":\"/refer_earn/homepage\",\"jumpType\":\"0\",\"menuId\":100,\"menuName\":\"Refer & Earn\"},{\"iconUrlBig\":\"https://d1me2081qmgmx2.cloudfront.net/activity/16831695410138-13-Withdraw1.png\",\"jumpPath\":\"/cashout/withdraw_home\",\"jumpType\":\"0\",\"menuId\":13,\"menuName\":\"Withdraw\"},{\"cornerImgUrl\":\"https://d1me2081qmgmx2.cloudfront.net/activity/17435803869072-%E8%A7%92%E6%A0%87Payable.png\",\"cornerOrder\":53,\"iconUrlBig\":\"https://d1me2081qmgmx2.cloudfront.net/activity/168318840834416-307-CashBox.png\",\"jumpPath\":\"/manage_money/cash_box_main_activity\",\"jumpType\":\"0\",\"menuId\":307,\"menuName\":\"CashBox\"},{\"iconUrlBig\":\"https://d1me2081qmgmx2.cloudfront.net/activity/17509951366086-home-More.png\",\"jumpParams\":\"\",\"jumpPath\":\"/app/all_function_activity\",\"jumpType\":\"0\",\"menuId\":9999,\"menuName\":\"More\"}],\"sendMoneyMenu\":[{\"cornerImgUrl\":\"https://d1me2081qmgmx2.cloudfront.net/activity/17089412086464-Frame%201410121198.png\",\"iconUrlBig\":\"https://d1me2081qmgmx2.cloudfront.net/activity/16831888150402-618-To%20bank.png\",\"jumpPath\":\"/sm/trans_to_bank\",\"jumpType\":\"0\",\"menuId\":618,\"menuName\":\"To Bank\"},{\"iconUrlBig\":\"https://d1me2081qmgmx2.cloudfront.net/activity/16831677862008-1-To%20PalmPay%20Account.png\",\"jumpPath\":\"/send/money\",\"jumpType\":\"0\",\"menuId\":1,\"menuName\":\"To PalmPay\"},{\"iconUrlBig\":\"https://d1me2081qmgmx2.cloudfront.net/activity/175099460477914-saving.png\",\"jumpPath\":\"arouter://coreImpl/rn_host?rn_module_name=SavingHome\",\"jumpType\":\"0\",\"menuId\":312,\"menuName\":\"Savings\"},{\"iconUrlBig\":\"https://d1me2081qmgmx2.cloudfront.net/activity/17436714076517-ATM%20Card%20icon.png\",\"jumpPath\":\"/palmpay-card/index?channelName=homeicon\",\"jumpType\":\"1\",\"menuId\":633,\"menuName\":\"ATM Card\"}],\"cornerCount\":1,\"fromCache\":true}")) {
            return 0;
        }
        showHomeCommonInfo((GetHomeCommonRsp.DataBean) d0.l(GetHomeCommonRsp.DataBean.class, "{\"bottomTabMenu\":[{\"iconUrl\":\"https://d1me2081qmgmx2.cloudfront.net/activity/171619419163513-%E9%80%89%E4%B8%AD.png\",\"iconUrlUnSelected\":\"https://d1me2081qmgmx2.cloudfront.net/activity/171619419604710-%E6%9C%AA%E9%80%89%E4%B8%AD.png\",\"darkIconUrl\":\"https://d1me2081qmgmx2.cloudfront.net/activity/17199734755263-loan-d.png\",\"darkIconUrlUnSelected\":\"https://d1me2081qmgmx2.cloudfront.net/activity/171997348380813-loan.png\",\"menuId\":63,\"menuName\":\"Loan\"},{\"iconUrl\":\"https://d1me2081qmgmx2.cloudfront.net/activity/171619421399620-%E9%80%89%E4%B8%AD.png\",\"iconUrlUnSelected\":\"https://d1me2081qmgmx2.cloudfront.net/activity/171619421872010-%E6%9C%AA%E9%80%89%E4%B8%AD.png\",\"darkIconUrl\":\"https://d1me2081qmgmx2.cloudfront.net/activity/171997344066617-home-d.png\",\"darkIconUrlUnSelected\":\"https://d1me2081qmgmx2.cloudfront.net/activity/17199734551520-home.png\",\"menuId\":61,\"menuName\":\"Home\"},{\"iconUrl\":\"https://d1me2081qmgmx2.cloudfront.net/activity/17161942344002-%E9%80%89%E4%B8%AD.png\",\"iconUrlUnSelected\":\"https://d1me2081qmgmx2.cloudfront.net/activity/17161942385371-%E6%9C%AA%E9%80%89%E4%B8%AD.png\",\"darkIconUrl\":\"https://d1me2081qmgmx2.cloudfront.net/activity/171997406369319-17161942344002-%E9%80%89%E4%B8%AD.png\",\"darkIconUrlUnSelected\":\"https://d1me2081qmgmx2.cloudfront.net/activity/17199740728912-reward.png\",\"menuId\":64,\"menuName\":\"Reward\"},{\"iconUrl\":\"https://d1me2081qmgmx2.cloudfront.net/activity/171619430067420-%E9%80%89%E4%B8%AD.png\",\"iconUrlUnSelected\":\"https://d1me2081qmgmx2.cloudfront.net/activity/171619430580710-%E6%9C%AA%E9%80%89%E4%B8%AD.png\",\"darkIconUrl\":\"https://d1me2081qmgmx2.cloudfront.net/activity/171997352704613-invest-d.png\",\"darkIconUrlUnSelected\":\"https://d1me2081qmgmx2.cloudfront.net/activity/171997354383116-invest.png\",\"menuId\":65,\"menuName\":\"Wealth\"},{\"iconUrl\":\"https://d1me2081qmgmx2.cloudfront.net/activity/171619427934520-%E9%80%89%E4%B8%AD.png\",\"iconUrlUnSelected\":\"https://d1me2081qmgmx2.cloudfront.net/activity/171619428238610-%E6%9C%AA%E9%80%89%E4%B8%AD.png\",\"darkIconUrl\":\"https://d1me2081qmgmx2.cloudfront.net/activity/17199736070032-me-d.png\",\"darkIconUrlUnSelected\":\"https://d1me2081qmgmx2.cloudfront.net/activity/171997366770120-me.png\",\"menuId\":62,\"menuName\":\"Me\"}],\"funMenu\":[{\"iconUrlBig\":\"https://d1me2081qmgmx2.cloudfront.net/activity/168316859401217-3-Airtime.png\",\"jumpPath\":\"/airtime/top_up_airtime\",\"jumpType\":\"0\",\"menuId\":3,\"menuName\":\"Airtime\"},{\"iconUrlBig\":\"https://d1me2081qmgmx2.cloudfront.net/activity/168316935250320-10-Data%20Bundle.png\",\"jumpPath\":\"/quick_teller/buy_bundle_ng\",\"jumpType\":\"0\",\"menuId\":10,\"menuName\":\"Data\"},{\"iconUrlBig\":\"https://d1me2081qmgmx2.cloudfront.net/activity/168317053483710-81-Electricity.png\",\"jumpPath\":\"/quick_teller/electricity_home\",\"jumpType\":\"0\",\"menuId\":81,\"menuName\":\"Electricity\"},{\"iconUrlBig\":\"https://d1me2081qmgmx2.cloudfront.net/activity/16831690472724-5-TV.png\",\"jumpPath\":\"/quick_teller/tv_home\",\"jumpType\":\"0\",\"menuId\":5,\"menuName\":\"TV\"},{\"iconUrlBig\":\"https://d1me2081qmgmx2.cloudfront.net/activity/16831854940456-100-Refer%20%26%20Earn.png\",\"jumpParams\":\"extra_type=14\",\"jumpPath\":\"/refer_earn/homepage\",\"jumpType\":\"0\",\"menuId\":100,\"menuName\":\"Refer & Earn\"},{\"iconUrlBig\":\"https://d1me2081qmgmx2.cloudfront.net/activity/16831695410138-13-Withdraw1.png\",\"jumpPath\":\"/cashout/withdraw_home\",\"jumpType\":\"0\",\"menuId\":13,\"menuName\":\"Withdraw\"},{\"cornerImgUrl\":\"https://d1me2081qmgmx2.cloudfront.net/activity/17435803869072-%E8%A7%92%E6%A0%87Payable.png\",\"cornerOrder\":53,\"iconUrlBig\":\"https://d1me2081qmgmx2.cloudfront.net/activity/168318840834416-307-CashBox.png\",\"jumpPath\":\"/manage_money/cash_box_main_activity\",\"jumpType\":\"0\",\"menuId\":307,\"menuName\":\"CashBox\"},{\"iconUrlBig\":\"https://d1me2081qmgmx2.cloudfront.net/activity/17509951366086-home-More.png\",\"jumpParams\":\"\",\"jumpPath\":\"/app/all_function_activity\",\"jumpType\":\"0\",\"menuId\":9999,\"menuName\":\"More\"}],\"sendMoneyMenu\":[{\"cornerImgUrl\":\"https://d1me2081qmgmx2.cloudfront.net/activity/17089412086464-Frame%201410121198.png\",\"iconUrlBig\":\"https://d1me2081qmgmx2.cloudfront.net/activity/16831888150402-618-To%20bank.png\",\"jumpPath\":\"/sm/trans_to_bank\",\"jumpType\":\"0\",\"menuId\":618,\"menuName\":\"To Bank\"},{\"iconUrlBig\":\"https://d1me2081qmgmx2.cloudfront.net/activity/16831677862008-1-To%20PalmPay%20Account.png\",\"jumpPath\":\"/send/money\",\"jumpType\":\"0\",\"menuId\":1,\"menuName\":\"To PalmPay\"},{\"iconUrlBig\":\"https://d1me2081qmgmx2.cloudfront.net/activity/175099460477914-saving.png\",\"jumpPath\":\"arouter://coreImpl/rn_host?rn_module_name=SavingHome\",\"jumpType\":\"0\",\"menuId\":312,\"menuName\":\"Savings\"},{\"iconUrlBig\":\"https://d1me2081qmgmx2.cloudfront.net/activity/17436714076517-ATM%20Card%20icon.png\",\"jumpPath\":\"/palmpay-card/index?channelName=homeicon\",\"jumpType\":\"1\",\"menuId\":633,\"menuName\":\"ATM Card\"}],\"cornerCount\":1,\"fromCache\":true}"));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        F6.d.h(this.f27317a, 3, "onCreateView");
        this.f27318b = inflater.inflate(f.main_content_home, viewGroup, false);
        if (this.f35109q0 == null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            this.f35109q0 = new Ee.a(viewLifecycleOwner, (ViewStub) this.f27318b.findViewById(Ac.e.ch_top_bar));
        }
        Ee.a aVar = this.f35109q0;
        if (aVar != null) {
            Bc.k kVar = (Bc.k) aVar.f2422e;
            r0.u1(kVar != null ? (AppCompatImageView) kVar.f748b : null, BaseApplication.get().getUser().getAvatar(), r.cv_avatar_default);
        }
        Ee.a aVar2 = this.f35109q0;
        if (aVar2 != null) {
            aVar2.a();
        }
        z();
        return this.f27318b;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        TextToSpeech textToSpeech;
        n nVar = this.f35119y0;
        if (nVar != null) {
            p354xe.h hVar = nVar.f4382c;
            if (hVar != null) {
                hVar.b();
            }
            p354xe.h hVar2 = nVar.f4383d;
            if (hVar2 != null) {
                hVar2.b();
            }
        }
        Handler handlerX = x();
        if (handlerX != null) {
            handlerX.removeCallbacksAndMessages(null);
        }
        super.onDestroy();
        j jVar = this.f35108p0;
        if (jVar != null) {
            ViewFlipper viewFlipper = jVar.f4811d;
            if (viewFlipper != null) {
                viewFlipper.removeCallbacks((Runnable) jVar.f4820w.getValue());
            }
            ((CopyOnWriteArrayList) jVar.f4817o.getValue()).clear();
        }
        org.greenrobot.eventbus.c.b().l(this);
        BannerAdView bannerAdView = this.f35098L;
        if (bannerAdView != null) {
            bannerAdView.setAdListener(null);
        }
        SingleAdView singleAdView = this.f35095B;
        if (singleAdView != null) {
            singleAdView.setAdListener(null);
        }
        top.zibin.luban.io.a aVar = this.f35112t0;
        if (aVar != null && (textToSpeech = (TextToSpeech) aVar.f42645b) != null) {
            textToSpeech.stop();
            ((TextToSpeech) aVar.f42645b).shutdown();
        }
        this.f35112t0 = null;
        I i7 = (I) this.f27328i;
        if (i7 != null) {
            i7.unSubscribe();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Me.c cVar;
        super.onDestroyView();
        e eVar = this.f35102Y;
        if (eVar != null && (cVar = eVar.f5967f) != null) {
            cVar.b();
        }
        this.f35102Y = null;
        MarqueeViewV2 marqueeViewV2 = this.f35100Q;
        if (marqueeViewV2 != null) {
            marqueeViewV2.setAdListener(null);
            marqueeViewV2.release();
            if (marqueeViewV2.getParent() instanceof ViewGroup) {
                ViewParent parent = marqueeViewV2.getParent();
                Intrinsics.f(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(marqueeViewV2);
            }
        }
        this.f35100Q = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterOnGetLayoutInflater, "onGetLayoutInflater(...)");
        return layoutInflaterOnGetLayoutInflater;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        p354xe.g gVar;
        Intrinsics.checkNotNullParameter(event, "event");
        int eventType = event.getEventType();
        if (eventType == 4) {
            Ee.a aVar = this.f35109q0;
            if (aVar != null) {
                Bc.k kVar = (Bc.k) aVar.f2422e;
                r0.u1(kVar != null ? (AppCompatImageView) kVar.f748b : null, BaseApplication.get().getUser().getAvatar(), r.cv_avatar_default);
            }
            Ee.a aVar2 = this.f35109q0;
            if (aVar2 != null) {
                aVar2.a();
            }
            z();
            return;
        }
        if (eventType != 343) {
            if (eventType == 519) {
                C();
                return;
            }
            switch (eventType) {
                case MessageEvent.EVENT_SIGN_UP_SUCCESS /* 307 */:
                    if (!TextUtils.isEmpty(this.f35094A)) {
                        BatchAdManager.INSTANCE.refreshBatchAd(this.f35094A);
                    } else {
                        SingleAdView singleAdView = this.f35099M;
                        if (singleAdView != null) {
                            singleAdView.refreshData();
                        }
                        SingleAdView singleAdView2 = this.f35096C;
                        if (singleAdView2 != null) {
                            p220oa.h.c(singleAdView2);
                        }
                        SingleAdView singleAdView3 = this.f35096C;
                        if (singleAdView3 != null) {
                            singleAdView3.refreshData();
                        }
                    }
                    break;
                case MessageEvent.EVENT_COUNTRY_CHANGED /* 309 */:
                    I i7 = (I) this.f27328i;
                    if (i7 != null) {
                        i7.c(true, false);
                    }
                    break;
            }
            return;
        }
        I i10 = (I) this.f27328i;
        if (i10 != null) {
            i10.b();
        }
        BannerAdView bannerAdView = this.f35098L;
        if (bannerAdView != null) {
            bannerAdView.refreshData(true);
        }
        if (308 == event.getEventType()) {
            BaseApplication.hasLogin();
            SingleAdView singleAdView4 = this.f35095B;
            if (singleAdView4 != null) {
                singleAdView4.refreshData();
            }
            MarqueeViewV2 marqueeViewV2 = this.f35100Q;
            if (marqueeViewV2 != null) {
                marqueeViewV2.setSlotId(MainAdUtils.getAdSlotId(Ac.h.main_home_top_text_slot_id));
            }
            if (TextUtils.isEmpty(this.f35094A)) {
                SingleAdView singleAdView5 = this.f35099M;
                if (singleAdView5 != null) {
                    singleAdView5.refreshData();
                }
                SingleAdView singleAdView6 = this.f35096C;
                if (singleAdView6 != null) {
                    p220oa.h.c(singleAdView6);
                }
                SingleAdView singleAdView7 = this.f35096C;
                if (singleAdView7 != null) {
                    singleAdView7.refreshData();
                }
            } else {
                BatchAdManager.INSTANCE.refreshBatchAd(this.f35094A);
            }
            d dVar = this.f35110r0;
            if (dVar != null && (gVar = dVar.f4784h) != null) {
                gVar.f43933i.clear();
            }
            q.f4388a.clearCornerData();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        x().removeCallbacks((Runnable) this.f35120z0.getValue());
        n nVar = this.f35119y0;
        if (nVar != null) {
            p354xe.h hVar = nVar.f4382c;
            if (hVar != null) {
                hVar.b();
            }
            p354xe.h hVar2 = nVar.f4383d;
            if (hVar2 != null) {
                hVar2.b();
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable PushMessage pushMessage) {
        String str;
        if ((pushMessage != null ? pushMessage.content : null) == null) {
            return;
        }
        String str2 = pushMessage.content.messageType;
        if (PushMessage.MESSAGE_TYPE_TRANSFER_MONEY.equals(str2) || PushMessage.MESSAGE_TYPE_PALMPAY_RECEIVE_MONEY_BYQRCODE.equals(str2)) {
            String noticeMsg = pushMessage.content.noticeMsg;
            Intrinsics.checkNotNullExpressionValue(noticeMsg, "noticeMsg");
            if (p367ya.a.d().f44149a.getBoolean("key_speaker_on", false)) {
                if (this.f35112t0 == null) {
                    this.f35112t0 = new top.zibin.luban.io.a(17);
                }
                top.zibin.luban.io.a aVar = this.f35112t0;
                if (aVar != null) {
                    aVar.q(noticeMsg);
                    return;
                }
                return;
            }
            return;
        }
        if (PushMessage.MESSAGE_TYPE_EXCHANGE_CASH_PAY_BALANCE.equals(str2)) {
            PushMessage.Content content = pushMessage.content;
            if (content == null || (str = content.businessInfo) == null) {
                return;
            }
            Long lI = C0525w.i(str, "bookingMoney");
            ARouter.getInstance().build("/p2p/exchange_cash_cashierdesk").withString("AGENT_NAME", C0525w.j(str, "networkName")).withLong("AMOUNT", lI != null ? lI.longValue() : 0L).withBoolean("IS_SHOW_CHANGE_LABEL", C0525w.g(str, "updateMoneyFlag").booleanValue()).withString("BOOKING_ID", pushMessage.content.orderId).navigation();
            return;
        }
        String str3 = pushMessage.content.messageType;
        if (PushMessage.MESSAGE_TYPE_ORDER_STATUS_CHANGE.equals(str3) || "P1029".equals(str3) || "P1056".equals(str3) || "P1059".equals(str3) || "1002".equals(str3) || "1003".equals(str3) || PushMessage.MESSAGE_TYPE_RECEIVE_MONEY.equals(str3) || "5304".equals(str3)) {
            Handler handlerX = x();
            t tVar = this.f35120z0;
            handlerX.removeCallbacks((Runnable) tVar.getValue());
            x().postDelayed((Runnable) tVar.getValue(), 1000L);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        View view = this.f27318b;
        if (view != null) {
            view.post(new RunnableC0178u(this, 1));
        }
        Handler handlerX = x();
        if (handlerX != null) {
            handlerX.post(new RunnableC0178u(this, 2));
        }
        I i7 = (I) this.f27328i;
        if (i7 != null) {
            i7.c(true, false);
        }
        View view2 = this.f27318b;
        if (view2 != null) {
            view2.post(new RunnableC0178u(this, 3));
        }
        View view3 = this.f27318b;
        if (view3 != null) {
            view3.postDelayed(new RunnableC0178u(this, 4), 48L);
        }
        n nVar = this.f35119y0;
        if (nVar == null || nVar.f4380a.getVisibility() != 0) {
            return;
        }
        p354xe.h hVar = nVar.f4382c;
        if (hVar != null) {
            hVar.a(hVar.f43942f);
        }
        p354xe.h hVar2 = nVar.f4383d;
        if (hVar2 != null) {
            hVar2.a(hVar2.f43942f);
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        VerticalSwipeRefreshLayout verticalSwipeRefreshLayoutY = y();
        if (verticalSwipeRefreshLayoutY != null) {
            HomeScrollView homeScrollViewW = w();
            verticalSwipeRefreshLayoutY.setEnabled((homeScrollViewW != null ? homeScrollViewW.getScrollY() : 0) <= 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0065  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView
    public final void queryHomeCouponAreaOk(HomeCouponAreaRsp homeCouponAreaRsp) {
        c cVar;
        WelcomeCouponData data;
        View view;
        ViewStub viewStub;
        View view2;
        ViewStub viewStub2;
        if (homeCouponAreaRsp != null) {
            if (homeCouponAreaRsp.couponAreaType != 1) {
                cVar = this.f35118x0;
                if (cVar != null) {
                    p220oa.h.s(cVar.f4312a, false);
                }
            } else {
                List<NewExclusiveDataBean> list = homeCouponAreaRsp.newAreaDetail;
                if ((list != null ? list.size() : 0) >= 2) {
                    List<NewExclusiveDataBean> data2 = homeCouponAreaRsp.newAreaDetail;
                    Intrinsics.checkNotNullExpressionValue(data2, "newAreaDetail");
                    String str = homeCouponAreaRsp.androidLinkUrl;
                    if (this.f35118x0 == null && (view2 = this.f27318b) != null && (viewStub2 = (ViewStub) view2.findViewById(Ac.e.exclusiveViewStub)) != null) {
                        n0.g().s("new_user_bonus_page_element_show");
                        p220oa.h.s(viewStub2, true);
                        View mParentView = this.f27318b;
                        Intrinsics.checkNotNullExpressionValue(mParentView, "mParentView");
                        this.f35118x0 = new c(mParentView);
                    }
                    c cVar2 = this.f35118x0;
                    if (cVar2 != null) {
                        Intrinsics.checkNotNullParameter(data2, "data");
                        cVar2.f4313b = str;
                        p354xe.a aVar = (p354xe.a) cVar2.f4314c.getValue();
                        if (aVar != null) {
                            aVar.setList(data2);
                        }
                    }
                } else {
                    cVar = this.f35118x0;
                    if (cVar != null) {
                        p220oa.h.s(cVar.f4312a, false);
                    }
                }
            }
            if (homeCouponAreaRsp.couponAreaType != 2 || (data = homeCouponAreaRsp.oldAreaDetail) == null) {
                n nVar = this.f35119y0;
                if (nVar != null) {
                    p220oa.h.s(nVar.f4380a, false);
                    return;
                }
                return;
            }
            Intrinsics.checkNotNullExpressionValue(data, "oldAreaDetail");
            List<WelcomeCouponBean> list2 = data.configs;
            if ((list2 != null ? list2.size() : 0) >= 2 && this.f35119y0 == null && (view = this.f27318b) != null && (viewStub = (ViewStub) view.findViewById(Ac.e.welcomeBackView)) != null) {
                p220oa.h.s(viewStub, true);
                View viewFindViewById = this.f27318b.findViewById(Ac.e.welcomeBackView);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                this.f35119y0 = new n(viewFindViewById);
            }
            n nVar2 = this.f35119y0;
            if (nVar2 != null) {
                Intrinsics.checkNotNullParameter(data, "data");
                List<WelcomeCouponBean> list3 = data.configs;
                int size = list3 != null ? list3.size() : 0;
                View view3 = nVar2.f4380a;
                if (size < 2) {
                    p220oa.h.s(view3, false);
                    return;
                }
                p220oa.h.s(view3, true);
                List<WelcomeCouponBean> list4 = data.configs;
                WelcomeCouponBean welcomeCouponBean = list4 != null ? list4.get(0) : null;
                List<WelcomeCouponBean> list5 = data.configs;
                WelcomeCouponBean welcomeCouponBean2 = list5 != null ? list5.get(1) : null;
                List<WelcomeCouponBean> list6 = data.configs;
                nVar2.f4382c.c(list6 != null ? list6.get(0) : null);
                List<WelcomeCouponBean> list7 = data.configs;
                nVar2.f4383d.c(list7 != null ? list7.get(1) : null);
                boolean zIsEmpty = TextUtils.isEmpty(data.backTitle);
                ImageView imageView = nVar2.f4381b;
                if (!zIsEmpty) {
                    r0.l1(data.backTitle, imageView);
                } else if (imageView != null) {
                    imageView.setImageResource(Ac.d.main_welcome_back_title);
                }
                Integer num = welcomeCouponBean != null ? welcomeCouponBean.priority : null;
                Integer num2 = welcomeCouponBean2 != null ? welcomeCouponBean2.priority : null;
                n0.g().u(((ViewEvent) G.g("homePageoldusercouponView", false)).add("priority", num + "," + num2));
            }
        }
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView
    public final void queryLastTransactionHistoryOk(List list) {
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView
    public final void showHomeCommonInfo(GetHomeCommonRsp.DataBean dataBean) {
        VerticalSwipeRefreshLayout verticalSwipeRefreshLayoutY = y();
        boolean zBooleanValue = false;
        if (verticalSwipeRefreshLayoutY != null) {
            verticalSwipeRefreshLayoutY.setRefreshing(false);
        }
        HomeScrollView homeScrollViewW = w();
        if (homeScrollViewW != null) {
            homeScrollViewW.r();
        }
        if (dataBean == null) {
            return;
        }
        PpPerfTrace.begin("Home.showCommonInfo.menus");
        try {
            v();
            d dVar = this.f35110r0;
            if (dVar != null) {
                dVar.d(dataBean.funMenu);
            }
            List<HomePageMenuData> list = dataBean.sendMoneyMenu;
            if (this.f35117w0 == null) {
                View view = this.f27318b;
                AsyncViewStub asyncViewStub = view != null ? (AsyncViewStub) view.findViewById(Ac.e.asyncTopFunction) : null;
                if (asyncViewStub != null) {
                    HomeFragment homeFragment = (HomeFragment) getParentFragment();
                    if (homeFragment != null) {
                        if (homeFragment.f35085M == null) {
                            homeFragment.f35085M = Boolean.valueOf(com.transsnet.palmpay.core.config.d.r());
                        }
                        Boolean bool = homeFragment.f35085M;
                        Intrinsics.e(bool);
                        zBooleanValue = bool.booleanValue();
                    }
                    asyncViewStub.b(zBooleanValue, new C0058e(4, this, list));
                }
            }
            m mVar = this.f35117w0;
            if (mVar != null) {
                mVar.c(list);
            }
            Unit unit = Unit.f38893a;
            PpPerfTrace.end();
            x().post(new RunnableC0085g(3, this, dataBean));
        } catch (Throwable th) {
            PpPerfTrace.end();
            throw th;
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment
    public final IBasePresenter t() {
        return new I();
    }

    public final void v() {
        View view;
        Context activity;
        if (this.f35110r0 == null && (view = this.f27318b) != null) {
            View viewFindViewById = view.findViewById(Ac.e.funListContainerV2);
            if (viewFindViewById == null) {
                ViewStub viewStub = (ViewStub) view.findViewById(Ac.e.funListContainerV2Stub);
                viewFindViewById = viewStub != null ? viewStub.inflate() : null;
            }
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
            }
            HomeFragment homeFragment = (HomeFragment) getParentFragment();
            final d dVar = new d(homeFragment);
            this.f35110r0 = dVar;
            dVar.f4781e = viewFindViewById;
            dVar.f4782f = viewFindViewById != null ? (LinearLayout) viewFindViewById.findViewById(Ac.e.functionRow0) : null;
            dVar.f4783g = viewFindViewById != null ? (LinearLayout) viewFindViewById.findViewById(Ac.e.functionRow1) : null;
            if (homeFragment == null || (activity = homeFragment.getActivity()) == null) {
                Context context = viewFindViewById != null ? viewFindViewById.getContext() : null;
                if (context == null) {
                    return;
                } else {
                    activity = context;
                }
            }
            p354xe.g gVar = new p354xe.g(activity);
            gVar.f43930e = true;
            gVar.f43934j = true;
            gVar.f4985b = dVar.f4780d;
            gVar.registerAdapterDataObserver(dVar.f4790n);
            dVar.f4784h = gVar;
            LinearLayout linearLayout = dVar.f4782f;
            if (linearLayout != null) {
                final int i7 = 0;
                linearLayout.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: Je.a
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                        switch (i7) {
                            case 0:
                                int i18 = i12 - i10;
                                if (i18 > 0 && i18 != i16 - i14) {
                                    d dVar2 = dVar;
                                    if (!dVar2.f4780d.isEmpty()) {
                                        dVar2.a(0);
                                    }
                                    break;
                                }
                                break;
                            default:
                                int i19 = i12 - i10;
                                if (i19 > 0 && i19 != i16 - i14) {
                                    d dVar3 = dVar;
                                    if (dVar3.f4780d.size() > 4) {
                                        dVar3.a(1);
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
            LinearLayout linearLayout2 = dVar.f4783g;
            if (linearLayout2 != null) {
                final int i10 = 1;
                linearLayout2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: Je.a
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view2, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                        switch (i10) {
                            case 0:
                                int i19 = i13 - i11;
                                if (i19 > 0 && i19 != i17 - i15) {
                                    d dVar2 = dVar;
                                    if (!dVar2.f4780d.isEmpty()) {
                                        dVar2.a(0);
                                    }
                                    break;
                                }
                                break;
                            default:
                                int i110 = i13 - i11;
                                if (i110 > 0 && i110 != i17 - i15) {
                                    d dVar3 = dVar;
                                    if (dVar3.f4780d.size() > 4) {
                                        dVar3.a(1);
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
        }
    }

    public final HomeScrollView w() {
        return (HomeScrollView) this.f35107p.getValue();
    }

    public final Handler x() {
        return (Handler) this.f35111s0.getValue();
    }

    public final VerticalSwipeRefreshLayout y() {
        return (VerticalSwipeRefreshLayout) this.t.getValue();
    }

    public final void z() {
        View view;
        View view2;
        View view3;
        boolean zBooleanValue = false;
        if (!BaseApplication.hasLogin()) {
            k kVar = this.f35113u0;
            if (kVar != null) {
                kVar.a(false);
            }
            Ie.h hVar = this.f35115v0;
            if (hVar != null && (view = hVar.f4342a) != null) {
                p220oa.h.s(view, true);
            }
        } else if (d0.t()) {
            if (this.f35113u0 == null) {
                View viewFindViewById = this.f27318b.findViewById(Ac.e.unVerifyUserStub);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                this.f35113u0 = new k((ViewStub) viewFindViewById);
            }
            Ie.h hVar2 = this.f35115v0;
            if (hVar2 != null && (view3 = hVar2.f4342a) != null) {
                p220oa.h.s(view3, false);
            }
        } else {
            k kVar2 = this.f35113u0;
            if (kVar2 != null) {
                kVar2.a(false);
            }
            Ie.h hVar3 = this.f35115v0;
            if (hVar3 != null && (view2 = hVar3.f4342a) != null) {
                p220oa.h.s(view2, true);
            }
        }
        AsyncViewStub asyncViewStub = (AsyncViewStub) this.f27318b.findViewById(Ac.e.asyncTopAccountBar);
        if (asyncViewStub != null) {
            HomeFragment homeFragment = (HomeFragment) getParentFragment();
            if (homeFragment != null) {
                if (homeFragment.f35085M == null) {
                    homeFragment.f35085M = Boolean.valueOf(com.transsnet.palmpay.core.config.d.r());
                }
                Boolean bool = homeFragment.f35085M;
                Intrinsics.e(bool);
                zBooleanValue = bool.booleanValue();
            }
            asyncViewStub.b(zBooleanValue, new C0177t(this, 0));
        }
    }
}
