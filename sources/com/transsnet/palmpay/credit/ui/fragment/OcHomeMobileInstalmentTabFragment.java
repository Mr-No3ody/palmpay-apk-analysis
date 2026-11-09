package com.transsnet.palmpay.credit.ui.fragment;

import Ab.ViewOnClickListenerC0053e;
import Bc.k;
import G9.i;
import Gb.x;
import Gb.y;
import Pa.i0;
import Pa.r0;
import Rd.C0595k;
import Wf.AbstractC0780y;
import Wf.I;
import Ya.e;
import Ya.f;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.result.a;
import androidx.fragment.app.E;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.V;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.palmpay.lib.ui.button.PpButton;
import com.transsnet.adsdk.widgets.SingleAdView;
import com.transsnet.palmpay.core.base.BaseApplication;
import com.transsnet.palmpay.core.base.BaseMvvmFragment;
import com.transsnet.palmpay.core.base.BaseViewModel;
import com.transsnet.palmpay.core.base.l;
import com.transsnet.palmpay.core.bean.LocationRecord;
import com.transsnet.palmpay.core.bean.PalmPayLatLng;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.core.config.d;
import com.transsnet.palmpay.credit.bean.LoanHomeDataInfo;
import com.transsnet.palmpay.credit.bean.resp.mobile_Installment.CLPhoneInstallmentMainData;
import com.transsnet.palmpay.credit.bean.resp.mobile_Installment.MobileInstallmentCardData;
import com.transsnet.palmpay.credit.ui.fragment.OcHomeMobileInstalmentTabFragment;
import com.transsnet.palmpay.credit.ui.view.NotifyInfoView;
import com.transsnet.palmpay.credit.view.LoanHomeBottomInfoView;
import com.transsnet.palmpay.credit.viewmodel.OcHomeFinanceViewModel;
import com.transsnet.palmpay.util.ActivityUtils;
import com.transsnet.palmpay.util.PermissionUtils;
import com.transsnet.palmpay.util.SPUtils;
import com.transsnet.palmpay.util.TimeUtils;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.c;
import p177m.j;
import p220oa.h;
import p284sb.C2023v;
import p355xf.C2131j;
import p355xf.t;
import p382zb.U;
import p382zb.Y;

/* JADX INFO: loaded from: classes4.dex */
@Route(path = "/credit_score/oc_home_mobile_installment_tab_fragment")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/transsnet/palmpay/credit/ui/fragment/OcHomeMobileInstalmentTabFragment;", "Lcom/transsnet/palmpay/core/base/BaseMvvmFragment;", "Lcom/transsnet/palmpay/core/base/BaseViewModel;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "<init>", "()V", "module_flexi_impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOcHomeMobileInstalmentTabFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OcHomeMobileInstalmentTabFragment.kt\ncom/transsnet/palmpay/credit/ui/fragment/OcHomeMobileInstalmentTabFragment\n+ 2 LifecycleOwnerKtx.kt\ncom/transsnet/palmpay/core/base/ext/LifecycleOwnerKtxKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,463:1\n171#2,12:464\n215#2:476\n171#2,12:477\n215#2:489\n260#2,10:490\n296#2:500\n1#3:501\n*S KotlinDebug\n*F\n+ 1 OcHomeMobileInstalmentTabFragment.kt\ncom/transsnet/palmpay/credit/ui/fragment/OcHomeMobileInstalmentTabFragment\n*L\n163#1:464,12\n163#1:476\n184#1:477,12\n184#1:489\n202#1:490,10\n202#1:500\n*E\n"})
public final class OcHomeMobileInstalmentTabFragment extends BaseMvvmFragment<BaseViewModel> implements SwipeRefreshLayout.OnRefreshListener {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f30434A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f30435B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f30436C;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f30437H;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final t f30438L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final a f30439M;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f30440j;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f30441o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f30442p;
    public final t t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c f30443v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public y f30444w;

    public OcHomeMobileInstalmentTabFragment() {
        final int i7 = 0;
        this.f30440j = C2131j.b(new Function0(this) { // from class: zb.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcHomeMobileInstalmentTabFragment f44547b;

            {
                this.f44547b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        View view = this.f44547b.f27318b;
                        if (view != null) {
                            return (SwipeRefreshLayout) view.findViewById(e.refreshLayout);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44547b.f27318b;
                        if (view2 != null) {
                            return (ViewStub) view2.findViewById(e.vsMobileInstallmentDefault);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44547b.f27318b;
                        if (view3 != null) {
                            return (ViewStub) view3.findViewById(e.vsMobileInstallmentMain);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44547b.f27318b;
                        if (view4 != null) {
                            return (NotifyInfoView) view4.findViewById(e.viewNotifyInfo);
                        }
                        return null;
                    default:
                        E eRequireActivity = this.f44547b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (OcHomeFinanceViewModel) new androidx.camera.video.internal.c(eRequireActivity).h(OcHomeFinanceViewModel.class);
                }
            }
        });
        final int i10 = 1;
        this.f30441o = C2131j.b(new Function0(this) { // from class: zb.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcHomeMobileInstalmentTabFragment f44547b;

            {
                this.f44547b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        View view = this.f44547b.f27318b;
                        if (view != null) {
                            return (SwipeRefreshLayout) view.findViewById(e.refreshLayout);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44547b.f27318b;
                        if (view2 != null) {
                            return (ViewStub) view2.findViewById(e.vsMobileInstallmentDefault);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44547b.f27318b;
                        if (view3 != null) {
                            return (ViewStub) view3.findViewById(e.vsMobileInstallmentMain);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44547b.f27318b;
                        if (view4 != null) {
                            return (NotifyInfoView) view4.findViewById(e.viewNotifyInfo);
                        }
                        return null;
                    default:
                        E eRequireActivity = this.f44547b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (OcHomeFinanceViewModel) new androidx.camera.video.internal.c(eRequireActivity).h(OcHomeFinanceViewModel.class);
                }
            }
        });
        final int i11 = 2;
        this.f30442p = C2131j.b(new Function0(this) { // from class: zb.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcHomeMobileInstalmentTabFragment f44547b;

            {
                this.f44547b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        View view = this.f44547b.f27318b;
                        if (view != null) {
                            return (SwipeRefreshLayout) view.findViewById(e.refreshLayout);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44547b.f27318b;
                        if (view2 != null) {
                            return (ViewStub) view2.findViewById(e.vsMobileInstallmentDefault);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44547b.f27318b;
                        if (view3 != null) {
                            return (ViewStub) view3.findViewById(e.vsMobileInstallmentMain);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44547b.f27318b;
                        if (view4 != null) {
                            return (NotifyInfoView) view4.findViewById(e.viewNotifyInfo);
                        }
                        return null;
                    default:
                        E eRequireActivity = this.f44547b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (OcHomeFinanceViewModel) new androidx.camera.video.internal.c(eRequireActivity).h(OcHomeFinanceViewModel.class);
                }
            }
        });
        final int i12 = 3;
        this.t = C2131j.b(new Function0(this) { // from class: zb.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcHomeMobileInstalmentTabFragment f44547b;

            {
                this.f44547b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        View view = this.f44547b.f27318b;
                        if (view != null) {
                            return (SwipeRefreshLayout) view.findViewById(e.refreshLayout);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44547b.f27318b;
                        if (view2 != null) {
                            return (ViewStub) view2.findViewById(e.vsMobileInstallmentDefault);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44547b.f27318b;
                        if (view3 != null) {
                            return (ViewStub) view3.findViewById(e.vsMobileInstallmentMain);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44547b.f27318b;
                        if (view4 != null) {
                            return (NotifyInfoView) view4.findViewById(e.viewNotifyInfo);
                        }
                        return null;
                    default:
                        E eRequireActivity = this.f44547b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (OcHomeFinanceViewModel) new androidx.camera.video.internal.c(eRequireActivity).h(OcHomeFinanceViewModel.class);
                }
            }
        });
        final int i13 = 4;
        this.f30438L = C2131j.b(new Function0(this) { // from class: zb.T

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcHomeMobileInstalmentTabFragment f44547b;

            {
                this.f44547b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        View view = this.f44547b.f27318b;
                        if (view != null) {
                            return (SwipeRefreshLayout) view.findViewById(e.refreshLayout);
                        }
                        return null;
                    case 1:
                        View view2 = this.f44547b.f27318b;
                        if (view2 != null) {
                            return (ViewStub) view2.findViewById(e.vsMobileInstallmentDefault);
                        }
                        return null;
                    case 2:
                        View view3 = this.f44547b.f27318b;
                        if (view3 != null) {
                            return (ViewStub) view3.findViewById(e.vsMobileInstallmentMain);
                        }
                        return null;
                    case 3:
                        View view4 = this.f44547b.f27318b;
                        if (view4 != null) {
                            return (NotifyInfoView) view4.findViewById(e.viewNotifyInfo);
                        }
                        return null;
                    default:
                        E eRequireActivity = this.f44547b.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(eRequireActivity, "requireActivity(...)");
                        return (OcHomeFinanceViewModel) new androidx.camera.video.internal.c(eRequireActivity).h(OcHomeFinanceViewModel.class);
                }
            }
        });
        a aVarRegisterForActivityResult = registerForActivityResult(new j(), new i(this, 16));
        Intrinsics.checkNotNullExpressionValue(aVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.f30439M = aVarRegisterForActivityResult;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment
    public final int h() {
        return f.cs_fragment_home_mobile_installment;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int k() {
        l lVar = x().f30920w;
        if (lVar != null) {
            lVar.e(this, new C2023v(new U(this, this, 0), 21));
        }
        final int i7 = 0;
        x().f30913f.e(getViewLifecycleOwner(), new C2023v(new Function1(this) { // from class: zb.S

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcHomeMobileInstalmentTabFragment f44545b;

            {
                this.f44545b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C0595k c0595k;
                k kVar;
                k kVar2;
                List<CLPhoneInstallmentMainData> list;
                k kVar3;
                Object next;
                MobileInstallmentCardData mobileInstallmentCardData;
                C0595k c0595k2;
                switch (i7) {
                    case 0:
                        this.f44545b.y(false);
                        return Unit.f38893a;
                    default:
                        LoanHomeDataInfo loanHomeDataInfo = (LoanHomeDataInfo) obj;
                        OcHomeMobileInstalmentTabFragment ocHomeMobileInstalmentTabFragment = this.f44545b;
                        SwipeRefreshLayout swipeRefreshLayoutW = ocHomeMobileInstalmentTabFragment.w();
                        if (swipeRefreshLayoutW != null) {
                            swipeRefreshLayoutW.setRefreshing(false);
                        }
                        y yVar = ocHomeMobileInstalmentTabFragment.f30444w;
                        if (yVar != null) {
                            yVar.a();
                        }
                        y yVar2 = ocHomeMobileInstalmentTabFragment.f30444w;
                        if (yVar2 != null) {
                            x xVar = yVar2.f3316g;
                            if (xVar != null) {
                                xVar.cancel();
                            }
                            yVar2.f3316g = null;
                        }
                        if (loanHomeDataInfo == null || (list = loanHomeDataInfo.hirePurchaseProductContent) == null || list.isEmpty()) {
                            if (ocHomeMobileInstalmentTabFragment.f30443v == null) {
                                ViewStub viewStub = (ViewStub) ocHomeMobileInstalmentTabFragment.f30441o.getValue();
                                c cVar = new c(4, false);
                                new WeakReference(ocHomeMobileInstalmentTabFragment);
                                View viewInflate = viewStub != null ? viewStub.inflate() : null;
                                if (viewInflate != null) {
                                    int i10 = e.adView;
                                    if (((SingleAdView) p059e1.a.m(i10, viewInflate)) != null) {
                                        i10 = e.btnContact;
                                        PpButton ppButton = (PpButton) p059e1.a.m(i10, viewInflate);
                                        if (ppButton != null) {
                                            i10 = e.ivShop;
                                            ImageView imageView = (ImageView) p059e1.a.m(i10, viewInflate);
                                            if (imageView != null) {
                                                i10 = e.ivShopCopyWriting;
                                                ImageView imageView2 = (ImageView) p059e1.a.m(i10, viewInflate);
                                                if (imageView2 != null) {
                                                    i10 = e.viewLoanHomeBottomInfo;
                                                    if (((LoanHomeBottomInfoView) p059e1.a.m(i10, viewInflate)) != null) {
                                                        i10 = e.viewNotifyInfo;
                                                        NotifyInfoView notifyInfoView = (NotifyInfoView) p059e1.a.m(i10, viewInflate);
                                                        if (notifyInfoView != null) {
                                                            cVar.f41176b = new k((LinearLayout) viewInflate, ppButton, imageView, imageView2, notifyInfoView, 17);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
                                }
                                ocHomeMobileInstalmentTabFragment.f30443v = cVar;
                            }
                            c cVar2 = ocHomeMobileInstalmentTabFragment.f30443v;
                            if (cVar2 != null && (((kVar2 = (k) cVar2.f41176b) == null || ((LinearLayout) kVar2.f748b).getVisibility() != 0) && kVar2 != null)) {
                                h.C((LinearLayout) kVar2.f748b);
                            }
                            c cVar3 = ocHomeMobileInstalmentTabFragment.f30443v;
                            if (cVar3 != null && (kVar = (k) cVar3.f41176b) != null) {
                                ((NotifyInfoView) kVar.f749c).a(loanHomeDataInfo != null ? loanHomeDataInfo.notifyInfo : null);
                                r0.l1(i0.T() ? "https://static.chuanyinet.com/images/Frame%20168655656566442686-b829-45.png" : "https://static.chuanyinet.com/images/Frame%201686556565614c6944-48cd-4f.png", (ImageView) kVar.f752f);
                                r0.l1(i0.T() ? "https://static.chuanyinet.com/images/Frame%2016865565661b4e0b7d-6fff-43.png" : "https://static.chuanyinet.com/images/Frame%201686556566f3eebd44-1567-4e.png", (ImageView) kVar.f750d);
                                ((PpButton) kVar.f751e).setOnClickListener(new ViewOnClickListenerC0053e(13));
                            }
                            y yVar3 = ocHomeMobileInstalmentTabFragment.f30444w;
                            if (yVar3 != null && (((c0595k = yVar3.f3310a) == null || c0595k.f8367b.getVisibility() != 8) && c0595k != null)) {
                                h.c(c0595k.f8367b);
                            }
                            return Unit.f38893a;
                        }
                        NotifyInfoView notifyInfoView2 = (NotifyInfoView) ocHomeMobileInstalmentTabFragment.t.getValue();
                        if (notifyInfoView2 != null) {
                            notifyInfoView2.a(loanHomeDataInfo.notifyInfo);
                        }
                        if (ocHomeMobileInstalmentTabFragment.f30444w == null) {
                            ocHomeMobileInstalmentTabFragment.f30444w = new y((ViewStub) ocHomeMobileInstalmentTabFragment.f30442p.getValue(), ocHomeMobileInstalmentTabFragment);
                        }
                        y yVar4 = ocHomeMobileInstalmentTabFragment.f30444w;
                        if (yVar4 != null && (((c0595k2 = yVar4.f3310a) == null || c0595k2.f8367b.getVisibility() != 0) && c0595k2 != null)) {
                            h.C(c0595k2.f8367b);
                        }
                        y yVar5 = ocHomeMobileInstalmentTabFragment.f30444w;
                        if (yVar5 != null) {
                            x xVar2 = yVar5.f3316g;
                            if (xVar2 != null) {
                                xVar2.cancel();
                            }
                            yVar5.f3316g = null;
                            yVar5.f3317h = false;
                            yVar5.f3312c = loanHomeDataInfo;
                            List<CLPhoneInstallmentMainData> list2 = loanHomeDataInfo.hirePurchaseProductContent;
                            if (list2 != null) {
                                if (list2.isEmpty()) {
                                    list2 = null;
                                }
                                if (list2 != null) {
                                    ((p339wb.e) yVar5.f3313d.getValue()).setList(list2);
                                    Iterator<T> it = list2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            next = it.next();
                                            Integer itemLayoutType = ((CLPhoneInstallmentMainData) next).getItemLayoutType();
                                            if (itemLayoutType != null && itemLayoutType.intValue() == 0) {
                                            }
                                        } else {
                                            next = null;
                                        }
                                    }
                                    CLPhoneInstallmentMainData cLPhoneInstallmentMainData = (CLPhoneInstallmentMainData) next;
                                    if (cLPhoneInstallmentMainData != null && (mobileInstallmentCardData = cLPhoneInstallmentMainData.getMobileInstallmentCardData()) != null) {
                                        Long expireTime = mobileInstallmentCardData.getExpireTime();
                                        if ((expireTime != null ? expireTime.longValue() : 0L) > 0) {
                                            Long expireTime2 = mobileInstallmentCardData.getExpireTime();
                                            yVar5.a();
                                            if (expireTime2 != null && expireTime2.longValue() > 0) {
                                                yVar5.b(expireTime2.longValue());
                                                x xVar3 = new x(yVar5, expireTime2.longValue());
                                                yVar5.f3315f = xVar3;
                                                xVar3.start();
                                            }
                                        } else {
                                            yVar5.a();
                                        }
                                        if (Intrinsics.c(mobileInstallmentCardData.getExemptionBadgeVisible(), Boolean.TRUE)) {
                                            Long exemptionExpireTime = mobileInstallmentCardData.getExemptionExpireTime();
                                            long jLongValue = exemptionExpireTime != null ? exemptionExpireTime.longValue() : 0L;
                                            if (jLongValue > System.currentTimeMillis()) {
                                                yVar5.f3318i = false;
                                                x xVar4 = yVar5.f3316g;
                                                if (xVar4 != null) {
                                                    xVar4.cancel();
                                                }
                                                yVar5.f3316g = null;
                                                if (jLongValue > System.currentTimeMillis()) {
                                                    yVar5.c();
                                                    x xVar5 = new x(jLongValue - System.currentTimeMillis(), yVar5, jLongValue);
                                                    yVar5.f3316g = xVar5;
                                                    xVar5.start();
                                                }
                                            } else {
                                                yVar5.c();
                                                if (!yVar5.f3318i) {
                                                    yVar5.f3318i = true;
                                                    if (!yVar5.f3317h) {
                                                        yVar5.f3317h = true;
                                                        OcHomeFinanceViewModel ocHomeFinanceViewModel = yVar5.f3314e;
                                                        if (ocHomeFinanceViewModel != null) {
                                                            ocHomeFinanceViewModel.d();
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            yVar5.f3318i = false;
                                        }
                                    }
                                }
                            }
                        }
                        c cVar4 = ocHomeMobileInstalmentTabFragment.f30443v;
                        if (cVar4 != null && (((kVar3 = (k) cVar4.f41176b) == null || ((LinearLayout) kVar3.f748b).getVisibility() != 8) && kVar3 != null)) {
                            h.c((LinearLayout) kVar3.f748b);
                        }
                        return Unit.f38893a;
                }
            }
        }, 22));
        l lVar2 = x().f30915i;
        if (lVar2 != null) {
            lVar2.e(this, new C2023v(new U(this, this, 1), 21));
        }
        OcHomeFinanceViewModel ocHomeFinanceViewModelX = x();
        l lVar3 = ocHomeFinanceViewModelX != null ? ocHomeFinanceViewModelX.t : null;
        if (lVar3 != null) {
            lVar3.e(this, new C2023v(new U(this, this, 2), 21));
        }
        final int i10 = 1;
        x().f30912e.e(getViewLifecycleOwner(), new C2023v(new Function1(this) { // from class: zb.S

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OcHomeMobileInstalmentTabFragment f44545b;

            {
                this.f44545b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                C0595k c0595k;
                k kVar;
                k kVar2;
                List<CLPhoneInstallmentMainData> list;
                k kVar3;
                Object next;
                MobileInstallmentCardData mobileInstallmentCardData;
                C0595k c0595k2;
                switch (i10) {
                    case 0:
                        this.f44545b.y(false);
                        return Unit.f38893a;
                    default:
                        LoanHomeDataInfo loanHomeDataInfo = (LoanHomeDataInfo) obj;
                        OcHomeMobileInstalmentTabFragment ocHomeMobileInstalmentTabFragment = this.f44545b;
                        SwipeRefreshLayout swipeRefreshLayoutW = ocHomeMobileInstalmentTabFragment.w();
                        if (swipeRefreshLayoutW != null) {
                            swipeRefreshLayoutW.setRefreshing(false);
                        }
                        y yVar = ocHomeMobileInstalmentTabFragment.f30444w;
                        if (yVar != null) {
                            yVar.a();
                        }
                        y yVar2 = ocHomeMobileInstalmentTabFragment.f30444w;
                        if (yVar2 != null) {
                            x xVar = yVar2.f3316g;
                            if (xVar != null) {
                                xVar.cancel();
                            }
                            yVar2.f3316g = null;
                        }
                        if (loanHomeDataInfo == null || (list = loanHomeDataInfo.hirePurchaseProductContent) == null || list.isEmpty()) {
                            if (ocHomeMobileInstalmentTabFragment.f30443v == null) {
                                ViewStub viewStub = (ViewStub) ocHomeMobileInstalmentTabFragment.f30441o.getValue();
                                c cVar = new c(4, false);
                                new WeakReference(ocHomeMobileInstalmentTabFragment);
                                View viewInflate = viewStub != null ? viewStub.inflate() : null;
                                if (viewInflate != null) {
                                    int i11 = e.adView;
                                    if (((SingleAdView) p059e1.a.m(i11, viewInflate)) != null) {
                                        i11 = e.btnContact;
                                        PpButton ppButton = (PpButton) p059e1.a.m(i11, viewInflate);
                                        if (ppButton != null) {
                                            i11 = e.ivShop;
                                            ImageView imageView = (ImageView) p059e1.a.m(i11, viewInflate);
                                            if (imageView != null) {
                                                i11 = e.ivShopCopyWriting;
                                                ImageView imageView2 = (ImageView) p059e1.a.m(i11, viewInflate);
                                                if (imageView2 != null) {
                                                    i11 = e.viewLoanHomeBottomInfo;
                                                    if (((LoanHomeBottomInfoView) p059e1.a.m(i11, viewInflate)) != null) {
                                                        i11 = e.viewNotifyInfo;
                                                        NotifyInfoView notifyInfoView = (NotifyInfoView) p059e1.a.m(i11, viewInflate);
                                                        if (notifyInfoView != null) {
                                                            cVar.f41176b = new k((LinearLayout) viewInflate, ppButton, imageView, imageView2, notifyInfoView, 17);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
                                }
                                ocHomeMobileInstalmentTabFragment.f30443v = cVar;
                            }
                            c cVar2 = ocHomeMobileInstalmentTabFragment.f30443v;
                            if (cVar2 != null && (((kVar2 = (k) cVar2.f41176b) == null || ((LinearLayout) kVar2.f748b).getVisibility() != 0) && kVar2 != null)) {
                                h.C((LinearLayout) kVar2.f748b);
                            }
                            c cVar3 = ocHomeMobileInstalmentTabFragment.f30443v;
                            if (cVar3 != null && (kVar = (k) cVar3.f41176b) != null) {
                                ((NotifyInfoView) kVar.f749c).a(loanHomeDataInfo != null ? loanHomeDataInfo.notifyInfo : null);
                                r0.l1(i0.T() ? "https://static.chuanyinet.com/images/Frame%20168655656566442686-b829-45.png" : "https://static.chuanyinet.com/images/Frame%201686556565614c6944-48cd-4f.png", (ImageView) kVar.f752f);
                                r0.l1(i0.T() ? "https://static.chuanyinet.com/images/Frame%2016865565661b4e0b7d-6fff-43.png" : "https://static.chuanyinet.com/images/Frame%201686556566f3eebd44-1567-4e.png", (ImageView) kVar.f750d);
                                ((PpButton) kVar.f751e).setOnClickListener(new ViewOnClickListenerC0053e(13));
                            }
                            y yVar3 = ocHomeMobileInstalmentTabFragment.f30444w;
                            if (yVar3 != null && (((c0595k = yVar3.f3310a) == null || c0595k.f8367b.getVisibility() != 8) && c0595k != null)) {
                                h.c(c0595k.f8367b);
                            }
                            return Unit.f38893a;
                        }
                        NotifyInfoView notifyInfoView2 = (NotifyInfoView) ocHomeMobileInstalmentTabFragment.t.getValue();
                        if (notifyInfoView2 != null) {
                            notifyInfoView2.a(loanHomeDataInfo.notifyInfo);
                        }
                        if (ocHomeMobileInstalmentTabFragment.f30444w == null) {
                            ocHomeMobileInstalmentTabFragment.f30444w = new y((ViewStub) ocHomeMobileInstalmentTabFragment.f30442p.getValue(), ocHomeMobileInstalmentTabFragment);
                        }
                        y yVar4 = ocHomeMobileInstalmentTabFragment.f30444w;
                        if (yVar4 != null && (((c0595k2 = yVar4.f3310a) == null || c0595k2.f8367b.getVisibility() != 0) && c0595k2 != null)) {
                            h.C(c0595k2.f8367b);
                        }
                        y yVar5 = ocHomeMobileInstalmentTabFragment.f30444w;
                        if (yVar5 != null) {
                            x xVar2 = yVar5.f3316g;
                            if (xVar2 != null) {
                                xVar2.cancel();
                            }
                            yVar5.f3316g = null;
                            yVar5.f3317h = false;
                            yVar5.f3312c = loanHomeDataInfo;
                            List<CLPhoneInstallmentMainData> list2 = loanHomeDataInfo.hirePurchaseProductContent;
                            if (list2 != null) {
                                if (list2.isEmpty()) {
                                    list2 = null;
                                }
                                if (list2 != null) {
                                    ((p339wb.e) yVar5.f3313d.getValue()).setList(list2);
                                    Iterator<T> it = list2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            next = it.next();
                                            Integer itemLayoutType = ((CLPhoneInstallmentMainData) next).getItemLayoutType();
                                            if (itemLayoutType != null && itemLayoutType.intValue() == 0) {
                                            }
                                        } else {
                                            next = null;
                                        }
                                    }
                                    CLPhoneInstallmentMainData cLPhoneInstallmentMainData = (CLPhoneInstallmentMainData) next;
                                    if (cLPhoneInstallmentMainData != null && (mobileInstallmentCardData = cLPhoneInstallmentMainData.getMobileInstallmentCardData()) != null) {
                                        Long expireTime = mobileInstallmentCardData.getExpireTime();
                                        if ((expireTime != null ? expireTime.longValue() : 0L) > 0) {
                                            Long expireTime2 = mobileInstallmentCardData.getExpireTime();
                                            yVar5.a();
                                            if (expireTime2 != null && expireTime2.longValue() > 0) {
                                                yVar5.b(expireTime2.longValue());
                                                x xVar3 = new x(yVar5, expireTime2.longValue());
                                                yVar5.f3315f = xVar3;
                                                xVar3.start();
                                            }
                                        } else {
                                            yVar5.a();
                                        }
                                        if (Intrinsics.c(mobileInstallmentCardData.getExemptionBadgeVisible(), Boolean.TRUE)) {
                                            Long exemptionExpireTime = mobileInstallmentCardData.getExemptionExpireTime();
                                            long jLongValue = exemptionExpireTime != null ? exemptionExpireTime.longValue() : 0L;
                                            if (jLongValue > System.currentTimeMillis()) {
                                                yVar5.f3318i = false;
                                                x xVar4 = yVar5.f3316g;
                                                if (xVar4 != null) {
                                                    xVar4.cancel();
                                                }
                                                yVar5.f3316g = null;
                                                if (jLongValue > System.currentTimeMillis()) {
                                                    yVar5.c();
                                                    x xVar5 = new x(jLongValue - System.currentTimeMillis(), yVar5, jLongValue);
                                                    yVar5.f3316g = xVar5;
                                                    xVar5.start();
                                                }
                                            } else {
                                                yVar5.c();
                                                if (!yVar5.f3318i) {
                                                    yVar5.f3318i = true;
                                                    if (!yVar5.f3317h) {
                                                        yVar5.f3317h = true;
                                                        OcHomeFinanceViewModel ocHomeFinanceViewModel = yVar5.f3314e;
                                                        if (ocHomeFinanceViewModel != null) {
                                                            ocHomeFinanceViewModel.d();
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            yVar5.f3318i = false;
                                        }
                                    }
                                }
                            }
                        }
                        c cVar4 = ocHomeMobileInstalmentTabFragment.f30443v;
                        if (cVar4 != null && (((kVar3 = (k) cVar4.f41176b) == null || ((LinearLayout) kVar3.f748b).getVisibility() != 8) && kVar3 != null)) {
                            h.c((LinearLayout) kVar3.f748b);
                        }
                        return Unit.f38893a;
                }
            }
        }, 22));
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final void n() {
        y(true);
    }

    @Override // com.transsnet.palmpay.core.base.BaseMvvmFragment, com.transsnet.palmpay.core.base.BaseFragment
    public final int o() {
        super.o();
        SwipeRefreshLayout swipeRefreshLayoutW = w();
        if (swipeRefreshLayoutW != null) {
            swipeRefreshLayoutW.setOnRefreshListener(this);
        }
        u();
        return 0;
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        y yVar = this.f30444w;
        if (yVar != null) {
            yVar.a();
        }
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z3) {
        super.onHiddenChanged(z3);
        if (z3) {
            return;
        }
        if (this.f30435B && t()) {
            this.f30435B = false;
        }
        u();
        v();
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public final void onRefresh() {
        SwipeRefreshLayout swipeRefreshLayoutW = w();
        if (swipeRefreshLayoutW != null) {
            swipeRefreshLayoutW.setRefreshing(true);
        }
        y(false);
        z();
    }

    @Override // com.transsnet.palmpay.core.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.f30435B && t()) {
            this.f30435B = false;
        }
        v();
        if (this.f30436C) {
            y(false);
        }
        this.f30436C = true;
    }

    public final boolean t() {
        E activity;
        if (!isAdded() || isDetached() || (activity = getActivity()) == null) {
            return false;
        }
        return ActivityUtils.isValidActivityContext(activity);
    }

    public final void u() {
        if (!isAdded() || isDetached()) {
            return;
        }
        if (PermissionUtils.isGranted(d.j())) {
            this.f30435B = false;
            z();
        } else {
            this.f30439M.a(new String[]{"android.permission.ACCESS_COARSE_LOCATION", d.j()});
        }
    }

    public final void v() {
        E activity = getActivity();
        E activity2 = getActivity();
        Eb.e.a(activity, activity2 != null ? activity2.getIntent() : null);
        if (Eb.e.f2275c) {
            Eb.e.f2275c = false;
            return;
        }
        if (!BaseApplication.hasLogin() || this.f30434A || !isAdded() || Eb.e.f2273a) {
            return;
        }
        boolean z3 = !TimeUtils.isToday(SPUtils.getInstance().getLong(d.d(), 0L));
        boolean z8 = !TimeUtils.isToday(SPUtils.getInstance().getLong(d.f(), 0L));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = V.f(viewLifecycleOwner);
        p042cg.f fVar = I.f10809a;
        AbstractC0780y.m(lifecycleCoroutineScopeImplF, p042cg.e.f19009c, null, new Y(z3, z8, this, null), 2);
    }

    public final SwipeRefreshLayout w() {
        return (SwipeRefreshLayout) this.f30440j.getValue();
    }

    public final OcHomeFinanceViewModel x() {
        return (OcHomeFinanceViewModel) this.f30438L.getValue();
    }

    public final void y(boolean z3) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AbstractC0780y.m(V.f(viewLifecycleOwner), null, null, new p382zb.V(this, z3, null), 3);
    }

    public final void z() {
        PalmPayLatLng location;
        org.greenrobot.eventbus.c.b().f(new MessageEvent(MessageEvent.EVENT_REFRESH_LOCATION));
        LocationRecord locationRecordF = p367ya.a.d().f();
        OcHomeFinanceViewModel ocHomeFinanceViewModelX = x();
        if (ocHomeFinanceViewModelX != null) {
            ocHomeFinanceViewModelX.f((locationRecordF == null || (location = locationRecordF.getLocation()) == null) ? null : Long.valueOf(location.locateTime), "MOBILE_INSTALMENT_TAB");
        }
    }
}
