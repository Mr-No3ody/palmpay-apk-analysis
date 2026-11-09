package com.transsnet.palmpay.ui.fragment;

import Ab.C;
import Ac.f;
import Bc.q;
import C0.G;
import Ce.H;
import Ce.K;
import Ce.M;
import Fe.I;
import Gb.T;
import Je.k;
import Je.l;
import Ke.b;
import Ke.c;
import Ke.d;
import Ke.e;
import Ke.g;
import Ke.h;
import Ke.i;
import Pa.i0;
import Pa.n0;
import Pa.r0;
import Wf.AbstractC0780y;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.E;
import androidx.lifecycle.AbstractC1207q;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.V;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.mlkit.common.MlKitException;
import com.horcrux.svg.d0;
import com.mikepenz.iconics.view.IconicsImageView;
import com.mikepenz.iconics.view.IconicsTextView;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.adsdk.widgets.MarqueeTextView.MarqueeViewV2;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMVPFragment;
import com.transsnet.palmpay.core.base.IBasePresenter;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.bean.message.PushMessage;
import com.transsnet.palmpay.core.db.entity.User;
import com.transsnet.palmpay.custom_view.StatusBarView;
import com.transsnet.palmpay.custom_view.async.AsyncViewStub;
import com.transsnet.palmpay.custom_view.r;
import com.transsnet.palmpay.custom_view.swipe.VerticalSwipeRefreshLayout;
import com.transsnet.palmpay.custom_view.utils.CommonViewExtKt;
import com.transsnet.palmpay.main.export.bean.rsp.MeTabTotalAssetInfo;
import com.transsnet.palmpay.main.export.bean.rsp.QueryHomeAccountInfoRsp;
import com.transsnet.palmpay.main.export.bean.rsp.SlideMenuListRsp;
import com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView;
import com.transsnet.palmpay.util.ImageUtils;
import com.transsnet.palmpay.util.SpanUtils;
import com.transsnet.palmpay.util.TimeUtils;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C1850q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p156ka.a;
import p183m6.j;
import p189me.jessyan.autosize.internal.CancelAdapt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/ui/fragment/HomeMeFragment;", "Lcom/transsnet/palmpay/core/base/BaseMVPFragment;", "LFe/I;", "Lcom/transsnet/palmpay/ui/mvp/contract/HomeFragmentContract$IView;", "Lme/jessyan/autosize/internal/CancelAdapt;", "<init>", "()V", "Lcom/transsnet/palmpay/core/bean/message/PushMessage;", "pushMessage", "", "onReceivePushMessage", "(Lcom/transsnet/palmpay/core/bean/message/PushMessage;)V", "Lcom/transsnet/palmpay/core/bean/message/MessageEvent;", "event", "onMessageEvent", "(Lcom/transsnet/palmpay/core/bean/message/MessageEvent;)V", "module_main_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHomeMeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeMeFragment.kt\ncom/transsnet/palmpay/ui/fragment/HomeMeFragment\n+ 2 ViewExt.kt\ncom/transsnet/palmpay/core/ext/ViewExtKt\n*L\n1#1,543:1\n629#2,11:544\n*S KotlinDebug\n*F\n+ 1 HomeMeFragment.kt\ncom/transsnet/palmpay/ui/fragment/HomeMeFragment\n*L\n124#1:544,11\n*E\n"})
public final class HomeMeFragment extends BaseMVPFragment<I> implements HomeFragmentContract$IView, CancelAdapt {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public b f35121A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public c f35122B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public d f35123C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public e f35124H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f35125L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public MeTabTotalAssetInfo f35126M;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public VerticalSwipeRefreshLayout f35127Q;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public MarqueeViewV2 f35128X;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f35129j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f35130o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h f35131p;
    public i t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public k f35132v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public j f35133w;

    public static final void u(HomeMeFragment homeMeFragment) {
        AsyncViewStub asyncViewStub;
        h hVar;
        if (homeMeFragment.f27318b == null) {
            return;
        }
        homeMeFragment.y();
        ViewStub viewStub = (ViewStub) homeMeFragment.f27318b.findViewById(Ac.e.dragViewStub);
        boolean z3 = false;
        if (viewStub != null) {
            viewStub.setVisibility(0);
            org.chromium.support_lib_boundary.util.b.c((SingleAdView) homeMeFragment.f27318b.findViewById(Ac.e.floatAdView));
        }
        if (!BaseApplication.hasLogin() && (hVar = homeMeFragment.f35131p) != null) {
            hVar.a();
        }
        View view = homeMeFragment.f27318b;
        if (view == null || (asyncViewStub = (AsyncViewStub) view.findViewById(Ac.e.asyncTopAdView)) == null) {
            return;
        }
        HomeFragment homeFragment = (HomeFragment) homeMeFragment.getParentFragment();
        if (homeFragment != null) {
            if (homeFragment.f35085M == null) {
                homeFragment.f35085M = Boolean.valueOf(com.transsnet.palmpay.core.config.d.r());
            }
            Boolean bool = homeFragment.f35085M;
            Intrinsics.e(bool);
            if (bool.booleanValue()) {
                z3 = true;
            }
        }
        asyncViewStub.b(z3, new C(homeMeFragment, 5));
    }

    @Override // com.transsnet.palmpay.core.base.IBaseView
    public final AbstractC1207q getCoroutineScope() {
        return V.f(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.main_fragment_home_me_tab;
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView
    public final void handleHomeAccountInfo(QueryHomeAccountInfoRsp queryHomeAccountInfoRsp) {
        QueryHomeAccountInfoRsp.AccountInfoBean accountInfoBean;
        VerticalSwipeRefreshLayout verticalSwipeRefreshLayout = this.f35127Q;
        if (verticalSwipeRefreshLayout != null) {
            verticalSwipeRefreshLayout.setRefreshing(false);
        }
        if (queryHomeAccountInfoRsp == null || (accountInfoBean = queryHomeAccountInfoRsp.accountInfo) == null) {
            return;
        }
        User user = BaseApplication.getInstance().getUser();
        QueryHomeAccountInfoRsp.AccountInfoBean.BriefnessAccountAmountBean briefnessAccountAmountBean = accountInfoBean.briefnessAccountAmount;
        if (!TextUtils.isEmpty(briefnessAccountAmountBean != null ? briefnessAccountAmountBean.accountId : null) && user != null) {
            QueryHomeAccountInfoRsp.AccountInfoBean.BriefnessAccountAmountBean briefnessAccountAmountBean2 = accountInfoBean.briefnessAccountAmount;
            user.setBalanceAccountId(briefnessAccountAmountBean2 != null ? briefnessAccountAmountBean2.accountId : null);
        }
        BaseApplication.getInstance().getUserDataSource().getClass();
        a.c(user);
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView
    public final void handleMeTabTotalAssetInfo(MeTabTotalAssetInfo meTabTotalAssetInfo) {
        VerticalSwipeRefreshLayout verticalSwipeRefreshLayout = this.f35127Q;
        if (verticalSwipeRefreshLayout != null) {
            verticalSwipeRefreshLayout.setRefreshing(false);
        }
        i iVar = this.t;
        if (iVar != null) {
            iVar.a(false);
        }
        this.f35126M = meTabTotalAssetInfo;
        if (d0.t()) {
            k kVarX = x();
            if (kVarX != null) {
                kVarX.a(true);
            }
            i iVar2 = this.t;
            if (iVar2 != null) {
                iVar2.b(false);
                return;
            }
            return;
        }
        i iVarW = w();
        if (iVarW != null) {
            iVarW.f(meTabTotalAssetInfo);
        }
        k kVarX2 = x();
        if (kVarX2 != null) {
            kVarX2.a(false);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        Window window;
        Handler handler = new Handler(Looper.getMainLooper());
        E activity = getActivity();
        View decorView = (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView();
        if (decorView == null) {
            return 0;
        }
        decorView.post(new H(handler, 1, this, this));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        ViewStub viewStub;
        View viewInflate;
        View viewFindViewById;
        View view;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate2 = inflater.inflate(f.main_fragment_home_me_tab, viewGroup, false);
        this.f27318b = viewInflate2;
        this.f35127Q = (VerticalSwipeRefreshLayout) viewInflate2.findViewById(Ac.e.refreshLayout);
        this.f35123C = new d(getActivity(), (LinearLayout) this.f27318b.findViewById(Ac.e.viewContainer));
        org.greenrobot.eventbus.c.b().j(this);
        if (!BaseApplication.hasLogin()) {
            j jVarV = v();
            if (jVarV != null && (view = (View) jVarV.f39520b) != null) {
                p220oa.h.s(view, true);
            }
        } else if (d0.t()) {
            k kVarX = x();
            if (kVarX != null) {
                kVarX.a(true);
            }
            try {
                View view2 = this.f27318b;
                if (view2 != null && (viewStub = (ViewStub) view2.findViewById(Ac.e.logoutStub)) != null && (viewInflate = viewStub.inflate()) != null && (viewFindViewById = viewInflate.findViewById(Ac.e.btnLogOut)) != null) {
                    viewFindViewById.setOnClickListener(new K(this, 0));
                }
            } catch (Exception unused) {
            }
        }
        VerticalSwipeRefreshLayout verticalSwipeRefreshLayout = this.f35127Q;
        if (verticalSwipeRefreshLayout != null) {
            verticalSwipeRefreshLayout.setOnRefreshListener(new A8.a(this, 23));
        }
        return this.f27318b;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment, com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.b().l(this);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        MarqueeViewV2 marqueeViewV2 = this.f35128X;
        if (marqueeViewV2 != null) {
            marqueeViewV2.setAdListener(null);
            marqueeViewV2.release();
        }
        this.f35128X = null;
        this.f35123C = null;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(@NotNull MessageEvent event) {
        i iVarW;
        Intrinsics.checkNotNullParameter(event, "event");
        int eventType = event.getEventType();
        if (eventType == 4) {
            y();
            z();
            return;
        }
        if (eventType == 273) {
            if (this.f35125L) {
                HomeFragment homeFragment = (HomeFragment) getParentFragment();
                if (homeFragment != null) {
                    homeFragment.G(false);
                }
                I i7 = (I) this.f27328i;
                if (i7 != null) {
                    i7.queryMeTabTotalAssetInfo();
                    return;
                }
                return;
            }
            return;
        }
        if (eventType == 309) {
            I i10 = (I) this.f27328i;
            if (i10 != null) {
                i10.queryMenuList();
                return;
            }
            return;
        }
        if (eventType != 407) {
            if (eventType == 519 && (iVarW = w()) != null) {
                iVarW.f(this.f35126M);
                return;
            }
            return;
        }
        HomeFragment homeFragment2 = (HomeFragment) getParentFragment();
        if (homeFragment2 != null) {
            homeFragment2.G(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f35125L = false;
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public final void onReceivePushMessage(@Nullable PushMessage pushMessage) {
        HomeFragment homeFragment;
        if ((pushMessage != null ? pushMessage.content : null) == null || !PushMessage.MESSAGE_TYPE_CASH_IN.equals(pushMessage.content.messageType) || (homeFragment = (HomeFragment) getParentFragment()) == null) {
            return;
        }
        homeFragment.G(false);
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f35125L = true;
        I i7 = (I) this.f27328i;
        if (i7 != null) {
            i7.queryMenuList();
        }
        HomeFragment homeFragment = (HomeFragment) getParentFragment();
        if (homeFragment != null) {
            homeFragment.G(false);
        }
        I i10 = (I) this.f27328i;
        if (i10 != null) {
            i10.queryLastTransactionHistory();
        }
        I i11 = (I) this.f27328i;
        if (i11 != null) {
            i11.queryMeTabTotalAssetInfo();
        }
        z();
    }

    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView
    public final void queryLastTransactionHistoryOk(List list) {
        VerticalSwipeRefreshLayout verticalSwipeRefreshLayout = this.f35127Q;
        if (verticalSwipeRefreshLayout != null) {
            verticalSwipeRefreshLayout.setRefreshing(false);
        }
        if (this.t == null && list != null && (!list.isEmpty())) {
            i iVarW = w();
            if (iVarW != null) {
                iVarW.d(list);
                return;
            }
            return;
        }
        i iVar = this.t;
        if (iVar != null) {
            iVar.d(list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v14, types: [android.view.View, com.palmpay.lib.ui.button.PpButton] */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r12v9, types: [android.view.LayoutInflater] */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v15, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r14v3, types: [android.view.ViewGroup] */
    @Override // com.transsnet.palmpay.ui.mvp.contract.HomeFragmentContract$IView
    public final void showSlideMenuList(SlideMenuListRsp slideMenuListRsp) throws Throwable {
        View view;
        View view2;
        Typeface typefaceA;
        float f10;
        Throwable th;
        View view3;
        View view4;
        boolean zC;
        String str;
        String str2;
        String str3;
        String str4;
        ?? bitmapDrawable;
        View view5;
        int i7 = 8;
        VerticalSwipeRefreshLayout verticalSwipeRefreshLayout = this.f35127Q;
        boolean z3 = false;
        if (verticalSwipeRefreshLayout != null) {
            verticalSwipeRefreshLayout.setRefreshing(false);
        }
        if (slideMenuListRsp != null) {
            SlideMenuListRsp.BusinessMenuData businessMenuData = slideMenuListRsp.businessMenu;
            if (businessMenuData == null) {
                b bVar = this.f35121A;
                if (bVar != null && (view5 = bVar.f5423a) != null) {
                    p220oa.h.s(view5, false);
                }
            } else if (BaseApplication.hasLogin()) {
                if (this.f35121A == null) {
                    View viewFindViewById = this.f27318b.findViewById(Ac.e.fhm_my_business_stub);
                    Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                    this.f35121A = new b((ViewStub) viewFindViewById);
                }
                b bVar2 = this.f35121A;
                if (bVar2 != null && (view2 = bVar2.f5423a) != null && !businessMenuData.equals(bVar2.f5429g)) {
                    bVar2.f5429g = businessMenuData;
                    TextView textView = bVar2.f5427e;
                    if (textView != null) {
                        textView.setOnClickListener(new l(businessMenuData, 7));
                    }
                    r0.h1(bVar2.f5424b, businessMenuData.iconUrl, Ac.d.main_my_business);
                    TextView textView2 = bVar2.f5425c;
                    if (textView2 != null) {
                        String str5 = businessMenuData.title;
                        if (str5 == null) {
                            str5 = "My Business";
                        }
                        textView2.setText(str5);
                    }
                    Context context = view2.getContext();
                    if (context != null) {
                        try {
                            typefaceA = Y.j.a(L6.e.lib_ui_palmpaynum_bold_ttf, context);
                        } catch (Exception unused) {
                            typefaceA = null;
                        }
                        SpanUtils foregroundColor = G.i("Account: ").append(i0.n(businessMenuData.content, false)).setForegroundColor(context.getColor(L6.b.ppColorTextPrimary));
                        if (typefaceA != null) {
                            foregroundColor.setTypeface(typefaceA);
                        }
                        TextView textView3 = bVar2.f5426d;
                        if (textView3 != null) {
                            textView3.setText(foregroundColor.create());
                        }
                    }
                    boolean zIsEmpty = TextUtils.isEmpty(businessMenuData.superscriptPictureUrl);
                    ImageView imageView = bVar2.f5428f;
                    if (!zIsEmpty) {
                        if (imageView != null) {
                            p220oa.h.C(imageView);
                        }
                        r0.l1(businessMenuData.superscriptPictureUrl, imageView);
                    } else if (imageView != null) {
                        p220oa.h.c(imageView);
                    }
                }
            } else {
                b bVar3 = this.f35121A;
                if (bVar3 != null && (view = bVar3.f5423a) != null) {
                    p220oa.h.s(view, false);
                }
            }
            SlideMenuListRsp.ExtraMenuData extraMenuData = slideMenuListRsp.priorityMenu;
            if (extraMenuData == null || !BaseApplication.hasLogin()) {
                f10 = 1.0f;
                th = null;
                c cVar = this.f35122B;
                if (cVar != null && (view3 = cVar.f5430a) != null) {
                    p220oa.h.s(view3, false);
                }
            } else {
                if (this.f35122B == null) {
                    View viewFindViewById2 = this.f27318b.findViewById(Ac.e.fhm_kyc_stub);
                    Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
                    ViewStub stub = (ViewStub) viewFindViewById2;
                    Intrinsics.checkNotNullParameter(stub, "stub");
                    c cVar2 = new c();
                    View viewInflate = stub.inflate();
                    cVar2.f5430a = viewInflate;
                    if (viewInflate != null) {
                        int i10 = Ac.e.btnKyc;
                        PpButton ppButton = (PpButton) p059e1.a.m(i10, viewInflate);
                        if (ppButton != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            i10 = Ac.e.ivClose;
                            IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i10, viewInflate);
                            if (iconicsImageView != null) {
                                i10 = Ac.e.ivIcon;
                                ImageView imageView2 = (ImageView) p059e1.a.m(i10, viewInflate);
                                if (imageView2 != null) {
                                    i10 = Ac.e.tvKycMessage;
                                    TextView textView4 = (TextView) p059e1.a.m(i10, viewInflate);
                                    if (textView4 != null) {
                                        i10 = Ac.e.tvKycTitle;
                                        TextView textView5 = (TextView) p059e1.a.m(i10, viewInflate);
                                        if (textView5 != null) {
                                            cVar2.f5433d = new Bc.i(constraintLayout, ppButton, constraintLayout, iconicsImageView, imageView2, textView4, textView5);
                                        }
                                    }
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
                    }
                    if (viewInflate != null) {
                        viewInflate.setOnClickListener(cVar2);
                    }
                    cVar2.f5432c = TimeUtils.isToday(p059e1.a.E(0L, "main_sp_close_security_center"));
                    this.f35122B = cVar2;
                }
                c cVar3 = this.f35122B;
                if (cVar3 == null) {
                    f10 = 1.0f;
                    th = null;
                } else {
                    if (cVar3.f5432c) {
                        View view6 = cVar3.f5430a;
                        if (view6 != null) {
                            p220oa.h.s(view6, false);
                        }
                    } else if (!Intrinsics.c(cVar3.f5431b, extraMenuData)) {
                        cVar3.f5431b = extraMenuData;
                        Bc.i iVar = cVar3.f5433d;
                        if (iVar != null) {
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) iVar.f725c;
                            String backgroundColor = extraMenuData.getBackgroundColor(i0.V(constraintLayout2));
                            int iHexToColorInt = backgroundColor != null ? CommonViewExtKt.hexToColorInt(backgroundColor, constraintLayout2.getContext(), L6.b.ppColorAssisBackground) : CommonViewExtKt.colorInt(L6.b.ppColorAssisBackground, constraintLayout2.getContext());
                            float dp = CommonViewExtKt.getDp(8.0f);
                            int iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorBackgroundLight, constraintLayout2.getContext());
                            int i11 = i0.V(constraintLayout2) ? 26 : MlKitException.CODE_SCANNER_TASK_IN_PROGRESS;
                            f10 = 1.0f;
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            gradientDrawable.setShape(0);
                            gradientDrawable.setCornerRadius(dp);
                            gradientDrawable.setColor(iHexToColorInt);
                            gradientDrawable.setStroke(CommonViewExtKt.getDp(1), androidx.core.graphics.d.e(iColorInt, i11));
                            constraintLayout2.setBackground(gradientDrawable);
                        } else {
                            f10 = 1.0f;
                        }
                        View view7 = cVar3.f5430a;
                        String textColor = extraMenuData.getTextColor(i0.V(view7));
                        int iHexToColorInt2 = textColor != null ? CommonViewExtKt.hexToColorInt(textColor, view7 != null ? view7.getContext() : null, "#9B5D00") : Color.parseColor("#9B5D00");
                        if (iVar != null) {
                            TextView textView6 = (TextView) iVar.f729g;
                            textView6.setText(extraMenuData.menuName);
                            textView6.setTextColor(iHexToColorInt2);
                        }
                        if (iVar != null) {
                            TextView textView7 = (TextView) iVar.f728f;
                            textView7.setText(extraMenuData.showMsg);
                            textView7.setTextColor(iHexToColorInt2);
                        }
                        if (iVar != null) {
                            ImageView imageView3 = (ImageView) iVar.f727e;
                            String icon = extraMenuData.getIcon(i0.V(imageView3));
                            if (TextUtils.isEmpty(icon)) {
                                p220oa.h.c(imageView3);
                            } else {
                                p220oa.h.C(imageView3);
                                r0.l1(icon, imageView3);
                            }
                        }
                        if (iVar != null) {
                            ?? r11 = (PpButton) iVar.f726d;
                            r11.setOnClickListener(cVar3);
                            r11.setTextColor(iHexToColorInt2);
                            r11.setText(extraMenuData.button);
                            Context context2 = r11.getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                            float dp2 = CommonViewExtKt.getDp(12.0f);
                            try {
                                th = null;
                                try {
                                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(CommonViewExtKt.getDp(67.0f), CommonViewExtKt.getDp(24.0f), Bitmap.Config.ARGB_8888);
                                    ImageUtils.addCornerBorder(bitmapCreateBitmap, CommonViewExtKt.getDp(f10), iHexToColorInt2, dp2, true);
                                    bitmapDrawable = new BitmapDrawable(context2.getResources(), bitmapCreateBitmap);
                                } catch (Exception unused2) {
                                    bitmapDrawable = th;
                                }
                            } catch (Exception unused3) {
                                th = null;
                            }
                            r11.setBackground(bitmapDrawable);
                        } else {
                            th = null;
                        }
                        if (iVar != null) {
                            IconicsImageView iconicsImageView2 = (IconicsImageView) iVar.f730i;
                            iconicsImageView2.setImageTintList(ColorStateList.valueOf(iHexToColorInt2));
                            p220oa.h.s(iconicsImageView2, extraMenuData.canClose);
                            iconicsImageView2.setOnClickListener(new l(cVar3, i7));
                        }
                        boolean z8 = extraMenuData.needDisplay && !cVar3.f5432c;
                        View view8 = cVar3.f5430a;
                        if (view8 != null) {
                            p220oa.h.s(view8, z8);
                        }
                    }
                    f10 = 1.0f;
                    th = null;
                }
            }
            List<SlideMenuListRsp.QuickAccessDTO> list = slideMenuListRsp.quickAccessDTO;
            if (list == null || !BaseApplication.hasLogin()) {
                e eVar = this.f35124H;
                if (eVar != null && (view4 = eVar.f5436a) != null) {
                    p220oa.h.s(view4, false);
                }
            } else {
                if (this.f35124H == null) {
                    View viewFindViewById3 = this.f27318b.findViewById(Ac.e.fhm_my_quick_access_stub);
                    Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
                    this.f35124H = new e((ViewStub) viewFindViewById3);
                }
                e eVar2 = this.f35124H;
                if (eVar2 != null) {
                    n0.g().v("Me_QuickAccessCard_View");
                    Integer numValueOf = Integer.valueOf(list.size());
                    List list2 = eVar2.f5438c;
                    if (numValueOf.equals(list2 != null ? Integer.valueOf(list2.size()) : th)) {
                        zC = false;
                        int i12 = 0;
                        for (Object obj : list) {
                            int i13 = i12 + 1;
                            if (i12 < 0) {
                                C1850q.k();
                                throw th;
                            }
                            SlideMenuListRsp.QuickAccessDTO quickAccessDTO = (SlideMenuListRsp.QuickAccessDTO) obj;
                            List list3 = eVar2.f5438c;
                            zC = Intrinsics.c(quickAccessDTO, list3 != null ? (SlideMenuListRsp.QuickAccessDTO) list3.get(i12) : th);
                            F6.d.h("isSameData", 3, "come1");
                            i12 = i13;
                        }
                    } else {
                        zC = false;
                    }
                    if (!zC) {
                        LinearLayout linearLayout = eVar2.f5437b;
                        if (linearLayout != null) {
                            linearLayout.removeAllViews();
                        }
                        eVar2.f5438c = list;
                        int i14 = 0;
                        for (Object obj2 : list) {
                            int i15 = i14 + 1;
                            if (i14 < 0) {
                                C1850q.k();
                                throw null;
                            }
                            SlideMenuListRsp.QuickAccessDTO quickAccessDTO2 = (SlideMenuListRsp.QuickAccessDTO) obj2;
                            HashMap map = new HashMap();
                            map.put("memberid", BaseApplication.getInstance().getUser().getMemberId());
                            if (quickAccessDTO2 != null && (str4 = quickAccessDTO2.title) != null) {
                                map.put(FirebaseAnalytics.Param.CONTENT, str4);
                            }
                            n0.g().n("Me_QucikAccess_View", map);
                            View view9 = eVar2.f5436a;
                            View viewInflate2 = LayoutInflater.from(view9 != null ? view9.getContext() : th).inflate(f.main_quick_info_item, th, z3);
                            TextView textView8 = (TextView) viewInflate2.findViewById(Ac.e.tvTitle);
                            TextView textView9 = (TextView) viewInflate2.findViewById(Ac.e.tvContent);
                            TextView textView10 = (TextView) viewInflate2.findViewById(Ac.e.tvRemark);
                            int i16 = i7;
                            r0.l1(quickAccessDTO2 != null ? quickAccessDTO2.icon : null, (ImageView) viewInflate2.findViewById(Ac.e.ivLogo));
                            if (quickAccessDTO2 != null && (str3 = quickAccessDTO2.title) != null) {
                                if (TextUtils.isEmpty(str3)) {
                                    str3 = null;
                                }
                                if (str3 != null && textView8 != null) {
                                    textView8.setText(str3);
                                }
                            }
                            if (quickAccessDTO2 != null && (str2 = quickAccessDTO2.firstContent) != null) {
                                if (TextUtils.isEmpty(str2)) {
                                    str2 = null;
                                }
                                if (str2 != null && textView9 != null) {
                                    textView9.setText(str2);
                                }
                            }
                            if (quickAccessDTO2 != null && (str = quickAccessDTO2.secondContent) != null) {
                                if (TextUtils.isEmpty(str)) {
                                    str = null;
                                }
                                if (str != null) {
                                    if (textView9 != null) {
                                        textView9.setMaxLines(1);
                                    }
                                    if (textView10 != null) {
                                        textView10.setVisibility(0);
                                    }
                                    if (textView10 != null) {
                                        textView10.setText(str);
                                    }
                                }
                            }
                            float f11 = f10;
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, CommonViewExtKt.getDp(96.0f), f11);
                            if (i14 < list.size() - 1) {
                                layoutParams.setMarginEnd(CommonViewExtKt.getDp(i16));
                            }
                            viewInflate2.setLayoutParams(layoutParams);
                            viewInflate2.setOnClickListener(new T(10, quickAccessDTO2, eVar2));
                            if (linearLayout != null) {
                                linearLayout.addView(viewInflate2);
                            }
                            i14 = i15;
                            f10 = f11;
                            i7 = i16;
                            z3 = false;
                            th = null;
                        }
                    }
                }
            }
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
            p042cg.f fVar = Wf.I.f10809a;
            AbstractC0780y.m(lifecycleCoroutineScopeImplF, p042cg.e.f19009c, null, new M(slideMenuListRsp, this, slideMenuListRsp, null), 2);
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseMVPFragment
    public final IBasePresenter t() {
        return new I();
    }

    public final j v() {
        StatusBarView statusBarView;
        FrameLayout frameLayout;
        AsyncViewStub asyncViewStub;
        ImageView imageView;
        ImageView imageView2;
        if (this.f35133w == null) {
            View view = this.f27318b;
            j jVar = new j(4);
            if (view != null) {
                ViewStub viewStub = (ViewStub) view.findViewById(Ac.e.layoutGuestAssetsStub);
                if (viewStub != null) {
                    p220oa.h.s(viewStub, true);
                }
                View viewFindViewById = view.findViewById(Ac.e.mbi_no_balance_container);
                if (viewFindViewById != null) {
                    viewFindViewById.getContext();
                    jVar.f39520b = viewFindViewById;
                    int iColorInt = CommonViewExtKt.colorInt(L6.b.ppColorTextPrimary, viewFindViewById.getContext());
                    ImageView imageView3 = (ImageView) viewFindViewById.findViewById(Ac.e.ivSecPalmpay);
                    if (imageView3 != null) {
                        imageView3.setColorFilter(iColorInt);
                    }
                    if (i0.T() && (imageView2 = (ImageView) viewFindViewById.findViewById(Ac.e.ivPalmpay)) != null) {
                        imageView2.setColorFilter(iColorInt);
                    }
                    PpButton ppButton = (PpButton) viewFindViewById.findViewById(Ac.e.rtvGetNow);
                    if (ppButton != null) {
                        ppButton.setText(!TextUtils.isEmpty(i0.y()) ? "Login" : "Sign Up");
                        ppButton.setOnClickListener(new K8.a(6));
                    }
                }
            }
            this.f35133w = jVar;
            View view2 = this.f27318b;
            if (view2 != null && (imageView = (ImageView) view2.findViewById(Ac.e.ivAssetsHolder)) != null) {
                p220oa.h.c(imageView);
            }
            View view3 = this.f27318b;
            if (view3 != null && (asyncViewStub = (AsyncViewStub) view3.findViewById(Ac.e.asyncTopAdView)) != null) {
                p220oa.h.c(asyncViewStub);
            }
            View view4 = this.f27318b;
            if (view4 != null && (frameLayout = (FrameLayout) view4.findViewById(Ac.e.topBarContainer)) != null) {
                p220oa.h.c(frameLayout);
            }
            View view5 = this.f27318b;
            if (view5 != null && (statusBarView = (StatusBarView) view5.findViewById(Ac.e.statusBarView)) != null) {
                p220oa.h.c(statusBarView);
            }
        }
        return this.f35133w;
    }

    public final i w() {
        ImageView imageView;
        if (this.t == null) {
            this.t = new i(this.f27318b);
            View view = this.f27318b;
            if (view != null && (imageView = (ImageView) view.findViewById(Ac.e.ivAssetsHolder)) != null) {
                p220oa.h.A(imageView, false, p025ba.a.core_anim_fade_out);
            }
        }
        return this.t;
    }

    public final k x() {
        if (BaseApplication.hasLogin() && d0.t() && this.f35132v == null) {
            View viewFindViewById = this.f27318b.findViewById(Ac.e.unVerifyUserStub);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.f35132v = new k((ViewStub) viewFindViewById);
        }
        return this.f35132v;
    }

    public final void y() {
        String strString;
        Context context;
        View viewInflate;
        if (this.f35131p == null) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(this);
            ViewStub viewStub = (ViewStub) this.f27318b.findViewById(Ac.e.userInfoStub);
            h hVar = new h(0);
            hVar.f5445c = lifecycleCoroutineScopeImplF;
            if (viewStub != null) {
                try {
                    viewInflate = viewStub.inflate();
                } catch (Exception unused) {
                }
            } else {
                viewInflate = null;
            }
            hVar.f5444b = viewInflate;
            View view = (View) hVar.f5444b;
            if (view != null) {
                int i7 = Ac.e.imageViewAvatar;
                ImageView imageView = (ImageView) p059e1.a.m(i7, view);
                if (imageView != null) {
                    i7 = Ac.e.ivLevel;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) p059e1.a.m(i7, view);
                    if (appCompatImageView != null) {
                        i7 = Ac.e.ivNew;
                        ImageView imageView2 = (ImageView) p059e1.a.m(i7, view);
                        if (imageView2 != null) {
                            i7 = Ac.e.ivScan;
                            IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, view);
                            if (iconicsImageView != null) {
                                i7 = Ac.e.ivSettings;
                                IconicsImageView iconicsImageView2 = (IconicsImageView) p059e1.a.m(i7, view);
                                if (iconicsImageView2 != null) {
                                    i7 = Ac.e.tvLevel;
                                    IconicsTextView iconicsTextView = (IconicsTextView) p059e1.a.m(i7, view);
                                    if (iconicsTextView != null) {
                                        i7 = Ac.e.tvName;
                                        TextView textView = (TextView) p059e1.a.m(i7, view);
                                        if (textView != null) {
                                            i7 = Ac.e.tvSignUpLogin;
                                            IconicsTextView iconicsTextView2 = (IconicsTextView) p059e1.a.m(i7, view);
                                            if (iconicsTextView2 != null) {
                                                hVar.f5446d = new q((ConstraintLayout) view, imageView, appCompatImageView, imageView2, iconicsImageView, iconicsImageView2, iconicsTextView, textView, iconicsTextView2);
                                                iconicsImageView2.setOnClickListener(hVar);
                                                iconicsImageView.setOnClickListener(hVar);
                                                imageView.setOnClickListener(hVar);
                                                textView.setOnClickListener(hVar);
                                                iconicsTextView.setOnClickListener(hVar);
                                                iconicsTextView2.setOnClickListener(hVar);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
            }
            this.f35131p = hVar;
        }
        h hVar2 = this.f35131p;
        if (hVar2 != null && BaseApplication.hasLogin()) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) hVar2.f5445c;
            p042cg.f fVar = Wf.I.f10809a;
            AbstractC0780y.m(lifecycleCoroutineScopeImpl, p042cg.e.f19009c, null, new g(hVar2, null), 2);
        }
        h hVar3 = this.f35131p;
        if (hVar3 != null) {
            boolean zHasLogin = BaseApplication.hasLogin();
            q qVar = (q) hVar3.f5446d;
            if (!zHasLogin) {
                hVar3.a();
                if (qVar != null) {
                    ((ImageView) qVar.f818e).setImageResource(r.cv_avatar_default);
                    return;
                }
                return;
            }
            User user = BaseApplication.get().getUser();
            if (user != null) {
                if (!TextUtils.isEmpty(user.getAvatar())) {
                    r0.m1(user.getAvatar(), qVar != null ? (ImageView) qVar.f818e : null);
                } else if (qVar != null) {
                    ((ImageView) qVar.f818e).setImageResource(r.cv_avatar_default);
                }
                if (qVar != null) {
                    boolean zIsEmpty = TextUtils.isEmpty(user.getDisplayName());
                    View view2 = (View) hVar3.f5444b;
                    if (zIsEmpty || user.isTier0User()) {
                        strString = CommonViewExtKt.string(Ac.h.main_hi_palmpayer, view2 != null ? view2.getContext() : null);
                    } else {
                        strString = (view2 == null || (context = view2.getContext()) == null) ? null : context.getString(p025ba.k.core_hi, user.getDisplayName());
                    }
                    TextView tvName = qVar.f816c;
                    tvName.setText(strString);
                    IconicsTextView tvLevel = (IconicsTextView) qVar.f822j;
                    Intrinsics.checkNotNullExpressionValue(tvLevel, "tvLevel");
                    p220oa.h.s(tvLevel, !TextUtils.isEmpty(user.getUserLevel()));
                    IconicsTextView tvSignUpLogin = (IconicsTextView) qVar.f823o;
                    p220oa.h.c(tvSignUpLogin);
                    p220oa.h.C(tvName);
                    p220oa.h.s((IconicsImageView) qVar.f815b, !user.isTier0User());
                    p220oa.h.s((IconicsImageView) qVar.f821i, !user.isTier0User());
                    p220oa.h.s((AppCompatImageView) qVar.f819f, !user.isTier0User());
                    if (!user.isTier0User()) {
                        if (user.isTier3User()) {
                            tvLevel.setText(user.getUserLevel());
                            return;
                        } else if (user.isTier2User()) {
                            tvLevel.setText(user.getUserLevel());
                            return;
                        } else {
                            tvLevel.setText(user.getUserLevel());
                            return;
                        }
                    }
                    Intrinsics.checkNotNullExpressionValue(tvLevel, "tvLevel");
                    p220oa.h.c(tvLevel);
                    Intrinsics.checkNotNullExpressionValue(tvSignUpLogin, "tvSignUpLogin");
                    p220oa.h.C(tvSignUpLogin);
                    Intrinsics.checkNotNullExpressionValue(tvName, "tvName");
                    p220oa.h.c(tvName);
                    tvSignUpLogin.setText(CommonViewExtKt.string(Ac.h.main_hi_palmpayer, view2 != null ? view2.getContext() : null));
                    tvSignUpLogin.setCompoundDrawables(null, null, null, null);
                }
            }
        }
    }

    public final void z() {
        ImageView imageView;
        View view;
        View view2;
        if (!BaseApplication.hasLogin()) {
            j jVarV = v();
            if (jVarV != null && (view2 = (View) jVarV.f39520b) != null) {
                p220oa.h.s(view2, true);
            }
            i iVar = this.t;
            if (iVar != null) {
                iVar.b(false);
            }
            k kVarX = x();
            if (kVarX != null) {
                kVarX.a(false);
                return;
            }
            return;
        }
        j jVar = this.f35133w;
        if (jVar != null && (view = (View) jVar.f39520b) != null) {
            p220oa.h.s(view, false);
        }
        boolean zT = d0.t();
        k kVarX2 = x();
        if (kVarX2 != null) {
            kVarX2.a(zT);
        }
        if (zT) {
            i iVar2 = this.t;
            if (iVar2 != null) {
                iVar2.b(false);
            }
            View view3 = this.f27318b;
            if (view3 == null || (imageView = (ImageView) view3.findViewById(Ac.e.ivAssetsHolder)) == null) {
                return;
            }
            p220oa.h.c(imageView);
            return;
        }
        if (this.f35126M != null) {
            i iVarW = w();
            if (iVarW != null) {
                iVarW.b(true);
                iVarW.f(this.f35126M);
                return;
            }
            return;
        }
        i iVar3 = this.t;
        if (iVar3 != null) {
            iVar3.b(true);
            iVar3.f(null);
        }
    }
}
